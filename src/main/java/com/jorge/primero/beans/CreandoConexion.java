package com.jorge.primero.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import com.jorge.primero.model.Conexion;
import com.jorge.primero.model.Usuario;

import javax.sql.DataSource;

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
	
	/*@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysq.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/blog");
		dataSource.setUsername("jorge");
		dataSource.setPassword("root");
		
		return dataSource;
	}*/
	
}
