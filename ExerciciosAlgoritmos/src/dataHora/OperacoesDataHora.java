package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class OperacoesDataHora {
	public static void main(String[] args) {
		LocalDate dataQualquer = LocalDate.parse("2024-02-24");
		LocalDateTime dataHoraQualquer = LocalDateTime.parse("2024-01-24T15:14:30");
		Instant dataHoraGlobalISO = Instant.parse("2024-01-24T15:04:10Z");
		
		
		// Data e Hora
		LocalDateTime diminuindoDataHora = dataHoraQualquer.minusHours(3).minusMinutes(10).minusSeconds(20);
		LocalDateTime adicionandoDataHora = dataHoraQualquer.plusHours(3).plusMinutes(10).plusSeconds(20);
		
		
		// Data
		LocalDate diminuindoData = dataQualquer.minusYears(1).minusMonths(1).minusDays(7);
		LocalDate adicionandoData = dataQualquer.plusYears(1).plusMonths(1).plusDays(7);
		
		
		// Data aceita somente Dias, Milissegundos, NanoSegundos e Segundos
		Instant diminuindoDataHoraGlobal = dataHoraGlobalISO.minus(7, ChronoUnit.DAYS);
		Instant adicionandoDataHoraGlobal = dataHoraGlobalISO.plus(7, ChronoUnit.DAYS);
		
		
		// Datas Quaisquer
		System.out.println(dataQualquer);
		System.out.println(dataHoraQualquer);
		
		
		// Horas, Minutos e Segundos
		System.out.println();
		System.out.println(diminuindoDataHora);
		System.out.println(adicionandoDataHora);
		
		
		// Anos, Meses e Dias
		System.out.println();
		System.out.println(diminuindoData);
		System.out.println(adicionandoData);
		
		
		// Anos, Meses e Dias Globais
		System.out.println();
		System.out.println(diminuindoDataHoraGlobal);
		System.out.println(adicionandoDataHoraGlobal);
	}
}