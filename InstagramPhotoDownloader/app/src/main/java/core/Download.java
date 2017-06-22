package core;

import android.app.DownloadManager;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import constants.constants;

/**
 * Created by BURAK on 17/06/2017.
 */

public class Download {
    public void DownloadVideo(File getCacheDir, String fileURL, String fileName) {
        try {
            //  String rootDir = Environment.getExternalStorageDirectory() + File.separator + "Video";
            File rootFile = new File(getCacheDir +"/" + constants.VideoDirName + "/");
            rootFile.mkdir();
            //http://techslides.com/demos/sample-videos/small.mp4
            //https://www.instagram.com/static/sprites/core/30624d.png
            URL url = new URL("http://techslides.com/demos/sample-videos/small.mp4");
            HttpURLConnection c = (HttpURLConnection) url.openConnection();
            c.setRequestMethod("GET");
            c.setDoOutput(true);
            c.connect();
            FileOutputStream f = new FileOutputStream(new File(rootFile,
                    "png.jpg"));
            InputStream in = c.getInputStream();
            int x = c.getContentLength();
            byte[] buffer = new byte[x];
            int len1 = 0;
            while ((len1 = in.read(buffer)) > 0) {
                f.write(buffer, 0, len1);
            }
            f.close();
        } catch (IOException e) {
            Log.d("Error....", e.toString());
        }
    }
}
