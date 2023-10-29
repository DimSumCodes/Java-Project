//Import the utility needed to use the popup windows
import javax.swing.JOptionPane;

//Create the main class for the project
class Main 
{
//Create a Question class that can be used to create question objects
    static class Question{
//Variables to store the Question information
        String type;
        String ques;
//Question constructor that will take the paramaters of the Question
        public Question(String type, String ques)
        {
            this.type = type;
            this.ques = ques;
        }
//Method to get the type of question
        public String getType()
        {
            this.type = type;
            return type;
        }
//Method to get the Question itself
        public String getQuestion()
        {
            this.ques = ques;
            return ques;
        }

    }




    public static void main(String args[])
    {//dog and cat values that will be incremented by questions and compared at the end of the program
        int dog = 0;
        int cat = 0;
//Create all of the Question objects and there properties, type and question contents
        Question q1 = new Question("dog", "Do you like dogs?"); 
        Question q2 = new Question("cat", "Do you like cats?");
        Question q3 = new Question("cat", "Are you an introvert?");
        Question q4 = new Question("dog", "Do you like being outdoors?");
        Question q5 = new Question("cat", "Do you enjoy being indoors?");
        Question q6 = new Question("dog", "Are you an extrovert?"); 
        Question q7 = new Question("dog", "Do you enjoy running?");
        Question q8 = new Question("cat", "Do you like anime?");
        Question q9 = new Question("dog", "Do you like going to the beach?");
        Question q10 = new Question("dog", "Do you enjoy constant companionship?");
        Question q11 = new Question("cat", "Do you dislike loud noises?");

//Create an array of questions that will be referenced
        Question [] quesArray = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11};
//Welcome the user and ask if they want to answer a questionnare
        int welcome = JOptionPane.showConfirmDialog(null, "Are you ready to take the Questionnaire?", "Dog or Cat Person?", JOptionPane.OK_CANCEL_OPTION);

//stops the program in the event the user does not agree to answer the questionnare
        if (welcome != 0)
        {
            System.exit(0);
        }


//A for loop that uses the variable i and compare it to the length of the array and increments i by adding 1
        for(int i=0; i< quesArray.length;++i) 
        {
//create an answer ineger that will be used to verify user input as well as generate the questions pulled from the array
            int answer = JOptionPane.showConfirmDialog(null, quesArray[i].getQuestion(), "Dog or Cat Person?", JOptionPane.YES_NO_CANCEL_OPTION);
//Check if the user entered yes to a question that would lean more towards liking dogs
            if (answer == 0 & quesArray[i].getType() == "dog")
            {
                dog+=1;
            }
            else if(answer == 0 & quesArray[i].getType() == "cat")//Check if the user entered yes to a question that would lean more towards liking cats
            {
                cat+=1;
            }
            else if(answer == 1 & quesArray[i].getType() == "dog")//Check if the user entered no to a question that would lean more towards liking dogs
            {
                cat+=1;
            }
            else if(answer == 1 & quesArray[i].getType() == "cat")//Check if the user entered no to a question that would lean more towards liking cats
            {
                dog+=1;
            }            
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Input Program Closing", "Cancelling Program...", JOptionPane.OK_OPTION);
                System.exit(0);           //If the user exits the window or presses the cancel button a window will popup saying the program will close     
            }
        }
//compare the cat variable to dog and generate a window saying congrats on being a cat person if the cat variable is larger than the dog variable
        if (cat > dog)
        {
            JOptionPane.showConfirmDialog(null, "Congratulations you are a cat person!", "Cats are right for you", JOptionPane.PLAIN_MESSAGE);            
        }
        else if (dog > cat)//compare the dog variable to cat and generate a window saying congrats on being a dog person if the dog variable is larger than the cat variable
        {
            JOptionPane.showConfirmDialog(null, "Congratulations you are a dog person!", "Dogs are right for you", JOptionPane.PLAIN_MESSAGE);            
        }
 

    }
}



