package com.eliasreis.banco.entities;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ContaCorrente {
	public int documento;
	public String nome;
	public Date dataNascimento;
	public int numero_conta;
	public int agencia;
	public Date DataCriacao;
	public Date DataModificacao;
	public double salario;
	public double valor_atual;
	public String senha;
	
	public ContaCorrente(int NumDoc, String NomeCorrentista, String DataNascito, double SalarioAtual, String SenhaDigitada ) throws ParseException {
		documento = NumDoc;
		nome = NomeCorrentista;
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		dataNascimento = (Date) d.parse(DataNascito);
		salario = SalarioAtual;
		senha = SenhaDigitada;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
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
	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
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
