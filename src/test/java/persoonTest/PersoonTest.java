package persoonTest;

import be.vdab.persoonTest.Persoon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PersoonTest {
    private Persoon persoon;

    @BeforeEach
    void beforeEach() {
        persoon = new Persoon();
        persoon.voornamen = new LinkedHashSet<>(Arrays.asList("semih", "enes", "burak", "kadir"));
    }

    @Test
    void eenNullWaardeKanNiet() {
        assertThatNullPointerException().isThrownBy(
                () -> persoon.add(null));
    }

    @Test
    void eenLegeWaardeKanNiet() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> persoon.add(" "));
    }

    @Test
    void dezelfdeVoornaamBevat() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> persoon.add("semih"));
    }

    @Test
    void metSpatieEnVolgordeToString() {
        persoon.add("frank");
        persoon.add("jutta");
        assertThat(persoon.toString()).hasToString("semih enes burak kadir frank jutta");
    }

}