package com.projetointegrador.cultivar.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author BabiLuna
 * @since 1.0
 *
 */


@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
    
	@NotBlank
	@Size (min = 2, max = 100)
    private String nome;
   
	@NotBlank
	@Email
	@Size (min = 5, max = 100)
    private String email;
    
	@NotBlank
	@Size (min = 8, max = 20)
    private String senha;
	
	@OneToMany(mappedBy = "criador", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("criador")
	private List<ProdutoModel> meusproduto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<ProdutoModel> getMeusproduto() {
		return meusproduto;
	}

	public void setMeusproduto(List<ProdutoModel> meusproduto) {
		this.meusproduto = meusproduto;
	}

	
 
	
}
