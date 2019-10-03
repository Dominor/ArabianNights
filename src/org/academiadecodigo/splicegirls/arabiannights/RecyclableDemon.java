package org.academiadecodigo.splicegirls.arabiannights;

public class RecyclableDemon extends Genie {

    private boolean recycled;

    public RecyclableDemon (int maxNumberWishes) {
        super(maxNumberWishes);
        this.recycled = false;
    }

    public void recycle () {
        recycled = true;
    }

    @Override
    public boolean hasWishesLeft() {
        return !recycled;
    }

    public boolean isRecycled() {
        return recycled;
    }

    @Override
    public String toString () {

        return "I am a Demon " + super.toString() +
                "; Is recycled? " + (recycled ? " Yes. " : " No. ") + "\n";
    }
}
