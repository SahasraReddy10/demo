package org.example.Controller;

import org.example.Utils.MathUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @PostMapping("/add/{a}/{b}")
    public int addNumbers(@PathVariable int a, @PathVariable int b) {
        return MathUtils.add(a,b);
    }


}

