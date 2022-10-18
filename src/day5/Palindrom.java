package day5;
public class Palindrom {
    public static void main(String[] args) {
        String str="nalant";
        String str2="";
        for(int i=str.length()-1;i>=0;i--){
            str2=str2+str.charAt(i);
        }
        if(str.equals(str2)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrom");
        }
        System.out.println(str2);
    }
}
