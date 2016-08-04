package br.com.assertsitemas.entity;


/**
 * Alguns pontos a serem analizado no mapeamento
 * sao as nomeclaturas.
 * 
 * Exemplo:
 * 
 * @Column(name = "NOME_COMPLETO")
 * private String nomeCompleto
 * 
 * Todas as colunas no banco devem 
 * estar com letra maiuscula e separas com underline
 * 
 * @author Jaderson Berti
 */
public class Usuario {

	private Long id;
	private String cpf;
	private String rg;
	private String nomeCompleto;
	private String dataNacimento;
	private Double valorBeneficio;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getDataNacimento() {
		return dataNacimento;
	}
	
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	
	public Double getValorBeneficio() {
		return valorBeneficio;
	}
	
	public void setValorBeneficio(Double valorBeneficio) {
		this.valorBeneficio = valorBeneficio;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
}
