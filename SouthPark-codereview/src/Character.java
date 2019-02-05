public class Character {

    int life; //make some comments
    int stagmia;

    private final int STRONG_ATTACK = 40;

    public Character(int life, int stagmia) {
        this.life = life;
        this.stagmia = stagmia;
    }

    public boolean attack(Character c) {
        c.life = c.life - STRONG_ATTACK;
        return true;//use of this method?
    }






}
