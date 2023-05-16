package com.example.combogui;

//This program gets an english sentence for ONE(1) input, the inputs,
//     then mixes and matches them in an orderly fashion.

public class DoubleOrder {
    String japaneseSent,englishSent,romajiSent,japanese1,english1,romaji1,japanese2,english2,romaji2;


    public DoubleOrder(String a, String b, String c, String d, String e,String f,String g,String h, String i){
        japaneseSent = a;
        englishSent = b;
        romajiSent = c;
        japanese1 = d;
        english1 = e;
        romaji1 = f;
        japanese2 = g;
        english2 = h;
        romaji2 = i;
    }


    public String run() {

        //separate variables by comma
        String[] english = english1.split(",");
        String[] japanese = japanese1.split(",");
        String[] romaji = romaji1.split(",");

        StringBuilder output = new StringBuilder();


        //separate variables by comma
        String[] english_2 = english2.split(",");
        String[] japanese_2 = japanese2.split(",");
        String[] romaji_2 = romaji2.split(",");

        for(int i = 0; i<=english.length-1;i++){
            String englishTemp =englishSent.replaceAll("Y",english[i]) ;
            String japaneseTemp =japaneseSent.replaceAll("Y",japanese[i]) ;
            String romajiTemp =romajiSent.replaceAll("Y", romaji[i]);

            for(int v = 0; v<=english_2.length-1;v++){
                if(!english[i].equals(english_2[v])){
                    String englishTemp2 = englishTemp.replaceAll("Z",english_2[v]) ;
                    String japaneseTemp2 = japaneseTemp.replaceAll("Z",japanese_2[v]) ;
                    String romajiTemp2 = romajiTemp.replaceAll("Z", romaji_2[v]);

                    output.append(japaneseTemp2).append(",").append(englishTemp2).append(",").append(romajiTemp2).append("\n");
                }
            }
        }
        return output.toString();
    }

}