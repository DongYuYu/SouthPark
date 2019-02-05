public class Character {

    protected int life;
    int stagmia;


    public Character() {
        life = 100;
        stagmia = 230;
    }
    public boolean attack(Character c) {
        c.life -= 10;
        return true;
    }






}
