public class AnswerChecker {

    public static int CheckAnswer(String[] inputs) {
        int score = 0;

        if (inputs[0].equals("False")) {
            score++;
        }

        if (inputs[1].equals("1")) {
            score++;
        }

        if (inputs[2].equals("3")) {
            score++;
        }

        if (inputs[3].equals("2")) {
            score++;
        }

        if (inputs[4].equals("2")) {
            score++;
        }

        if (inputs[5].equals("1")) {
            score++;
        }

        if (inputs[6].equals("1")) {
            score++;
        }

        if (inputs[7].equals("1")) {
            score++;
        } else if (inputs[7].equals("2")) {
            score++;
        }

        if (inputs[8].equals("1")) {
            score++;
        }

        if (inputs[9].equals("4")) {
            score++;
        }

        return score;
    }
}
