package br.ucdb;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluno {
	private static java.util.List<Aluno> Alunos = new ArrayList<Aluno>();

	public void salvar(Aluno aluno){
		Alunos.add(aluno);
		
	}
	
	public List<Aluno> getAlunos(){
		return Alunos;
		
	}
	
}
