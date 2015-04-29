package com.mygdx.game;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.equations.Elastic;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.mygdx.game.box2d.Box2D;
import com.mygdx.game.engine.GameObject;
import com.mygdx.game.engine.Animation;
import com.mygdx.game.engine.VectorTweenAccessor;

public class TextSprite extends GameObject {
	private BitmapFont font;
	private Body box2dBody;
	private Vector2 position = new Vector2(100, 100);
	private Vector2 scale = new Vector2(1, 1);
	
	public TextSprite() {
		font = new BitmapFont();
		box2dBody = Box2D.instance.createBody(this);
		Tween.to(position, VectorTweenAccessor.POSITION_XY, 1.25f).target(200, 120).ease(Elastic.OUT).start(Animation.manager);
		Tween.to(scale, VectorTweenAccessor.POSITION_XY, 1.25f).target(5, 5).ease(Elastic.OUT).start(Animation.manager);
	}
	
	@Override
	public void draw(SpriteBatch spriteBatch) {
		super.draw(spriteBatch);
		font.draw(spriteBatch, "Welcome to Drop!!! ", position.x, position.y);
		font.setScale(scale.x, scale.y);
	}

	@Override
	public void update(double dt) {
		super.update(dt);
	}
}
