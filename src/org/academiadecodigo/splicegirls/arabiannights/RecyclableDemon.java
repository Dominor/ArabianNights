package org.academiadecodigo.splicegirls.arabiannights;

public class RecyclableDemon extends Genie {

    private boolean isRecycled;

    public RecyclableDemon (int maxNumberWishes) {
        super(maxNumberWishes);
        this.isRecycled = false;
    }

    public boolean checkIsRecycled () {
        return isRecycled;
    }

    public void recharge (MagicLamp magicLamp) {
        isRecycled = true;
        magicLamp.recycle(this);
    }

    @Override
    public boolean grantWish() {
        if (grantedWish || isRecycled) {
            return false;
        }
        return super.grantWish();
    }
}
