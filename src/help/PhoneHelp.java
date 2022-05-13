package help;

import questionsanswers.Question;

public class PhoneHelp extends HelpOption{
    public PhoneHelp() {
    }

    @Override
   public HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers =new HelpAnswer[1];
        helpAnswers[0]=new HelpAnswer(question.getCorrectAnswer(),100);

        return helpAnswers;
    }
}

