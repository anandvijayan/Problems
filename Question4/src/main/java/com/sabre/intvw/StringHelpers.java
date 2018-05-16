package com.sabre.intvw;//========================================================================
// This conversion was produced by the Free Edition of
// C++ to Java Converter courtesy of Tangible Software Solutions.
// Order the Premium Edition at https://www.tangiblesoftwaresolutions.com
//========================================================================

public class StringHelpers {
    public static boolean equalsIgnoreCase(String lhs, String rhs) {
        return toUpper(lhs).equals(toUpper(rhs));
    }

    public static String toUpper(String str) {
        String s = str;
        s = s.toUpperCase();
        return s;
    }

    public static String replace(String str, String findStr, String replaceStr) {

        return str.replaceAll(findStr, replaceStr);
    }

    public static String ltrim(String str) {
        return str.trim();

    }

    public static boolean isNotSpace(char c) {
        return (' ' != c)?true:false;
    }

    public static String rtrim(String str) {
        return str.trim();

    }

    public static String trim(String str) {
        return rtrim(ltrim(str));
    }

}