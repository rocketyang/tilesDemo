/**
 * 
 */
package com.example.tiles;

import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;
import org.apache.tiles.definition.dao.DefinitionDAO;
import org.apache.tiles.request.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.BeanUtils;

/**
 * @author rocket
 *
 */
public class CustomDefinitionFactory  implements DefinitionsFactory {
	
//	private static final Logger LOGGER = LoggerFactory.getLogger(CustomDefinitionFactory.class);
	private DefinitionDAO<String> definitionDao;
	
	public CustomDefinitionFactory() {

    	definitionDao = BeanUtils.instantiate(com.example.tiles.CustomDefinitionDao.class);
	}
    
	@Override
	public Definition getDefinition(String name, Request tilesContext) {

		return definitionDao.getDefinition(name, null);

	}
	

}
