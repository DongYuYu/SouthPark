package extension;

import java.util.ArrayList;
import java.util.List;

public class Inheritance {
    public static void main(String[] args) {
        Parent p1 = new Parent(100);

        Parent p2 = p1;



        try {
            p2 = (Parent) p1.clone();
        } catch(Exception e) {
            e.printStackTrace();
        }


        p2.life = 230;
        System.gc();
        System.out.println(p2.life);









        System.out.println(p1.life);
    }
}

class Child extends Parent {


    public Child(int i) {
        super(i);
    }
    ArrayList<Integer> see() {
        life = 100;
        play();

        return new ArrayList<>();
    }
}


class House {
    int i = 10;
}




class Parent implements Cloneable{
    Integer life;


    String children = "boy";


    House h = new House();






    public Parent(int i) {
        life = i;




       // children = new String[] {"boy", "girl"};
    }

    List<Integer> see() {
        return new ArrayList<>();
    }
    protected void play() {

    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();



        System.out.println("collect" + life);
    }

}
