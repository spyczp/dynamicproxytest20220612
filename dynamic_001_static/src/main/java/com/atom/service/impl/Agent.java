package com.atom.service.impl;

import com.atom.service.Service;

public class Agent implements Service {

    //传入主体对象，这里是任意歌手
    public Service target;

    public Agent(Service target){
        this.target = target;
    }

    @Override
    public void sing() {
        System.out.println("预订时间...");
        System.out.println("预订场地...");

        /*//唱歌业务得由歌手来完成
        SuperStarLiu ssl = new SuperStarLiu();
        ssl.sing();*/
        this.target.sing();


        System.out.println("结算费用...");
    }
}