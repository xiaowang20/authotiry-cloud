package com.wg.authority.user.controller;

import com.wg.authority.common.bean.ResultBean;
import com.wg.authority.user.server.MenuService;
import com.wg.authority.user.vo.MenuCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
@Slf4j
@Api(tags = "菜单信息接口")
public class MenuController {

    @Autowired
    private MenuService menuService;
    @ApiOperation(value = "树形结构返回所有菜单列表")
    @GetMapping("/treeList")
    public ResultBean<?> treeList(){
        List<MenuCode> treeList = menuService.treeList();
        return ResultBean.ok(treeList);
    }
}
