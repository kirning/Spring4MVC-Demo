package net.kirno.actions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kirno on 2016/2/4.
 */

@Controller
@RequestMapping("/")
public class TestAction {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String test(){
        return "index";
    }
}
