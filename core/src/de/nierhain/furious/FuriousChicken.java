package de.nierhain.furious;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2D;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.ScreenUtils;

public class FuriousChicken extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private SplashWorker splashWorker;
	private World world;
	@Override
	public void create () {
		splashWorker.closeSplashScreen();
		Box2D.init();
		batch = new SpriteBatch();
		img = new Texture("splashscreen.jpg");
		world = new World(new Vector2(0,-10), true);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 0);
		world.step(1/60f, 6, 2);
		batch.begin();
		batch.draw(img, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();

		checkRefresh();
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
