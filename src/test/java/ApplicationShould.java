import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationShould {

    @Test
    void name() {
        Application application = new Application();

        boolean isWorking = application.isWorking();

        Assertions.assertThat(isWorking).isFalse();
    }
}
