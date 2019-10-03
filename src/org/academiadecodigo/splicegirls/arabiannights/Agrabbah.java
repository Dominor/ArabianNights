package org.academiadecodigo.splicegirls.arabiannights;

public class Agrabbah {

    public static void main(String[] args) {

        MagicLamp magicLamp = new MagicLamp(3);
        Genie genie1 = magicLamp.rub(1);
        Genie genie2 = magicLamp.rub(1);
        Genie genie3 = magicLamp.rub(1);
        System.out.println(genie1);
        genie1.grantWish();
        System.out.println(magicLamp);
        System.out.println(genie1);

        genie1.grantWish();
        System.out.println(magicLamp);
        System.out.println(genie1);

        genie2.grantWish();
        System.out.println(magicLamp);
        System.out.println(genie2);

        magicLamp.recharge(magicLamp.rub(1));
        System.out.println(magicLamp);

        System.out.println(genie3);
        genie3.grantWish();
        System.out.println(magicLamp);
        System.out.println(genie3);
    }
}
