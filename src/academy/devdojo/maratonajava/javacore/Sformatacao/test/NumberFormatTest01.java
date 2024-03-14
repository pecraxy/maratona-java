package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeUS = Locale.US;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[5];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeUS);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localePT);
        nfa[4] = NumberFormat.getInstance(localeIT);

        double valor = 1_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        System.out.println("");
        String valorString = "1000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
