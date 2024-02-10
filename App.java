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

            System.out.println("Question 2:Who wrote Voice Piece for Soprano?");
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
            System.out.println("Question 6: Who Killed John Lennon?");
            System.out.println("Options are : 1)Mark David Chapman 2)Mal Evans  3)Lucas Aiello 4)Vincent Anzelmo");
            System.out.println("Please type 1, 2, 3 or 4");
            inputs[5] = questions.nextLine();

            System.out.println("Question 7:When Did Yoko Ono divorced Tony Cox? ");
            System.out.println("option are : 1)1969 2)1970");
            System.out.println("Please type 1 or 2");
            inputs[6] = questions.nextLine();

            System.out.println("Question 8 :Who is Sean Ono Lennon?");
            System.out.println("options are : 1)Musician 2)Beatle's Son 3)IDK 4)Just a Man");
            System.out.println("Please type 1, 2, 3 or 4");
            inputs[7] = questions.nextLine();
            

            System.out.println("Question 9: What is better than Apple Corps?");
            System.out.println("options are : 1)Yoko Ono 2)Ono  3)ONO  4)YOKO ONO");
            System.out.println("Please type 1, 2, 3 or 4");
            inputs[8] = questions.nextLine();

            System.out.println("Question 10: Who is numba won enemy?");
            System.out.println("1)Paul  2)George 3)Richie Snare 4)Pete Best");
            System.out.println("Please type 1, 2, 3 or 4");
            inputs[9] = questions.nextLine(); 

            System.out.println("You scored: " + AnswerChecker.CheckAnswer(inputs) + "/10");
            System.out.println("Try Again? (Type 'Yaya' to try again and scream)");
            retry = questions.nextLine().equals("Yaya") ? true : false;
        } while (retry);
    }
}

