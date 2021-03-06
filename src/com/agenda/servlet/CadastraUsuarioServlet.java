package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;
import com.agenda.service.PessoaDAO;

public class CadastraUsuarioServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setEndereco(request.getParameter("endereco"));
		pessoa.setTelefone(request.getParameter("telefone"));
		pessoa.setEmail(request.getParameter("email"));
		
		CadastraUsuarioService service = new CadastraUsuarioService();
		
		service.Cadastro(pessoa);
		
		PessoaDAO dao = new PessoaDAO();
		
		dao.Pessoa(pessoa);
		
		
		
		
		
		
		/*
		 * request.getParameter("nome");
		 * System.out.println(request.getParameter("nome"));
		 * 
		 * request.getParameter("endereco");
		 * System.out.println(request.getParameter("endereco"));
		 * 
		 * request.getParameter("telefone");
		 * System.out.println(request.getParameter("telefone"));
		 * 
		 * request.getParameter("email");
		 * System.out.println(request.getParameter("email"));
		 */

	}

}
