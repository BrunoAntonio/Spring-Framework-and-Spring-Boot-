package com.bruno.manytoone.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private String email;

	// 1 user tem varios perfis
		//@ManyToOne(cascade=javax.persistence.CascadeType.PERSIST)
		//por default o many to one é eager, carrega todos os objectos.Em LAZY ele não regarrega os objectos automaticamente
		@ManyToOne(cascade=javax.persistence.CascadeType.PERSIST, fetch=FetchType.EAGER) 
		private Role role;

		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
