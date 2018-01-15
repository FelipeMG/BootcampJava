import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class DancingPhraseTest {

    @Test
    public void firstSentence(){
        assertThat(PhrasesOperations.dancingPhrase("En total serán protegidas 12.946 hectáreas").equals("En Total Serán Protegidas 12.946 Hectáreas"),is(true));
    }
}
