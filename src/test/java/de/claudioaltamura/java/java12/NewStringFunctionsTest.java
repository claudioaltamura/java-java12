package de.claudioaltamura.java.java12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static de.claudioaltamura.java.java12.NewStringFunctions.getCommaSeparatedList;
import static org.junit.jupiter.api.Assertions.assertEquals;


class NewStringFunctionsTest {

    @Test
    void transform() {
        Function<String, List<String>> transformFunction = s -> Arrays.asList(s.split(","));
        List<String> actual = getCommaSeparatedList().transform(transformFunction);
        assertEquals(5, actual.size());
    }
}
