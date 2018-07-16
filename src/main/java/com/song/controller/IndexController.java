package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by WangSong on 2018/7/11.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}