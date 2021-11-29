public class AnswerChecker {

    public static int CheckAnswer(String[] inputs) {
        int score = 0;

        if (inputs[0] == "False") {
            score++;
        }

        if (inputs[1] == "1") {
            score++;
        }

        if (inputs[2] == "3") {
            score++;
        }

        if (inputs[3] == "2") {
            score++;
        }

        if (inputs[4] == "2") {
            score++;
        }

        if (inputs[5] == "1") {
            score++;
        }

        if (inputs[6] == "2") {
            score++;
        }

        if (inputs[7] == "1") {
            score++;
        } else if (inputs[7] == "2") {
            score++;
        } else if (inputs[7] == "3") {
            score++;
        }

        if (inputs[8] == "1") {
            score++;
        }

        if (inputs[9] == "3") {
            score++;
        }

        return score;
    }
}
