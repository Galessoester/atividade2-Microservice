package br.fiap.app.exemplo.models;

public class Cliente {
	private String nome;
	private Integer idade;
	private Integer documento;

	public Cliente(String nome, Integer idade, Integer documento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

}
