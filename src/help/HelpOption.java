package help;

import questionsanswers.Question;

public abstract class HelpOption {
    private boolean isUsed = false;

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    abstract HelpAnswer[] getHelpAnswers(Question question);
}
