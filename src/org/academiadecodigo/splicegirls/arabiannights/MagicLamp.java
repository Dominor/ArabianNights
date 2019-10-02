package org.academiadecodigo.splicegirls.arabiannights;

public class MagicLamp {

    private int capacity;
    private int remainingGenies;
    private boolean mood; // true = friendly, false = grumpy
    private int timesRecharged;

    public MagicLamp (int capacity) {

        this.capacity = capacity;
        this.remainingGenies = capacity;
        this.mood = true;
        this.timesRecharged = 0;
    }

    public Genie release(int capacity) {

        Genie genie = (mood) ? new FriendlyGenie(capacity) : new GrumpyGenie(capacity);
        remainingGenies--;
        return genie;
    }

    public void recycle (RecyclableDemon recyclableDemon) {

        if (recyclableDemon.checkIsRecycled()) {
            remainingGenies++;
            timesRecharged++;
        }
    }

    @Override
    public boolean equals (Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof MagicLamp)) {
            return false;
        }

        // typecast o to MagicLamp so that we can compare data members
        MagicLamp c = (MagicLamp) o;

        // Compare the data members and return accordingly
        return (this.capacity ==  c.capacity && this.remainingGenies == c.remainingGenies && this.timesRecharged == c.timesRecharged);
    }
}
