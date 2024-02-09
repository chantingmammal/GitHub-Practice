import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean retry;

        System.out.println("Welcome to the Beatles test"); 
        System.out.println("there will be 10 questions, are you ready?");

        do {
            Scanner questions = new Scanner(System.in);
            String[] inputs = new String[10];
            
            System.out.println("Question 1: True or False, Is John Lennon Alive?");
            inputs[0] = questions.nextLine();
            System.out.println(inputs[0]);

            System.out.println("Question 2:Who wrote "Voice Piece for Soprano"?");
            System.out.println("options are  : 1)Yoko Ono 2)Donald Trump 3)Nathan Amaya ");
            System.out.println("Please type 1, 2 or 3");
            inputs[1] = questions.nextLine();

            System.out.println("Question 3: In this song, it states Hard Times are Over for a While, what is the name?");
            System.out.println("options are : 1)Kiss Kiss Kiss 2)Mundian to Bach Ke 3)Hard Times are Over");
            System.out.println("Please type 1, 2 or 3");
            inputs[2] = questions.nextLine();

            System.out.println("Question 4:Did Yoko Ono breakup the Beatles?");
            System.out.println("options are  : 1)Yes  2)No");
            System.out.println("Please type 1 or 2");
            inputs[3] = questions.nextLine();
            
            System.out.println("Question 5: Yoko Ono or Linda McCartney?");
            System.out.println("Options are : 1)ONO 2)MCCARTNEY");
            System.out.println("Please type 1 or 2");
            inputs[4] = questions.nextLine();
// Rest of Questions need to be finished
            System.out.println("Question 6: what is the best number of kids to have?");
            System.out.println("Options are : 1)1 2)4  3)69 4)420");
            System.out.println("Please type 1, 2, 3 or 4");
            inputs[5] = questions.nextLine();

            System.out.println("Question 7:Is china a capitalist or communist? ");
            System.out.println("option are : 1)capitalist 2)communist");
            System.out.println("Please type 1 or 2");
            inputs[6] = questions.nextLine();

            System.out.println("Question 8 :Who is tank man?");
            System.out.println("options are : 1)what are you talking about? 2)idk 3)wut 4)a protester");
            System.out.println("Please type 1, 2, 3 or 4");
            inputs[7] = questions.nextLine();
            

            System.out.println("Question 9: What is better than china?");
            System.out.println("options are : 1)nothing 2)women  3)money  4)Jeff Bezos");
            System.out.println("Please type 1, 2, 3 or 4");
            inputs[8] = questions.nextLine();

            System.out.println("Question 10: Who is numba won enemy?");
            System.out.println("1)simps  2)youtube ads 3)Donald Trump 4)Johnny Depp");
            System.out.println("Please type 1, 2, 3 or 4");
            inputs[9] = questions.nextLine(); 

            System.out.println("You scored: " + AnswerChecker.CheckAnswer(inputs) + "/10");
            System.out.println("Try Again? (Type 'Yes' to try again)");
            retry = questions.nextLine().equals("Yes") ? true : false;
        } while (retry);
    }
}

