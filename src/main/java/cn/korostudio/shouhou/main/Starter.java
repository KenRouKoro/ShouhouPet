package cn.korostudio.shouhou.main;

import cn.korostudio.jsme.core.Application;
import cn.korostudio.jsme.core.BasePanel;
import cn.korostudio.jsme.data.Configuration;
import cn.korostudio.shouhou.data.SizeData;

import java.awt.*;
@cn.korostudio.jsme.core.loader.Application
public class Starter extends Application {
    protected SizeData sizeData=new SizeData(600,600);
    @Override
    public Configuration init() {
        Configuration configuration =new Configuration();
        VLCSupport=false;
        configuration.closingStop=true;
        configuration.window=true;
        configuration.fps=30;
        configuration.windowH=sizeData.h;
        configuration.windowW=sizeData.w;
        return configuration;
    }

    @Override
    public String getName() {
        return "ShouhouPet";
    }

    @Override
    public void sentData(Object... sent) {
        super.sentData(sent);
        if (sent.length>0)sizeData=(SizeData)sent[0];
    }

    @Override
    public void load(BasePanel basePanel) {
        basePanel.setBackground(Color.blue);
    }

    @Override
    public void stop() {

    }
}
