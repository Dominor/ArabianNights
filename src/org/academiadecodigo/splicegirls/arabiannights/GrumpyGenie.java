package org.academiadecodigo.splicegirls.arabiannights;

public class GrumpyGenie extends Genie {

    private boolean grantedWish;

    public GrumpyGenie (int maxNumberWishes) {

        super(maxNumberWishes);
        this.grantedWish = false;
    }

    @Override
    public boolean grantWish() {
        if (grantedWish) {
            return !grantedWish;
        }
        grantedWish = true;
        return super.grantWish();
    }

    @Override
    public String toString () {

        return super.toString() +
                "; Granted wish already? " + ((grantedWish) ? " Yes. " : " No. ");
    }
}
