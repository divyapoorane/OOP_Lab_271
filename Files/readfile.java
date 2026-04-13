import java.io.*; 
import java.util.*; 
public class readfile { 
public static void main(String[] args) throws Exception { 
Scanner sc = new Scanner(System.in); 
// Writing 
FileWriter fw = new FileWriter("student.txt"); 
System.out.print("Enter Name: "); 
String name = sc.nextLine(); 
System.out.print("Enter Age: "); 
int age = sc.nextInt(); 
fw.write(name + " " + age); 
fw.close(); 
// Reading 
File file = new File("student.txt"); 
Scanner reader = new Scanner(file); 
System.out.println("Data from file:"); 
while (reader.hasNext()) { 
System.out.print(reader.next() + " "); 
} 
reader.close(); 
} 
}