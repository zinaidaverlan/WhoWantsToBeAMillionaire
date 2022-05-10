package help;

import questionsanswers.Question;

public abstract class HelpOption {
    private boolean isUsed = false;



    abstract HelpAnswer[] getHelpAnswers(Question question);
}
