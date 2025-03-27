package ac.za.cput.util;

import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String value){
        return value == null || value.trim().isEmpty();
    }
    public static String generateId(){
        return UUID.randomUUID().toString();

    }

    }



