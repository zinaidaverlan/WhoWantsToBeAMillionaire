package help;

import questionsanswers.Question;

import java.util.Random;

public abstract class HelpOption {
    private boolean isUsed = false;

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    abstract HelpAnswer[] getHelpAnswers(Question question);

    protected HelpAnswer getRandomWrongAnswer(Question question) {
        HelpAnswer wrongAnswer = new HelpAnswer();
        Random random = new Random();
       // wrongAnswer.setAnswer(question.getWrongAnswers().get(RandomHelp.getRandomIndex(question, random)));
        return wrongAnswer;
}}
