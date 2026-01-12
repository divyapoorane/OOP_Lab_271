//Factorial

import java.util.Scanner;
class Factorial{
public static void main(String[] args) {
Scanner myobj = new Scanner(System.in);
int n=myobj.nextInt();
int f=1;
for (int i=1; i<=n; i++){
f=f*i;
}
System.out.println(f);
}
}