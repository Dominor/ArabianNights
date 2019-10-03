package org.academiadecodigo.splicegirls.arabiannights;

public class GrumpyGenie extends Genie {

    public GrumpyGenie (int maxNumberWishes) {

        super(maxNumberWishes);
    }

    @Override
    public boolean hasWishesLeft() {

        return getGrantedWishes() == 0;
    }

    @Override
    public String toString () {

        return "I am a Grumpy Genie " + super.toString() +
                "; Granted wish? " + ((!hasWishesLeft()) ? " Yes. " : " No. ") + "\n";
    }
}
