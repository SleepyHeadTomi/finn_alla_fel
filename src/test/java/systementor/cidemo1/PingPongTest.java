package systementor.cidemo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PingPongTest {

    private PingPong pingPong;

    @BeforeEach
    void setUp() {
        pingPong = new PingPong();
    }

    @Test
    void pingShouldReturnPongWhenInputIsPing() {
        String result = pingPong.ping("ping");
        assertEquals("pong", result);
    }

    @Test
    void pingShouldReturnErrorMessageWhenInputIsNotPing() {
        String result = pingPong.ping("hello");
        assertEquals("pong", result);
    }

    @Test
    void pingShouldIncreaseCounterStepByStep() {
        pingPong.ping("ping");
        assertEquals(5, pingPong.getPingCounter(), "Counter should be 5 after first ping");

        pingPong.ping("ping");
        assertEquals(10, pingPong.getPingCounter(), "Counter should be 10 after second ping");
    }

    @Test
    void getPingCounterShouldReturnMinusOneIfNoPingHasBeenCalled() {
        assertEquals(0, pingPong.getPingCounter());
    }

    @Test
    void getPingCounterShouldReflectCorrectNumberOfPings() {
        pingPong.ping("ping");
        pingPong.ping("hello"); // ska INTE öka counter
        pingPong.ping("ping");
        assertEquals(10, pingPong.getPingCounter());
    }
}