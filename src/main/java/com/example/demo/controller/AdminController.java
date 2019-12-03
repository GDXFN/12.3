package com.example.demo.controller;


import com.example.demo.dataobject.AdminInfo;
import com.example.demo.enums.ResultEnum;
import com.example.demo.service.AdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import org.springframework.data.redis.core.StringRedisTemplate;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;


    @Autowired
    private StringRedisTemplate redisTemplate;

    @ApiOperation(value = "订单列表",notes = "分页显示订单列表")
    @GetMapping("/qq")
    public ModelAndView list(@RequestParam(value = "page",defaultValue = "1") Integer page,
                             @RequestParam(value = "size",defaultValue = "10") Integer size,
                             Map<String,Object> map) {
        map.put("page",page);
        map.put("size",size);

        return new ModelAndView("order/list1",map);
    }

    @ApiOperation(value = "订单列表",notes = "分页显示订单列表")
    @GetMapping("/login")
    public ModelAndView list(@RequestParam(value = "page",defaultValue = "2") Integer page,
                             Map<String,Object> map) {
        map.put("page",page);


        return new ModelAndView("login/index",map);
    }

    @GetMapping("login")
    public  ModelAndView login(@RequestParam(value = "username",required = false) String username,
                               @RequestParam(value = "password",required = false) String password,
                               HttpServletResponse response,Map<String, Object> map)
    {
        AdminInfo adminInfo;
            adminInfo=adminService.findByAdminUsernameAndPassword(username,password);
        if (adminInfo==null)
        {
            map.put("msg", ResultEnum.LOGIN_FAIL.getMessage());
            map.put("url","/sell/seller/index");
            return  new ModelAndView("common/error",map);
        }

        return new ModelAndView("redirect:/seller/product/list");
    }

}
