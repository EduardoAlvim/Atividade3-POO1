package a2_eduardoalvim;


public class Radio {
    boolean ligado;
    float frequencia;
    int volume;
    
    void ligar(){
        ligado = true;
    }
    void desligar(){
        ligado = false;
        frequencia = 0;
        volume = 0;
    }
    void status(){
        if(ligado == false){
            System.out.println("Radio desligado");
        }
        else{
            System.out.println("Radio ligado \nFrequencia: "+frequencia+"\nVolume: "+volume);
        }
    }
    void alteraFrequencia(float f){
        frequencia = f;
    }
    void alteraVolume(int v){
        volume = v;
    }
    
}
