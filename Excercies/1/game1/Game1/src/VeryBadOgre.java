

public class VeryBadOgre extends BadOgre {
    @Override
    void revenge(Knight knight) {
        if (hungry)
            eat(knight);
        else
            System.out.println("I'll get you next time!");
    }
    void eat(Knight knight) {
        knight.energy = 0;
    }

}


