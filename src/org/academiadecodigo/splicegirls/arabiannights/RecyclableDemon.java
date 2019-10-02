package org.academiadecodigo.splicegirls.arabiannights;

public class RecyclableDemon extends Genie {

    private boolean isRecycled;
    private int timesRecycled;

    public RecyclableDemon (int maxNumberWishes) {
        super(maxNumberWishes);
        this.isRecycled = false;
        this.timesRecycled = 0;
    }

    @Override
    public boolean recycle () {
        if (!isRecycled && timesRecycled < 1) {
            isRecycled = true;
            timesRecycled++;
            return true;
        }
        return super.recycle();
    }

    @Override
    public boolean grantWish() {
        if (isRecycled) {
            return false;
        }
        return super.grantWish();
    }

    @Override
    public String toString () {

        return super.toString() +
                "; Is recycled? " + (isRecycled ? " Yes. " : " No. ");
    }
}
