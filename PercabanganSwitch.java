package percabanganswitch;
import java.util.Scanner;
public class PercabanganSwitch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi variabel
        int jumlah,menu,submenu,kartumember;
        double harga = 0,diskon,total = 0;
        
        System.out.println("Program Switch");
        System.out.println("===============================================");
        System.out.println("Daftar Menu");
        System.out.println("1. Sate :");
        System.out.println("    (11) Ayam              : Rp1500 per tusuk");
        System.out.println("    (12) Kambing           : Rp3000 per tusuk");
        System.out.println("2. Pecel :");
        System.out.println("    (21) Lauk Ayam         : Rp13000 per porsi");
        System.out.println("    (22) Lauk Empal        : Rp15000 per porsi");
        System.out.println("3. Penyetan :");
        System.out.println("    (31) Lauk Tahu / Tempe : Rp5000  per porsi");
        System.out.println("    (32) Lauk Telur        : Rp7000  per porsi");
        System.out.println("    (33) Lauk Ayam         : Rp10000 per porsi");
        System.out.println("===============================================");
        System.out.print("Pilih Menu        = ");
        menu = sc.nextInt();

        System.out.print("Pilih Sub Menu    = ");
        submenu = sc.nextInt();
        
        switch (menu) {
            case 1 :
                if (submenu==11){
                    harga = 1500;
                } else if (submenu==12){
                harga = 3000;
                } else {
                    System.out.println("Sub Menu Yang Anda Pilih Tidak Ada");
                    System.exit(0);
                }
                break;
                
            case 2 :
                if (submenu==21){
                    harga = 13000;
                } else if (submenu==22){
                harga = 15000;
                } else {
                    System.out.println("Sub Menu Yang Anda Pilih Tidak Ada");
                    System.exit(0);
                }
                break;
                
            case 3 :
                switch (submenu){
                    case 31 :
                        harga = 5000;
                        break;
                    case 32 :
                        harga = 7000;
                        break;
                    case 33 :
                        harga = 10000;
                        break;
                    default:
                    System.out.println("Sub Menu Yang Anda Pilih Tidak Ada");
                    System.exit(0);
                }
                break;
        }
        
        System.out.print("Jumlah            = ");
        jumlah = sc.nextInt();
        
        total = harga*jumlah;
        System.out.println("Total             = "+total);
        System.out.println("===============================================");
        System.out.println("Apakah Mempunyai Kartu Member?");
        System.out.println("(1) jika ya");
        System.out.println("(2) jika tidak");
        System.out.print("Pilih   = ");
        kartumember = sc.nextInt();
        System.out.println("===============================================");
        if (kartumember == 1){
            diskon = 0.05 * total;
            System.out.println("Mendapat Diskon 5% = "+diskon);
            total = total - diskon;
            System.out.println("Total Akhir        = "+total);
        } else if (kartumember == 2){
            System.out.println("Belum ada Diskon");
            System.out.println("Total Akhir         = "+total);
        } else {
            System.out.println("-");
          }
        
    }
    
}