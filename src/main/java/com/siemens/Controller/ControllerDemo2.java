package com.siemens.Controller;

import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/v2")
    public class ControllerDemo2
    {

        @GetMapping("/demo")
        public String getDemo()
        {
            return "demo";
        }

        @PostMapping("/demo/post")
        public String postDemo()
        {
            return "post demo1 ";
        }

        @PutMapping("/demo/post")
        public String putDemo()
        {
            return "put demo";
        }

    }


