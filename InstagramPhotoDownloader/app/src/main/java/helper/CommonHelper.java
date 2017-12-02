package helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.StrictMode;
import android.util.Patterns;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import constants.constants;
import core.SharedResponseTemplate;
import java.util.UUID;
/**
 * Created by BURAK on 11/06/2017.
 */

public class CommonHelper {

    public static SharedResponseTemplate ConvertToJson(String data) {
        Gson gson = new Gson();
        return gson.fromJson(data, SharedResponseTemplate.class);
    }

    public static void ThreadPolicy() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public static boolean CreateMainDirectory() {
        File rootFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + constants.InstagramMedia);
        boolean success = false;
        if (!rootFile.exists()) {
            success = rootFile.mkdir();
        }
        return success;
    }

    public static boolean CreateVideoDirectory() {
        File rootFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + constants.InstagramMedia + "/" + constants.VideoDirName);
        boolean success = false;
        if (!rootFile.exists()) {
            success = rootFile.mkdir();
        }
        return success;
    }

    public static boolean CreatePhotoDirectory() {
        File rootFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + constants.InstagramMedia + "/" + constants.PhotoDirName);
        boolean success = false;
        if (!rootFile.exists()) {
            success = rootFile.mkdir();
        }
        return success;
    }

    public static boolean CreateThumbPhotoDirectory() {
        File rootFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + constants.InstagramMedia + "/" + constants.PhotoDirNameThumb);
        boolean success = false;
        if (!rootFile.exists()) {
            success = rootFile.mkdir();
        }
        return success;
    }

    public static boolean CreateThumbVideoDirectory() {
        File rootFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + constants.InstagramMedia + "/" + constants.VideoDirNameThumb);
        boolean success = false;
        if (!rootFile.exists()) {
            success = rootFile.mkdir();
        }
        return success;
    }

    public static void CallAllDirectory() {
        CreateMainDirectory();
        CreatePhotoDirectory();
        CreateVideoDirectory();
        CreateThumbPhotoDirectory();
        CreateThumbVideoDirectory();
    }

    public static String CreateFileNameForVideo(String fileName) {
        String [] Splitted = fileName.split("/");
        return Splitted[Splitted.length -1];
    }

    public static String CreateFileNameForImage(String fileName) {
        String [] Splitted = fileName.split("/");
        return Splitted[Splitted.length -1];
    }


    public static boolean checkNetworkStatus(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
        return isConnected;
    }


    public static String RemoveScriptTag(String element) {

        element = element.toString().replace("<script type=\"text/javascript\">", "");
        element = element.toString().replace(";</script>", "");
        element = element.toString().replace("window._sharedData = ", "");
        return element;
    }

    public static boolean IsUrl(String url) {
        return Patterns.WEB_URL.matcher(url).matches();
    }

    public static boolean ExistLocalFile(Context context, String file) throws IOException {
        File rootFile = new File(context.getFilesDir() + "/" + file);
        if (rootFile.exists()) {
            return true;
        }
        return false;
    }

    public static void CreateLocalFile(Context context, String file) throws IOException {
        File rootFile = new File(context.getFilesDir() + "/" + file);
        rootFile.createNewFile();
    }

    public static String ReadFromFile(Context context, String filename) throws IOException {
        StringBuilder text = new StringBuilder();
        try {

            File file = new File(context.getFilesDir(),filename);

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
            }
            br.close() ;
        }catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    public static void WriteToFile(Context context, String file, String data) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(file, Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        } catch (IOException e) {

        }
    }
}
