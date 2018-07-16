package com.song.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WangSong on 2018/7/11.
 */
@RestController
@RequestMapping("/test")
public class SimpleController {
    @RequestMapping(value = "/init",method = RequestMethod.POST)
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/init/{go}")
    public String go(@PathVariable String go){
        return go;
    }
}