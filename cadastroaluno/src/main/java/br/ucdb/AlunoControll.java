package br.ucdb;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlunoControll
 */
@WebServlet({ "/alunocontroll"})
public class AlunoControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
    public AlunoControll() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GerenciadorAluno gc = new GerenciadorAluno();
		List<Aluno> alunos = gc.getAlunos();
	    
		request.setAttribute("alu", alunos);
		
		RequestDispatcher view = request.getRequestDispatcher("alunos.jsp");
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String rg = request.getParameter("rg");
		String sexo = request.getParameter("sexo");
		String estado = request.getParameter("uf");
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setRg(rg);
		aluno.setSexo(sexo);
		aluno.setEstado(estado);

		GerenciadorAluno gc = new GerenciadorAluno();
		
		gc.salvar(aluno);
		
	}

}
