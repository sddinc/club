package day10oop;

public class main {
    public static void main(String[] args) {
        pen p1= new pen();

        pen p2= new pen();
        matematica m1=new matematica();

        System.out.println(p1.color);
        p1.color="red";
        System.out.println("new color is "+p1.color);
        System.out.println(p2.color);
        p1.click();
        if(pen.clicked){
            System.out.println("pen is clicked");
        }else{
            System.out.println("pen is unClick");
        }

        m1.add(2,5);

        System.out.println(m1.div(40,3));

    }

}
