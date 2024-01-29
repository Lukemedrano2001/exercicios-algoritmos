package dataHora;

import java.time.Duration;
import java.time.LocalDateTime;

public class CalculoDataHora {
	public static void main(String[] args) {
		LocalDateTime data1 = LocalDateTime.parse("2020-02-10T12:00:00");
		LocalDateTime data2 = LocalDateTime.parse("2020-03-11T18:00:00");
		
		Duration tempo1 = Duration.between(data1, data2);
		Duration tempo2 = Duration.between(data2, data1);
		
		// Segundos
		System.out.println(tempo1.toSeconds());
		System.out.println(tempo2.toSeconds());
		
		// Minutos
		System.out.println();
		System.out.println(tempo1.toMinutes());
		System.out.println(tempo2.toMinutes());
		
		// Horas
		System.out.println();
		System.out.println(tempo1.toHours());
		System.out.println(tempo2.toHours());
		
		// Dias
		System.out.println();
		System.out.println(tempo1.toDays());
		System.out.println(tempo2.toDays());
	}
}