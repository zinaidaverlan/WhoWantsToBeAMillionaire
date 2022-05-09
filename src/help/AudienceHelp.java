package help;

import questionsanswers.Question;

public class AudienceHelp extends HelpOption{
    @Override
    HelpAnswer[] getHelpAnswers(Question question) {

            HelpAnswer[] helpAnswers =new HelpAnswer[2];
            helpAnswers[0]=new HelpAnswer(question.getCorrectAnswer(),50);
            helpAnswers[1]=new HelpAnswer(question.getWrongAnswer(),10);
            helpAnswers[2]=new HelpAnswer(question.getWrongAnswer(), 25);
            helpAnswers[3]=new HelpAnswer(question.getWrongAnswer(),15);
            return new HelpAnswer[4];

    }
}
