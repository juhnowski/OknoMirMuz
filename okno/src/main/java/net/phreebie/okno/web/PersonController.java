package net.phreebie.okno.web;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import net.phreebie.okno.Example;
import net.phreebie.okno.db.History;
import net.phreebie.okno.logic.HistoryLogic;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import net.phreebie.okno.db.Person;
import net.phreebie.okno.logic.PersonLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(PersonController.PERSON_URI)
public class PersonController {
    public static final String PERSON_URI = "/person";
    public static final String ADD_URI = "/add";
    
    @Autowired
    PersonLogic personLogic;
    //http://95.79.97.91/okno/person/add?personFamily="Юхновский"&personName="Александр"&personSName="Ильич"&personFullAge=false&personParentFamily="Юхновский"&personParentName="Илья"&personParentSName="Александрович"&personMusicLevel=true&musicType="неопределенно"&personPhone="89027800807"&personCountry="Россия"&personCity="Нижний Новгород"&personEmail="juhnowski@gmail.com"&personPassword="123456"&personHome=true&personAgreement=true
    @RequestMapping(value = ADD_URI, method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Person createPerson(
    @RequestParam("personFamily") String personFamily,
    @RequestParam("personName") String personName,
    @RequestParam("personSName") String personSName,
    @RequestParam("personFullAge") Boolean personFullAge,
    @RequestParam("personParentFamily") String personParentFamily,
    @RequestParam("personParentName") String personParentName,
    @RequestParam("personParentSName") String personParentSName,
    @RequestParam("personMusicLevel") Boolean personMusicLevel,
    @RequestParam("musicType") String musicType,
    @RequestParam("personPhone") String personPhone,
    @RequestParam("personCountry") String personCountry,
    @RequestParam("personCity") String personCity,
    @RequestParam("personEmail") String personEmail,
    @RequestParam("personPassword") String personPassword,
    @RequestParam("personHome") Boolean personHome,
    @RequestParam("personAgreement") Boolean personAgreement
    ) {    
        return personLogic.createPerson(
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
    }
    
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exceptionHandler(Exception exception) {
        return exception.getMessage();
    }
}
