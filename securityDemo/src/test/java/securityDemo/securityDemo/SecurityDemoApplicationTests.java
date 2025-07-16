package securityDemo.securityDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import securityDemo.securityDemo.entities.User;
import securityDemo.securityDemo.services.JwtService;

@SpringBootTest
class SecurityDemoApplicationTests {

	@Autowired
	private JwtService service;

	@Test
	void contextLoads() {
		User user = new User(4L, "abc@gmail.com", "1234");

		String token = service.generateToken(user);
		System.out.println(token);
	}

}
