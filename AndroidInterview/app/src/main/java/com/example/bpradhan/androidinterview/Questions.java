package com.example.bpradhan.androidinterview;



public class Questions {
    public String nQuestions[]={
            "which is the first planet in the solar system",
            "which is the second planet in the solar system",
            "which is the third planet in the solar system",
            "which is the fourth planet in the solar system",
            "which is the fifth planet in the solar system",
            "which is the sixth planet in the solar system",
            "which is the seventh planet in the solar system",
            "which is the eigth planet in the solar system",
            "which is the ninth planet in the solar system"
    };
    private String nChices[][]={
            {"Mercury","Venus","Mars","Saturn"},
            {"Jupiter","Venus","Earth","Neptune"},
            {"Earth","Jupiter","Pluto","Venus"},
            {"Jupiter","Saturn","Mars","Earth"},
            {"Jupiter","Pluto","Mercury","Earth"},
            {"Uranus","Venus","Mars","Saturn"},
            {"Saturn","Pluto","Uranus","Earth"},
            {"Venus","Neptune","Mars","Saturn"},

            {"Mercury","Venus","Mars","Pluto"},

    };
    private String nCorrectAnswers[]={
            "Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"
    };
    public String getQuestion(int a){
        String question=nQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice=nChices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice=nChices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice=nChices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice=nChices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer=nCorrectAnswers[a];
        return answer;
    }
}
