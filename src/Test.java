import collection.GarbageCollection;

public class Test {

    public static void main(String[] args) {

        Character hero1 = new Character();

        Character hero2 = new Character();

        hero1.attack(hero2);



        System.out.println(hero2.life == 90);
        hero1.attack(hero2);
        System.out.println(hero2.life == 80);
        hero1.attack(hero2);
        System.out.println(hero2.life);

        // Garbage Collection
        GarbageCollection gc = new GarbageCollection();
        gc = null;
        System.gc();
    }
}
