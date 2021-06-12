package com.example.proyecto.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name ="certificado")

public class certificado implements Serializable {
	

		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		private long id;
		@Column
		private String ciudad;
		@Column
		private String fecha;
		@Column
		private String empresa;
		@Column
		private String nit;
		@Column
		private String cargo;
		@Column
		private String valor_mensual;
		@Column
		private String descripcion;
		@Column
		private String fecha_inicio;
		@Column
		private String fecha_final;
		
		 @OneToOne
		 @JoinColumn( name = "ID_USUARIO_FK", nullable = false )
			private usuario usuario;
		 

		public usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(usuario usuario) {
			this.usuario = usuario;
		}


		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		

		public String getCiudad() {
			return ciudad;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		public String getEmpresa() {
			return empresa;
		}

		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}

		public String getNit() {
			return nit;
		}

		public void setNit(String nit) {
			this.nit = nit;
		}

		public String getValor_mensual() {
			return valor_mensual;
		}

		public void setValor_mensual(String valor_mensual) {
			this.valor_mensual = valor_mensual;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public String getFecha_inicio() {
			return fecha_inicio;
		}

		public void setFecha_inicio(String fecha_inicio) {
			this.fecha_inicio = fecha_inicio;
		}

		public String getFecha_final() {
			return fecha_final;
		}

		public void setFecha_final(String fecha_final) {
			this.fecha_final = fecha_final;
		}

		
		
		
		
	
}
