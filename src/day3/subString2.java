package day3;
public class subString2 {
    public static void main(String[] args) {
        String str="bucuresti";//matei-> ma***, spectrum -> spect***
        String str2="";
        //str2=str.substring(2,5);
        //System.out.println(str2);
        for(int i=0;i<str.length()-3;i++){
            str2=str2+str.substring(i,i+1);
        }
        System.out.println(str2+"***");




    }

}
