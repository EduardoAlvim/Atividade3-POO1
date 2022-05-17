package a3_eduardoalvim;

public class Data {

    private int dia, mes, ano;

    public Data() {
        dia = 1;
        mes = 1;
        ano = 1900;
    }

    public Data(int dia, int mes, int ano) {
        if (mes == 02 || mes == 2) {
            if (dia <= 29) {
                this.dia = dia;
            } else {
                this.dia = 1;
            }
        } else if (dia <= 30) {
            this.dia = dia;
        }
        if (mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 01;
        }
        if (ano > 0) {
            this.ano = ano;
        } else {
            this.ano = 1900;
        }
    }

    public void mostraData() {
        System.out.println("Data: " + dia + " / " + mes + " / " + ano);
    }

    public void comparaData(int dia, int mes, int ano) {
        if (this.ano > ano) {
            System.out.println("Maior data: " + this.dia + " / " + this.mes + " / " + this.ano);
        } else if (this.ano < ano) {
            System.out.println("Maior data: " + dia + " / " + mes + " / " + ano);
        }
        else{
        if (this.mes > mes) {
            System.out.println("Maior data: " + this.dia + " / " + this.mes + " / " + this.ano);
        } else if (this.mes < mes) {
            System.out.println("Maior data: " + dia + " / " + mes + " / " + ano);
        }
        else{
        if (this.dia > dia) {
            System.out.println("Maior data: " + this.dia + " / " + this.mes + " / " + this.ano);
        } else if (this.dia < dia) {
            System.out.println("Maior data: " + dia + " / " + mes + " / " + ano);
        }
        }
        }
        if (this.ano == ano && this.mes == mes && this.dia == dia) {
            System.out.println("Nulo");
        }
        
    }

}
