package com.jorge.primero.services.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.jorge.primero.model.Post;
import com.jorge.primero.services.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Override
	public List<Post> validation(List<Post> posts) {
		
		final Log log = LogFactory.getLog(getClass());
		
		log.info("Servicio 1");
		for(Post post : posts)
		{
			if(post.getTitulo() == null)
			{
				throw new NullPointerException("El titulo no existe");
			}
		}
		
		return posts;
	}

	@Override
	public void addClass(Class clazz) {
		// TODO Auto-generated method stub
		
	}

}
