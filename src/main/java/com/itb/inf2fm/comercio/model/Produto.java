package com.itb.inf2fm.comercio.model;

public class Produto {
	private long id;
    private String nome;
    private String descricao;
    private String codigoBarras;
    private double preco;
    
    // public : Acesso liberado para todas as classes.
    
    // private : acesso permitido apenas para os membros
    //          da propia classe.
    //          Entende-se por membros (atribuidos e ou método)
    
    // M´wtodos Setter e getter atribiur e recuperar dados 
     public void setId(Long id) {
    	 this.id = id;
     }
     public Long getId() {
    	 return id;
     }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
     
     
}
     
