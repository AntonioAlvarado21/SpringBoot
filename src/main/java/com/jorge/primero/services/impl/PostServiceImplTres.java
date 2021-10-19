package com.jorge.primero.services.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.jorge.primero.model.Post;
import com.jorge.primero.services.PostService;

@Service("serviceTres")
public class PostServiceImplTres implements PostService {

	private final Log log = LogFactory.getLog(getClass());
	
	@Override
	public List<Post> validation(List<Post> posts) {
		
		log.info("Servicio 2");
		for(Post post : posts)
		{
			if(post.getId() == 0)
			{
				throw new NullPointerException("El id no existe");
			}
		}
		return posts;
	}

	@Override
	public void addClass(Class clazz) {
		
	}
	
}
