
import java.util.Scanner;
import java.util.regex.*;

    public class RegularExpression {

        public static boolean checkPattern(String string, String patternType) {
            String pattern = "";

            if (patternType.equals("email")) {
                pattern = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
            } else if (patternType.equals("date")) {
                pattern = "^\\d{2}-\\d{2}-\\d{4}$";
            } else if (patternType.equals("date2")) {
                pattern = "^\\w{1,10},\\s\\w{1,10}\\s\\d{2}$";
            } else if (patternType.equals("ip")) {
                pattern = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
            } else {
                return false;
            }

            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(string);

            return m.matches();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan string yang akan diperiksa: ");
            String string = scanner.nextLine();

            System.out.println("Pilih jenis pola yang akan digunakan:");
            System.out.println("1. Email");
            System.out.println("2. Tipe Tanggal (dd-MM-yyyy) / contoh (14-07-2003)");
            System.out.println("3. Tipe Tanggal (dddd, MMMM yy) / contoh (sabtu, januari 22)");
            System.out.println("4. Alamat IP");
            System.out.print("Pilihan: ");
            String patternType = scanner.nextLine();

            if (patternType.equals("1")) {
                patternType = "email";
            } else if (patternType.equals("2")) {
                patternType = "date";
            } else if (patternType.equals("3")) {
                patternType = "date2";
            } else if (patternType.equals("4")) {
                patternType = "ip";
            } else {
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
            }

            if (checkPattern(string, patternType)) {
                System.out.println("String sesuai dengan pola yang dipilih.");
            } else {
                System.out.println("String tidak sesuai dengan pola yang dipilih.");
            }

            scanner.close();
        }
    }

