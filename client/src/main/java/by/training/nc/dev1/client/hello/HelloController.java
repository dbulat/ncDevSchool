package by.training.nc.dev1.client.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by dmbu0616 on 3/27/2017.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public void hello(HttpServletResponse response) {
        System.out.println("test");
        response.setStatus(200);//OK
    }
}
