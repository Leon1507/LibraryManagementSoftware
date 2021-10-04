package com.company;

public enum Language {
    DEUTSCH("Deutsch"),
    ENGLISCH("Englisch"),
    SPANISCH("Spanisch"),
    ITALIENISCH("Italienisch"),
    FRANZÖSISCH("Französisch");

    private String label;

    Language(String label){
        this.label = label;
    }

    public String ToString(){
        return label;
    }

}
