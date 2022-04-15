import java.util.Scanner;

public class GameProcess {
    Question[] allQuestions;

    public void startGame() {

        Scanner scanner = new Scanner(System.in);
        allQuestions = initQuestion();
        boolean testGame = true;
        int totalScore = 0;
        int level = 1;
        while (testGame && (level <= 10)) {
            Question question = getQuestionByLevel(level);
            if (question != null) {
                System.out.println(question.getQuestion());
                System.out.println(question.getAnswer1().getOption() + ":" + question.getAnswer1().getAnswer());
                System.out.println(question.getAnswer2().getOption() + ":" + question.getAnswer2().getAnswer());
                System.out.println(question.getAnswer3().getOption() + ":" + question.getAnswer3().getAnswer());
                System.out.println(question.getAnswer4().getOption() + ":" + question.getAnswer4().getAnswer());

                System.out.println("Choose the correct option a,b,c or d:");
                String gamerAnswer = scanner.nextLine();
                switch (gamerAnswer) {
                    case "a":
                        if (question.getAnswer1().isCorrect()) {
                            System.out.println("Answer is correct");
                            totalScore += question.getScore();
                            System.out.println("Score =" + totalScore);
                        } else {
                            System.out.println("Answer in wrong!");
                            System.out.println("Final Score=" + totalScore);
                            testGame = false;

                        }
                        break;
                    case "b":
                        if (question.getAnswer2().isCorrect()) {
                            System.out.println("Answer is correct");
                            totalScore += question.getScore();
                            System.out.println("Score =" + totalScore);
                        } else {
                            System.out.println("Answer in wrong!");
                            System.out.println("Final Score=" + totalScore);
                            testGame = false;
                        }
                        break;
                    case "c":
                        if (question.getAnswer3().isCorrect()) {
                            System.out.println("Answer is correct");
                            totalScore += question.getScore();
                            System.out.println("Score =" + totalScore);
                        } else {
                            System.out.println("Answer in wrong!");
                            System.out.println("Final Score=" + totalScore);
                            testGame = false;
                        }
                        break;
                    case "d":
                        if (question.getAnswer4().isCorrect()) {
                            System.out.println("Answer is correct");
                            totalScore += question.getScore();
                            System.out.println("Score =" + totalScore);
                        } else {
                            System.out.println("Answer in wrong!");
                            System.out.println("Final Score=" + totalScore);
                            testGame = false;
                        }
                        break;
                    default:
                        System.out.println("The option is not answer!");
                }

                level += 1;
            } else {
                testGame = false;
            }
        }
    }

    private Question[] initQuestion() {
        Question[] questions = new Question[10];

        Answer answer1question1level1 = new Answer(GameInformation.QUESTION_1_ANSWER_1_LEVEL1, true, "a");
        Answer answer2question1level1 = new Answer(GameInformation.QUESTION_1_ANSWER_2_LEVEL1, false, "b");
        Answer answer3question1level1 = new Answer(GameInformation.QUESTION_1_ANSWER_3_LEVEL1, false, "c");
        Answer answer4question1level1 = new Answer(GameInformation.QUESTION_1_ANSWER_4_LEVEL1, false, "d");
        Question question1 = new
                Question(GameInformation.QUESTION_1_LEVEL_1, answer1question1level1, answer2question1level1,
                answer3question1level1, answer4question1level1, 1, GameInformation.QUESTION_1_MONEY);
        questions[0] = question1;

        Answer answer1question2level1 = new Answer(GameInformation.QUESTION_2_ANSWER_1_LEVEL1, false, "a");
        Answer answer2question2level1 = new Answer(GameInformation.QUESTION_2_ANSWER_2_LEVEL1, false, "b");
        Answer answer3question2level1 = new Answer(GameInformation.QUESTION_2_ANSWER_3_LEVEL1, true, "c");
        Answer answer4question2level1 = new Answer(GameInformation.QUESTION_2_ANSWER_4_LEVEL1, false, "d");
        Question question2 = new
                Question(GameInformation.QUESTION_2_LEVEL_1, answer1question2level1, answer2question2level1,
                answer3question2level1, answer4question2level1, 1, GameInformation.QUESTION_2_MONEY);
        questions[1] = question2;

        Answer answer1question3level1 = new Answer(GameInformation.QUESTION_3_ANSWER_1_LEVEL1, false, "a");
        Answer answer2question3level1 = new Answer(GameInformation.QUESTION_3_ANSWER_2_LEVEL1, false, "b");
        Answer answer3question3level1 = new Answer(GameInformation.QUESTION_3_ANSWER_3_LEVEL1, true, "c");
        Answer answer4question3level1 = new Answer(GameInformation.QUESTION_3_ANSWER_4_LEVEL1, false, "d");
        Question question3 = new
                Question(GameInformation.QUESTION_3_LEVEL_1, answer1question3level1, answer2question3level1,
                answer3question3level1, answer4question3level1, 1, GameInformation.QUESTION_3_MONEY);
        questions[2] = question3;

        Answer answer1question4level1 = new Answer(GameInformation.QUESTION_4_ANSWER_1_LEVEL1, false, "a");
        Answer answer2question4level1 = new Answer(GameInformation.QUESTION_4_ANSWER_2_LEVEL1, false, "b");
        Answer answer3question4level1 = new Answer(GameInformation.QUESTION_4_ANSWER_3_LEVEL1, false, "c");
        Answer answer4question4level1 = new Answer(GameInformation.QUESTION_4_ANSWER_4_LEVEL1, true, "d");
        Question question4 = new
                Question(GameInformation.QUESTION_4_LEVEL_1, answer1question4level1, answer2question4level1,
                answer3question4level1, answer4question4level1, 1, GameInformation.QUESTION_4_MONEY);
        questions[3] = question4;

        Answer answer1question5level1 = new Answer(GameInformation.QUESTION_5_ANSWER_1_LEVEL1, false, "a");
        Answer answer2question5level1 = new Answer(GameInformation.QUESTION_5_ANSWER_2_LEVEL1, true, "b");
        Answer answer3question5level1 = new Answer(GameInformation.QUESTION_5_ANSWER_3_LEVEL1, false, "c");
        Answer answer4question5level1 = new Answer(GameInformation.QUESTION_5_ANSWER_4_LEVEL1, false, "d");
        Question question5 = new
                Question(GameInformation.QUESTION_5_LEVEL_1, answer1question5level1, answer2question5level1,
                answer3question5level1, answer4question5level1, 1, GameInformation.QUESTION_5_MONEY);
        questions[4] = question5;
        return questions;
    }

    private Question getQuestionByLevel(int level) {
        Question question = null;
        for (Question question1 : allQuestions) {
            if (question1.getLevel() == level) {
                question = question1;
                level++;
                break;
            }
        }
        return question;

    }
}

