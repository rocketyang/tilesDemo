/**
 * 
 */
package com.example.tiles;

import java.util.Map;

import org.apache.tiles.Definition;

/**
 * @author rocket
 *
 */
public interface IDefinitionLoader {
	
	public Map<String, Definition> getDefinitions();
}
