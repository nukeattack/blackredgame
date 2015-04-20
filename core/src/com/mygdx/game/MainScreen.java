package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.engine.GameObject;

public class MainScreen implements Screen {
	private OrthographicCamera camera;
	private SpriteBatch spriteBatch;
	private BitmapFont font;
	private GameObject rootObject;

	public MainScreen() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		font = new BitmapFont();
		spriteBatch = new SpriteBatch(10);
		rootObject =  new GameObject();
	}

	@Override
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0.0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		spriteBatch.setProjectionMatrix(camera.combined);
		spriteBatch.begin();
		font.draw(spriteBatch, "Welcome to Drop!!! ", 100, 150);
		rootObject.draw(spriteBatch);
		spriteBatch.end();
		camera.update();
	}

	@Override
	public void resize(int width, int height) {
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
