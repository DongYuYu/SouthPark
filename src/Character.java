public class Character {

    int life; //make some comments
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
