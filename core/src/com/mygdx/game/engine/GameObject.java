package com.mygdx.game.engine;

import java.util.List;

public abstract class GameObject {
	protected List<GameObject> children;
	protected GameObject parent;
	
	public GameObject(){
		
	}
	
	public void draw(){
		
	}
	
	public void update(double dt){
		
	}
}
