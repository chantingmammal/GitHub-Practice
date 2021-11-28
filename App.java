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
        System.out.println("options are  : 1)Nothing   2)Protesting 3)tank man ");
        String input2 = questions.nextLine();

        System.out.println("Question 3: Who is our leader?");
        System.out.println("options are : 1)Daniel zhou 2)Donald Trump 3)Xi Jinping");
        String input3 = questions.nextLine();

        System.out.println("Question 4:is capitalism good?");
        System.out.println("options are  : 1)Yes  2)No");
        String input4 = questions.nextLine();
        
        System.out.println("Question 5: U.S.A or CHINA?");
        System.out.println("Options are : 1)U.S.A 2)CHINA");
        String input5 = questions.nextLine();

        System.out.println("Question 6: what is the best number of kids to have?");
        System.out.println("Options are : 1)1 2)4  3)69 4)420");
        String input6 = questions.nextLine();

        System.out.println("Question 7:Is china a capitalist or communist? ");
        System.out.println("option are : 1)capitalist 2)communist");
        String input7 = questions.nextLine();

        System.out.println("Question 8 :Who is tank man?");
        System.out.println("options are : 1)what are you talking about? 2)idk 3)wut 4)a protester");
        String input8 = questions.nextLine();
        

        System.out.println("Question 9: What is better than china?");
        System.out.println("options are : 1)nothing 2)women  3)money  4)Jeff Bezos");
        String input9 = questions.nextLine();

        System.out.println("Question 10: Who is numba won enemy?");
        System.out.println("1)simps  2)youtube ads 3)Donald Trump 4)Johnny Depp");
        String input10 = questions.nextLine(); //test fnny
    }
}

