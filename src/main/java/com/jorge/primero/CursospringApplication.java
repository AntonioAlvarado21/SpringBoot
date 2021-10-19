package com.jorge.primero;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jorge.primero.components.PostComponent;
import com.jorge.primero.model.Conexion;
import com.jorge.primero.services.PostService;

@SpringBootApplication
public class CursospringApplication implements CommandLineRunner {
	
	@Autowired
	@Qualifier("beanConexion")
	private Conexion conexion;
	
	@Autowired
	@Qualifier("com.jorge.primero.components.PostComponent")
	public PostComponent postComponent;
	
	@Autowired
	@Qualifier("serviceDecorado")
	public PostService postService;
	
	public static void main(String[] args) {
		SpringApplication.run(CursospringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Log log = LogFactory.getLog(getClass());
		
		try {
			postService.validation(postComponent.getPosts())
			.forEach((post) -> {
					log.info(post.getTitulo());
				});
		}catch (Exception e)
		{
			log.error(e);
		}		
	}

	/*Otra forma de hacer inyecciones 
	@Autowired
	public CursospringApplication(@Qualifier("serviceDecorado") PostService postService)
	{
		this.postService = postService;
	}*/
	
}
