package com.lingbei.util;

public class MessageUtil {

    private String message;

    public MessageUtil(String message){
        this.message = message;
    }

    public String printMeassage(){
        System.out.println(message);
        return message;
    }
}
