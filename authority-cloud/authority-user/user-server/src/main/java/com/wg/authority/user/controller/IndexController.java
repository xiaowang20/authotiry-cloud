package com.wg.authority.user.controller;

import com.wg.authority.common.bean.ResultBean;
import com.wg.authority.common.enums.ResponseStatus;
import com.wg.authority.user.entity.UmsAdmin;
import com.wg.authority.user.entity.UmsMenu;
import com.wg.authority.user.mapper.UmsAdminMapper;
import com.wg.authority.user.server.UserService;
import com.wg.authority.user.vo.UserLoginParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("admin")
@Slf4j
@Api(tags = "后台用户相关信息接口")
public class IndexController {
    @Autowired
    private UserService adminService;
    @Autowired
    private UmsAdminMapper umsAdminMapper;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean<?> register(@RequestBody UmsAdmin umsAdminParam) {
        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
        if (umsAdmin == null) {
            ResultBean.fail(ResponseStatus.REGISTER_ERROR);
        }
        return ResultBean.ok(umsAdmin);
    }

    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean<?> login(@RequestBody UserLoginParam userLoginParam) {
        String token = adminService.login(userLoginParam);
        if (token == null) {
            return ResultBean.fail(ResponseStatus.NO_LOGIN);
        }
        Map<String, String> tokenMap = new HashMap<>(1);
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return ResultBean.ok(tokenMap);
    }
//    TODO
//    @ApiOperation(value = "登出功能")
//    @RequestMapping(value = "/logout", method = RequestMethod.POST)

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @RequestMapping(value = "/permission/{adminId}", method = RequestMethod.GET)
    @ResponseBody
    public ResultBean<?> getPermissionList(@PathVariable Long adminId) {
        List<UmsMenu> permissionList = adminService.getPermissionList(adminId);
        return ResultBean.ok(permissionList);
    }

}
