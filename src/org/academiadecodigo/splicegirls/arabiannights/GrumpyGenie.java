package org.academiadecodigo.splicegirls.arabiannights;

public class GrumpyGenie extends Genie {

    public GrumpyGenie (int maxNumberWishes) {

        super(maxNumberWishes);
    }

    @Override
    public boolean grantWish() {
        if (grantedWish) {
            return false;
        }
        return super.grantWish();
    }
}
