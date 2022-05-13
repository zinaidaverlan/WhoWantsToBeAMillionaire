package help;

import questionsanswers.Question;

import java.util.Random;

public class AudienceHelp<getHelpAnswers> extends HelpOption {
    Random random = new Random();

    public AudienceHelp() {
    }
    @Override
   public HelpAnswer[] getHelpAnswers(Question question) {
        int[] randomArray = new int[4];
        int randomBuffer = 100;
        randomArray[0] = getRandomPercent(randomBuffer + 1);
        randomArray[1] = getRandomPercent(randomBuffer - randomArray[0]);
        randomArray[2] = randomBuffer-randomArray[1]-randomArray[0];
        randomArray[3] = randomBuffer - randomArray[0] - randomArray[1] - randomArray[2];
       
        int max = randomArray[0];
        int p = 0;
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
                p = i;
            }
        }
        
        int n = randomArray.length;
        for (int i = p; i < n - 1; i++) {
            randomArray[i] = randomArray[i + 1];}
        n--;

        HelpAnswer[] helpAnswers = new HelpAnswer[4];
        helpAnswers[0] = new HelpAnswer(question.getCorrectAnswer(), max);
        helpAnswers[1] = new HelpAnswer(question.getWrongAnswer()[0], randomArray[0]);
        helpAnswers[2] = new HelpAnswer(question.getWrongAnswer()[1], randomArray[1]);
        helpAnswers[3] = new HelpAnswer(question.getWrongAnswer()[2], randomArray[2]);
         return helpAnswers;
        }
    private int getRandomPercent(int randomBuffer) {
        return random.nextInt(randomBuffer + 1);
    }


}
