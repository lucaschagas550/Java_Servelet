package br.com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/novaEmpresa") //Define nome da url
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeEmpresa = request.getParameter("nome"); //nome do parametro que ser� enviado
		
		System.out.println("cadastrando nova empresa.");
		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa "+ nomeEmpresa +" cadastrada com sucesso.</body></html");
	}

}
