package com.jorge.primero.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jorge.primero.model.Post;

@Component("com.jorge.primero.components.PostComponent")
public class PostComponent {
	
	public List<Post> getPosts()
	{
		ArrayList<Post> post = new ArrayList<>();
		
		post.add(new Post(1,"Desarrollo web es un término que define la creación de sitios web para Internet o una intranet","http://localhost:90/img/01.jpg",new Date(),"Desarrollo Web"));
		post.add(new Post(2,"Desarrollo web es un término que define la creación de sitios web para Internet o una intranet","http://localhost:90/img/01.jpg",new Date(),"Desarrollo Web Front-End"));
		post.add(new Post(3,"Desarrollo web es un término que define la creación de sitios web para Internet o una intranet","http://localhost:90/img/01.jpg",new Date(),"Desarrollo Web Back-End"));
		post.add(new Post(4,"Desarrollo web es un término que define la creación de sitios web para Internet o una intranet","http://localhost:90/img/01.jpg",new Date(),"Desarrollo Web UX/UI"));

		return post;
	}

}
