
public class Knight {
    int energy;
    int beauty = 0;

    knight(beauty) {
        this.beauty = beauty;
    }

    void attack(Ogre ogre) {
        ogre.energy = (int) (0.9 * ogre.energy); // (int) just casts a float result into an int
        ogre.revenge(this); // this represents a reference to the current knight object
        System.out.println(this);
        // Is this output is diffrent for each pair because each pair is unique group of objects. They have identity.
    }
}
