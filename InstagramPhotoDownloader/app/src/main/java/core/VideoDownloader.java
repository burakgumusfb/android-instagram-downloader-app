package core;

import android.graphics.Bitmap;
import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import constants.constants;

/**
 * Created by BURAK on 20/06/2017.
 */

public class VideoDownloader {
    public static void Download(String fileUrl, String fileName) {
        File rootFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + constants.InstagramMedia + "/" + constants.VideoDirName);
        URL url = null;
        try {
            url = new URL(fileUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            connection.setRequestMethod("GET");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
        try {
            connection.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int fileSize = connection.getContentLength();

        InputStream inputStream = null;
        try {
            inputStream = connection.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] buffer = new byte[fileSize];
        int len1 = 0;
        FileOutputStream f = null;

        try {

            f = new FileOutputStream(new File(rootFile, fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while ((len1 = inputStream.read(buffer)) > 0) {
                f.write(buffer, 0, len1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            f.flush();
            f.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputStream.reset();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        connection.disconnect();
        // Intent intent = new Intent(Intent.ACTION_VIEW);
        // intent.setDataAndType(Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/" + "small1.mp4"), "video/*");
        //startActivity(intent);
    }
    public static void CreateThumbForVideo(Bitmap bmp, String name) {
        File fs = new File(Environment.getExternalStorageDirectory() + "/" + constants.InstagramMedia + "/" + constants.VideoDirNameThumb + "/" + name);
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
}
