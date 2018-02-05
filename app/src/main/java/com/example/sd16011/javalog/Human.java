package com.example.sd16011.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable{
    String hobby;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void say(){ Log.d("javatest", "私の名前は"+ this.name + "です。年は"+this.age + "です。");}

    @Override
    public void think(){Log.d("javatest","私は"+ hobby + "について考える。");}
}
