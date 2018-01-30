package com.eliasreis.banco.Utils;

import java.util.Random;

public class GeraNumeroConta {

	private int VerificaJaExiste() {
		return 0;
	}
	
	// @return String
	// Gera numero da conta do correntista
	public int Gerar() {
		Random i = new Random();
		return i.nextInt(500000);
	}
}
