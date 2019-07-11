package com.example.staticvalue;

import com.example.staticvalue.components.StaticUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = StaticValueApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StaticValueTest {

    @Test
    public void shouldHavePopulatedTestValues() {
        assertThat(StaticUtils.url.equals("this/is")).isTrue();
        assertThat(StaticUtils.path.equals("/a/test")).isTrue();
    }
}
