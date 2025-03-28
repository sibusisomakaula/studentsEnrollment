package za.ac.cput.util;

import java.time.LocalDate;

public class EnrolHelperClass {
    public static boolean isNullOrEmpty(String s){

        if(s.isEmpty() || s == null)
            return true;
        return false;
    }

    public static boolean isNull(LocalDate ld) {
        if(ld == null)
            return true;
        return false;
    }
}
