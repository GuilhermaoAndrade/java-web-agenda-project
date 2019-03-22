package com.agenda.service;

import org.apache.catalina.connector.Request;

import com.agenda.model.Pessoa;

public class CadastraUsuarioService 
{

	public void Cadastro(Pessoa pessoa) 
	{
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getEmail());
		System.out.println(pessoa.getTelefone());
	}
	
	
}
