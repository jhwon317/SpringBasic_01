package com.heeone.basic01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller 의미
// 개발자가 스프링부트에 말하는 것
// 아래 있는 HomeController가 Controller라는 것을
@Controller
public class HomeController {

    //GetMapping()의 의미
    //만약 /home/main 요청이 들어 오면 아래 메서드를 실행
    //이라고 개발자가 스프링부트에게 말하는 것
    @GetMapping("/home/main")

    //@ResponseBody의 의미
    //아래 메서드를 실행한 후 그 리턴값을
    //응답으로 사용

    @ResponseBody
    public String showHome() {
        return "Hi";
    }
}
