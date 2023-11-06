package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/front")
public class HelloAwsApp {

    @PostMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
