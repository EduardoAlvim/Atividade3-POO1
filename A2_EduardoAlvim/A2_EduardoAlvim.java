package a2_eduardoalvim;


public class A2_EduardoAlvim {

   
    public static void main(String[] args) {
        Radio[] r = new Radio[3];
        for(int i = 0; i <3 ; i++){
            r[i] = new Radio();
            r[i].ligar();
        }
        r[0].alteraFrequencia(40);
        r[0].alteraVolume(10);
        
        r[1].alteraFrequencia(30);
        r[1].alteraVolume(6);
        
        r[2].alteraFrequencia(75);
        r[2].alteraVolume(5);
        
        for(int i = 0; i <3 ; i++){
            r[i].status(); 
        }
    }
    
}
