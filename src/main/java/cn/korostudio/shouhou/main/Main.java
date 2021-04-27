package cn.korostudio.shouhou.main;

import cn.korostudio.jsme.core.Application;
import cn.korostudio.jsme.core.err.Error;
import cn.korostudio.shouhou.data.SizeData;

public class Main {
    public static void main(String[] args) {
        int w=600;
        int h=600;
        for (String arg:args) {
            if (arg.contains("=")){
                String[] split =arg.split("=");
                split[0]=split[0].trim();
                switch (split[0]){
                    case "w":
                        w=Integer.parseInt(split[1]);
                        break;
                    case "h":
                        h=Integer.parseInt(split[1]);
                        break;
                }
            }
        }
        SizeData sizeData=new SizeData();
        sizeData.w=w;
        sizeData.h=h;
        try {
            Application.start(Starter.class,sizeData);
        } catch (Exception e) {
            Error.error(Main.class,e);
        }
    }
}
