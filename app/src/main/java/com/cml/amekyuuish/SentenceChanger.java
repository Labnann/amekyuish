package com.cml.amekyuuish;

public class SentenceChanger {

    char[] sentence;
    String resultSentence;

    public void setSentence(String sentence) {
        this.sentence = sentence.toCharArray();
        resultSentence = "";
    }
    public void makeResultSentence(){
        for(int i = 0; i< sentence.length; i++){
            changeCharacter(sentence[i]);
            //resultSentence+= " ";
        }

    }

    private void changeCharacter(char ch){
        switch (ch){
            default:
                resultSentence += ch;
                break;
            case 'A':
                resultSentence+="/-\\";
                break;
            case 'B':
                resultSentence+="|3";
                break;
            case 'C':
                resultSentence+="©";
                break;
            case 'D':
                resultSentence+="|)";
                break;
            case 'E':
                resultSentence+="[-";
                break;
            case 'F':
                resultSentence+="|=";
                break;
            case 'G':
                resultSentence+="(+";
                break;
            case 'H':
                resultSentence+="|-|";
                break;
            case 'I':
                resultSentence+="i";
                break;
            case 'J':
                resultSentence+="u|";
                break;
            case 'K':
                resultSentence+="|<";
                break;
            case 'L':
                resultSentence+="|_";
                break;
            case 'M':
                resultSentence+="|\\/|";
                break;
            case 'N':
                resultSentence+="|\\|";
                break;
            case 'O':
                resultSentence+="0";
                break;
            case 'P':
                resultSentence+="|>";
                break;
            case 'Q':
                resultSentence+="[,]";
                break;
            case 'R':
                resultSentence+="π";
                break;
            case 'S':
                resultSentence+="$";
                break;
            case 'T':
                resultSentence+="+";
                break;
            case 'U':
                resultSentence+="u";
                break;
            case 'V':
                resultSentence+="\\/";
                break;
            case 'W':
                resultSentence+= "\\/\\/";
                break;
            case 'X':
                resultSentence+= "x";
                break;
            case 'Y':
                resultSentence+= "'/";
                break;
            case 'Z':
                resultSentence+= "7_";
                break;


            case 'a':
                resultSentence+="/-\\";
                break;
            case 'b':
                resultSentence+="|3";
                break;
            case 'c':
                resultSentence+="©";
                break;
            case 'd':
                resultSentence+="|)";
                break;
            case 'e':
                resultSentence+="[-";
                break;
            case 'f':
                resultSentence+="|=";
                break;
            case 'g':
                resultSentence+="9";
                break;
            case 'h':
                resultSentence+="|-|";
                break;
            case 'i':
                resultSentence+="i";
                break;
            case 'j':
                resultSentence+="u|";
                break;
            case 'k':
                resultSentence+="|<";
                break;
            case 'l':
                resultSentence+="|_";
                break;
            case 'm':
                resultSentence+="|\\/|";
                break;
            case 'n':
                resultSentence+="|\\|";
                break;
            case 'o':
                resultSentence+="0";
                break;
            case 'p':
                resultSentence+="|>";
                break;
            case 'q':
                resultSentence+="o|";
                break;
            case 'r':
                resultSentence+="π";
                break;
            case 's':
                resultSentence+="$";
                break;
            case 't':
                resultSentence+="+";
                break;
            case 'u':
                resultSentence+="μ";
                break;
            case 'v':
                resultSentence+="\\/";
                break;
            case 'w':
                resultSentence+= "\\/\\/";
                break;
            case 'x':
                resultSentence+= "x";
                break;
            case 'y':
                resultSentence+= "'/";
                break;
            case 'z':
                resultSentence+= "7_";
                break;

        }
    }

    String getResultSentence(){
        return resultSentence;
    }
}
