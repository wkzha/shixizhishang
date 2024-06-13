package com.cc.service;

import com.cc.dto.DishDto;
import com.cc.pojo.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 菜品管理 服务类
 * </p>
 *
 * @author cc
 * @since 2022-05-30
 */
public interface DishService extends IService<Dish> {
    public DishDto getByIdWithFlavor(Long id);

    public void addDishWithFlavor(DishDto dishDto);

    public void updateDishWithFlavor(DishDto dishDto);
    //根据传过来的id批量或者是单个的删除菜品，并判断是否是启售的

    public void deleteByIds(List<Long> ids);

    //菜品批量删除和单个删除，删除时用到deleteByIds方法删除菜品
    public boolean deleteInSetmeal(List<Long> ids);


}
