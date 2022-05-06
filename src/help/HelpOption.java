package help;

import questionsanswers.Question;

public abstract class HelpOption {
    private boolean isUsed;
    abstract HelpAnswer[] getHelpAnswers(Question question);
}
