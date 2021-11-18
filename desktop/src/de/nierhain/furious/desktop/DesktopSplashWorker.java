package de.nierhain.furious.desktop;

import de.nierhain.furious.SplashWorker;

import java.awt.*;

public class DesktopSplashWorker implements SplashWorker {
    @Override
    public void closeSplashScreen() {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if(splash != null){
            splash.close();
        }
    }
}
