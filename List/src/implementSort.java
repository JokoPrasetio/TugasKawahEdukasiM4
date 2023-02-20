import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class implementSort {
    public static void main(String[] args){
        List<String> provinsi = new ArrayList<>();

        provinsi.add("Aceh");
        provinsi.add("Bali");
        provinsi.add("Bengkulu");
        provinsi.add("Jawa Barat");
        provinsi.add("Jawa Timur");
        provinsi.add("Jawa Tengah");
        provinsi.add("Jakarta");
        provinsi.add("Jambi");
        provinsi.add("Kalimantan Barat");
        provinsi.add("Kalimantan Timur");
        provinsi.add("Kalimantan Selatan");
        provinsi.add("Sumatera Selatan");
        provinsi.add("Sumatera Barat");

        System.out.println("List Nama Provinsi (sebelum diurutkan) : ");
        for(String prov : provinsi){
            System.out.println(prov);
        }
         Collections.sort(provinsi, Collections.reverseOrder());

            System.out.println("\nList Nama Provinsi (Setelah diurutkan Secara descending) : ");
            for (String prov : provinsi){
                System.out.println(prov);

        }
    }
}
