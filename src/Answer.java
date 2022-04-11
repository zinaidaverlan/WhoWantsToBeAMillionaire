public class Answer {
    String answer;
    boolean isCorrect;
    String option;

    public Answer(String answer, boolean isCorrect, String option) {
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.option = option;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public String getOption() {
        return option;
    }
}
