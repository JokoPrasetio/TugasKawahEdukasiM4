import java.util.ArrayList;
        import java.util.List;
public class tahunPialaDunia {
    public static void main(String[] args){
        List<Integer> daftarTahunPialaDunia = new ArrayList<>();

        int tahunAwal = 1930;
        int tahunAkhir = 2022;

        for (int a = tahunAwal; a <= tahunAkhir; a +=4){
            daftarTahunPialaDunia.add(a);
        }
        System.out.println("\nList Tahun Piala Dunia : ");
        for (int tahun : daftarTahunPialaDunia){
            System.out.println(tahun);
        }
    }

}
