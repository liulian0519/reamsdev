package com.xupt.edu.liulian.reams.util;

import java.util.Random;

public class PhoneCode {
    private String codes="0123456789";
    private Random r=new Random();
    private String text;//验证码文本信息
    private char randomChar(){//生成随机数字
        int index=r.nextInt(codes.length());
        return codes.charAt(index);
    }
    public String getCode(){
        StringBuilder sb=new StringBuilder();//用来装载生成的验证码文本
        //四位数的验证码
        for(int i=0;i<4;i++){
            String s=randomChar() + "";//随机生成一个数字（字符）
            sb.append(s);
        }
        this.text=sb.toString();//把生成的字符串赋值给this.text
        System.out.println(text);
        return text;
    }
}
