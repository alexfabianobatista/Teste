package br.edu.utfpr.javaexception;

public class AppConsultaDiaSemana {
    public static void main(String[] args) {
        int dia = 9;
        
        try {
            System.out.println(ConversorDiaSemana.convert(dia));
        } catch (DiaSemanaException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
