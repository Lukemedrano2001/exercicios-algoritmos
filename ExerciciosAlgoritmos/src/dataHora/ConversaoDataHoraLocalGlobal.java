package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoDataHoraLocalGlobal {
	public static void main(String[] args) {
		Instant dataHoraGlobalISO = Instant.parse("2024-01-24T01:05:10Z");
		
		LocalDate resultado1 = LocalDate.ofInstant(dataHoraGlobalISO, ZoneId.systemDefault());
		LocalDate resultado2 = LocalDate.ofInstant(dataHoraGlobalISO, ZoneId.of("Asia/Aden"));
		LocalDate resultado3 = LocalDate.ofInstant(dataHoraGlobalISO, ZoneId.of("Portugal"));
		LocalDateTime resultado4 = LocalDateTime.ofInstant(dataHoraGlobalISO, ZoneId.of("Asia/Aden"));
		LocalDateTime resultado5 = LocalDateTime.ofInstant(dataHoraGlobalISO, ZoneId.of("Portugal"));
		
		// Data
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		
		
		// Data e Hora
		System.out.println();
		System.out.println(resultado4);
		System.out.println(resultado5);
	}
}