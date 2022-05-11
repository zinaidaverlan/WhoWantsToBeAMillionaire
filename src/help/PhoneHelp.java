package help;

import questionsanswers.Question;

public class PhoneHelp extends HelpOption{
    public PhoneHelp() {
    }

    @Override
    HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers =new HelpAnswer[1];
        helpAnswers[0]=new HelpAnswer(question.getCorrectAnswer(),100);
        return new HelpAnswer[0];
    }
}

