package com.jorge.primero;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jorge.primero.components.PostComponent;
import com.jorge.primero.model.Conexion;
import com.jorge.primero.services.PostService;


@SpringBootApplication
public class CursospringApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("${cursospring.jdbc.import.ruta}")
	private String ruta;
	
	@Value("${cursospring.jdbc.import}")
	private String importar;
	
	
	/*@Autowired
	@Qualifier("beanConexion")
	private Conexion conexion;
	
	@Autowired
	@Qualifier("com.jorge.primero.components.PostComponent")
	public PostComponent postComponent;
	
	@Autowired
	@Qualifier("serviceDecorado")
	public PostService postService;*/
	
	Log log = LogFactory.getLog(getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(CursospringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Log log = LogFactory.getLog(getClass());
		
		try {
			postService.validation(postComponent.getPosts())
			.forEach((post) -> {
					log.info(post.getTitulo());
				});
		}catch (Exception e)
		{
			log.error(e);
		}		*/
		
		//jdbcTemplate.execute("insert into permiso (Nombre) values ('Ejemplo')");
	
		/*Path path = Paths.get("src/main/resources/import.sql");
		
		Log log = LogFactory.getLog(getClass());
		try(BufferedReader bufferReader = Files.newBufferedReader(path, Charset.forName("UTF-8")))
		{
			String line;
			while((line = bufferReader.readLine()) != null) {
				//log.info(line);
				
				jdbcTemplate.execute(line);
			}
			
		}catch(IOException ex) {
			
		}*/
		
		if(importar.equalsIgnoreCase("true")) {
			Path path = Paths.get("ruta");
			
			
			try(BufferedReader bufferReader = Files.newBufferedReader(path, Charset.forName("UTF-8")))
			{
				String line;
				while((line = bufferReader.readLine()) != null) {
					//log.info(line);
					
					jdbcTemplate.execute(line);
				}
				
			}catch(IOException ex) {
				
			}
			
		}
		
		log.info("Tenemos estos permisos: " + jdbcTemplate.queryForObject("SELECT count(*) FROM permiso;", Integer.class));
	}
	
	/*Otra forma de hacer inyecciones 
	@Autowired
	public CursospringApplication(@Qualifier("serviceDecorado") PostService postService)
	{
		this.postService = postService;
	}*/
	
}
