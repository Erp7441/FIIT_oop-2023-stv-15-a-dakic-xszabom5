package game1;
public class HandsomeKnight extends Knight{
    public int energy;
    public int beauty = 0;

    public HandsomeKnight(int beauty) {
        this.beauty = beauty;
    }

    public void attack(Ogre ogre) {
        ogre.energy = (int) (0.9 * ogre.energy); // (int) just casts a float result into an int
        ogre.revenge((Knight) this); // this represents a reference to the current knight object
        System.out.println(this);
        // Is this output is diffrent for each pair because each pair is unique group of objects. They have identity.
    }
}
