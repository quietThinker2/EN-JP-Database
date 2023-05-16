package com.example.combogui;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    public TextArea japaneseSentBox,englishSentBox, romajiSentBox, japaneseBox1, englishBox1, romajiBox1,japaneseBox2, englishBox2,romajiBox2,outputBox;

    @FXML
    public RadioButton r1,r2,r3;

    @FXML
    private ToggleGroup t1;


    @FXML
    protected void onFinishButtonClick() {
        RadioButton rb = (RadioButton)t1.getSelectedToggle();
        if (rb.getText().equals(r1.getText())){
            Single single = new Single(japaneseSentBox.getText(),englishSentBox.getText(),romajiSentBox.getText(),japaneseBox1.getText(),englishBox1.getText(),romajiBox1.getText());
            outputBox.setText(single.run());
        } else if (rb.equals(r2)) {
            DoubleSwap doubleSwap = new DoubleSwap(japaneseSentBox.getText(),englishSentBox.getText(),romajiSentBox.getText(),japaneseBox1.getText(),englishBox1.getText(),romajiBox1.getText());
            outputBox.setText(doubleSwap.run());
        } else if (rb.equals(r3)) {
            DoubleOrder doubleSwap = new DoubleOrder(japaneseSentBox.getText(),englishSentBox.getText(),romajiSentBox.getText(),japaneseBox1.getText(),englishBox1.getText(),romajiBox1.getText(),japaneseBox2.getText(),englishBox2.getText(),romajiBox2.getText());
            outputBox.setText(doubleSwap.run());
        }

    }

    @FXML
    protected void onClearButtonClick(){
        japaneseSentBox.setText("");
        englishSentBox.setText("");
        romajiSentBox.setText("");
        japaneseBox1.setText("");
        englishBox1.setText("");
        romajiBox1.setText("");
        japaneseBox2.setText("");
        englishBox2.setText("");
        romajiBox2.setText("");
        outputBox.setText("");
    }


}