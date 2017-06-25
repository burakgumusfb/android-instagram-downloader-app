package core;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Environment;
import android.provider.MediaStore;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import constants.constants;
import helper.CommonHelper;

/**
 * Created by BURAK on 20/06/2017.
 */

public class PhotoDownloader {

    public static void SaveImage(Bitmap bmp, String name) {

        File fs = new File(Environment.getExternalStorageDirectory() + "/" + constants.InstagramMedia + "/" + constants.PhotoDirName + "/" + name);
        try {
            FileOutputStream out = new FileOutputStream(fs);
            bmp.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.close();
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void CreateThumbForPhoto(Bitmap bmp, String name) {
        File fs = new File(Environment.getExternalStorageDirectory() + "/" + constants.InstagramMedia + "/" + constants.PhotoDirNameThumb + "/" + name);
        try {
            FileOutputStream out = new FileOutputStream(fs);

            bmp = Bitmap.createScaledBitmap(bmp,64,64,true);
            bmp.compress(Bitmap.CompressFormat.JPEG,100,out);
            out.close();
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ShortcodeMedia ConnectImage(String shareurl) {
        Connection.Response response = null;

        try {
            response = Jsoup.connect(String.valueOf(shareurl)).timeout(30000).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Document doc = null;
        try {
            if (response != null)
                doc = response.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (doc == null)
                return null;
            Elements elements = doc.getElementsByTag("script");
            for (Element element : elements) {
                if (element.toString().contains("window._sharedData")) {

                    String JSON = CommonHelper.RemoveScriptTag(element.toString());
                    return GetMediaInfo(JSON);

                }
            }
        } catch (Exception err) {
            err.printStackTrace();
        }

        return null;
    }

    public ShortcodeMedia GetMediaInfo(String json) {
        SharedResponseTemplate template = CommonHelper.ConvertToJson(json);
        EntryData entryData = template.getEntryData();


        ArrayList<PostPage> postPage = entryData.getPostPage();
        for (PostPage page : postPage) {
            Graphql graphql = page.getGraphql();
            ShortcodeMedia shortcodeMedia = graphql.getShortcodeMedia();
            return shortcodeMedia;
        }
        return null;
    }

    public static void SaveBitmap(ContentResolver context, Bitmap bitmap) {
        MediaStore.Images.Media.insertImage(context, bitmap, "", "");
    }
}
