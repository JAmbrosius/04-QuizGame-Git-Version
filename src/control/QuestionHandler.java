package control;

import model.LevelQuestions;
import model.Question;

public class QuestionHandler {
    private LevelQuestions[] allLevelQuestions;

    public QuestionHandler(){
        allLevelQuestions = new LevelQuestions[15];
        createAllLevels();
    }

    public String[] getRandomQuestions(int level){
        String[] output = new String[6];

        Question q = allLevelQuestions[level].getRandomQuestion();
        output[0] = q.getQuestion();
        output[1] = q.getAnswers()[0];
        output[2] = q.getAnswers()[1];
        output[3] = q.getAnswers()[2];
        output[4] = q.getAnswers()[3];
        output[5] = q.getCorrectAnswer();

        return output;
    }

    private void createAllLevels(){
        for(int i = 0; i < allLevelQuestions.length; i++){
            allLevelQuestions[i] = new LevelQuestions(i+1);
        }
    }
}
