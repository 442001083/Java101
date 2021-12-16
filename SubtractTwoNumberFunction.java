import java.util.Scanner;

public class Main {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter Number 1 or 2");

int var1 = scan.nextInt();

switch (var1){

case 1:

System.out.println("radius");

float r = scan.nextFloat();

System.out.println( r * r * 3.14);

break;

case 2:

System.out.println("heigh");

float h = scan.nextFloat();

System.out.println("Width");

float w = scan.nextFloat();

System.out.println(h * w);

break;

default:

System.out.println("error");
}
}
}
