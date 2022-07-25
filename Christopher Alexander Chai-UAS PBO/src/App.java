import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class App {
    
    public static int getIndexFromPemesan(ArrayList<pemesan> array, String nama) {
        int index = 0;
        for (pemesan p : array) {
            if (p.getNama().equals(nama)) {
                return index;
            }
            index++;
            
        }
        return -1;
    }
    public static int getIndexFromPembayaran(ArrayList<pembayaran> array, String kode) {
        int index = 0;
        for (pembayaran py : array) {
            if (py.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static int getIndexFromStatus(ArrayList<status> array, String kode) {
        int index = 0;
        for (status st : array) {
            if (st.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static int getIndexFromSuperior(ArrayList<Superior> array, String kode) {
        int index = 0;
        for (Superior superior : array) {
            if (superior.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static int getIndexFromStandard(ArrayList<Standard> array, String kode) {
        int index = 0;
        for (Standard standard : array) {
            if (standard.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    public static int getIndexFromstatus(ArrayList<status> array, String kode) {
        int index = 0;
        for (status status : array) {
            if (status.getKode().equals(kode)) {
                return index;
            }
            index++;
        }
        return -1;
    }
   
    public static ArrayList<Standard> initStandard(ArrayList<Standard>Standard ){
        Standard s1 = new  Standard("100");
        Standard.add(s1);
        Standard s2 = new  Standard("101");
        Standard.add(s2);
        Standard s3 = new  Standard("102");
        Standard.add(s3);
        return  Standard;
    }
    public static ArrayList<Luxurious> initLuxurious(ArrayList<Luxurious>Luxurious ){
        Luxurious s1 = new  Luxurious("200");
        Luxurious.add(s1);
        Luxurious s2 = new  Luxurious("201");
        Luxurious.add(s2);
        Luxurious s3 = new  Luxurious("202");
        Luxurious.add(s3);
        return  Luxurious;
    }
    public static ArrayList<pemesan> initpemesan(ArrayList<pemesan>pemesan ){
        pemesan p1 = new pemesan("Dina", "Jalan gajah", "0811234522","Standard",2);
        pemesan.add(p1);
        pemesan p2 = new pemesan("Santi", "Jalan kerbau", "0834674112","Superior",4);
        pemesan.add(p2);
        pemesan p3 = new pemesan("Karen", "Jalan sapi", "081190488","Standard",2);
        pemesan.add(p3);
        return pemesan;
    }
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    } 
    
    public static ArrayList<status> initstatus(ArrayList<status>status ){
        status sts1 = new status("S01","Cash", "Standard", "A01","Checked In","2");
        status.add(sts1);
        status sts2 = new status("S02","Credit", "Superior", "S01","Checked In","4");
        status.add(sts2);
        status sts3 = new status("S03","Debit", "Standard", "A02","Checked Out","2");
        status.add(sts3);
        return status;
    }
    
   public static ArrayList<Standard> sd = new ArrayList<Standard>();
   public static ArrayList<pemesan> p = new ArrayList<pemesan>();
   public static ArrayList<pembayaran> py = new ArrayList<pembayaran>();
   public jenis jenis;
   public static ArrayList<Superior> sp = new ArrayList<Superior>();
    public static void main(String[] args) throws Exception {
        jenis jenisp = new jenis();
        pembayaran.initpembayaran(py);
       
        initpemesan(p);
        ArrayList<Luxurious> lux = new ArrayList<Luxurious>();
        initLuxurious(lux);
       
        initStandard(sd);
        ArrayList<status> sts = new ArrayList<status>();
        initstatus(sts);
        Scanner keyboard = new Scanner(System.in);
        String yn = "y";
        while(yn.equalsIgnoreCase("y")){
            clearScreen();
            System.out.println("                  UAS PBO Christopher                    ");
            System.out.println("---------------------------------------------------");
            System.out.println("1. Input/Cetak Data Pemesan");
            System.out.println("2. Input/Cetak Data Pembayaran");
            System.out.println("3. Cetak Jenis Kamar");
            System.out.println("4. Cetak Status");
            System.out.println("5. Metode Pembayaran");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda[1-6] ? ");
            String pilihan = keyboard.next();
            clearScreen();
            if (pilihan.equals("1")) {
                System.out.println("Data Pemesan");
                System.out.println("----------------");
                System.out.println("1. Input");
                System.out.println("2. Cetak Data Pemesan");
                System.out.println("3. Cetak Semua Data Pemesan");
                System.out.print("Pilihan Anda [1-3] ? ");
                String opsi = keyboard.next();
                clearScreen();
                if (opsi.equals("1")) {
                    System.out.println("Input Data Pemesan Baru");
                    System.out.println("----------------------");
                    System.out.print("Nama             : ");
                    String nama = keyboard.nextLine();
                    nama+=keyboard.nextLine();
                    System.out.print("Alamat           : ");
                    String alamat = keyboard.nextLine();
                    System.out.print("No Telepon       : ");
                    String notelp = keyboard.nextLine();
                    System.out.print("Jenis Kamar      : ");
                    String kamar = keyboard.nextLine();
                    System.out.print("Durasi           : ");
                    int durasi = keyboard.nextInt();
                    p.add(new pemesan(nama, alamat, notelp, kamar, durasi));
                }
                else if (opsi.equals("2")) {
                    System.out.println("Cetak Data Pemesan ");
                    System.out.println("-----------------");
                    System.out.print("Masukkan Nama  : ");
                    String nama = keyboard.next();
                    if (p.size() > 0) {
                        int idx = getIndexFromPemesan(p, nama);
                        if (idx == -1) {
                            throw new Exception("Nama Tidak Ditemukan");
                        }
                        else {
                            clearScreen();
                            System.out.println("Data Pemesan");
                            System.out.println("----------------");
                            System.out.println("Nama           : " + p.get(idx).getNama());
                            System.out.println("Alamat         : " + p.get(idx).getAlamat());
                            System.out.println("No Telepon     : " + p.get(idx).getNotelp());
                            System.out.println("Alamat         : " + p.get(idx).getKamar());
                            System.out.println("No Telepon     : " + p.get(idx).getDurasi());
                        }
                    }
                    else {
                        throw new Exception("Tidak ada data pemesan");
                    }
                }
                else if (opsi.equals("3")) {
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("\t\t\tData Pemesan");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Nama\t\tAlamat\t\tNo Telepon\tJenis Kamar\tDurasi");
                    System.out.println("----------------------------------------------------------------");
                    for (pemesan pemesan : p) {
                        pemesan.tampilpemesan();
                    }
                    System.out.println("----------------------------------------------------------------");

                }
                else {
                    throw new Exception("Pilihan tidak tersedia");
                }
            }
                else if(pilihan.equals("2")) {
                    System.out.println("Pembayaran");
                    System.out.println("--------------");
                    System.out.println("1. Input");
                    System.out.println("2. Cetak Pembayaran");
                    System.out.println("3. Cetak Semua Data Pembayaran");
                    System.out.print("Pilihan Anda [1-3] ? ");
                    String opsi = keyboard.next();
    
                    clearScreen();
                    if (opsi.equals("1")) {
                        System.out.println("Input Pembayaran");
                        System.out.println("--------------------");
                        System.out.print("Kode              : ");
                        String kode = keyboard.next();
                        System.out.print("Durasi            : ");
                        int durasi = keyboard.nextInt();
                        System.out.print("Biaya Penginapan  : ");
                        int penginapan = keyboard.nextInt();
                        System.out.print("Biaya Tambahan    : ");
                        int tambahan = keyboard.nextInt();
                        py.add(new pembayaran( kode, durasi, penginapan, tambahan  ));
                    }
                    else if (opsi.equals("2")) {
                        System.out.println("Cetak Data Pembayaran");
                        System.out.println("--------------------");
                        System.out.print("Masukkan Kode : ");
                        String kode = keyboard.next();
                        if (py.size()>0) {
                            int idx = getIndexFromPembayaran(py, kode);
                            if (idx == -1) {
                                throw new Exception("Kode yang Anda masukkan salah");
                            }
                            else {
                                clearScreen();
                                System.out.println("Data Pembayaran");
                                System.out.println("--------------");
                                System.out.println("Kode              : " + py.get(idx).getKode());
                                System.out.println("Durasi            : " + py.get(idx).getDurasi());
                                System.out.println("Biaya Penginapan  : " + py.get(idx).getPenginapan());
                                System.out.println("Biaya Tambahan    : " + py.get(idx).getTambahan());
                            }
                        }
                        else {
                            throw new Exception("Tidak ada data yang ditemukan");
                        }
                    }
                    else if (opsi.equals("3"))
                        {
                            int i=0;
                            System.out.println("Cetak Semua Data Pembayaran");
                            System.out.println("Kode Pembayaran\tDurasi\t\tPenginapan\t\tTambahan");
                            System.out.println("-------------------------------------------------------------------");  
                            
                            for (pembayaran pembayaran :py) {
                                pembayaran.tampilpembayaran();

                            }  
                        }
                }
                else if(pilihan.equals("3")) {
                    System.out.println("Jenis Kamar");
                    System.out.println("--------------");
                    System.out.println("1. Input");
                    System.out.println("2. Cetak Kamar Yang Terisi");
                    System.out.print("Pilihan Anda [1-2] ? ");
                    String opsi = keyboard.next();
    
                    clearScreen();
                    if (opsi.equals("1")) {
                        System.out.println("Input Kamar Yang Dipakai");
                        System.out.println("--------------------");
                        System.out.println("Jenis kamar [Standard/Superior/Luxurious]");
                        String pilihan1 = keyboard.next();
                        if (pilihan1.equals("Superior")) {
                        readwrite.daftarsuperior(sp);
                        }
                        else if (pilihan1.equals("Standard")) {
                            System.out.print("Kode      : ");
                            String kode = keyboard.next();
                            sd.add(new Standard( kode));
                            }
                        else if (pilihan1.equals("Luxurious")) {
                            System.out.print("Kode      : ");
                            String kode = keyboard.next();
                            lux.add(new Luxurious( kode));
                            }
                        }
                        
                    else if (opsi.equals("2")) {
                    System.out.println("Cetak Kamar Yang Terisi");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Jenis Kamar [Superior/Standard/Luxurious] : ");
                    String pilihan1 = keyboard.next();
                    if (pilihan1.equals("Superior")) {
                    System.out.println("\t\t\tData Kamar");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Kode Kamar\t");
                    System.out.println("-------------------------------------------------------------------");  
                    readwrite.display();
                        }
                    else if (pilihan1.equals("Standard")) {
                    System.out.println("\t\t\tData Kamar");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Kode Kamar\t");
                    System.out.println("-------------------------------------------------------------------");  
                    for (Standard standard : sd) {
                     
                        standard.tampilstandard();
                    }  
                        }
                        else if (pilihan1.equals("Luxurious")) {
                            System.out.println("\t\t\tData Kamar");
                            System.out.println("-------------------------------------------------------------------");
                            System.out.println("Kode Kamar\t");
                            System.out.println("-------------------------------------------------------------------");  
                            for (Luxurious Luxurious:lux) {
                                Luxurious.tampillux();
                            }  
                                }
                        }
                        else {
                            throw new Exception("Tidak ada data yang ditemukan..");
                        }
                    
                }

                else if(pilihan.equals("4")) {
                    System.out.println("Status");
                    System.out.println("--------------");
                    System.out.println("1. Input");
                    System.out.println("2. Cetak Status");
                    System.out.print("Pilihan Anda [1-2] ? ");
                    String opsi = keyboard.next();
                    clearScreen();
                    if (opsi.equals("1")) {
                        System.out.println("Input Status");
                        System.out.println("--------------------");
                        System.out.print("Kode Status         : ");
                        String kode = keyboard.next();
                        System.out.print("Metode Pembayaran   : ");
                        String metode = keyboard.next();
                        System.out.print("Jenis kamar         : ");
                        String jenis = keyboard.next();
                        System.out.print("Kode kamar          : ");
                        String kodek = keyboard.next();
                        System.out.print("Status              : ");
                        String status = keyboard.next();
                        System.out.print("Durasi              : ");
                        String durasi = keyboard.next();
                        sts.add(new status( kode, metode, jenis, kodek, status, durasi  ));
                    }
                    else if (opsi.equals("2")) {
                        System.out.println("Cetak Data Pembayaran");
                        System.out.println("--------------------");
                        System.out.print("Masukkan Kode : ");
                        String kode = keyboard.next();
                        if (sts.size()>0) {
                            int idx = getIndexFromStatus(sts, kode);
                            if (idx == -1) {
                                throw new Exception("Kode Yang Anda Masukkan Salah");
                            }
                            else {
                                clearScreen();
                                System.out.println("Data Pembayaran");
                                System.out.println("--------------");
                                System.out.println("Kode           : " + sts.get(idx).getKode());
                                System.out.println("Metode         : " + sts.get(idx).getMetode());
                                System.out.println("Jenis          : " + sts.get(idx).getKeterangan());
                                System.out.println("Kode kamar     : " + sts.get(idx).getKodek());
                                System.out.println("Status         : " + sts.get(idx).getStatus());
                                System.out.println("Durasi         : " + sts.get(idx).getDurasi());
                            }
                        }
                        else {
                            throw new Exception("Tidak Ada Data Yang Ditemukan");
                        }
                    }

                }
                else if (pilihan.equals("5")) {
                    jenisp.jenispembayarn();
                }
            
                else if (pilihan.equals("6")) {
                    break;
                }
    
                else {
                    throw new Exception("Pilihan Tidak Tersedia");
                }
    
                System.out.print("\nKembali Ke Halaman Utama [y/n] ? ");
                yn = keyboard.next();
            }
clearScreen();
System.out.println("\nTerima Kasih\n");
keyboard.close();
}
}