package by.training.nc.dev1.client.dashboard;

import by.training.nc.dev1.common.repository.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by dmbu0616 on 4/3/2017.
 */
@Controller
@RequestMapping(value = {"/"})
public class DashboardController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showDashboard() throws IOException
    {
        ModelAndView modelAndView = new ModelAndView("dashboard/dashboard");

        System.out.println("userService = " + userService);

        return modelAndView;
    }

}
