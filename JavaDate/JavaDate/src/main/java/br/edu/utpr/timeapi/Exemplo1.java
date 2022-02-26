package br.edu.utpr.timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *Exemplo de uso da nota api (java >= 8) para trabalhar com data
 * 
 */
public class Exemplo1 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        
        System.out.println(hoje);
        System.out.println("Ano: " + hoje.getYear());
        System.out.println("Mês (número): " + hoje.getMonthValue());
        System.out.println("Mês (nome): " + hoje.getMonth().name());
        System.out.println("Dia da semana (numero): " + hoje.getDayOfWeek().ordinal());
        System.out.println("Dia da semana (nome" + hoje.getDayOfWeek().name());
        
//instanciando em data definida        
        LocalDate nascimento = LocalDate.of(1987, Month.JUNE, 2);
        //LocalDate nascimento = LocalDate.of(1987, 6, 2);
        
        System.out.println(nascimento);


//instanciando em data a partir de uma string
        LocalDate natal = LocalDate.parse("2022-12-25");
        System.out.println(natal);
        
/*
        trabalhando com hora local
        */

        LocalTime horaAgora = LocalTime.now();
        System.out.println(horaAgora);
        System.out.println("Hora: " + horaAgora.getHour());
        System.out.println("Minutos: " + horaAgora.getMinute());
        System.out.println("Segundos: " + horaAgora.getSecond());
        System.out.println("Milisegundos: " + horaAgora.getNano());
        
/*
        trabalhando com data e hora
        */

        LocalDateTime dtAgora = LocalDateTime.now();
        System.out.println(dtAgora);
        
        
        LocalDateTime inicioAula = LocalDateTime.parse("2022-03-03T07:30:00");
        System.out.println(inicioAula);
    }
    
}
