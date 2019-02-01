import collection.GarbageCollection;

public class Test {

    public static void main(String[] args) {

        Character hero1 = new Character(100, 50);

        Character hero2 = new Character(150,75);

        hero1.attack(hero2);



        System.out.println(hero2.life);
        hero1.attack(hero2);
        System.out.println(hero2.life);
        hero1.attack(hero2);
        System.out.println(hero2.life);

        // Garbage Collection
        GarbageCollection gc = new GarbageCollection();
        gc = null;
        System.gc();
    }
}
