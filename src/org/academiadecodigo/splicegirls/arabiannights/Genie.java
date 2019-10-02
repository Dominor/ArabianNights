package org.academiadecodigo.splicegirls.arabiannights;

public class Genie {

    protected int maxWishes;
    protected int remainingWishes;
    protected boolean grantedWish;

    public Genie (int maxWishes) {

        this.maxWishes = maxWishes;
        this.remainingWishes = this.maxWishes;
        this.grantedWish = false;
    }

    public boolean grantWish () {

        remainingWishes --;
        grantedWish = true;
        return true;
    }
}
