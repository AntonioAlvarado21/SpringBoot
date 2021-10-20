package com.jorge.primero.services.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.jorge.primero.model.Post;
import com.jorge.primero.services.PostService;

@Service("serviceDecorado")
@Scope("singleton")
public class PostServiceDecoradoImp implements PostService {

	private final Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private PostServiceImpl postServiceImpl;
	
	@Autowired
	private PostServiceImplTres postServiceImplTres;
	
	@Override
	public List<Post> validation(List<Post> posts) {
		log.debug(posts);
		posts = postServiceImpl.validation(posts);
		posts = postServiceImplTres.validation(posts);
		
		for(Post post : posts)
		{
			if(post.getDescripcion() == null)
			{
				throw new NullPointerException("La descripcion no existe");
			}
			if(post.getFecha() == null)
			{
				throw new NullPointerException("La fecha no existe");
			}
		}
		
		
		return posts;
	}

	@Override
	public void addClass(Class clazz) {

		
	}
	
	
}
