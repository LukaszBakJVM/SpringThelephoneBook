package com.example.thelephonebook;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Loop {
    private final Scanner sc;
    private final  PhoneService phoneService;
    public Loop(Scanner sc, PhoneService phoneService) {
        this.sc = sc;
        this.phoneService = phoneService;
    }









    public void controlLoop() {

        Options options;
        do {
            printOptions();
            options = Options.create(sc.nextInt());

            switch (options) {
                case ADD -> phoneService.add(createNumber());
                case MODIFY -> phoneService.update(updateNumberFindLastName(), updateNumber());
                case REMOVE -> phoneService.deleteByLastName(updateNumberFindLastName());

            }
        }while (options!=Options.EXIT);


    }



    private PhoneBookDto createNumber() {
        System.out.println("Podaj imie");
        String firstName = sc.next();
        System.out.println("Podaj Nazwisko");
        String lastName = sc.next();
        System.out.println("Podaj numer telefonu");
        int phoneNumber = sc.nextInt();

        return new PhoneBookDto(firstName, lastName, phoneNumber);
    }
private String updateNumberFindLastName() {
    System.out.println("Podaj nazwisko");
    String lastName = sc.next();
    return lastName;
}
private int updateNumber(){
    System.out.println("Podaj nowy numer");
        int number=sc.nextInt();
        return number;


}
private void printOptions(){
        System.out.println("Wybierz opcje");
    for (Options o:Options.values()
         ) {
        System.out.println(o);

    }
}
}
