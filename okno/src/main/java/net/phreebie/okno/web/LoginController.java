package net.phreebie.okno.web;

import javax.servlet.http.HttpServletRequest;
import net.phreebie.okno.logic.PersonLogic;
import static net.phreebie.okno.web.PersonController.ADD_URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(LoginController.LOGIN_URI)
public class LoginController {

    public static final String LOGIN_URI = "/login";
    public static final String EMAIL_PARAM = "mail";
    public static final String PASSWORD_PARAM = "password";
    public static final String IS_HOME_PARAM = "ishome";

    @Autowired
    private PersonLogic personLogic;
    
    ////http://www.phreebie.net/okno/login/try?mail=%221%22&password=%221%22&ishome=true
    @RequestMapping(value = "/try", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String login(
            HttpServletRequest request,
            @RequestParam(EMAIL_PARAM) String mail,
            @RequestParam(PASSWORD_PARAM) String password,
            @RequestParam(IS_HOME_PARAM) Boolean ishome
            ) {
        //Redirect redirect = new Redirect();
        
        if(personLogic.checkPerson(mail, password)){
            //redirect.setId(0L);
            //redirect.setUrl("http://www.phreebie.net/cabinet.html");
            
            return "http://www.phreebie.net/cabinet.html";
        } else {
            //redirect.setId(0L);
            //redirect.setUrl("http://www.phreebie.net/auth_error.html");
            return "http://www.phreebie.net/auth_error.html";
        }
        
      //  return redirect;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exceptionHandler(Exception exception) {
        return exception.getMessage();
    }
}
