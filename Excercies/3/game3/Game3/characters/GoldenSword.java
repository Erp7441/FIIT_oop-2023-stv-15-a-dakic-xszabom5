package characters;

public class GoldenSword extends Sword {
    public GoldenSword(int productNumber) {
        super(productNumber);
    }

    public void hit(Knight knight, Ogre ogre) {
        if (knight.getEnergy() >= ogre.getEnergy())
            ogre.setEnergy((int) (0.6 * ogre.getEnergy()));

        System.out.println("Knight - golden sword");
    }

    public void hit(BraveKnight knight, Ogre ogre) {
        ogre.setEnergy((int) (0.5 * ogre.getEnergy()));

        System.out.println("Brave Knight - golden sword");
    }

    public void hit(HandsomeKnight knight, Ogre ogre) {
        ogre.setEnergy((int) (0.3 * ogre.getEnergy()));

        System.out.println("Brave Knight - golden sword");
    }
}
