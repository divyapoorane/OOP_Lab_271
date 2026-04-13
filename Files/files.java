import java.io.*; 
import java.util.*; 
 
public class files { 
    public static void main(String[] args) throws Exception { 
 
        File file = new File("data.txt"); 
        Scanner sc = new Scanner(file); 
 
        while (sc.hasNextLine()) { 
            System.out.println(sc.nextLine()); 
        } 
 
        sc.close(); 
    } 
}