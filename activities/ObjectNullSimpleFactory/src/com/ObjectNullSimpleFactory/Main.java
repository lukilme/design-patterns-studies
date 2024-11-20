package com.ObjectNullSimpleFactory;

public class Main{
    public static void main(String[] args){
        LapTop a1 = LapTopFactory.createLapTop("normal");
        LapTop a2 = LapTopFactory.createLapTop("game");
        LapTop a3 = LapTopFactory.createLapTop("casa bahia");
        a1.runTest();
        a2.runTest();
        a3.runTest();
    }
}