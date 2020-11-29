package com.example.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//비교) @Controller는 resources의 return한 html 파일을 호출
@RestController
public class VideosController {

    @RequestMapping(value = "/videos")
    public String index(){
        return "test";
    }
}
