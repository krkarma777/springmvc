package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responserViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");
        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responserViewV2(Model model) {
        model.addAttribute("data", "hello!");
        return "response/hello";
    }
    @RequestMapping("/response/hello")
    public void responserViewV3(Model model) {
        model.addAttribute("data", "hello!");
    }


}
