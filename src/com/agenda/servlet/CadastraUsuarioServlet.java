package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastraUsuarioServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getParameter("nome");
		System.out.println(request.getParameter("nome"));
		
		request.getParameter("endereco");
		System.out.println(request.getParameter("endereco"));
		
	}

}
