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
        for( Answer answer: answers){
            if (answer.isCorrect()){
                return answer;
            }
        }

        return null;
    }

    public Answer[] getWrongAnswer() {
        Answer[] wrongAnswers = new Answer[3];
        int i=0;
        for(Answer answer:answers){
            if (!(answer.isCorrect())){
                wrongAnswers[i]=answer;
                i++;
            }
        }

        return wrongAnswers;
    }

    public Answer getCheckAnswerCorrect(AnswerOptions answerOptions) {
        Answer checkAnswer = null;
        for (Answer answer : answers) {
            if (answer.getOption().equalsIgnoreCase(answerOptions.name())) {
                checkAnswer = answer;
            }
        }
        return checkAnswer;
    }
}