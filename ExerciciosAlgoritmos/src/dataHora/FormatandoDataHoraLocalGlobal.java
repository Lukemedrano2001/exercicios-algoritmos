package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatandoDataHoraLocalGlobal {
	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate dataCustomizada = LocalDate.parse("24/01/2024", fmt1);
		LocalDateTime dataHoraCustomizada = LocalDateTime.parse("24/01/2024 15:00", fmt2);
		
		LocalDate dataLocalISO = LocalDate.parse("2024-01-24");
		LocalDateTime dataHoraLocalISO = LocalDateTime.parse("2024-01-24T15:04:10");
		Instant dataHoraGlobalISO = Instant.parse("2024-01-24T15:04:10Z");
		
		System.out.println(dataCustomizada);
		System.out.println(dataHoraCustomizada);
		
		System.out.println();
		System.out.println(dataLocalISO.format(fmt1));
		System.out.println(fmt2.format(dataHoraLocalISO));
		System.out.println(fmt3.format(dataHoraGlobalISO));
		
		// ISO 8601
		System.out.println();
		System.out.println(fmt4.format(dataLocalISO));
		System.out.println(fmt5.format(dataHoraLocalISO));
		System.out.println(fmt6.format(dataHoraGlobalISO));
		
		System.out.println();
		System.out.println(dataHoraGlobalISO.toString());
		System.out.println(dataHoraGlobalISO.toString());
		System.out.println(dataHoraGlobalISO.toString());
	}
}