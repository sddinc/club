package day3;

import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter =");
        String str=scan.nextLine();
        //String str="Hello colentina!";
        //System.out.println(str.replace("ina","***"));
        String str2="";
        for(int i=0; i<str.length()-3;i++){
            str2=str2+str.substring(i,i+1);
        }
        System.out.printf(str2+"***");
    }
}
