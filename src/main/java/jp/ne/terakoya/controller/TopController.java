package jp.ne.terakoya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {

	@RequestMapping("/")
	public String top() {
		return "external/external-top";
	}
}
