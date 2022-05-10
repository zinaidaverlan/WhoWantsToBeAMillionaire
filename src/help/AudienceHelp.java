package help;

import questionsanswers.Question;

import java.util.Random;

public class AudienceHelp extends HelpOption{
    Random random =new Random();
    int n =random.nextInt();

    @Override
    HelpAnswer[] getHelpAnswers(Question question) {

            HelpAnswer[] helpAnswers =new HelpAnswer[2];
            helpAnswers[0]=new HelpAnswer(question.getCorrectAnswer(),50);
            helpAnswers[1]=new HelpAnswer(question.getWrongAnswer()[n],10);
            helpAnswers[2]=new HelpAnswer(question.getWrongAnswer()[n], 25);
            helpAnswers[3]=new HelpAnswer(question.getWrongAnswer()[n],15);
            return new HelpAnswer[4];

    }
}
