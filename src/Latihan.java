import java.util.HashMap;
import java.util.Scanner;

public class Latihan {
    String nama, kelas, matkulPraktikum;

    int nim;

    public Latihan(String nm, String kl, String mat, int mi){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = mi;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihan> lth = new HashMap<>();
        String input;
        Latihan data;

        lth.put("1" , new Latihan("Putri","3H","Struktur data",2020000));
        lth.put("2" , new Latihan("Agus","3A","Matematika",2020012));
        lth.put("3" , new Latihan("Arro","3O","Pemrogaman",2020017));

        System.out.println("Masukkan 10: ");
        input = in.nextLine();
        data = lth.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa: " + data.nama + ", kelas: " +
                    data.kelas + ", mata kuliah praktikum: " + data.matkulPraktikum +
                    ", nim: " + data.nim);
        }
    }
}
