package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataHoraLocalGlobalISO {
	public static void main(String[] args) {
		LocalDate dataLocalISO = LocalDate.parse("2024-01-24");
		LocalDateTime dataHoraLocalISO = LocalDateTime.parse("2024-01-24T15:04:10");
		Instant dataHoraGlobalISO = Instant.parse("2024-01-24T15:04:10Z");
		Instant dataHoraTimezoneISO = Instant.parse("2024-01-24T15:04:10-03:00");
		
		System.out.println(dataLocalISO);
		System.out.println(dataHoraLocalISO);
		System.out.println(dataHoraGlobalISO);
		System.out.println(dataHoraTimezoneISO);
	}
}