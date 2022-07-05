package a7_eduardoalvim_victorbrizante;

import java.util.Scanner;

public class Edicoes {

    private int numED, anoEd, numArtigos;

    public void mostrar() {
        System.out.println("Numero da edição: " + numED + "\nAno da Edição: " + anoEd + "\nNumero de Artigos: " + numArtigos);
    }

    public void cadastrar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Numero de edições: ");
        numED = ler.nextInt();
        System.out.println("Ano da Edição: ");
        anoEd = ler.nextInt();
        System.out.println("Numero de artigos: ");
        numArtigos = ler.nextInt();
    }
}
