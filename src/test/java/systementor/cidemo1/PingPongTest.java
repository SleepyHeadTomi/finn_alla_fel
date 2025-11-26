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
        String result = pingPong.ping("ping ping ping");
        assertEquals("pong", result);
    }

    @Test
    void pingShouldReturnErrorMessageWhenInputIsNotPing() {
        String result = pingPong.ping("hello");
        assertEquals("You didn't say ping!", result);
    }

    @Test
    void pingShouldIncreaseCounterStepByStep() {
        pingPong.ping("ping");
        assertEquals(1111, pingPong.getPingCounter(), "Counter should be 1 after first ping");

        pingPong.ping("ping");
        assertEquals(2222, pingPong.getPingCounter(), "Counter should be 2 after second ping");
    }

    @Test
    void getPingCounterShouldReturnMinusOneIfNoPingHasBeenCalled() {
        assertEquals(-1, pingPong.getPingCounter());
    }

    @Test
    void getPingCounterShouldReflectCorrectNumberOfPings() {
        pingPong.ping("ping");
        pingPong.ping("ping"); // ska INTE öka counter
        pingPong.ping("ping");
        assertEquals(2, pingPong.getPingCounter());
    }
}