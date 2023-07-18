public class MinhaData {
    private int dia, mes, ano;
    String data = "01/04/2013";

    // letra b
    public MinhaData(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    // letra c
    public MinhaData(String dt) {
        String[] partes = dt.split("/");
        if (partes.length == 3) {
            this.dia = Integer.parseInt(partes[0]);
            this.mes = Integer.parseInt(partes[1]);
            this.ano = Integer.parseInt(partes[2]);
        } else {
            // Lida com o formato de data inválido
            // Você pode lançar uma exceção ou tomar outra ação adequada aqui
        }
    }

    //letra d
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    // letra e
    public int diminuir_dia(int x) {
        return this.dia - x;
    }

    public int diminuir_mes(int x) {
        return this.mes - x;
    }

    public int diminuir_ano(int x) {
        return this.ano - x;
    }

    public int adicionar_dia(int x) {
        return this.dia - x;
    }

    public int adicionar_mes(int x) {
        return this.mes - x;
    }

    public int adicionar_ano(int x) {
        return this.ano - x;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getData() {
        return data;
    }

    //letra f
    public int compara(MinhaData outraData) {
        if (this.ano > outraData.ano) {
            return -1;
        } else if (this.ano < outraData.ano) {
            return 1;
        } else if (this.mes > outraData.mes) {
            return -1;
        } else if (this.mes < outraData.mes) {
            return 1;
        } else if (this.dia > outraData.dia) {
            return -1;
        } else if (this.dia < outraData.dia) {
            return 1;
        } else {
            return 0;
        }
    }
}
