package com.shan.sample.pattern.buildpattern.entity;

public class EntityTest {

	private IEntity entity;
	
	public EntityTest(final IEntity entity) {
        this.entity = entity;
    }
	
	public Entity construct() {
		return entity.build();
	}
	
	public static void main(String[] args) {
		final IEntity entity = new EntityImpl();
		
		// intialize Entity
		final EntityTest entityTest = new EntityTest(entity);
		
		Entity subEntity = new Entity();
		subEntity.setId("0012");
		subEntity.setName("NEW SUB ENTITY NAME 2");
		// send entity to the root entity
		entityTest.entity.sendEntity(subEntity);
		
		
		// read entity
		System.out.println("read entity : " + entityTest.entity.readEntity());
		
		//get the list of entities
		entityTest.entity.getEntity().forEach(e -> {
			System.out.println("Root entities : " + e.toString());
			e.getEntities().forEach(se -> {
				System.out.println("Child Entities" + se.toString());
			});
		});
		
	}

}
