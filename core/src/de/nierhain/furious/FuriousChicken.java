package de.nierhain.furious;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2D;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.ScreenUtils;
import de.nierhain.furious.screens.MainMenu;

public class FuriousChicken extends Game {
	public final int SCREEN_SIZE = 1024;
	public SpriteBatch batch;
	public BitmapFont font;
	Texture img;
	private SplashWorker splashWorker;
	private World world;

	@Override
	public void create () {
		splashWorker.closeSplashScreen();
		Box2D.init();
		batch = new SpriteBatch();
		font = new BitmapFont();
		world = new World(new Vector2(0,-10), true);

		img = new Texture("bg.png");
		this.setScreen(new MainMenu(this));
	}

	@Override
	public void render () {
		drawBackground();
		world.step(1/60f, 6, 2);
		checkRefresh();
		super.render();
	}

	private void drawBackground() {
		batch.begin();
		batch.draw(img, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
	}

	private void checkRefresh() {
		if(Gdx.input.isKeyPressed(Input.Keys.F5)) {
			dispose();
			create();
		}
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}



	public SplashWorker getSplashWorker() {
		return splashWorker;
	}

	public void setSplashWorker(SplashWorker splashWorker) {
		this.splashWorker = splashWorker;
	}
}
