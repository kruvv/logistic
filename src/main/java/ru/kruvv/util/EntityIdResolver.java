package ru.kruvv.util;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.ObjectIdResolver;

/**
 * @author Viktor Krupkin
 **/

public class EntityIdResolver implements ObjectIdResolver {

	private EntityManager entityMenager;

	@Autowired
	public EntityIdResolver(EntityManager entityMenager) {
		this.entityMenager = entityMenager;
	}

	@Override
	public void bindItem(IdKey id, Object pojo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object resolveId(IdKey id) {
		// By Id and scope find entity, parse value key
		return entityMenager.find(id.scope, Long.parseLong(id.key.toString()));
	}

	@Override
	public ObjectIdResolver newForDeserialization(Object context) {

		return this;
	}

	@Override
	public boolean canUseFor(ObjectIdResolver resolverType) {
		// TODO Auto-generated method stub
		return false;
	}

}
