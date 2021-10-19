package com.jorge.primero.model;

import java.util.Date;


public class Post {

	private int id;
	private String descripcion;
	private String urlImg="http://localhost:90/img/01.jpg";
	private Date fecha = new Date();
	private String titulo;
	
	//METODOS GETTER Y SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	//CONSTRUCTORES
	public Post(int id, String descripcion, String urlImg, Date fecha, String titulo) {
		this.id = id;
		this.descripcion = descripcion;
		this.urlImg = urlImg;
		this.fecha = fecha;
		this.titulo = titulo;
	}
	
	public Post() {
		
	}
	
	
	
	
}


