package a7_eduardoalvim_victorbrizante;

import java.util.Scanner;

public class Revistas {

    private int cod, ne;
    private String titulo, tipo;
    Edicoes[] ed = new Edicoes[5];

    public void cadastrar() {
        Scanner ler = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de edições deseja cadastrar(MAX = 5):");
        ne = ler.nextInt();
        for (int i = 0; i < ne; i++) {
            ed[i].cadastrar();
        }
        System.out.println("Digite o codigo: ");
        cod = ler.nextInt();
        System.out.println("Digite o titulo: ");
        titulo = s.nextLine();
        System.out.println("Digite o tipo: ");
        tipo = s.nextLine();
    }

    public void mostrar() {
        System.out.println("Edições:");
        for (int i = 0; i < ne; i++) {
            ed[i].mostrar();
        }
        System.out.println("Revista:");
        System.out.println("Codigo: " + cod + "\nTitulo: " + titulo + "\nTipo: " + tipo);
    }

    public int getCod() {
        return cod;
    }

}
