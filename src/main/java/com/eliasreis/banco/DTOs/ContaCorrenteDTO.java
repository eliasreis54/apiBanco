package com.eliasreis.banco.DTOs;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;;

//@Paran documento
//@Paran nome
//@Paran salario
//@Paran senha

//@return String
// Chamado para criar uma nova conta corrente
public class ContaCorrenteDTO {
	public String documento;
	public String nome;
	public double salario;
	public String senha;
	
	@NotEmpty(message = "CPF não pode ser vazia")
	@CPF(message="CPF inválido")
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	@NotEmpty(message = "Nome não pode ser vazia")
	@Length(min = 5, max = 200, message = "O nome deve conter entre 5 e 200 caracteres")
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@NotEmpty(message = "Senha não pode ser vazia")
	@Length(min = 5, max = 200, message = "O nome deve conter entre 5 e 200 caracteres")
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "ContaCorrenteDTO [documento=" + documento + ", nome=" + nome 
				+ ", salario=" + salario + ", senha=" + senha + "]";
	}
	
	
}
