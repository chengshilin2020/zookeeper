package com.example.zkeepppp.controller;

import com.example.zkeepppp.entity.Config;
import com.example.zkeepppp.service.ZkConfigMag;

public class ZkConfigController {
    public static void main(String[] args) {
        ZkConfigMag mag = new ZkConfigMag();
        Config config = mag.downLoadConfigFromDB();
        System.out.println("....加载数据库配置...."+config.toString());
        mag.syncConfigToZk();
        System.out.println("....同步配置文件到zookeeper....");

        //歇会，这样看比较清晰
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        mag.upLoadConfigToDB("cwhcc6612121", "passwordcc66121212121");
        System.out.println("....修改配置文件...."+config.toString());
        mag.syncConfigToZk();
        System.out.println("....同步配置文件到zookeeper....");


    }

}
