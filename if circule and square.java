import java.util.Scanner;,

public class Main {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter Number 1 or 2");

int var1 = scan.nextInt();

if (var1 == 3) {

System.out.println("radius");

float r =scan.nextFloat();

System.out.println( r * r * 3.14);

}else if(var1 == 4){

System.out.println("heigh");

float h = scan.nextFloat();

System.out.println("Width");

float w = scan.nextFloat();

System.out.println(h * w);

} else{

System.out.println("error");

}

}

}
