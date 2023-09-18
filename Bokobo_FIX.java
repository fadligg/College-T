import java.util.Scanner;
//Code made by Fadli Haidar / fadligg on github

class Bokobo_FIX { 
    //Kode dibawah untuk mengubah warna font dalam string
    //Contoh : warna_RED + string + warna_RESET, dan warna font dalam string akan menjadi merah
    public static final String warna_RESET = "\u001B[0m";//untuk mereset warna
    public static final String warna_GREEN = "\u001B[32m";//warna hijau
    public static final String warna_BLUE = "\u001B[34m";//warna biru
    public static final String warna_RED = "\u001B[31m";//warna merah
    public static void main(String[] args) {
        //boolean dibawah untuk menyatakan bahwa kodingan akan bernilai true dan bisa dieksekusi
        boolean bokoJalan = true;
        int merchandise1 = 0; //int merchandise1 s.d 4, digunakan untuk menampilkan angka atau banyaknya merchandise yang terjual
        int merchandise2 = 0;
        int merchandise3 = 0;
        int merchandise4 = 0;
        int keuntungan = 0;

        while (bokoJalan){ //digunakan while untuk mengeksekusi terus bokoJalan secara berulang
            
            //di bawah ini merupakan rangkaian string yang digunakan sebagai tampilan program, dan menggunakan assignment operator sehingga apabila diprint variable penyambutanSatu maka akan muncul juga string string yang lain
            String border = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
            String penyambutanSatu = border;
            penyambutanSatu += warna_GREEN +"\nSelamat datang di Todibo (Toko Merchandise Kobo)" +warna_RESET;
            penyambutanSatu += "\n" + border;
            penyambutanSatu += "\nBerikut adalah merchandise yang tersedia :";
            penyambutanSatu += "\n1. Poster Kobo Kanaeru ($10) - " +  merchandise1 + " merchandise terjual";
            penyambutanSatu += "\n2. Keychain Kobo Kanaeru ($5) - " +  merchandise2 + " merchandise terjual";
            penyambutanSatu += "\n3. Lanyard Kobo Kanaeru ($8) - " +  merchandise3 + " merchandise terjual" ;
            penyambutanSatu += "\n4. T-shirt Kobo Kanaeru ($20) - " +  merchandise4 + " merchandise terjual";
            penyambutanSatu += "\n0. Sudah cukup belanjanya, ehe~~";
            penyambutanSatu += "\n" + border + "\nTotal keuntungan Todibo = $" + keuntungan;
            penyambutanSatu += ("\n" + border);
            penyambutanSatu += ("\nSilakan pilih mau merchandise nomor berapa ?  (1/2/3/4)");
            
            //di bawah ini saya deklarasikan nama merchandise dengan variable kobo1 s.d 4, dengan tujuan mempermudah membuat string yang akan muncul di akhir program
            String kobo1 = "Poster Kobo Kanaeru!";
            String kobo2 = "Keychain Kobo Kanaeru!";
            String kobo3 = "Lanyard Kobo Kanaeru!";
            String kobo4 = "T-shirt Kobo Kanaeru!";
            System.out.println(penyambutanSatu);//untuk mengeksekusi rangkaian string sebagai tampilan program
        
            Scanner inputPembeli = new Scanner(System.in);//dibuatnya scanner dengan variable inputPembeli untuk menginput informasi terkait merchandise yang akan dibeli
                int nomorMerchandise = inputPembeli.nextInt();//nomorMerchandise atau merchandise yang akan dipilih akan ditampung dalam integer
                int qMerchandise;//deklarasi integer untuk banyaknya merchandise yang akan dibeli
             

            if (nomorMerchandise == 1 || nomorMerchandise == 2 || nomorMerchandise == 3 || nomorMerchandise == 4 ) {//apabila nomorMerchandise sesuai dengan salah satu nilai dari 1 s.d. 4 maka program akan dilanjut
                System.out.println("Merchandise no. " + nomorMerchandise + " \nMau checkout berapa?");//munculnya pertanyaan, berapa banyak merchandise yang akan dibeli
                qMerchandise = inputPembeli.nextInt();//untuk menginput berapa banyak merchandise yang akan dibeli
                System.out.println("Merchandise no. " + nomorMerchandise + " sudah dicheckout " + qMerchandise + "pc(s)" );//kata kata setelah menginput berapa banyak merchandise yang akan dibeli

                
             switch (nomorMerchandise){//switch untuk menyatakan suatu kondisi pada variable nomorMerchandise
                case 1: //apabila 1 maka kode di bawah akan dieksekusi
                    merchandise1 += qMerchandise;//merchandise yang telah terjual akan dimunculkan pada tampilan awal program dengan menambahkan merchandise1 dengan qMerchandise atau banyaknya merchandise 
                    keuntungan += (qMerchandise*10);//untuk menghitung keuntungan dengan menambahkan variable keuntungan dengan hasil kali qMerchandsie dengan harga merchandise no.1 yang berharga $10
                    System.out.println(border + warna_BLUE + "\nTerima kasih sudah beli " + kobo1 + warna_RESET);//ucapan terimakasih karena telah membeli merchandise
                break;//koboJalan akan tetap dieksekusi
                case 2://apabila 2 maka kode di bawah akan dieksekusi
                    merchandise2 += qMerchandise;//merchandise yang telah terjual akan dimunculkan pada tampilan awal program dengan menambahkan merchandise2 dengan qMerchandise atau banyaknya merchandise
                    keuntungan += (qMerchandise*5);//untuk menghitung keuntungan dengan menambahkan variable keuntungan dengan hasil kali qMerchandsie dengan harga merchandise no.2 yang berharga $5
                    System.out.println(border + warna_BLUE + "\nTerima kasih sudah beli " + kobo2 + warna_RESET);//ucapan terimakasih karena telah membeli merchandise
                break;//koboJalan akan tetap dieksekusi
                case 3://apabila 3 maka kode di bawah akan dieksekusi
                    merchandise3 += qMerchandise;//merchandise yang telah terjual akan dimunculkan pada tampilan awal program dengan menambahkan merchandise3 dengan qMerchandise atau banyaknya merchandise
                    keuntungan += (qMerchandise*8);//untuk menghitung keuntungan dengan menambahkan variable keuntungan dengan hasil kali qMerchandsie dengan harga merchandise no.3 yang berharga $8
                    System.out.println(border + warna_BLUE + "\nTerima kasih sudah beli " + kobo3 + warna_RESET);//ucapan terimakasih karena telah membeli merchandise
                break;//koboJalan akan tetap dieksekusi
                case 4://apabila 4 maka kode di bawah akan dieksekusi
                    merchandise4 += qMerchandise;//merchandise yang telah terjual akan dimunculkan pada tampilan awal program dengan menambahkan merchandise4 dengan qMerchandise atau banyaknya merchandise
                    keuntungan += (qMerchandise*20);//untuk menghitung keuntungan dengan menambahkan variable keuntungan dengan hasil kali qMerchandsie dengan harga merchandise no.3 yang berharga $20
                    System.out.println(border + warna_BLUE + "\nTerima kasih sudah beli " + kobo4 + warna_RESET);//ucapan terimakasih karena telah membeli merchandise
                break; //koboJalan akan tetap dieksekusi
                case 0:
                bokoJalan = false;
                break;
                }
                               
            }  
            else if (nomorMerchandise==0){//apabila nomorMerchandise yang dipilih adalah 0, maka program bokoJalan akan bernilai false yang artinya akan memberhentikan while loop di atas
                bokoJalan = false;//bokoJalan akan berhenti diulangi 
                    System.out.println(warna_GREEN + "Terima kasih sudah berkunjung, mampir lagi yaa!! ehe~~" + warna_RESET);//kata kata yang akan muncul setelah menginput 0 pada nomorMerchandise
            }

            else {  //untuk mengecualikan suatu kondisi apabila diinput angka yang bukan [0.1,2,3,4]
                    System.out.println(warna_RED + "Coba pilih lagi dengan angka yang tertera yaa" + warna_RESET);//dimunculkan peringatan untuk memilih angka yang sesuai
        }     
        }
    } 
        
}
        


