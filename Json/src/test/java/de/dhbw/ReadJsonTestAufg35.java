package de.dhbw;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReadJsonTestAufg35 {
    @Test
     void readFrom_and_assertAllFields() {
        var in = getClass().getResourceAsStream("/person.json");
        assertNotNull(in, "person.json muss in src/test/resources/person.json liegen");

        var gson = new Gson();
        Person p = gson.fromJson(new InputStreamReader(in, StandardCharsets.UTF_8), Person.class);

        assertThat(p).isNotNull();
        assertThat(p.firstname).isEqualTo("Johannes");
        assertThat(p.lastname).isEqualTo("Weiß");
        assertThat(p.city).isEqualTo("Karlsruhe");
        assertThat(p.street).isEqualTo("Thujaweg");

        assertThat(p.no).isEqualTo(11);
        assertThat(p.zipCode).isEqualTo(76149);

        assertThat(p.isFromKarlsruhe).isFalse();

        assertThat(p.hobbies).containsExactly("Fitness", "Investing", "Travel");

        assertThat(p.company).isNotNull();
        assertThat(p.company.name).isEqualTo("Riverty");
        assertThat(p.company.headquarter_city).isEqualTo("Baden Baden");

        System.out.println("Überprüfte Person: " + p.firstname + " " + p.lastname + " aus " + p.city + " im " + p.street + " Er macht gerne " + p.hobbies);


    }
}
