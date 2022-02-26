package br.edu.utfpr.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Exemplo2 {
    public static void main(String[] args) {
        Calendar hoje = new Calendar.getInstance();
        
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH)
                + "/"
                + hoje.get(Calendar.MONTH)+1
                + "/"
                + hoje.get(Calendar.YEAR));
        
        
        //formatador de data
        DateFormat formataData = DateFormat.getTimeInstance();
        System.out.println("Data: " + formataData.format(hoje));
        
        //Formatador de hora
        DateFormat formataDataHora = DateFormat.getDateTimeInstance();
        System.out.println(formataDataHora.format(hoje.getTime()));
        
        System.out.println(
            DateFormat.getDateInstance(DateFormat.SHORT)format(hoje.getTime())
        );
        
        System.out.println(
            DateFormat.getDateInstance(DateFormat.long)format(hoje.getTime())
        );
        
        System.out.println(
            DateFormat.getDateInstance(DateFormat.full)format(hoje.getTime())
        );        
            
/**
 * formatação com a classe symple date format
 */ 

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat hora = new SimpleDateFormat("hh:mm (ss)");
    
        System.out.println(sdf.format(hoje.getTime()));
        System.out.println(hoje.getTime());
        
/*
        formatação de data conforme o local
        */        

        Locale brasil = new Locale("pt", "Br");
        Locale usa = Locale.US;
        Locale italia = Locale.ITALIAN;
        
        DateFormat dfBrasil = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        DateFormat dfUsa = DateFormat.getDateInstance(DateFormat.FULL, usa);
        DateFormat dfItalia = DateFormat.getDateInstance(DateFormat.FULL, italia);
        
        System.out.println(dfBrasil.format(hoje.getTime()));
        System.out.println(dfUsa.format(hoje.getTime()));
        System.out.println(dfItalia.format(hoje.getTime()));

    }    

    private static void format(Date time) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
