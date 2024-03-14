package academy.devdojo.maratonajava.javacore.Rdatas.test;



import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        //Calendar foi a segunda classe, com a tentativa
        //de consertar os problemas que a classe Date não dava conta
        //(problemas relacionados a internalização)

        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão é o primeiríssimo dia da semaninha");
        }
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_WEEK) + " do mês: " + c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        //c.roll(Calendar.HOUR, 12);
        Date date = c.getTime();
        System.out.println(date);

    }
}
