package com.siemens.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/v1")
public class ControllerDemo
{
    @GetMapping("/demo")
    public String getDemo()
    {

        return "demo";
    }

    @PostMapping("/demo/post")
    public String postDemo()
    {
        return "post demo ";
    }

    @PutMapping("/demo/post")
    public String putDemo()
    {
        return "put demo";
    }

}
