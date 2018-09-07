package demo.com.aw.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/hello")
@Api(value = "HelloController|测试swagger注解的控制器")
public class HelloController {

    @ApiOperation(value = "欢迎光临", notes = "")
    @ApiImplicitParam(paramType = "query", name = "userName", value = "用户名字", required = false, dataType = "String")
    @ResponseBody
    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String hello(@RequestParam(required = false, value = "userName") String userName) {
        String result = "欢迎您";
        if (StringUtils.isNotBlank(userName)) {
            result = result + "," + userName;
        }
        return result + "!";
    }
}
