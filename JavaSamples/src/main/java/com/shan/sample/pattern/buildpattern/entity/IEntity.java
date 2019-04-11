package com.shan.sample.pattern.buildpattern.entity;

import java.util.List;

public interface IEntity {
	
	// intialize Entity and subEntity to begin this test.
	public Entity build();
	
	// read an Entity
	public String readEntity();
	
	// get Entities
	public List<Entity> getEntity();

	//send an Entity (to root, or attached to another entity)
	public void sendEntity(Entity entity);
}
