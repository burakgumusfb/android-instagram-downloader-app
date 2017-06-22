package core;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.provider.MediaStore;

import com.example.burak.instagramphotodownloader.MainActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import constants.constants;

/**
 * Created by BURAK on 11/06/2017.
 */

public class DirectoryProgress {

    public static boolean createDir(File getcacheDir, String dir) {
        boolean result = false;


        File f = new File(getcacheDir, dir);
        if (!f.exists()) {
            result = f.mkdir();
        }
        return result;
    }

    public static boolean createDir(String dir) {

        boolean result = false;


        File f = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), dir);
        if (!f.exists()) {
            result = f.mkdir();
        }
        return result;
    }

    public static void SaveImage(Bitmap bmp, String name) {

        File fs = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath()+ "/" + name);
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
    public static void SaveBitmap(ContentResolver context, Bitmap bitmap)
    {
        MediaStore.Images.Media.insertImage(context, bitmap, "" , "");
    }

}
