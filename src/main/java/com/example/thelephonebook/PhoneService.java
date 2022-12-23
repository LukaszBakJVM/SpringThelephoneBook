package com.example.thelephonebook;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PhoneService {
    private final TelephoneRepo telephoneRepo;

    public PhoneService(TelephoneRepo telephoneRepo) {
        this.telephoneRepo = telephoneRepo;
    }
@Transactional
    public void add(PhoneBookDto phoneBookDto){
        PhoneBook phoneBook = new PhoneBook(phoneBookDto.getFirstName(), phoneBookDto.getLastName()
                , phoneBookDto.getTelephoneNumber());
        telephoneRepo.save(phoneBook);
    }
    @Transactional
    public void deleteByLastName(String lastname){
        telephoneRepo.delte(lastname);
    }
@Transactional
    public PhoneBook update(String lastName,int number){



        PhoneBook phoneBook =telephoneRepo.findByLastNAme(lastName).orElseThrow();
phoneBook.setTelephoneNumber(number);
//telephoneRepo.save(phoneBook);
return phoneBook;
    }



}
