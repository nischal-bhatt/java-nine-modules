package nish.bhatt.export;

import nish.bhatt.add.Adder;

public class Receiver {

    public int receiverMethod(int r , int c) {
        Adder adder = new Adder();
        return adder.adding(r,c);
    }

}
