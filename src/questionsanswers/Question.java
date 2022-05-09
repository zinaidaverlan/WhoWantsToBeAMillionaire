package questionsanswers;

public class Question {

    private String question;
    private Answer[] answers;
    private int level;
    private int score;

    public Question(String question, Answer[] answers, int level, int score) {
        this.question = question;
        this.answers = answers;
        this.level = level;
        this.score = score;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public Answer getCorrectAnswer() {

        return null;
    }

    public Answer[] getWrongAnswer() {

        return new Answer[0];
    }

    public Answer getCheckAnswerCorrect(AnswerOptions answerOptions) {
        Answer checkAnswer = null;
        for (Answer answer : answers) {
            if (answer.getOption().equals(answerOptions)) {
                checkAnswer = answer;
            }
        }
        return null;
    }
}