package org.academiadecodigo.splicegirls.arabiannights;

public abstract class Genie {

    private int maxWishes;
    private int grantedWishes;

    public Genie (int maxWishes) {

        this.maxWishes = maxWishes;
        this.grantedWishes = 0;
    }

    public boolean grantWish () {

        if (hasWishesLeft()) {
            grantedWishes++;
            return true;
        }
        return false;
    }

    public int getMaxWishes() {
        return maxWishes;
    }

    public abstract boolean hasWishesLeft();

    public int getGrantedWishes() {
        return grantedWishes;
    }

    public int getRemainingWishes() {
        int remainingWishes = getMaxWishes() - getGrantedWishes();
        return (remainingWishes >= 0) ? remainingWishes : 0;
    }

    @Override
    public String toString () {

        return "Max wishes: " + getMaxWishes() +
                " Remaining wishes " + getRemainingWishes();
    }
}
