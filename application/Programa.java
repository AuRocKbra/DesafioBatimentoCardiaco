package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.BatimentosCardiacos;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Sobrenome:");
		String sobrenome = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Data de nescimento (DD/MM/YYYY):");
			Date dataDeNascimento = sdf.parse(sc.nextLine());
			BatimentosCardiacos pessoa = new BatimentosCardiacos(nome, sobrenome, dataDeNascimento);
			System.out.println("\n\nDados da pessoa:");
			System.out.println("Nome:"+pessoa.getNome());
			System.out.println("Sobrenome:"+pessoa.getSobrenome());
			System.out.println("Data de Nascimento:"+sdf.format(pessoa.getDataDeNescimento()));
			int idade = pessoa.getIdadeEmAnos();
			System.out.println("Idade:"+idade);
			int fCardMax = pessoa.getFrequenciaCardiacaMaxima(idade);
			System.out.println("Frequência cardiaca máxima:"+fCardMax);
			System.out.println("Frequência cardiaca alvo:"+pessoa.getFrequenciaAlvo(fCardMax));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
