package com.example.proyecto.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="usuario")



public class usuario implements Serializable {

	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private String name;
	@Column
	private String telefono;
	@Column
	private String direccion;
	@Column
	private String correo;
	@Column
	private String estado;
	@Column
	private String password;
	
	@OneToOne
	@JoinColumn( name = "ID_ROL_FK", nullable = false )
	private rol rol;
	
	@ManyToOne
	@JoinColumn( name = "ID_GENERO_FK", nullable = false )
	private genero genero;
	
	
	@ManyToOne
	@JoinColumn( name = "ID_TIPO_DOCUMENTO_FK", nullable = false )
	private documento tipo_documento;
	
	
	
	
	
	public genero getgenero() {
		return genero;
	}
	public void setgenero(genero genero) {
		this.genero = genero;
	}
	public documento getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(documento tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public rol getrol() {
		return rol;
	}
	public void setrol(rol rol) {
		this.rol = rol;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
