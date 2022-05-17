package a1_eduardoalvim;

import java.util.Scanner;

public class A1_EduardoAlvim {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vet1[], vet2[], vet3[];
        int acm = 0, num;
        vet1 = new int [5];
        vet2 = new int [5];
        vet3 = new int [5];
        System.out.println("Primeiro vetor:");
        for(int i =0; i<5;i++){
            num = ler.nextInt();
            vet1[i]= num;
        }
        System.out.println("Segundo vetor:");
        for(int i =0; i<5;i++){
            num = ler.nextInt();
            vet2[i]= num;
        }
        
        for(int i =0; i<5;i++){
            vet3[i]= vet1[i] * vet2[i];
            acm=acm+vet3[i];
            System.out.println(""+vet1[i]+" x "+vet2[i]+" ="+" "+vet3[i]);
        }
        System.out.println("Resultado:"+acm);
    }
    
}
