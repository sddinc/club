package day3;
public class stringFindChar {
    public static void main(String[] args) {
        String str="Hello colentina.";
        //substring
        String str2=str.substring(1,5);
        String str3="e";
        int cnt=0;
        //System.out.println(str2.length());
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            //System.out.println(str.substring(i,i+1));
           if(str3.equals(str.substring(i,i+1))){
               cnt++;
           }
        }
        System.out.println(cnt);
    }
}
