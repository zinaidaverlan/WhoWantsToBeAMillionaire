package help;

import questionsanswers.Question;

public class FiftyFiftyHelp extends HelpOption{
    @Override
    HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers =new HelpAnswer[2];
        helpAnswers[0]=new HelpAnswer(question.getCorrectAnswer(),50);
        helpAnswers[1]=new HelpAnswer(question.getWrongAnswer(),50);
        return new HelpAnswer[2];
    }
}
