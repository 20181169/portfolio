package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.ui.Model;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class Demo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
	}
		
//	@RequestMapping("/")
//	public String main(Model model) {
//		model.addAttribute("data", "hello rozy~!");
//		return "indesdasdx.html";
//	}
//	@GetMapping(value = "/demo")
//	public String doGetHelloWorldDemo() {
//		return "Hello World (Demo)";
//	}
//		
//		@GetMapping("/home")
//		public String home() {
//			return "content/home";
//		}
	
		@GetMapping("randomname")
		public String randomname() {
		    return "randomname";
		}
	

}
