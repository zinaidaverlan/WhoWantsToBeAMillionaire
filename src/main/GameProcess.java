package main;

import help.AudienceHelp;
import help.FiftyFiftyHelp;
import help.HelpfulAnswerOption;
import help.PhoneHelp;
import questionsanswers.Answer;
import questionsanswers.AnswerOptions;
import questionsanswers.Question;

import java.util.Locale;
import java.util.Scanner;

public class GameProcess {
    Question[] allQuestions;

    public void startGame() {

        Scanner scanner = new Scanner(System.in);
        allQuestions = initQuestion();
        boolean testGame = true;
        int totalScore = 0;
        int level = 1;

        PhoneHelp phoneHelp = new PhoneHelp();
        AudienceHelp audienceHelp = new AudienceHelp();
        FiftyFiftyHelp fiftyFiftyHelp = new FiftyFiftyHelp();

        while (testGame && (level <= 10)) {
            Question question = getQuestionByLevel(level);
            if (question != null) {
                System.out.println(question.getQuestion());
                for (Answer answer : question.getAnswers()) {
                    System.out.println(answer.getOption() + ":" + answer.getAnswer());
                }

                System.out.println("Choose the correct option A, B, C or D or:");
                System.out.println("====Help====");
                System.out.println("F -> 50/50 |  P -> Call a friend  |  U - > The audience asks:");
                String gamerAnswer = scanner.nextLine();


                if (isValidOption(gamerAnswer)) {
                    AnswerOptions gamesAnswers = AnswerOptions.valueOf(gamerAnswer.toUpperCase(Locale.ROOT));
                    Answer returnedAnswer = question.getCheckAnswerCorrect(gamesAnswers);

                    if (returnedAnswer.isCorrect()) {
                        System.out.println("Answer is correct");
                        totalScore += question.getScore();
                        System.out.println("Score =" + totalScore);
                    } else {
                        System.out.println("Answer in wrong!");
                        System.out.println("Final Score=" + totalScore);
                        testGame = false;
                    }
                } else

                if (isHelpOption(gamerAnswer)) {
                    switch (gamerAnswer) {
                        case "P":
                            System.out.println("The phone help option is chosen");
                             ;
                            phoneHelp.isUsed(true);
                            break;
                        case "F":
                            System.out.println("The fifty fifty option is chosen");

                            //fiftyFiftyHelp.isUsed();
                            break;
                        case "U":
                            System.out.println("The audience help option is chosen");

                            //audienceHelp.isUsed();
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + gamerAnswer);
                    }
                }
            }
        }
    }

    private boolean isHelpOption(String gamerAnswer) {
        for (HelpfulAnswerOption helpfulAnswerOption : HelpfulAnswerOption.values()) {
            if (helpfulAnswerOption.name().equals(gamerAnswer)) {
                return true;
            }
        }
        try {
        } catch (IllegalArgumentException e) {

        }
        System.out.println("The help option entered is incorrect");
        return false;

    }

    private boolean isValidOption(String gamerAnswer) {
        for (AnswerOptions answerOptions : AnswerOptions.values()) {
            if (answerOptions.name().equalsIgnoreCase(gamerAnswer)) {
                return true;
            }
        }
        try {
        } catch (IllegalArgumentException e) {

        }
        System.out.println("The option entered is incorrect");
        return false;
    }

    private Question[] initQuestion() {

        Question[] questions = new Question[10];
        Answer[] answers1 = new Answer[4];
        answers1[0] = new Answer(GameInformation.QUESTION_1_ANSWER_1, true, "a");
        answers1[1] = new Answer(GameInformation.QUESTION_1_ANSWER_2, false, "b");
        answers1[2] = new Answer(GameInformation.QUESTION_1_ANSWER_3, false, "c");
        answers1[3] = new Answer(GameInformation.QUESTION_1_ANSWER_4, false, "d");
        Question question1 = new
                Question(GameInformation.QUESTION_1_LEVEL_1, answers1, 1, GameInformation.QUESTION_1_MONEY);
        questions[0] = question1;
        Answer[] answers2 = new Answer[4];
        answers2[0] = new Answer(GameInformation.QUESTION_2_ANSWER_1, false, "a");
        answers2[1] = new Answer(GameInformation.QUESTION_2_ANSWER_2, false, "b");
        answers2[2] = new Answer(GameInformation.QUESTION_2_ANSWER_3, true, "c");
        answers2[3] = new Answer(GameInformation.QUESTION_2_ANSWER_4, false, "d");
        Question question2 = new
                Question(GameInformation.QUESTION_2_LEVEL_2, answers2, 2, GameInformation.QUESTION_2_MONEY);
        questions[1] = question2;
        Answer[] answers3 = new Answer[4];
        answers3[0] = new Answer(GameInformation.QUESTION_3_ANSWER_1, false, "a");
        answers3[1] = new Answer(GameInformation.QUESTION_3_ANSWER_2, false, "b");
        answers3[2] = new Answer(GameInformation.QUESTION_3_ANSWER_3, true, "c");
        answers3[3] = new Answer(GameInformation.QUESTION_3_ANSWER_4, false, "d");
        Question question3 = new
                Question(GameInformation.QUESTION_3_LEVEL_3, answers3, 3, GameInformation.QUESTION_3_MONEY);
        questions[2] = question3;
        Answer[] answers4 = new Answer[4];
        answers4[0] = new Answer(GameInformation.QUESTION_4_ANSWER_1, false, "a");
        answers4[1] = new Answer(GameInformation.QUESTION_4_ANSWER_2, false, "b");
        answers4[2] = new Answer(GameInformation.QUESTION_4_ANSWER_3, false, "c");
        answers4[3] = new Answer(GameInformation.QUESTION_4_ANSWER_4, true, "d");
        Question question4 = new
                Question(GameInformation.QUESTION_4_LEVEL_4, answers4, 4, GameInformation.QUESTION_4_MONEY);
        questions[3] = question4;
        Answer[] answers5 = new Answer[4];
        answers5[0] = new Answer(GameInformation.QUESTION_5_ANSWER_1, false, "a");
        answers5[1] = new Answer(GameInformation.QUESTION_5_ANSWER_2, true, "b");
        answers5[2] = new Answer(GameInformation.QUESTION_5_ANSWER_3, false, "c");
        answers5[3] = new Answer(GameInformation.QUESTION_5_ANSWER_4, false, "d");
        Question question5 = new
                Question(GameInformation.QUESTION_5_LEVEL_5, answers5, 5, GameInformation.QUESTION_5_MONEY);
        questions[4] = question5;
        Answer[] answers6 = new Answer[4];
        answers6[0] = new Answer(GameInformation.QUESTION_6_ANSWER_1, false, "a");
        answers6[1] = new Answer(GameInformation.QUESTION_6_ANSWER_2, false, "b");
        answers6[2] = new Answer(GameInformation.QUESTION_6_ANSWER_3, false, "c");
        answers6[3] = new Answer(GameInformation.QUESTION_6_ANSWER_4, true, "d");
        Question question6 = new
                Question(GameInformation.QUESTION_6_LEVEL_6, answers6, 6, GameInformation.QUESTION_6_MONEY);
        questions[5] = question6;
        Answer[] answers7 = new Answer[4];
        answers7[0] = new Answer(GameInformation.QUESTION_7_ANSWER_1, true, "a");
        answers7[1] = new Answer(GameInformation.QUESTION_7_ANSWER_2, false, "b");
        answers7[2] = new Answer(GameInformation.QUESTION_7_ANSWER_3, false, "c");
        answers7[3] = new Answer(GameInformation.QUESTION_7_ANSWER_4, false, "d");
        Question question7 = new
                Question(GameInformation.QUESTION_7_LEVEL_7, answers7, 7, GameInformation.QUESTION_7_MONEY);
        questions[6] = question7;
        Answer[] answers8 = new Answer[4];
        answers8[0] = new Answer(GameInformation.QUESTION_8_ANSWER_1, false, "a");
        answers8[1] = new Answer(GameInformation.QUESTION_8_ANSWER_2, false, "b");
        answers8[2] = new Answer(GameInformation.QUESTION_8_ANSWER_3, true, "c");
        answers8[3] = new Answer(GameInformation.QUESTION_8_ANSWER_4, false, "d");
        Question question8 = new
                Question(GameInformation.QUESTION_8_LEVEL_8, answers8, 8, GameInformation.QUESTION_8_MONEY);
        questions[7] = question8;
        Answer[] answers9 = new Answer[4];
        answers9[0] = new Answer(GameInformation.QUESTION_9_ANSWER_1, false, "a");
        answers9[1] = new Answer(GameInformation.QUESTION_9_ANSWER_2, false, "b");
        answers9[2] = new Answer(GameInformation.QUESTION_9_ANSWER_3, false, "c");
        answers9[3] = new Answer(GameInformation.QUESTION_9_ANSWER_4, true, "d");
        Question question9 = new
                Question(GameInformation.QUESTION_9_LEVEL_9, answers9, 9, GameInformation.QUESTION_9_MONEY);
        questions[8] = question9;
        Answer[] answers10 = new Answer[4];
        answers10[0] = new Answer(GameInformation.QUESTION_10_ANSWER_1, true, "a");
        answers10[1] = new Answer(GameInformation.QUESTION_10_ANSWER_2, false, "b");
        answers10[2] = new Answer(GameInformation.QUESTION_10_ANSWER_3, false, "c");
        answers10[3] = new Answer(GameInformation.QUESTION_10_ANSWER_4, false, "d");
        Question question10 = new
                Question(GameInformation.QUESTION_10_LEVEL_10, answers10, 10, GameInformation.QUESTION_10_MONEY);
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