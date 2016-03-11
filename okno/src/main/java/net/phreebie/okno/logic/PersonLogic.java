/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.phreebie.okno.logic;

import net.phreebie.okno.db.Person;
import net.phreebie.okno.db.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonLogic {
    private volatile static PersonLogic mPersonLogic = getPersonLogic();

    @Autowired
    PersonDAO personDAO;

    private PersonLogic() {

    }

    public static PersonLogic getPersonLogic() {
        if (mPersonLogic == null) {
            synchronized (PersonLogic.class) {
                if (mPersonLogic == null) {
                    mPersonLogic = new PersonLogic();
                }
            }
        }
        return mPersonLogic;
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
        Person person = personDAO.createPerson(
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
        
        return person;
    }
    
    public boolean checkPerson(String email, String password){
        return personDAO.checkPerson(email, password);
    }
}
