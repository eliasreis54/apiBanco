package com.eliasreis.banco.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eliasreis.banco.DTOs.ContaCorrenteDTO;
import com.eliasreis.banco.Responses.Response;

@RestController
@RequestMapping("api/banco/criaContaCorrente")
public class CriaContaCorrenteController {
	@PostMapping
	public ResponseEntity<Response<ContaCorrenteDTO>> Criar(@Valid @RequestBody ContaCorrenteDTO ContaCorrente,
		BindingResult results) {
		Response<ContaCorrenteDTO> response = new Response<ContaCorrenteDTO>();
		
		if (results.hasErrors()) {
			results.getAllErrors().forEach(error -> response.getErros().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		response.setJava(ContaCorrente);
		
		return ResponseEntity.ok(response);
	}
}
