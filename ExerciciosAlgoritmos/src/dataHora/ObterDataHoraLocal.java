package dataHora;

import java.time.LocalDateTime;

public class ObterDataHoraLocal {
	public static void main(String[] args) {
		LocalDateTime dataHoraLocalISO = LocalDateTime.parse("2024-01-24T15:04:10");
		
		// Dia
		System.out.println(dataHoraLocalISO.getDayOfMonth());
		System.out.println(dataHoraLocalISO.getDayOfYear());
		
		// Mês
		System.out.println(dataHoraLocalISO.getMonthValue());
		
		// Ano
		System.out.println(dataHoraLocalISO.getYear());
		
		// Hora
		int hora = dataHoraLocalISO.getHour();
		int minuto = dataHoraLocalISO.getMinute();
		int segundo = dataHoraLocalISO.getSecond();
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}
}