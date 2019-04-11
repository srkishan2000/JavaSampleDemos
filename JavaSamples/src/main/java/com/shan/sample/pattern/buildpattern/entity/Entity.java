package com.shan.sample.pattern.buildpattern.entity;

import java.util.List;

public class Entity {

	private String id;
	private String name;
	private List<Entity> entities;
	
	public Entity() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Entity> getEntities() {
		return entities;
	}

	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

	@Override
	public String toString() {
		int size = (entities != null && entities.size() > 0 ? entities.size() : 0);
		return "Entity [id=" + id + ", name=" + name + ", no of entities has=" + size + "]";
	}

	
}
