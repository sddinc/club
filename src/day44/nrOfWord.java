package day44;

public class nrOfWord {
    public static void main(String[] args) {
        String str="Polonia: Scurgeri de petrol din mega-conducta Drujba / La acest moment nu se cunosc cauzele incidentului";
   int cnt=0;
        for (int i=0;i< str.length();i++){
          if(str.charAt(i)==' ' ){
              cnt++;
          }
        }
        System.out.println(cnt);


    }
}
