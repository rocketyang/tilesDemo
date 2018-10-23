/**
 * 
 */
package com.example.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author rocket
 *
 */
@Component
public class BlogDataSource {
	
	@Value("#{blogService.getBlogDesc()}")
	public String blogDescription;

}
