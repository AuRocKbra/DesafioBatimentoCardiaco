package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BatimentosCardiacos {
	private String nome;
	private String sobrenome;
	private Date dataDeNescimento;
	
	public BatimentosCardiacos(String nome, String sobrenome, Date dataDeNescimento) {
		this.nome =nome;
		this.sobrenome= sobrenome;
		this.dataDeNescimento = dataDeNescimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataDeNescimento() {
		return dataDeNescimento;
	}

	public void setDataDeNescimento(Date dataDeNescimento) {
		this.dataDeNescimento = dataDeNescimento;
	}
	
	public int getIdadeEmAnos() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		int anoNascimento = Integer.valueOf(sdf.format(dataDeNescimento));
		int anoAtual = Integer.valueOf(sdf.format(new Date()));
		return anoAtual - anoNascimento;
		
	}
	
	public int getFrequenciaCardiacaMaxima(int idade) {
		return 220 - idade;
	}
	
	public String getFrequenciaAlvo(int fCardMax) {
		Double valMinimo;
		Double valMaximo;
		valMinimo = fCardMax * 0.5;
		valMaximo = fCardMax * 0.85;
		return "Frequência Alvo está entre "+String.format("%.2f",valMinimo)+" e "+String.format("%.2f",valMaximo);
	}
}
