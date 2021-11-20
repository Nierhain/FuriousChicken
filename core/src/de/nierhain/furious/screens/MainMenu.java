package de.nierhain.furious.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.ScreenUtils;
import de.nierhain.furious.FuriousChicken;

public class MainMenu implements Screen {

    final FuriousChicken _game;
    OrthographicCamera camera;
    Stage stage;

    public MainMenu(FuriousChicken game){
        _game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, _game.SCREEN_SIZE, _game.SCREEN_SIZE);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);

        camera.update();
        _game.batch.setProjectionMatrix(camera.combined);

        _game.batch.begin();
        _game.font.draw(_game.batch, )
    }

    @Override
    public void resize(int width, int height){
//        Vector2 size = Scaling.fit.apply(_game.SCREEN_SIZE, _game.SCREEN_SIZE, width, height);
//        int viewportX = (int) ((width - size.x) / 2);
//        int viewportY = (int) ((height - size.y) / 2);
//        int viewportWidth = (int) size.x;
//        int viewportHeight = (int) size.y;
//        Gdx.gl.glViewport(viewportX, viewportY, viewportWidth, viewportHeight);
//        stage.setViewport(_game.SCREEN_SIZE, _game.SCREEN_SIZE, true, viewportX, viewportY, viewportWidth, viewportHeight);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
