import java.util.Random;
import java.util.Scanner;

class NumberGuessGame
{
    public static void main(String[] args) {
        int ans,guess,score=0,tempScore=0,i,round=1;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Round: "+round++);
            ans = rand.nextInt(100)+1;
            i=1;
            while(i<=10)
            {
                System.out.println("Enter your guess(between 1 to 100): ");
                guess = sc.nextInt();
                if(guess==ans)
                {
                    System.out.println("Correct");
                    tempScore = (10-i+1)*10;    //1st round:100, 2nd round:90,....
                    break;
                }
                else if (guess<ans) 
                {
                    System.out.println("Too low");
                }
                else
                {
                    System.out.println("Too high");
                }
                System.out.println((10-i)+" attempts left");
                i++;
            }
            if(i>10)
                System.out.println("Failled!!!!");
            System.out.println("You get "+tempScore+" points");
            score+=tempScore;
            System.out.println("Press 1 to play another round else press anything to exit");
            String choice = sc.next();
            if(choice.equals("1")==false)
                break; 
        }
        System.out.println("Your final score is: "+score);
        sc.close();
    }   
}