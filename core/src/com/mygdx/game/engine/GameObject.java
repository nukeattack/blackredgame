package com.mygdx.game.engine;

import java.util.List;

public abstract class GameObject {
	protected List<GameObject> children;
	protected GameObject parent;
	
	public GameObject(){
		
	}
	
	public void draw(){
		for(GameObject gameObject : children){
			gameObject.draw();
		}
	}
	
	public void update(double dt){
		for(GameObject gameObject : children){
			gameObject.update(dt);
		}
	}
}
