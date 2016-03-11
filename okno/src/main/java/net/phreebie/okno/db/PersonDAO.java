/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.phreebie.okno.db;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO extends DAOTemplate<Person> {

    public PersonDAO() {
        super();
        typeParameterClass = Person.class;
    }

    public PersonDAO(Class<Person> typeParameterClass) {
        super(typeParameterClass);
    }

    public Person createPerson(
            String personFamily,
            String personName,
            String personSName,
            boolean personFullAge,
            String personParentFamily,
            String personParentName,
            String personParentSName,
            boolean personMusicLevel,
            String musicType,
            String personPhone,
            String personCountry,
            String personCity,
            String personEmail,
            String personPassword,
            boolean personHome,
            boolean personAgreement) {
        Person person = new Person(
                personFamily,
                personName,
                personSName,
                personFullAge,
                personParentFamily,
                personParentName,
                personParentSName,
                personMusicLevel,
                musicType,
                personPhone,
                personCountry,
                personCity,
                personEmail,
                personPassword,
                personHome,
                personAgreement);
        add(person);
        return person;
    }

    public boolean checkPerson(String personEmail, String personPassword){
        ArrayList<Person> list = getByField("personEmail", personEmail);
        if (list.isEmpty()){
            return false;
        } else {
            if (list.get(0).getPersonPassword().equals(personPassword)){
                return true;
            } else {
                return false;
            }
        }
    }
}
