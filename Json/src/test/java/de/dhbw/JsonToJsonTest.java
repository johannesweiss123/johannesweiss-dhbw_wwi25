package de.dhbw;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

public class JsonToJsonTest {

    @Test
    public void testJsonToJson() {

        Person person = new Person();
        person.firstname = "Johannes";
        person.lastname = "Weiß";
        person.city = "Karlsruhe";
        person.street = "Thujaweg";

        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println("Jason Ausgabe");
        System.out.println(json);
    }
}
