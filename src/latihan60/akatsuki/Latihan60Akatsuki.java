/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan60.akatsuki;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Memasukan Data Anggota Akatsuki
 */
public class Latihan60Akatsuki {

    protected String nama, desa;

   public Latihan60Akatsuki(String nama, String desa) {
       this.nama = nama;
       this.desa = desa;
   }

   public String getNama() {
       return nama;
   }

   public String getDesa() {
       return desa;
   }
   
   public void siapaSaya() {
       System.out.println("Anggota Akatsuki");
       System.out.println("Nama : ".concat(nama));
       System.out.println("Desa : ".concat(desa));
   }
}
