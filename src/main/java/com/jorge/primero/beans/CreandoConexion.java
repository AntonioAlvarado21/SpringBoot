package com.jorge.primero.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.jorge.primero.model.Conexion;
import com.jorge.primero.model.Usuario;

@Component
public class CreandoConexion {

	@Bean(name = "beanUsuario")
	public Usuario getUsuario()
	{
		return new Usuario();
	}
	
	@Bean(name = "beanConexion")
	public Conexion getConexion()
	{
		Conexion conexion = new Conexion();
		conexion.setDb("mysql");
		conexion.setUrl("localhost");
		
		return conexion;
	}
	
	
}
