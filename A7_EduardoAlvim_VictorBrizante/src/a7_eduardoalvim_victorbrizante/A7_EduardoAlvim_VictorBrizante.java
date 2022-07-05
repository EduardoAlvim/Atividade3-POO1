package a7_eduardoalvim_victorbrizante;

import java.util.Scanner;

public class A7_EduardoAlvim_VictorBrizante {

    public static void main(String[] args) {
        Revistas[] r = new Revistas[2];
        Scanner ler = new Scanner(System.in);
        int op = 1, contr = 0;
        while (op != 0) {
            System.out.println("\t\tMENU DE OPCOES");
            System.out.println("(1) - Cadastrar");
            System.out.println("(2) - Mostrar");
            System.out.println("(3) - Excluir");
            System.out.println("(0) - SAIR ");
            System.out.println("\nSUA ESCOLHA: ");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    if (contr < 2) {
                        r[contr].cadastrar();
                        contr++;
                    } else {
                        System.out.println("Quantidade maxima expirada");
                    }
                    break;
                case 2:
                    for (int i = 0; i < contr; i++) {
                        r[i].mostrar();
                    }
                    break;
                case 3:
                    int cod;
                    System.out.println("Digite o codigo da Revista que deseja excluir: ");
                    cod = ler.nextInt();
                    for (int i = 0; i < contr; i++) {
                        if (cod == r[i].getCod()) {
                            r[i] = null;
                            contr--;
                        }
                    }
                    break;
            }
        }
    }

}
