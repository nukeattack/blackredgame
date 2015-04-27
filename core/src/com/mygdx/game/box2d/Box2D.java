package com.mygdx.game.box2d;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

public class Box2D {
	public static final Box2D instance = new Box2D();
	
	private Box2DDebugRenderer debugRenderer;
	private World world;
	
	private Box2D(){
		world = new World(new Vector2(0, -10), false);
		debugRenderer = new Box2DDebugRenderer();
	}
	
	public void update(float dt){
		world.step(1.0f/60.0f, 6, 2);
	}
	
	public void render(Matrix4 matrix){
		debugRenderer.render(world, matrix);
	}
	
	public Box2DDebugRenderer getDebugRenderer() {
		return debugRenderer;
	}
}
