package de.nierhain.furious.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.nierhain.furious.FuriousChicken;
import de.nierhain.furious.desktop.settings.DesktopSettings;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = DesktopSettings.WINDOW_WIDTH;
		config.height = DesktopSettings.WINDOW_HEIGHT;
		config.title = DesktopSettings.WINDOW_TITLE;

		new LwjglApplication(new FuriousChicken(), config);
	}
}
