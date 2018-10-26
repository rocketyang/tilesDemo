/**
 * 
 */
package com.example.tiles;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;
import org.apache.tiles.definition.UnresolvingLocaleDefinitionsFactory;
import org.apache.tiles.request.Request;

/**
 * @author rocket
 *
 */
public class FloorDefinitionFactory  extends UnresolvingLocaleDefinitionsFactory{

	@Override
	public Definition getDefinition(String name, Request tilesContext) {
		// TODO Auto-generated method stub
		if (name.equals("floor")) {
			return createFloor();
		}
		return super.getDefinition(name, tilesContext);
	}
	private Definition createFloor() {
		Definition definition = new Definition();
		definition.setName("floor");
//		definition.setExtends("defaultTemplate");
		definition.setTemplateAttribute(new Attribute("/WEB-INF/template/floorTemplate.jsp"));
		definition.putAttribute("floor1", new Attribute("/WEB-INF/template/floor1.jsp"));
		definition.putAttribute("floor2", new Attribute("/WEB-INF/template/floor2.jsp"));
		return definition;
	}

}
