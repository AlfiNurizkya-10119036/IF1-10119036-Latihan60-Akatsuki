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
public class Main {

    public static void main(String[] args) {
        Anggota pain = new Anggota("Pain (Yahiko)", "Amegakure", "零 - れい, Rei - Nol/Tidak ada");
        pain.siapaSaya();

        Anggota deidara = new Anggota("Deidara", "Iwagakure", "青龍 - せいりゅう, Seiryū - Naga Biru/Hijau - Dewa Timur dan Musim Semi");
        deidara.siapaSaya();

        Anggota konan = new Anggota("Konan", "Amegakure", "白虎 - びゃっこ, Byakko - Harimau Putih - Dewa Barat dan Musim Gugur");
        konan.siapaSaya();

        Anggota itachi = new Anggota("Itachi Uchiha", "Konohagakure", "朱雀 - すざく, Suzaku - Merah darah - Dewa Selatan dan Musim Panas");
        itachi.siapaSaya();

        Anggota zetsu = new Anggota("Zetsu", "Tidak Diketahui", "玄武 - げんぶ, Genbu - Kura-Kura - Dewa Utara dan Musim Dingin");
        zetsu.siapaSaya();

        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure", "空陳 - くうちん, Sora - Langit");
        orochimaru.siapaSaya();

        Anggota kisame = new Anggota("Kisame Hoshigaki", "Kirigakure", "南斗 - なんじゅ, Nanju - Bintang Selatan");
        kisame.siapaSaya();

        Anggota kakuzu = new Anggota("Kakuzu", "Takigakure", "北斗 - ほくと, Hokuto - Bintang Utara");
        kakuzu.siapaSaya();

        Anggota hidan = new Anggota("Hidan", "Yugakure", "三台 - さんたい, Santai - Tiga Tingkatan");
        hidan.siapaSaya();

        Anggota sasori = new Anggota("Sasori", "Sunagakure", "玉女 - ぎょくにょ, Gyokunyo - Virgo");
        sasori.siapaSaya();

        Anggota nagato = new Anggota("Nagato", "Amegakure", "Tidak Memakai Cincin");
        nagato.siapaSaya();

        Anggota obito = new Anggota("Obito Uchiha (Tobi)", "Konohagakure", "玉女 - ぎょくにょ, Gyokunyo - Virgo");
        obito.siapaSaya();
    }
}
