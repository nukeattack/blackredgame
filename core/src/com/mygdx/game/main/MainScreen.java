package com.mygdx.game.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.TextSprite;
import com.mygdx.game.box2d.Box2D;
import com.mygdx.game.engine.GameObject;

public class MainScreen implements Screen {
	private OrthographicCamera camera;
	private SpriteBatch spriteBatch;
	private GameObject rootObject;

	public MainScreen() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		
		spriteBatch = new SpriteBatch(10);
		rootObject =  new GameObject();
		rootObject.getChildren().add(new TextSprite());
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
		rootObject.draw(spriteBatch);
		spriteBatch.end();
		Box2D.instance.update(delta);
		Box2D.instance.render(camera.combined);
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