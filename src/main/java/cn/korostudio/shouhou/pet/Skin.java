package cn.korostudio.shouhou.pet;

import java.awt.*;
import java.awt.image.BufferedImage;

public interface Skin {
     void touch();
     BufferedImage image();
     String mode();
     Component component();
}
