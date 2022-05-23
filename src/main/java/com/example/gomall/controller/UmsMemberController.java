package com.example.gomall.controller;

import com.example.gomall.common.api.CommonResult;
import com.example.gomall.service.RedisService;
import com.example.gomall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 　　* @author lee
 * 　　* @date 2022/4/25 18:35
 */
@Controller
@Api
@RequestMapping("/sso")
@ResponseBody
public class UmsMemberController {
     @Autowired
     private UmsMemberService memberService;
     @ApiOperation("获取验证码")
     @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
     @ResponseBody
     public CommonResult getAuthCode(@RequestParam String telephone) {
          System.out.println("测试");
          return memberService.generateAuthCode(telephone);
     }

     @ApiOperation("判断验证码是否正确")
     @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
     @ResponseBody
     public CommonResult updatePassword(@RequestParam String telephone,
                                        @RequestParam String authCode) {
          return memberService.verifyAuthCode(telephone,authCode);
     }
}
