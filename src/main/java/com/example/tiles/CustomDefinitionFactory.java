/**
 * 
 */
package com.example.tiles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;
import org.apache.tiles.definition.UnresolvingLocaleDefinitionsFactory;
import org.apache.tiles.definition.dao.DefinitionDAO;
import org.apache.tiles.request.ApplicationContextAware;
import org.apache.tiles.request.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.BeanUtils;

/**
 * @author rocket
 *
 */
public class CustomDefinitionFactory  extends  UnresolvingLocaleDefinitionsFactory {
	
//	private static final Logger LOGGER = LoggerFactory.getLogger(CustomDefinitionFactory.class);
	
	private List<IDefinitionLoader> loaders;
	/**
	 * @param loaders the loaders to set
	 */
	public void setLoaders(List<IDefinitionLoader> loaders) {
		this.loaders = loaders;
	}
	public List<IDefinitionLoader> getLoaders() {
		return this.loaders;
	}
    
	@Override
	/**
	 *  @TODO
	 */
	public Definition getDefinition(String name, Request tilesContext) {

		Map<String, Definition> definitionMap = mergeLoaders();
		return MapUtils.isNotEmpty(definitionMap) && definitionMap.containsKey(name)
				? definitionMap.get(name) : super.getDefinition(name, tilesContext);
	}
	/**
	 * 
	 * @TODO
	 */
	
	private Map<String, Definition> mergeLoaders() {

		Map<String, Definition> definitionMap = new HashMap<String, Definition>();
		if (loaders == null) {
			return null;
		}
		for (IDefinitionLoader loader : loaders) {
			definitionMap.putAll(loader.getDefinitions());
		}
		return definitionMap;
	}



	

}
