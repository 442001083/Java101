import java.util.Random;
import java.util.Scanner;

public class RockPaperSe {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String computerPlays = "rps";
Random rnd = new Random();
do{
System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
String s="";
if(scan.hasNextLine()){
  s = scan.nextLine();
}

s=s.toLowerCase();
char c=s.charAt(0);

if(c!='r'&&c!='p'&&c!='s')
break;
else
{
    
char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
if(c==computerChoice)
{   
    System.out.println(c+" won the match");
}
else
continue;
}


System.out.println("\n\n");
}while(true);
}
}
