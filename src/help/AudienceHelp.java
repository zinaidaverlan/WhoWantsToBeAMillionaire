package help;

import questionsanswers.Question;

import java.util.Random;

public class AudienceHelp extends HelpOption{
    public AudienceHelp() {
    }

    Random random =new Random();
    int max=100;
    int rand=random.nextInt(max);


    @Override
    HelpAnswer[] getHelpAnswers(Question question) {

            HelpAnswer[] helpAnswers =new HelpAnswer[4];
            helpAnswers[0]=new HelpAnswer(question.getCorrectAnswer(),50);
            helpAnswers[1]=new HelpAnswer(question.getWrongAnswer()[3],rand);
            helpAnswers[2]=new HelpAnswer(question.getWrongAnswer()[3],rand);
            helpAnswers[3]=new HelpAnswer(question.getWrongAnswer()[3],rand);
            return new HelpAnswer[4];

    }
}
