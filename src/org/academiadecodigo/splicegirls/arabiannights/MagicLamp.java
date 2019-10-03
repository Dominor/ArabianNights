package org.academiadecodigo.splicegirls.arabiannights;

public class MagicLamp {

    private int capacity;
    private int rubs;
    private int timesRecharged;

    public MagicLamp (int capacity) {

        this.capacity = capacity;
        this.rubs = 0;
    }

    public Genie rub(int maxWishes) {
        Genie genie = null;
        if(getAvailableGenies() == 0) {
            return new RecyclableDemon(maxWishes);
        }
        if (getAvailableGenies() % 2 == 0) {
            genie = new FriendlyGenie(maxWishes);
        } else {
            genie = new GrumpyGenie(maxWishes);
        }
        rubs++;
        return genie;
    }

    public void recharge (Genie genie) {
        if(!(genie instanceof RecyclableDemon)) {
            return;
        }

        // Safe cast because we use instanceof to check runtime type of Genie variable before making the cast
        RecyclableDemon demon = (RecyclableDemon) genie;

        if (demon.isRecycled()) {
            return;
        }

        demon.recycle();
        rubs--;
        timesRecharged++;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableGenies() {
        int availableGenies = getCapacity() - getRubs();
        return (availableGenies >= 0) ? availableGenies : 0;
    }

    public int getRubs() {
        return rubs;
    }

    public int getTimesRecharged() {
        return timesRecharged;
    }

    public boolean equals (MagicLamp lamp) {

        return (this.getCapacity() ==  lamp.getCapacity() && this.getAvailableGenies() == lamp.getAvailableGenies() && this.getTimesRecharged() == lamp.getTimesRecharged());
    }

    @Override
    public String toString() {
        return "Magic Lamp: " +
                "Capacity: " + getCapacity() +
                "; Available Genies: " + getAvailableGenies() +
                "; Times recharged: " + getTimesRecharged();
    }
}
