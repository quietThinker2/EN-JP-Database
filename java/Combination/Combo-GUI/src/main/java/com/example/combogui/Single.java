package com.example.combogui;

public class Single {
    String japaneseSent,englishSent,romajiSent,japanese1,english1,romaji1;


    public Single(String a, String b, String c, String d, String e,String f){
        japaneseSent = a;
        englishSent = b;
        romajiSent = c;
        japanese1 = d;
        english1 = e;
        romaji1 = f;
    }


    public String run() {
        String[] english = english1.split(",");
        String[] japanese = japanese1.split(",");
        String[] romaji = romaji1.split(",");

        StringBuilder output = new StringBuilder();
        for(int i = 0; i<=english.length-1;i++){

            String englishTemp =englishSent.replaceAll("Z",english[i]) ;
            String japaneseTemp =japaneseSent.replaceAll("Z",japanese[i]) ;
            String romajiTemp =romajiSent.replaceAll("Z", romaji[i]);

            output.append(japaneseTemp).append(",").append(englishTemp).append(",").append(romajiTemp).append("\n");
        }

        return output.toString();

    }
}