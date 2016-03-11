package net.phreebie.okno;

import net.phreebie.okno.cvs.Author;
import net.phreebie.okno.cvs.Date;
import net.phreebie.okno.cvs.Description;
import net.phreebie.okno.cvs.HasChanges;
import net.phreebie.okno.cvs.Version;

@Author("Ilya")
@Date(day = 1, month = 1,year = 2016)
@Version(version = 1)
@Description(description = "initial") 
public class Example {
    
    @HasChanges
    public static void hello(){
        System.out.println("Hello world!");
    }
}
