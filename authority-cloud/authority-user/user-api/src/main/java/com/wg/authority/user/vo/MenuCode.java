package com.wg.authority.user.vo;

import com.wg.authority.user.entity.UmsMenu;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
@Data
public class MenuCode extends UmsMenu {
@ApiModelProperty(value = "子级菜单")
   private List<MenuCode> children;
}
