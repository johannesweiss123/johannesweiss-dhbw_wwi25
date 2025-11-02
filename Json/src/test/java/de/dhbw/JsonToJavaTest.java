package de.dhbw;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class JsonToJavaTest {
    @Test
    void testJsonToJava() throws Exception {
        String jsonString = Files.readString(Path.of("person.json"));

        Gson gson = new Gson();
        de.dhbw.Person person = gson.fromJson(jsonString, de.dhbw.Person.class);

        assertNotNull(person,"Person konnte nicht eingelesen werden");

        System.out.println(person.firstname + " " + person.lastname + " aus " + person.city);

    }
}