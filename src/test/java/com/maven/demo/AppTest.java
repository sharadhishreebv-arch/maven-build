
package com.maven.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {

    @Test
    public void testApp() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
