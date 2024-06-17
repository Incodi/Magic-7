/**
 * Connects question and answer for MillerQueue
 *
 * @author Incodi
 * @version B
 */
class QuestionAnswerPair{
    String question;
    String answer;

    public QuestionAnswerPair(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    
    public String getQuestion(){
        return question;
    }
    
    public String getAnswer(){
        return answer;
    }
}
