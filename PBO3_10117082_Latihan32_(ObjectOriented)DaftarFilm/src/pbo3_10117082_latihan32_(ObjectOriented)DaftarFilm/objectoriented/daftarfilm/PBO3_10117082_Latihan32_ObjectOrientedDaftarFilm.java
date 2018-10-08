/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan32_.objectoriented.daftarfilm;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan daftar film
* dengan genre, durasi, dan rating yang sudah ada/sudah ditentukan
 */
public class PBO3_10117082_Latihan32_ObjectOrientedDaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("=====DAFTAR FILM YANG SEDANG TAYANG====="+"\n");
        
        Film film1 = new Film();
     film1.nama = "Venom";
     film1.genre = "Action, Horror, Sci-fi";
     film1.rating = "8.5";
     film1.durasi = "120 Menit";
        film1.nowPlaying(film1.nama, film1.genre, film1.rating, film1.durasi);
     
         Film film2 = new Film();
     film2.nama = "Small Foot";
     film2.genre = "Animation";
     film2.rating = "9.0";
     film2.durasi = "96 Menit";
        film2.nowPlaying(film2.nama, film2.genre, film2.rating, film2.durasi);     
        
      Film film3 = new Film();
     film3.nama = "Crazy Rich Asian";
     film3.genre = "Comedy";
     film3.rating = "7.8";
     film3.durasi = "119 Menit";
        film3.nowPlaying(film3.nama, film3.genre, film3.rating, film3.durasi);
        
     Film film4 = new Film();
     film4.nama = "Asih";
     film4.genre = "Horror";
     film4.rating = "6.0";
     film4.durasi = "100 Menit";
        film4.nowPlaying(film4.nama, film4.genre, film4.rating, film4.durasi);
    }
    
}
