package spring5_webmvc_mybatis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_webmvc_mybatis.controller.RegisterController;
import spring5_webmvc_mybatis.service.MemberRegisterService;

@Configuration
public class ControllerConfig {

	@Autowired
	private MemberRegisterService memberRegSvc;

	@Bean
	public RegisterController registerController() {
		RegisterController controller = new RegisterController();
		controller.setMemberRegisterService(memberRegSvc);
		return controller;
	}
	
}
