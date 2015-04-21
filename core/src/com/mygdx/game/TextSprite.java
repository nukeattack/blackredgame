package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.engine.GameObject;

public class TextSprite extends GameObject {
	private BitmapFont font;
	
	public TextSprite() {
		font = new BitmapFont();
	}
	
	@Override
	public void draw(SpriteBatch spriteBatch) {
		super.draw(spriteBatch);
		font.draw(spriteBatch, "Welcome to Drop!!! ", 50, 50);
	}

	@Override
	public void update(double dt) {
		super.update(dt);
	}
}
