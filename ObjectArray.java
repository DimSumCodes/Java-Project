class Question{

    String type;
    String ques;

    public Question(String type, String ques)
    {
        this.type = type;
        this.ques = ques;
    }

    public String getType()
    {
        this.type = type;
        return type;
    }

    public String getQuestion()
    {
        this.ques = ques;
        return ques;
    }

}

public class ObjectArray {
    public static void main(String args[])
    {
        
        Question q1 = new Question("dog", "Do you like dogs?");
        Question q2 = new Question("cat", "Do you like cats?");
        Question q3 = new Question("cat", "Are you an introvert?");
        Question q4 = new Question("dog", "Do you like being outdoors?");
        Question q5 = new Question("cat", "Do you enjoy being indoors?");
        Question q6 = new Question("dog", "Are you an extrovert?");


        Question [] quesArray = {q1,q2,q3,q4,q5,q6};

        for(int i=0; i< quesArray.length;++i) {
            
            System.out.println(quesArray[i].getQuestion() + " " + quesArray[i].getType());
        }


    }
}
