package core;

import android.graphics.Bitmap;

import java.util.List;

/**
 * Created by BURAK on 25/06/2017.
 */

public class Pictures {

    private Bitmap BitMap;

    public Bitmap getBitMap() {
        return BitMap;
    }

    public void setBitMap(Bitmap bitMap) {
        BitMap = bitMap;
    }

    private String FileName;

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }
}
