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
public class Anggota extends Latihan60Akatsuki {

     private String cincin;
    
    public Anggota(String nama, String desa, String cincin) {
        super(nama, desa);
        this.cincin = cincin;
    }

    public String getCincin() {
        return cincin;
    }
    
    @Override
    public void siapaSaya() {
        super.siapaSaya();
        System.out.println("Cincin : ".concat(cincin).concat("\n"));
    }
}
