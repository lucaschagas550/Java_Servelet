package br.com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	//doPost so aceita post na requisicao doGet ...
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		System.out.println("cadastrando nova empresa.");
		
        String nomeEmpresa = request.getParameter("nome");
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        
        Banco banco = new Banco();
        banco.adiciona(empresa);

        //Chamar jsp
        RequestDispatcher rd =  request.getRequestDispatcher("/novaEmpresaCriada.jsp");
        request.setAttribute("empresa", empresa.getNome());
        rd.forward(request, response);
	}

}
