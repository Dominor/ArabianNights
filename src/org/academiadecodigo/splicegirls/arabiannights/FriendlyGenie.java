package org.academiadecodigo.splicegirls.arabiannights;

public class FriendlyGenie extends Genie {

    public FriendlyGenie (int maxWishes) {

        super(maxWishes);
    }

    @Override
    public boolean grantWish () {

        if (super.remainingWishes <= 0) {
            return false;
        }
        return super.grantWish();
    }
}
