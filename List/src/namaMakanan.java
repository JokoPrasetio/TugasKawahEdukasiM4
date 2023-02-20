import java.util.ArrayList;
import java.util.List;
public class namaMakanan {
    public static void main(String[] args){
        List<String> makanan = new ArrayList<>();
        makanan.add("Pempek");
        makanan.add("Bakso");
        makanan.add("Pisang Goreng");
        makanan.add("Mie Goreng");
        makanan.add("Rendang");
        makanan.add("Sate Ayam");
        makanan.add("Soto");
        makanan.add("Gado Gado");
        makanan.add("Nasi Goreng");
        makanan.add("Ayam Rendang");
        makanan.add("Ayam Serundeng");
        makanan.add("Nasi Kucing");
        makanan.add("Nasi Kuning");
        makanan.add("Pecel Lele");
        makanan.add("Burger");
        makanan.add("Pizza");
        makanan.add("Tempe Goreng");
        makanan.add("Tahu Goreng");
        makanan.add("Seblak");

        System.out.println("List 20 Nama Makanan : ");
        for(String namaMakanan : makanan){
            System.out.println(namaMakanan);
        }
    }
}
