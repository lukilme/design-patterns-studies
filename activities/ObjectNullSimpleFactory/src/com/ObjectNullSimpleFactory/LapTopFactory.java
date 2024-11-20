package com.ObjectNullSimpleFactory;

public class LapTopFactory {
    public static LapTop createLapTop(String command){
        if(command.equals("game")){
            return new GamingLapTop();
        }
        if(command.equals("normal")){
            return new NormalLapTop();
        }
        return new NullLapTop();
    }
}
