/**
 * 
 */
package com.example.loaders;

import java.util.HashMap;
import java.util.Map;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.springframework.stereotype.Component;

import com.example.tiles.IDefinitionLoader;

/**
 * @author rocket
 *
 */
public class FloorDefinitionLoader  implements IDefinitionLoader {

	@Override
	public Map<String, Definition> getDefinitions() {

		Map<String, Definition> map = new HashMap<String, Definition>();
		Definition definition = new Definition();
		definition.setName("floor");
//		definition.setExtends("defaultTemplate");
		definition.setTemplateAttribute(new Attribute("/WEB-INF/template/floorTemplate.jsp"));
		definition.putAttribute("floor1", new Attribute("/WEB-INF/template/floor1.jsp"));
		definition.putAttribute("floor2", new Attribute("/WEB-INF/template/floor2.jsp"));
		map.put("floor", definition);
		return map;
	}

}
