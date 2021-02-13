package javaTasks;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDuplicates {

    /*
    Write a return method that can remove the
    duplicates values from string
    Ex: removeDup("AAABBBCCC")===>ABC
     */


    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDup(str));

    }

    public static String removeDup(String str) {
        String result = "";


     // while (str.length() > 0) {
        // if (!result.contains(str.substring(0, 1))) {
        //result += str.substring(0, 1);
        //str = str.replaceAll(str.substring(0, 1), "");
        //}
        //}

          for(int i=0; i<str.length(); i++){
            if(!result.contains(str.substring(i,i+1)))
                result+=str.substring(i,i+1);
        }
            return result;
        }

        // LinkedHashSet
        public static String removeDup2(String str) {
        str=new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        //str=str.replace("[","").replace(", ","").replace("]","");
        return str;

        }
}