package peoplefeedback.com.peoplefeedback.utils;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by rojesharunkumar on 18/03/18.
 */

public class StaticUtils {


    public final static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

}
