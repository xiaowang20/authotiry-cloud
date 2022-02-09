package com.wg.authority.user.controller;

import com.wg.authority.common.bean.ResultBean;
import com.wg.authority.common.enums.ResponseStatus;
import com.wg.authority.user.server.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("role")
@Slf4j
@Api(value = "角色信息接口")
public class RoleController {
//    @ApiOperation("获取角色相关菜单")
//    @RequestMapping(value = "/listMenu/{roleId}", method = RequestMethod.GET)
//    =====
//    @ApiOperation("获取角色相关资源")
//    @RequestMapping(value = "/listResource/{roleId}", method = RequestMethod.GET)
@Autowired
private RoleService roleService;

    @ApiOperation(value = "给角色分配菜单")
    @PostMapping("/menu/assignments")
    public ResultBean<?> assignMenu(@RequestParam Long roleId, @RequestParam List<Long> menuIds){
          int count = roleService.assignMenu(roleId,menuIds);
          if (count <= 0 ){
              return ResultBean.fail(ResponseStatus.ASSIGN_MENU_ERROR);
          }
          return ResultBean.ok();
    }

    @ApiOperation(value = "给角色分配资源接口")
    @PostMapping("/resource/assignments")
    public ResultBean<?> assignResource(@RequestParam Long roleId,@RequestParam List<Long> resourceIds){
       int count = roleService.assignResource(roleId,resourceIds);
       if (count <= 0){
           return ResultBean.fail(ResponseStatus.ASSIGN_RESOURCE_ERROR);
       }
       return ResultBean.ok();
    }
}
