package day5;
public class PalindromNumber {
    public static void main(String[] args) {
        int number=123;
        int newNumber=0;
        while(number>0){
            newNumber=newNumber*10+(number%10);
            number=number/10;
        }
        System.out.println(newNumber);
    }
}
