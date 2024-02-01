package com.example.butunleme.ui.etiketekle;

public class Etiket {

    private String labelText;

    public Etiket(){
        this.labelText = null;
    }

    public Etiket(String labelText){this.labelText = labelText;}

    public String getEtiketText(){return labelText;}

    public void setEtiketText(String labelText){this.labelText = labelText;}
}

