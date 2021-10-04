package com.company;

public enum Language {
    DEUTSCH("Deutsch"),
    ENGLISCH("Englisch"),
    SPANISCH("Spanisch"),
    ITALIENISCH("Italienisch"),
    FRANZÖSISCH("Französisch");

    final private String label;

    private Language(String label){
        this.label = label;
    }

    public String getName(){
        return label;
    }

}
