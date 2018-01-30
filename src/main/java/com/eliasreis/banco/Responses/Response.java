package com.eliasreis.banco.Responses;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
	private T java;
	private List<String> erros;
	
	public Response() {
		
	}
	public T getJava() {
		return java;
	}
	public void setJava(T java) {
		this.java = java;
	}
	public List<String> getErros() {
		if (this.erros == null) {
			this.erros = new ArrayList<String>();
		}
		return erros;
	}
	public void setErros(List<String> erros) {
		this.erros = erros;
	} 
	
	
}