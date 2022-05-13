package help;

import questionsanswers.Answer;

public class HelpAnswer {
    private Answer helpAnswer;
    private double  probabilityOfCorrectness;

    public HelpAnswer(Answer helpAnswer, double probabilityOfCorrectness) {
        this.helpAnswer = helpAnswer;
        this.probabilityOfCorrectness = probabilityOfCorrectness;
    }

    public HelpAnswer() {

    }

    public Answer getHelpAnswer() {
        return helpAnswer;
    }

    public void setHelpAnswer(Answer helpAnswer) {
        this.helpAnswer = helpAnswer;
    }

    public double getProbabilityOfCorrectness() {
        return probabilityOfCorrectness;
    }


    public void setProbabilityOfCorrectness(double probabilityOfCorrectness) {
        this.probabilityOfCorrectness = probabilityOfCorrectness;
    }
}
