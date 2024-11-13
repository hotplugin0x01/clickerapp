package io.hextree.weatherusa;

public class InternetUtil {

    public static String solve(String str){
        System.loadLibrary("native-lib");
        return getKey(str);
    }
    private static native String getKey(String str);
}
