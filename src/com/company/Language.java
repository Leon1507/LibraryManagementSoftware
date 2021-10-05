package com.company;

public enum Language {
    DEUTSCH("Deutsch"),
    ENGLISCH("Englisch"),
    SPANISCH("Spanisch"),
    ITALIENISCH("Italienisch"),
    FRANZÖSISCH("Französisch");

    private String value;

    private Language(String value){
        this.value = value;
    }

    public String getName(){
        return value;
    }

    @Override public String toString() { return value; }

}

