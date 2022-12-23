package com.example.thelephonebook;

public enum Options {
    ADD(0,"Dodaj kontakt"),MODIFY(1,"Zmien dane w kontakcji")
    ,PRINT(2,"Wyszukaj kontakt"),REMOVE(3,"Usun kontakt")
    ,EXIT(4,"Wyjscie");

    private final int OPTION;
    private final String DESCRiPTION;

    Options(int OPTION, String DESCRiPTION) {
        this.OPTION = OPTION;
        this.DESCRiPTION = DESCRiPTION;
    }

    @Override
    public String toString() {
        return OPTION+" : "+DESCRiPTION;
    }

    public static Options create(int option){
        return Options.values()[option];
    }
}
