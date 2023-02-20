import java.util.ArrayList;

public class hapusData{
    public static void main(String[] args) {
        ArrayList<String> bahasaPemrograman = new ArrayList<>();

        // tambahkan 12 data ke dalam ArrayList
        bahasaPemrograman.add("Java");
        bahasaPemrograman.add("Python");
        bahasaPemrograman.add("JavaScript");
        bahasaPemrograman.add("PHP");
        bahasaPemrograman.add("Ruby");
        bahasaPemrograman.add("Swift");
        bahasaPemrograman.add("C++");
        bahasaPemrograman.add("C#");
        bahasaPemrograman.add("Go");
        bahasaPemrograman.add("Kotlin");
        bahasaPemrograman.add("R");

        // hapus 5 data yang berbeda dari ArrayList
        bahasaPemrograman.remove("PHP");
        bahasaPemrograman.remove("Ruby");
        bahasaPemrograman.remove("Swift");
        bahasaPemrograman.remove("Go");
        bahasaPemrograman.remove("R");

        // cetak isi ArrayList setelah data dihapus
        System.out.println("List Bahasa Pemrograman:");
        for (String bahasa : bahasaPemrograman) {
            System.out.println(bahasa);
        }
    }
}
