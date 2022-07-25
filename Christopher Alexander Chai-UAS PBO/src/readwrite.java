import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class readwrite {

   
    public static void daftarsuperior (ArrayList<Superior> Superior) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input Data Kamar Superior");
        System.out.println("----------------------");
        System.out.print("Kode      : ");
        String kode = keyboard.next();
        Superior.add(new Superior( kode));
        
        try (FileWriter superi = new FileWriter("C:\\Users\\ASUS\\Downloads\\Project Uas-Chai\\src\\Superior.txt", true)) {
            superi.append("\n" + kode );
        }
    }
    public static void display() throws Exception{
        try (BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Downloads\\Project Uas-Chai\\src\\Superior.txt"))) {
            String s = "";
            while ((s = read.readLine())!= null)
            {
                String data[] = s.split(",");
               
                for(int x=0; x<data.length;x++)
                { 
                    System.out.print("|" +data[x] + "\t|");
                }
                System.out.println();
            }
        }
    }
}