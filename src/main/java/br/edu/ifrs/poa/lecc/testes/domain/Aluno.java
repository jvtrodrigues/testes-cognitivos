package br.edu.ifrs.poa.lecc.testes.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.edu.ifrs.poa.lecc.testes.domain.enuns.Sexo;
import br.edu.ifrs.poa.lecc.testes.domain.enuns.TipoCurso;

@Entity
public class Aluno extends Usuario {
	private static final long serialVersionUID = 1L;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataDeNascimento;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@Enumerated(EnumType.STRING)
	private TipoCurso tipoDoCurso;
	private int anoRealizado;
	private int semestre;
	
	public Aluno() {}

	public Aluno(Integer id, String nome, String cpf, String identificador, String senha, Date dataDeNascimento,
			Sexo sexo, TipoCurso tipoDoCurso, int anoRealizado, int semestre) {
		super(id, nome, cpf, identificador, senha);
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.tipoDoCurso = tipoDoCurso;
		this.anoRealizado = anoRealizado;
		this.semestre = semestre;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public TipoCurso getTipoDoCurso() {
		return tipoDoCurso;
	}

	public void setTipoDoCurso(TipoCurso tipoDoCurso) {
		this.tipoDoCurso = tipoDoCurso;
	}

	public int getAnoRealizado() {
		return anoRealizado;
	}

	public void setAnoRealizado(int anoRealizado) {
		this.anoRealizado = anoRealizado;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	@Override
	public void criarConta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editarPerfil() {
		// TODO Auto-generated method stub
		
	}

}
