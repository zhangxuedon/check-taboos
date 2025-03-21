package com.tencent.wxcloudrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * index控制器
 */
@Controller

public class IndexController {

  /**
   * 主页页面
   * @return API response html
   */
  @GetMapping
  public String index() {
    return "form";
  }

  @GetMapping("/form")
  public String testhtml() {
    return "form";
  }

  @GetMapping("/search")
  public String search() {
    return "search";
  }

}
