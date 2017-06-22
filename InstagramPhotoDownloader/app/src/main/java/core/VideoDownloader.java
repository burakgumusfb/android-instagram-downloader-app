package core;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import constants.constants;

/**
 * Created by BURAK on 20/06/2017.
 */

public class VideoDownloader {
    public static void Download(String fileUrl, String fileName, ContentResolver resolver) {
        File rootFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).getPath());
        URL url = null;
        try {
            //"http://techslides.com/demos/sample-videos/small.mp4"
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

            f = new FileOutputStream(new File(rootFile,fileName));
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
}
