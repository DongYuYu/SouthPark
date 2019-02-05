import collection.GarbageCollection;


import extension.Inheritance;
public class Test {

    public static void main(String[] args) {

        Character hero1 = new Character();

        Character hero2 = new Character();

        System.out.println(hero1.life);
        hero1.attack(hero2);



        System.out.println(hero2.life == 90);
        hero1.attack(hero2);
        System.out.println(hero2.life == 80);
        hero1.attack(hero2);
        System.out.println(hero2.life);

        // Garbage Collection
        GarbageCollection gc = new GarbageCollection();
        System.out.println(gc.value);
        gc = null;
        System.gc();




        // wrapper
        Integer i = 10;
        int p = i.intValue();
        String t = "10";


        Float f = Float.parseFloat(t);
        System.out.println(f);


    }
}
