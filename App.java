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
        System.out.println("options are  : Nothing , Protesting , tank man ");
        String input2 = questions.nextLine();

        System.out.println("Question 3: Who is our leader?");
        System.out.println("options are : Daniel zhou , Donald Trump ,Xi Jinping");
        String input3 = questions.nextLine();

        System.out.println("Question 4:is capitalism good?");
        System.out.println("options are  : Yes, No");
        String input4 = questions.nextLine();
        
        System.out.println("Question 5: U.S.A or CHINA?");
        System.out.println("Options are : U.S.A , CHINA");
        String input5 = questions.nextLine();

        System.out.println("Question 6: what is the best number of kids to have?");
        System.out.println("Options are : 1, 4 , 69 , 420");
        String input6 = questions.nextLine();

        System.out.println("Question 7:Is china a capitalist or communist? ");
        System.out.println("option are : capitalist or communist");
        String input7 = questions.nextLine();

        System.out.println("Question 8 :Who is tank man?");
        System.out.println("options are : what are you talking about? , idk , wut , a protester");
        String input8 = questions.nextLine();
        

        System.out.println("Question 9: What is better than china?");
        System.out.println("options are : nothing , women , money , jeff bezos");
        String input9 = questions.nextLine();

        System.out.println("Question 10: Who is numba won enemy?");
        System.out.println("simps, youtube ads , donald trump , johnny depp");
        String input10 = questions.nextLine(); //test fnny
    }
}

