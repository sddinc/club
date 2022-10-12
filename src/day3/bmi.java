package day3;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter w=");
        double w= scan.nextDouble();
        System.out.println("enter h=");
        double h= scan.nextDouble();
        double bmi=w/(h*h);
        System.out.println("bmi="+bmi);
        if(bmi<18.5){
            System.out.println("under weight");
        }else if(bmi>18.5 && bmi<24.5){
            System.out.println("normal");
        }else if(bmi>24.5 && bmi<30){
            System.out.println("over weight");
        }else{
            System.out.println("obesy");
        }






    }
}
