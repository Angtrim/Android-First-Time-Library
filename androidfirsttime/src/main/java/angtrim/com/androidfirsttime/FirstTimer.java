package angtrim.com.androidfirsttime;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.lang.reflect.Method;

/**
 * Created by angtrim on 29/08/15.
 */
public class FirstTimer {

    public static final String SHARED_PREF_STRING = "com.angtrim.androidfirsttime.isFirst";


    /**
     * Use this method to bind your Context subclass to the First Time script.
     * @param context Context sublcass with @FistTimeOnly annotated methods
     */
    public static void invoke(Context context){
        invoke(context,context);
    }

    /**
     * Use this method to bind any class to the First Time script.
     * You need to pass a context
     * @param context An Android Context
     * @param object An object with @FistTimeOnly annotated methods
     */
    public static void invoke(Context context,Object object){
        /* Check if is first time */
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
        boolean isFirstTime = sharedPref.getBoolean(SHARED_PREF_STRING, true);
        if(isFirstTime){
            invokeFirstTimers(object);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putBoolean(SHARED_PREF_STRING, false);
            editor.commit();
        }


    }

    private static void invokeFirstTimers(Object object) {
        Method[] methods = object.getClass().getMethods();
        for (Method method : methods) {
            FirstTimeOnly annotation = method.getAnnotation(FirstTimeOnly.class);
            if (annotation != null) {
                try {
                    method.invoke(object);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
