package help;

import questionsanswers.Question;

import java.security.SecureRandom;
import java.util.Random;

public class FiftyFiftyHelp extends HelpOption{
    public FiftyFiftyHelp() {
    }

    Random random =new Random();
    int n =random.nextInt();
    @Override
    HelpAnswer[] getHelpAnswers(Question question) {
        HelpAnswer[] helpAnswers =new HelpAnswer[2];
        helpAnswers[0]=new HelpAnswer(question.getCorrectAnswer(),50);
        helpAnswers[1]=new HelpAnswer(question.getWrongAnswer()[2],50);
        return new HelpAnswer[2];
    }
}
