import java.util.ArrayList;
import java.util.List;
public class DatasComemorativas {
    private List<DataComemorativa> datasComemorativas;

    public DatasComemorativas() {
        datasComemorativas = new ArrayList<>();
    }

    public void adiciona_dataComemorativa(DataComemorativa dataComemorativa){
        datasComemorativas.add(dataComemorativa);
    }
    public void remove_dataComemorativa(DataComemorativa dataComemorativa){
        datasComemorativas.remove(dataComemorativa);
    }

    public int horasNaoTrabalhadas(){
        return datasComemorativas.size()*8;
    }
}
