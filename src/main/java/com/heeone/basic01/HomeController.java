package com.heeone.basic01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/home/main2")
    @ResponseBody
    public String showHome2() {
        return "환영합니다";
    }

    //요청 Get방식
    @GetMapping("/home/main3")

    //응답결과를 화면에 띄워줌
    @ResponseBody
    public String showHome3() {
        return "스프링부트";
    }

    //전역변수로 생성
    private int count;

    //생성자 메서드
    public HomeController() {
        count = -1;
    }

    @GetMapping("/home/increase")
    @ResponseBody
    public int showIncrease() {
        //아래 처럼 생성하면 count는 지역변수
        //메서드가 만들어질때 생성되고 메서드가 종료되면 사라짐
        //웹브라우저는 String 타입의 값만 이해한다
        //int count;
        
        count++;
        return count;
    }

    @GetMapping("/home/plus")
    @ResponseBody
    // int a는 쿼리스트링에서 a 파라미터의 값을 얻은 후 정수화 한 값이어야 한다
    //@RequestParam은 생략 가능
    public int showPlus(@RequestParam(defaultValue= "0") int a, @RequestParam(defaultValue= "0") int b) {
        return a+b;
    }

}
