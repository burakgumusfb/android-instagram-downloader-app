package core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

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

        File fs = new File(Environment.getExternalStorageDirectory() + "/" + constants.PhotoDirName + "/" + name);
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

    public static Bitmap GetOneFile(File getcacheDir) {
        Bitmap bmp = null;
        File path = new File(getcacheDir, constants.PhotoDirName);
        if (path.exists()) {
            String[] fileNames = path.list();
            bmp = BitmapFactory.decodeFile(path + "/" + fileNames[0]);
        }
        return bmp;
    }
}
