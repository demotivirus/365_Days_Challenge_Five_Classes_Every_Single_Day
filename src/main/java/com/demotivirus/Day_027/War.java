package com.demotivirus.Day_027;

import lombok.Data;
import lombok.NonNull;

import java.util.Iterator;
import java.util.logging.Logger;

@Data
public class War {
    @NonNull
    private LocalDB localDB;
    private Logger logger = Logger.getAnonymousLogger();

    public void killPersons(int nums){
        var persons = localDB.getPersons();
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext() && nums > 0){
            Person killedPerson = iterator.next();
            iterator.remove();
            logger.info("Kill person " + killedPerson);
            nums--;
        }
    }
}
