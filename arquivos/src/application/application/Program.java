package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        File file = new File("c:\\users\\600534\\documents\\exem.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(IOException e){
            System.out.println("Erro: "+ e.getMessage());
        }
        finally{
            if(sc != null){
                sc.close();
            }
            
        }
    }
}