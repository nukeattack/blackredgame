package com.mygdx.game.engine;

import java.util.LinkedList;
import java.util.List;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameObject {
	protected List<GameObject> children;
	protected GameObject parent;
	
	public GameObject(){
		children = new LinkedList<GameObject>();
	}
	
	public void draw(SpriteBatch spriteBatch){
		for(GameObject gameObject : children){
			gameObject.draw(spriteBatch);
		}
	}
	
	public void update(double dt){
		for(GameObject gameObject : children){
			gameObject.update(dt);
		}
	}
	
	public List<GameObject> getChildren() {
		return children;
	}
}
