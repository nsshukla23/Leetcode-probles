// import java.io.*;
import java.util.*;
import java.util.Scanner;

public class getSubsequenx {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     String str = scn.next();
     ArrayList<String> res = gss(str);
     System.out.println(res);
     
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() ==0 ) {
            ArrayList<String> rres = new  ArrayList<>();
            rres.add("");
            return rres ;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1) ;
        ArrayList<String> bres = gss(ros);
        
        ArrayList<String> ans = new ArrayList<>();
        
        for(String rstr : bres){
            ans.add("" + rstr);
           
        }
        for(String rstr : bres){
            ans.add(ch + rstr );
           
        }
        return ans ;
  }

}