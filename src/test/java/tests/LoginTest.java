package tests;

import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void should_access_login_page() {
        login.submitLogin("hf_challenge_abc123@test.com", "12345678");
    }

    @Test
    public void should_not_access_login_page() {
        login.submitLogin("hf_challenge_abc456@test.com", "123456");
    }
}
