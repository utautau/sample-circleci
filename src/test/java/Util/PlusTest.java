package Util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Plus.class)
public class PlusTest {

    @Test
    public void calcTest() {
        assertThat(Plus.calc(3,5), is(8));
    }

    @Test
    public void calcTest2() {
        assertThat(Plus.calc(5,6), is(11));
    }
}