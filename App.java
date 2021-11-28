import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // This is a test
        System.out.println("Welcome to the social credit score test"); //Funny comment
        System.out.println("there will be 10 questions, are you ready?");
        System.out.println("Question 1: True or false, Is Taiwan a country?");
        Scanner questions = new Scanner(System.in);
        String input1 = questions.nextLine();

        System.out.println("Question 2:What happened at tiananmen square?");
        String input2 = questions.nextLine();

        System.out.println("Question 3: Who is our leader?");
        String input3 = questions.nextLine();

        System.out.println("Question 4:is capitalism good?");
        String input4 = questions.nextLine();
        
        System.out.println("Question 5: U.S.A or CHINA?");
        String input5 = questions.nextLine();

        System.out.println("Question 6: what is the best number of kids to have?");
        String input6 = questions.nextLine();

        System.out.println("Question 7:Is china a capitalist or communist? ");
        String input7 = questions.nextLine();

        System.out.println("Question 8 :Who is tank man?");
        String input8 = questions.nextLine();

        System.out.println("Question 9: What is better than china?");
        String input9 = questions.nextLine();

        System.out.println("Question 10: Who is numba won enemy?");
        String input10 = questions.nextLine();
    }
}

