package main;
import questionsanswers.Question;

import  java.util.Scanner;

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
                        if (question.getAnswers().isCorrect()) {
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

        Answer answer1question1 = new Answer(GameInformation.QUESTION_1_ANSWER_1, true, "a");
        Answer answer2question1 = new Answer(GameInformation.QUESTION_1_ANSWER_2, false, "b");
        Answer answer3question1 = new Answer(GameInformation.QUESTION_1_ANSWER_3, false, "c");
        Answer answer4question1 = new Answer(GameInformation.QUESTION_1_ANSWER_4, false, "d");
        Question question1 = new
                Question(GameInformation.QUESTION_1_LEVEL_1, answer1question1, answer2question1,
                answer3question1, answer4question1, 1, GameInformation.QUESTION_1_MONEY);
        questions[0] = question1;

        Answer answer1question2 = new Answer(GameInformation.QUESTION_2_ANSWER_1, false, "a");
        Answer answer2question2 = new Answer(GameInformation.QUESTION_2_ANSWER_2, false, "b");
        Answer answer3question2 = new Answer(GameInformation.QUESTION_2_ANSWER_3, true, "c");
        Answer answer4question2 = new Answer(GameInformation.QUESTION_2_ANSWER_4, false, "d");
        Question question2 = new
                Question(GameInformation.QUESTION_2_LEVEL_2, answer1question2, answer2question2,
                answer3question2, answer4question2, 2, GameInformation.QUESTION_2_MONEY);
        questions[1] = question2;

        Answer answer1question3 = new Answer(GameInformation.QUESTION_3_ANSWER_1, false, "a");
        Answer answer2question3 = new Answer(GameInformation.QUESTION_3_ANSWER_2, false, "b");
        Answer answer3question3 = new Answer(GameInformation.QUESTION_3_ANSWER_3, true, "c");
        Answer answer4question3= new Answer(GameInformation.QUESTION_3_ANSWER_4, false, "d");
        Question question3 = new
                Question(GameInformation.QUESTION_3_LEVEL_3, answer1question3, answer2question3,
                answer3question3, answer4question3, 3, GameInformation.QUESTION_3_MONEY);
        questions[2] = question3;

        Answer answer1question4 = new Answer(GameInformation.QUESTION_4_ANSWER_1, false, "a");
        Answer answer2question4 = new Answer(GameInformation.QUESTION_4_ANSWER_2, false, "b");
        Answer answer3question4 = new Answer(GameInformation.QUESTION_4_ANSWER_3, false, "c");
        Answer answer4question4 = new Answer(GameInformation.QUESTION_4_ANSWER_4, true, "d");
        Question question4 = new
                Question(GameInformation.QUESTION_4_LEVEL_4, answer1question4, answer2question4,
                answer3question4, answer4question4, 4, GameInformation.QUESTION_4_MONEY);
        questions[3] = question4;

        Answer answer1question5 = new Answer(GameInformation.QUESTION_5_ANSWER_1, false, "a");
        Answer answer2question5 = new Answer(GameInformation.QUESTION_5_ANSWER_2, true, "b");
        Answer answer3question5 = new Answer(GameInformation.QUESTION_5_ANSWER_3, false, "c");
        Answer answer4question5 = new Answer(GameInformation.QUESTION_5_ANSWER_4, false, "d");
        Question question5 = new
                Question(GameInformation.QUESTION_5_LEVEL_5, answer1question5, answer2question5,
                answer3question5, answer4question5, 5, GameInformation.QUESTION_5_MONEY);
        questions[4] = question5;

        Answer answer1question6 = new Answer(GameInformation.QUESTION_6_ANSWER_1, false, "a");
        Answer answer2question6 = new Answer(GameInformation.QUESTION_6_ANSWER_2, false, "b");
        Answer answer3question6 = new Answer(GameInformation.QUESTION_6_ANSWER_3, false, "c");
        Answer answer4question6 = new Answer(GameInformation.QUESTION_6_ANSWER_4, true, "d");
        Question question6 = new
                Question(GameInformation.QUESTION_6_LEVEL_6, answer1question6, answer2question6,
                answer3question6, answer4question6, 6, GameInformation.QUESTION_6_MONEY);
        questions[5] = question6;

        Answer answer1question7 = new Answer(GameInformation.QUESTION_7_ANSWER_1, true, "a");
        Answer answer2question7 = new Answer(GameInformation.QUESTION_7_ANSWER_2, false, "b");
        Answer answer3question7 = new Answer(GameInformation.QUESTION_7_ANSWER_3, false, "c");
        Answer answer4question7 = new Answer(GameInformation.QUESTION_7_ANSWER_4, false, "d");
        Question question7 = new
                Question(GameInformation.QUESTION_7_LEVEL_7, answer1question7, answer2question7,
                answer3question7, answer4question7, 7, GameInformation.QUESTION_7_MONEY);
        questions[6] = question7;

        Answer answer1question8 = new Answer(GameInformation.QUESTION_8_ANSWER_1, false, "a");
        Answer answer2question8 = new Answer(GameInformation.QUESTION_8_ANSWER_2, false, "b");
        Answer answer3question8 = new Answer(GameInformation.QUESTION_8_ANSWER_3, true, "c");
        Answer answer4question8 = new Answer(GameInformation.QUESTION_8_ANSWER_4, false, "d");
        Question question8 = new
                Question(GameInformation.QUESTION_8_LEVEL_8, answer1question8, answer2question8,
                answer3question8, answer4question8, 8, GameInformation.QUESTION_8_MONEY);
        questions[7] = question8;

        Answer answer1question9 = new Answer(GameInformation.QUESTION_9_ANSWER_1, false, "a");
        Answer answer2question9 = new Answer(GameInformation.QUESTION_9_ANSWER_2, false, "b");
        Answer answer3question9 = new Answer(GameInformation.QUESTION_9_ANSWER_3, false, "c");
        Answer answer4question9 = new Answer(GameInformation.QUESTION_9_ANSWER_4, true, "d");
        Question question9 = new
                Question(GameInformation.QUESTION_9_LEVEL_9, answer1question9, answer2question9,
                answer3question9, answer4question9, 9, GameInformation.QUESTION_9_MONEY);
        questions[8] = question9;

        Answer answer1question10 = new Answer(GameInformation.QUESTION_10_ANSWER_1, true, "a");
        Answer answer2question10 = new Answer(GameInformation.QUESTION_10_ANSWER_2, false, "b");
        Answer answer3question10 = new Answer(GameInformation.QUESTION_10_ANSWER_3, false, "c");
        Answer answer4question10 = new Answer(GameInformation.QUESTION_10_ANSWER_4, false, "d");
        Question question10 = new
                Question(GameInformation.QUESTION_10_LEVEL_10, answer1question10, answer2question10,
                answer3question10, answer4question10, 10, GameInformation.QUESTION_10_MONEY);
        questions[9] = question10;
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