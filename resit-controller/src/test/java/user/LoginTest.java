package user;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.resit.controller.UserController;

public class LoginTest {


	@Test
	public void test() {
		UserController userController = new UserController();
		ModelAndView mav = userController.login(null, null, null, null);
		assert mav.getViewName().equals("index");

		mav = userController.login("heavywizard@gmail.com", "", null, null);
		assert mav.getViewName().equals("index");

		mav = userController.login("heavywizard@gmail.com", "pass", null, null);
		assert mav.getViewName().equals("home");
	}

}
