package game1;

public class VeryBadOgre extends BadOgre {
    @Override
    public void revenge(Knight knight) {
        if (hungry)
            eat(knight);
        else
            System.out.println("I'll get you next time!");
    }
    public void eat(Knight knight) {
        knight.energy = 0;
    }

}


