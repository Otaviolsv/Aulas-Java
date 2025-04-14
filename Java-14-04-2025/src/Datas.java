import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Datas {
    public static void main(String[] args) {

        Locale pt_br = new Locale("pt");

        System.out.println(Month.AUGUST.getDisplayName(TextStyle.FULL, pt_br));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate agora = LocalDate.now();
        LocalDate aniversario_atual = LocalDate.of(2025,8,9);
        LocalDate aniversario = LocalDate.of(2002,8,9);
        String agora_formatado = agora.format(formatter);
        System.out.println(agora_formatado);
        String aniversario_formatado = aniversario.format(formatter);

        System.out.println(aniversario);
        System.out.println(aniversario_formatado);

        System.out.println(ChronoUnit.DAYS.between(agora , aniversario_atual));


    }
}