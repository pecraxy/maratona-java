package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        //Bom pra relatório
        String pattern = "'Amsterdam' dd 'de' MMM 'de' YYYY";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));;
        try {
            System.out.println(sdf.parse("Amsterdam 04 de Maio de 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }



    }
}
