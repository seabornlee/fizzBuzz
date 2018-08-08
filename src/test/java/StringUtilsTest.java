import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class StringUtilsTest {
    @Test
    public void testIsBlank() {
        assertThat(StringUtils.isBlank(null)).isTrue();
        assertThat(StringUtils.isBlank("")).isTrue();
        assertThat(StringUtils.isBlank(" ")).isFalse();
        assertThat(StringUtils.isBlank("hello")).isFalse();
    }

    @Test
    public void testRandomAge() {
        assertThat(StringUtils.randomAge(15)).isLessThan(15);
        assertThat(StringUtils.randomAge(15)).isGreaterThan(0);
        assertThat(StringUtils.randomAge()).isLessThan(300);
    }
}