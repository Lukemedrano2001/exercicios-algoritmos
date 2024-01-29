package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstanciandoDataHoraLocalGlobal {
	public static void main(String[] args) {
		LocalDate dataAtualLocal = LocalDate.now();
		LocalDateTime dataHoraAtualLocal = LocalDateTime.now();
		Instant dataHoraGlobal = Instant.now();	// Horário de Londres com a letra Z no final
		
		LocalDate dataNumeros = LocalDate.of(2024, 03, 20);
		LocalDateTime dataHoraNumeros = LocalDateTime.of(2024, 03, 20, 15, 00);
		
		
		System.out.println(dataAtualLocal);
		System.out.println(dataHoraAtualLocal);
		System.out.println(dataHoraGlobal);
		System.out.println(dataNumeros);
		System.out.println(dataHoraNumeros);
	}
}