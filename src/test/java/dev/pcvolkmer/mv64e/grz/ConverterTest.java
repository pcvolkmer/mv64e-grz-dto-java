package dev.pcvolkmer.mv64e.grz;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConverterTest {

    @Test
    void shouldDeserializeJsonString() throws IOException {
        var ressource = getClass().getClassLoader().getResource("example_metadata.json");
        assertNotNull(Converter.fromJsonString(new String(ressource.openStream().readAllBytes())));
    }

}