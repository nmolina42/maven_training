package fr.lernejo;

import fr.lernejo.Sample;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.assertj.core.api.Assertions.assertThat;

class SampleTest {
    Sample sample = new Sample();

    @Test
    public void testOP() {
        System.out.println("Inside testOP()");
        assertThat(sample.op(ADD, 5,5)).isEqualTo(10);
    }
    @Test
    public void testOP2() {
        System.out.println("Inside testOP()");
        assertThat(sample.op(MULT, 2,5)).isEqualTo(10);
    }
    @Test
    public void testFact() {
        System.out.println("Inside testFact()");
        assertThat(sample.fact(3)).isEqualTo(6);
    }
    @Test
    public void testFact2() {
        System.out.println("Inside testFact()");
        assertThat(sample.fact(0)).isEqualTo(1);
    }
    @Test
    public void fact_of_negative_number_throws() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-1))
            .withMessage("N should be positive"); // (3)
    }

}
