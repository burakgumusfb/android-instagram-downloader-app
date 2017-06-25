package core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import java.io.File;
import java.util.ArrayList;

import constants.constants;

/**
 * Created by BURAK on 24/06/2017.
 */

public class DirectoryProgress {

    public ArrayList<Pictures> PicturesList;

    public DirectoryProgress() {
        PicturesList = new ArrayList<Pictures>();
    }

    public ArrayList<Pictures> GetPictures() {
        String path = Environment.getExternalStorageDirectory().toString() + "/" + constants.InstagramMedia + "/" + constants.PhotoDirNameThumb;
        File directory = new File(path);
        File[] files = directory.listFiles();
        Pictures pictures;
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                pictures = new Pictures();
                Bitmap bitmap = BitmapFactory.decodeFile(String.valueOf(files[i]));
                pictures.setBitMap(bitmap);
                pictures.setFileName(files[i].getName());
                PicturesList.add(pictures);
            }
        }
        return PicturesList;
    }
    public ArrayList<Pictures> GetVideoPictures() {
        String path = Environment.getExternalStorageDirectory().toString() + "/" + constants.InstagramMedia + "/" + constants.PhotoDirName;
        File directory = new File(path);
        File[] files = directory.listFiles();
        Pictures pictures;
        for (int i = 0; i < files.length; i++) {
            pictures = new Pictures();
            Bitmap bitmap = BitmapFactory.decodeFile(String.valueOf(files[i]));
            pictures.setBitMap(bitmap);
            pictures.setFileName(files[i].getName());
            PicturesList.add(pictures);
        }
        return PicturesList;
    }
}
