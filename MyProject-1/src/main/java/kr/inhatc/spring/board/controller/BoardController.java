package kr.inhatc.spring.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller // 컨트롤러는 이렇게 컨트롤러를 반드시 붙여야한다.(컨트롤러는 웹사이트로 줄때) => index.html을 찾는다.
//@RestController // 이거는 바로 결과물 출력하게 해준다.
public class BoardController {

	@RequestMapping("/") // 이렇게 하면 localhost:18080/ 할시 이 페이지 켜진다.
	public String hello() {
		return "index";
	}
}
