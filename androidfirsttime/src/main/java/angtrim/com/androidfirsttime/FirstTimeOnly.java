package angtrim.com.androidfirsttime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Annotation used to execute a method only when is the first time that the user open
 * the app
 * Created by angtrim on 29/08/15.
 */

@Target(value = ElementType.METHOD)
public @interface FirstTimeOnly {

}
