import java.util.Scanner;
public class jenis extends pembayaran{
    Scanner temp = new Scanner(System.in);

    public int hitung(int durasi)
    {
        System.out.println("Masukkan jenis kamar[Standard/Deluxe/Superior] : ");
        String jenis = temp.next();
        if (jenis.equals("Standard"))
        {
            int tagihan=300000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        else if (jenis.equals("Luxurious"))
        {
            int tagihan=800000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        else if (jenis.equals("Superior"))
        {
            int tagihan=600000;
            int total = tagihan*durasi;
            System.out.println("Total : "+total);
        }
        return durasi;
    }
    public void hitung (String jenis,int a)
    {
        
        if (jenis.equals("Ovo"))
        {
            double diskon = 0.88*a;
            System.out.println("Tagihan setelah diskon : "+diskon);
        }
        else if (jenis.equals("Shopeepay"))
        {
            double diskon = 1*a;
            System.out.println("Total setelah diskon: "+diskon);
        }
        else if (jenis.equals("Gopay"))
        {
            double diskon = 0.95*a;
            System.out.println("Total setelah diskon: "+diskon);
        }
        
    }
    public static void quickSort(int[] arr, int start, int end){
 
        int partition = partition(arr, start, end);
 
        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }
 
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        return start;
    }
    int x=0;
    
    public void simpandata()
    {
        for(int i=0;i<1;i++)
        {
            x++;
            
        }
        
        System.out.println("Apakah anda ingin menggunakan sort [y/n]? ");  
        String jwb = temp.next();
        if (jwb.equals("y"))
        {  
            System.out.println("Silahkan masukkan jumlah data yang akan disimpan : "); 
            int n= temp.nextInt(); 
            int[] array = new int[n];
            System.out.println("Silahkan masukkan total yang akan disimpan : ");  
            for(int i=0;i<n;i++)
        {
            array[i]=temp.nextInt();
        }
            System.out.println("Data yang sudah disimpan (Disusun dari nominal kecil)");
            quickSort(array,0,array.length-1);
        for (int i=0;i<array.length;++i)
        {
            System.out.println(""+array[i]);
        } 
        }
        else
        {
            System.out.println("Terima Kasih ");  
        }
      
    }
    
    public  void jenispembayarn()
    {
     
        System.out.println("Masukkan durasi penginapan : ");
        int durasi = temp.nextInt();
        hitung(durasi);
        System.out.println("Masukkan jenis pembayaran[Ovo/Shopeepay/Gopay] : ");
        String jenis1 = temp.next();
        System.out.println("Tagihan anda : ");
        int tagihan = temp.nextInt();
        hitung(jenis1,tagihan);
        simpandata();
        
}
}