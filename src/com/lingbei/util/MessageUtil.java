package com.lingbei.util;

public class MessageUtil {

    private String message;

    public MessageUtil(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);

        int a =0;
        int b = 1/a;
        return message;
    }

    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
