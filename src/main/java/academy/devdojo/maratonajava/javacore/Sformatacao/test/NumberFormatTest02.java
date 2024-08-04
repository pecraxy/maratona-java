package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeUS = Locale.US;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[5];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localePT);
        nfa[4] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 1000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "$1,000.21";
        try {
            System.out.println(nfa[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
