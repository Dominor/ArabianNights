package org.academiadecodigo.splicegirls.arabiannights;

public class MagicLamp {

    private int capacity;
    private int remainingGenies;
    private int timesRecharged;

    public MagicLamp (int capacity) {

        this.capacity = capacity;
        this.remainingGenies = capacity;
        this.timesRecharged = 0;
    }

    public Genie release(int maxWishes) {

        if (remainingGenies % 2 == 0) {
            remainingGenies--;
            return new FriendlyGenie(maxWishes);
        }
        if (remainingGenies-- % 2 == 1) {
            remainingGenies--;
            return new GrumpyGenie(maxWishes);
        }
        if(remainingGenies <= 0) {
            remainingGenies--;
            return new RecyclableDemon(maxWishes);
        }
        return null;
    }

    public void recharge (Genie recyclableDemon) {
        if(recyclableDemon.recycle()) {
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

    @Override
    public String toString() {
        return "Magic Lamp: " +
                "Capacity: " + capacity +
                "; Remaining Genies: " + remainingGenies +
                "; Times recharged: " + timesRecharged;
    }
}
