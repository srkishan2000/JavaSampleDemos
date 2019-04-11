package com.shan.sample.pattern.buildpattern.entity;

import java.util.ArrayList;
import java.util.List;

public class EntityImpl implements IEntity {
	private Entity tmpEntity;
	private List<Entity> list = new ArrayList<>();
	
	public EntityImpl() {
		tmpEntity = new Entity();
		
		tmpEntity.setId("0001");
		tmpEntity.setName("ENTITY NAME 1");
		
		Entity tmpSubEntity = new Entity();
		tmpSubEntity.setId("0011");
		tmpSubEntity.setName("SUB ENTITY NAME");

		sendEntity(tmpSubEntity);		
	}

	@Override
	public Entity build() {
		Entity entity = new Entity();
		entity.setId(tmpEntity.getId());
		entity.setName(tmpEntity.getName());
		entity.setEntities(tmpEntity.getEntities());		
		return entity;
	}

	@Override
	public String readEntity() {
		return tmpEntity.toString();
	}

	@Override
	public void sendEntity(Entity entity) {
		if (entity != null) {
			list.add(entity);
			tmpEntity.setEntities(list);
			System.out.println("ADDED in the root entity");
		} else {
			System.out.println("Cannot add the entity in to the root...");
		}
		
	}

	@Override
	public List<Entity> getEntity() {
		List<Entity> list = new ArrayList<>();
		list.add(tmpEntity);
		
		return list;
	}
	
	
	
}
