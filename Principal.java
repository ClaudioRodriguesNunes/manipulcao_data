import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Principal {
    public static void main(String[] args){
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatter);
        //String data_natal = "25/12/2023";
        int temp;

        MinhaData minhaData = new MinhaData(dataFormatada);
        DatasComemorativas datasComemorativas = new DatasComemorativas();

        datasComemorativas.adiciona_dataComemorativa(new DataComemorativa("Carnaval","12/03/2023",true,true));
        datasComemorativas.adiciona_dataComemorativa(new DataComemorativa("Natal","25/12/2023",true,true));
        datasComemorativas.adiciona_dataComemorativa(new DataComemorativa("Rio de Janeiro","28/01/2023",true,false));

        int compara = minhaData.compara(new MinhaData("25/12/2023"));
        if (compara == 0){
            System.out.println("É hoje!");
        }else if (compara ==-1){
            System.out.println("É posterior");
        }else{
            System.out.println("É anterior.");
        }
        temp = datasComemorativas.horasNaoTrabalhadas();
        System.out.println("Total de horas não trabalhadas"+temp);
    }
}
