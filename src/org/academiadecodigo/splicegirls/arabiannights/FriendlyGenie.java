package org.academiadecodigo.splicegirls.arabiannights;

public class FriendlyGenie extends Genie {

    public FriendlyGenie (int maxWishes) {

        super(maxWishes);
    }

    @Override
    public boolean hasWishesLeft() {
        return getRemainingWishes() > 0;
    }

    @Override
    public String toString () {

        return "I am a Friendly Genie " + super.toString() + "\n";
    }
}
