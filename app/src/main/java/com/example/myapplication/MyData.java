package com.example.myapplication;

public class MyData {
    String myText;
    boolean myBool;

    public MyData(String myText, boolean myBool) {
        this.myText = myText;
        this.myBool = myBool;
    }

    public String getMyText() {
        return myText;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }

    public boolean isMyBool() {
        return myBool;
    }

    public void setMyBool(boolean myBool) {
        this.myBool = myBool;
    }
}
