package de.dhbw;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ToStringTestAufg46 {
    @Test
    void testToStringUsesSeperatorFromProperties() {
        Person p = new Person();
        p.firstname = "Johannes";
        p.lastname = "Weiß";
        p.street = "Thujaweg";
        p.no = 11;
        p.zipCode = 76149;
        p.city = "Karlsruhe";
        p.hobbies = new String[]{"Fitness", "Investing", "Travel"};
        p.isFromKarlsruhe = false;

        Person.Company c = new Person.Company();
        c.name = "Riverty";
        c.headquarter_city = "Baden Baden";
        p.company = c;

        String result = p.toString();
        System.out.println("Ausgabe: " + result);

        assertThat(result).contains("#");
        assertThat(result).contains("Johannes");
        assertThat(result).contains("Weiß");
        assertThat(result).contains("Karlsruhe");
        assertThat(result).contains("Riverty");
    }

}
