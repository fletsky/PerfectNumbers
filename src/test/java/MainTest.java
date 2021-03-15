import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void checkPerfection() {
        assertTrue(Main.checkPerfection(6));
        assertTrue(Main.checkPerfection(28));
        assertTrue(Main.checkPerfection(496));
        assertFalse(Main.checkPerfection(495));

    }
}