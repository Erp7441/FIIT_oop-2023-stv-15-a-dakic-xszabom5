package game;

import characters.*;

public class ComplexGameSetup implements GameSetup {
    public void setup(Knight[] knights, Ogre[] ogres, int nKnights, int nBraveKnights, int nBadOgres) {
        int numberOfWarriors = nKnights + nBraveKnights;

        for (int i = 0; i < nBraveKnights; ++i){
            knights[i] = new BraveKnight((int) (100 * Math.random()), new LightSword(i));
        }

        for (int i = nBraveKnights; i < numberOfWarriors; ++i){
            knights[i] = new Knight((int) (80 * Math.random()), new IronSword(i));
        }

        for (int i = 0; i < nBadOgres; ++i){
            ogres[i] = new BadOgre((int) (100 * Math.random()));
        }

        for (int i = nBadOgres; i < numberOfWarriors; ++i){
            ogres[i] = new Ogre((int) (100 * Math.random()));
        }
    }
}
