package com.projetointegrador.cultivar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	@Size(min = 2, max = 100)
	private String produto;
	
	@NotNull
	private double valor;
	
	@NotNull
	private int estoque;
	
	@NotNull
	private double pesoUnitario;
	
	@ManyToOne
	@JoinColumn(name = "fk_categoria")
	@JsonIgnoreProperties("produtos")
	private categoriaModel categoriaDoProduto;
	
	@ManyToOne
	@JoinColumn(name = "fk_categoria")
	@JsonIgnoreProperties("meusprodutos")
	private UsuarioModel criador;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPesoUnitario() {
		return pesoUnitario;
	}

	public void setPesoUnitario(double pesoUnitario) {
		this.pesoUnitario = pesoUnitario;
	}

	public categoriaModel getCategoriaDoProduto() {
		return categoriaDoProduto;
	}

	public void setCategoriaDoProduto(categoriaModel categoriaDoProduto) {
		this.categoriaDoProduto = categoriaDoProduto;
	}

	public UsuarioModel getCriador() {
		return criador;
	}

	public void setCriador(UsuarioModel criador) {
		this.criador = criador;
	}

	
	

	
}
