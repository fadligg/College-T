import java.util.Random;
import java.util.random.*;

class Hidup {

}

class Manusia{
    String nama;
    //boolean kenyang = false;
    int minMood = 0
    int maksMood = 10
    int mood = 5; //skala 0-10
    //boolean sim = false;
    //boolean mandi = false;
    int minEnergi = 0;
    int maksEnergi = 100;
    int energi = 30; //skala 0-100
    int uang; //dalam dollar
    int minKebersihan = 0;
    int maksKebersihan = 10;
    int kebersihan;

    void nugas(){
        if(mood>5){
            nugas();
        }else{
         System.out.println("ga ada mood nugas, malazzz....");
        }
        //bisa nugas klo mood diatas 5
    }
    void tidur(){
        //tidur klo energi dibawah 30
    }
    void makan(Makanan makanan){
        
    }
    void mainGame (Game game){
        //
    }
    void mandiBiasa(){

    }

}

class Makanan {
    String nama;
    int tambahEnergi;
    int tambahMood;
    void mempengaruhi(Manusia manusia) {
     manusia.energi += this.tambahEnergi;
     manusia.energi += this.tambahMood;
    }
}

class NasiAyam extends Makanan{
    this.nama = "Nasi Ayam";
    this.tambahEnergi = 40;
}
class NasiTelur extends Makanan{
    this.nama = "Nasi Telur";
    this.tambahEnergi = 30;
}
class Mie extends Makanan{
    this.nama = "Mie";
    this.tambahEnergi = 25;
}
class Durian extends Makanan{
    this.nama = "Durian";
    this.tambahEnergi = 20;
    this.tambahMood = 2;  
}

class Game {
    int nama;
    int tambahMood;
    int tambahEnergi;
}

class PES extends Game{
    int nama = "PES";
    int tambahMood = 5;
    int tambahEnergi = -10;
}

class MobileLegend extends Game{
    int nama = "Mobile Legend";
    Random random = new Random();
    int randomMood = random.nextInt(3)
    int tambahMood = randomMood;
    int tambahEnergi = -40;
}
