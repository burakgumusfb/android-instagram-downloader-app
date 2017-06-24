package core;

import android.os.Environment;
import android.util.Log;

import java.io.File;

import constants.constants;

/**
 * Created by BURAK on 24/06/2017.
 */

public class DirectoryProgress {

    public static void GetPictures() {
        String path = Environment.getExternalStorageDirectory().toString() + "/" + constants.PhotoDirName;
       File directory = new File(path);
        File[] files = directory.listFiles();
        for (int i = 0; i < files.length; i++) {
            Log.d("Files", "FileName:" + files[i].getName());
        }
    }
}
