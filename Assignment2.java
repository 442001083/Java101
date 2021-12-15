import java.util.Random;
import java.util.Scanner;
public class  RockPaperSe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
            
            String user=scan.nextLine();
            
          user = (user.toLowerCase());
           char user1=user.charAt(0);
           if(user1!='r'&&user1!='s'&&user1!='p')
           break;
        
          char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
           if((user1=='s'&&computerChoice=='r')||(user1=='p'&&computerChoice=='s')||(user1=='r'&&computerChoice=='p'))
               System.out.println("computerPlays win");
           
           else if((user1=='r'&&computerChoice=='s')||(user1=='s'&&computerChoice=='p')||(user1=='p'&&computerChoice=='r'))
               System.out.println("user win"); 
            else 
    System.out.println("Draw");

             System.out.println("\n\n");
        }while(true);
        
    }
}
