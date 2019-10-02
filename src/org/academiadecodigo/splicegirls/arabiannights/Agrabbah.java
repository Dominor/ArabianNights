package org.academiadecodigo.splicegirls.arabiannights;

public class Agrabbah {

    public static void main(String[] args) {

        MagicLamp magicLamp = new MagicLamp(3);
        Genie genie1 = magicLamp.release(1);
        Genie genie2 = magicLamp.release(1);
        Genie genie3 = magicLamp.release(1);
        Genie genie4 = magicLamp.release(1);
        Genie genie5 = magicLamp.release(1);
        System.out.println(genie1);
        genie1.grantWish();
        System.out.println(magicLamp);
        System.out.println(genie1);

        genie1.grantWish();
        System.out.println(magicLamp);
        System.out.println(genie1);

        genie1.grantWish();
        System.out.println(magicLamp);
        System.out.println(genie1);

        magicLamp.recharge(magicLamp.release(1));
        System.out.println(magicLamp);
        System.out.println(genie4);

        genie5.grantWish();
        System.out.println(magicLamp);
        System.out.println(genie5);
    }
}
