package com.jorge.primero.services;

import java.util.List;
import com.jorge.primero.model.Post;


public interface PostService {
	
	public List<Post> validation(List<Post> post);
	
	public void addClass(Class clazz);
	

}
