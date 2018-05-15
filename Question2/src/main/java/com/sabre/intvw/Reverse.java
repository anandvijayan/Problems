package com.sabre.intvw;

/**
 * This class is used to reverse a given string
 */
public class Reverse {

    public static void main (String args[]) {
        if (args.length == 0 || args[0] == null)
            System.out.println("Usage: java -cp . Reverse <StringToReverse>");
        else {
            String ipStr = args[0];
            System.out.println("Input String:"+ipStr);
            System.out.println("Output String:"+reverseMe(ipStr));
        }
    }

    public static String reverseMe(String str) {
        StringBuilder sbStr = new StringBuilder();
        int len=str.length();
        while (len > 0){
            sbStr.append(str.charAt(--len));
        }
        return sbStr.toString();
    }
}
