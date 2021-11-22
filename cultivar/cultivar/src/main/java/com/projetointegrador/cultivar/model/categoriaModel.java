package com.projetointegrador.cultivar.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author BabiLuna
 * @since 1.0
 * @see ProdutoModel
 * 
 * 
 */

@Entity
@Table(name = "tb_categoria")


public class categoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank
	@Size(min = 2 , max = 50)
	private String categoria;
	
	public List<ProdutoModel> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}

	@NotBlank
	@Size(min = 2 , max = 100)
	private String nomeVendedor;
	
	@NotBlank
	@Size(min = 2 , max = 50)
	private String formaPagamento;
	
	@OneToMany(mappedBy = "categoriaDoProduto", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("categoriaDoProduto")
	private List<ProdutoModel> produto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	
	
}
