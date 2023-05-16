package com.example.combogui;

public class DoubleSwap {
    String japaneseSent,englishSent,romajiSent,japanese1,english1,romaji1;


    public DoubleSwap(String a, String b, String c, String d, String e,String f){
        japaneseSent = a;
        englishSent = b;
        romajiSent = c;
        japanese1 = d;
        english1 = e;
        romaji1 = f;
    }


    public String run() {

        //separate variables by comma
        String[] english = english1.split(",");
        String[] japanese = japanese1.split(",");
        String[] romaji = romaji1.split(",");

        StringBuilder output = new StringBuilder();

        for(int i = 0; i<=english.length-1;i++){

            String englishTemp =englishSent.replaceAll("Y",english[i]) ;
            String japaneseTemp =japaneseSent.replaceAll("Y",japanese[i]) ;
            String romajiTemp =romajiSent.replaceAll("Y", romaji[i]);

            for(int v = 0; v<=english.length-1;v++){
                if(!english[i].equals(english[v])){
                    String englishTemp2 = englishTemp.replaceAll("Z",english[v]) ;
                    String japaneseTemp2 = japaneseTemp.replaceAll("Z",japanese[v]) ;
                    String romajiTemp2 = romajiTemp.replaceAll("Z", romaji[v]);

                    output.append(japaneseTemp2).append(",").append(englishTemp2).append(",").append(romajiTemp2).append("\n");
                }
            }

        }
        return output.toString();
    }

}