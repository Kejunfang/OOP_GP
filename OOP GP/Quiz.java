import javax.swing.*;

public class Quiz {
    public int chance;
 
    //store the information of quiz questions and quiz answers
    private static final String[] quizQuestions = {
            "1. What is the primary cause of global warming?\n   Options: [Greenhouse gases, Deforestation, Ocean currents, Volcanic eruptions]",
            "2. Which gas is the most abundant greenhouse gas?\n   Options: [Carbon dioxide, Methane, Water vapor, Ozone]",
            "3. What is a major consequence of melting glaciers?\n  Options: [Sea level rise, Decreased biodiversity, Air pollution, Soil erosion]"
    };

    private static final String[] quizAnswers = {
            "Greenhouse gases",
            "Water vapor",
            "Sea level rise"
    };

    public void takeQuiz(){
        int score = 0;
        for(int i = 0; i < quizQuestions.length; i++){
            String answer = JOptionPane.showInputDialog(null,quizQuestions[i],"Quiz Question" + (i+1),3);
            if(answer!= null && answer.equalsIgnoreCase(quizAnswers[i])){
                score++;
                JOptionPane.showMessageDialog(null, "Correct","Quiz Result",3);
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is: " +  quizAnswers[i], "Quiz Result",2);
            }
        }
    JOptionPane.showMessageDialog(null, "Your scored "+score+"/" + quizQuestions.length,"Quiz Result",2);
    chance = 3;
    }

//this function is for user to taking quiz
    public void taking_question(){
        while (true) {

  
                takeQuiz();
                if(chance == 3){
                    break;
                }
      
    }
    }
}

