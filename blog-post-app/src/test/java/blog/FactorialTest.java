package blog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static blog.Factorial.fact;

class FactorialTest {
    
    @Test
    void testFact() {
        assertEquals(1, fact(0, 1));
        assertEquals(120, fact(5, 1));
    }
}