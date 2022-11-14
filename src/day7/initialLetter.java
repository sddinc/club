package day7;

public class initialLetter {
    public static void main(String[] args) {
        String cities[]={"iaSi","ploIesti","ConstantA","BucHarest"};
        for (String city:cities) {
            String str1=city.substring(0,1).toUpperCase();
            String str2= city.substring(1,city.length()).toLowerCase();
            System.out.println(str1+str2);
        }
    }
}
