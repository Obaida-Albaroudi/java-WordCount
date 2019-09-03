package wordcount;

public class Words
{

    //fields
    private String sentence;

    public Words(String sentence)
    {
        this.sentence = sentence;
    }

    public String getSentence()
    {
        return sentence;
    }
    
    public void setSentence(String sentence)
    {
        this.sentence = sentence;
    }

    @Override
    public String toString()
    {
        return sentence ;
    }
}