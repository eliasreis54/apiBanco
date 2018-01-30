package com.eliasreis.banco.entities;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.eliasreis.banco.Utils.GeraNumeroConta;

public class ContaCorrente {
	public String documento;
	public String nome;
	public Date dataNascimento;
	public int numero_conta;
	public int agencia;
	public Date DataCriacao;
	public Date DataModificacao;
	public double salario;
	public double valor_atual;
	public String senha;
	
	public ContaCorrente(String NumDoc, String NomeCorrentista, double SalarioAtual, String SenhaDigitada ) throws ParseException {
		documento = NumDoc;
		nome = NomeCorrentista;
		salario = SalarioAtual;
		senha = SenhaDigitada;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta() {
		this.numero_conta = new GeraNumeroConta().Gerar();
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Date getDataCriacao() {
		return DataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		DataCriacao = dataCriacao;
	}
	public Date getDataModificacao() {
		return DataModificacao;
	}
	public void setDataModificacao(Date dataModificacao) {
		DataModificacao = dataModificacao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
