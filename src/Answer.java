public class Answer {
    private String answer;
    private boolean isCorrect;
    private String option;

    public Answer(String answer, boolean isCorrect, String option) {
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.option = option;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public void setOption(String option) {
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
