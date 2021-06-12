package com.example.proyecto.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@NamedQueries(value= {
		@NamedQuery(name="usuario.findUsuarioById", query = "SELECT c FROM usuario c WHERE c.id = :id"),
		@NamedQuery(name="usuario.findUsuarioByName", query = "SELECT c FROM usuario c WHERE c.name = :name"),
		@NamedQuery(name="usuario.findUsuarioByTelefono", query = "SELECT c FROM usuario c WHERE c.telefono = :telefono"),
		@NamedQuery(name="usuario.findUsuarioByDireccion", query = "SELECT c FROM usuario c WHERE c.direccion = :direccion"),
		@NamedQuery(name="usuario.findUsuarioByCorreo", query = "SELECT c FROM usuario c WHERE c.correo = :correo"),
		@NamedQuery(name="usuario.findUsuarioByEstado", query = "SELECT c FROM usuario c WHERE c.estado = :estado"),
		@NamedQuery(name="usuario.findUsuarioByPassword", query = "SELECT c FROM usuario c WHERE c.password = :password"),
		@NamedQuery(name="usuario.findUsuarioByRol", query = "SELECT c FROM usuario c WHERE c.rol = :rol"),
		@NamedQuery(name="usuario.findUsuarioByGenero", query = "SELECT c FROM usuario c WHERE c.genero = :genero"),
		@NamedQuery(name="usuario.findUsuarioByTipo_documento", query = "SELECT c FROM usuario c WHERE c.tipo_documento = :tipo_documento"),
		@NamedQuery(name="usuario.findUsuarioByUserPpassword", query ="SELECT c FROM usuario c WHERE c.correo=:correo and c.password=:password"),
		
})




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
	@Column
	private String numero_documento;
	
	
	@OneToOne
	@JoinColumn( name = "ID_ROL_FK", nullable = false )
	private rol rol;
	
	/**
	 * @return the numero_documento
	 */
	public String getNumero_documento() {
		return numero_documento;
	}
	/**
	 * @param numero_documento the numero_documento to set
	 */
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
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
