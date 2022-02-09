package com.wg.authority.user.controller;

import com.wg.authority.common.bean.ResultBean;
import com.wg.authority.common.enums.ResponseStatus;
import com.wg.authority.common.exception.BusinessException;
import com.wg.authority.user.entity.UmsAdmin;
import com.wg.authority.user.mapper.UmsAdminMapper;
import com.wg.authority.user.server.AdminService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * admin接口
 */
@RestController
@RequestMapping("admin")
@Slf4j
public class AdminController {
    @Autowired
    private AdminService adminService;

    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @ApiOperation(value = "删除指定admin用户接口")
    @DeleteMapping("delete/{adminId}")
    public ResultBean<?> deleteAdmin(@PathVariable Long adminId){
        int i = umsAdminMapper.deleteByPrimaryKey(adminId);
        if (i <= 0){
            throw new BusinessException(ResponseStatus.DELETE_ERROR);
        }
        return ResultBean.ok();
    }

    @ApiOperation(value = "修改指定用户信息接口")
    @PutMapping("update/{adminId}")
    public ResultBean<?> updateAdmin(@PathVariable Long adminId, @RequestBody UmsAdmin umsAdminParam){
        int i = adminService.updateByAdminParam(adminId, umsAdminParam);
        if (i <= 0){
            throw new BusinessException(ResponseStatus.UPDATE_ERROR);
        }
        return ResultBean.ok();
    }
    @ApiOperation("获取用户信息接口")
    @GetMapping("/getAllUser/{id}")
    public ResultBean<?> getAllUser(@PathVariable Long id){
        UmsAdmin umsAdmin = umsAdminMapper.selectByPrimaryKey(id);
        return ResultBean.ok(umsAdmin);
    }
//
//    @ApiOperation("修改指定用户密码")
//    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
//    =========
//    @ApiOperation("修改帐号状态")
//    @RequestMapping(value = "/updateStatus/{id}", method = RequestMethod.POST)
//    ==========
//    @ApiOperation("给用户分配角色")
//    @RequestMapping(value = "/role/update", method = RequestMethod.POST)
//    ===========
//    @ApiOperation("获取指定用户的角色")
//    @RequestMapping(value = "/role/{adminId}", method = RequestMethod.GET)
//    ========
//    @ApiOperation("根据用户名或姓名分页获取用户列表")
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    ========
//    @ApiOperation(value = "获取当前登录用户信息")
//    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ApiOperation(value = "给用户分配角色")
    @PostMapping("/role/assignments")
    public ResultBean<?> assignRole(@RequestParam("adminId") Long adminId,
                                    @RequestParam("roleIds") List<Long> roleIds){
      int i = adminService.assignRole(adminId,roleIds);
        if (i <=0 ){
            return ResultBean.fail(ResponseStatus.ASSIGN_ROLES_ERROR);
        }
      return ResultBean.ok();
    }
}
