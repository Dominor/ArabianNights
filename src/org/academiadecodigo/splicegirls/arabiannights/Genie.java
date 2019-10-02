package org.academiadecodigo.splicegirls.arabiannights;

public class Genie {

    protected int maxWishes;
    protected int remainingWishes;

    public Genie (int maxWishes) {

        this.maxWishes = maxWishes;
        this.remainingWishes = maxWishes;
    }

    public boolean grantWish () {

        remainingWishes--;
        return true;
    }

    public boolean recycle() {
        return false;
    }

    @Override
    public String toString () {

        return "Max wishes: " + maxWishes +
                " Remaining wishes " + remainingWishes;
    }
}
