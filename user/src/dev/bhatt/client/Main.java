package dev.bhatt.client;

import andy.ong.export.ReceivingSub;

import nish.bhatt.add.Adder;
// Package 'nish.bhatt.add' is declared in module 'bellow', which does not export it to module 'papa'
//import andy.ong.subtract.Subtractor;
//Package 'andy.ong.subtract' is declared in module 'yellow', which does not export it to module 'papa'
import nish.bhatt.export.Receiver;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ReceivingSub receivingSub = new ReceivingSub();

        Adder adder = new Adder();

        int adding = adder.adding(2, 13);
        System.out.println("now can access" + adding);
        System.out.println(receiver.receiverMethod(2,3));
        System.out.println(receivingSub.receiver(8,4));
    }
}
