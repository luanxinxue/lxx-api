package com.lxx.service.impl;


import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxx.common.page.PageResult;
import com.lxx.factory.PageFactory;
import com.lxx.mapper.DepartmentMapper;
import com.lxx.model.manager.Department;
import com.lxx.model.manager.params.DepartmentAddParam;
import com.lxx.model.manager.params.DepartmentChildrenParam;
import com.lxx.model.manager.params.DepartmentPageParam;
import com.lxx.model.manager.vo.DepartmentChildrenVO;
import com.lxx.model.manager.vo.DepartmentVO;
import com.lxx.service.DepartmentService;
import com.lxx.util.BeanCopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *   服务实现类
 * </p>
 *·
 * @author luanxinxue
 * @since 2024-12-25
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

    public static String path = "path";


    @Override
    public List<DepartmentChildrenVO> getChildren(DepartmentChildrenParam departmentChildrenParam) {
        QueryWrapper<Department> queryWrapper = new QueryWrapper<Department>();
        queryWrapper.likeRight(path, String.valueOf(departmentChildrenParam.getDepartmentId()));
        List<Department> list = this.baseMapper.selectList(queryWrapper);
        List<DepartmentChildrenVO> departmentChildrenVOList = new ArrayList<>();

        list.forEach(department ->{
            DepartmentChildrenVO departmentChildrenVO = new DepartmentChildrenVO();
            BeanUtils.copyProperties(department, departmentChildrenVO);
            departmentChildrenVOList.add(departmentChildrenVO);
        });
        return departmentChildrenVOList;
    }

    @Override
    public PageResult<DepartmentVO> pageList(DepartmentPageParam departmentPageParam) {
        QueryWrapper<Department> queryWrapper = new QueryWrapper<Department>();
        if (ObjectUtil.isNotEmpty(departmentPageParam.getName())) {
            queryWrapper.lambda().like(Department::getName, departmentPageParam.getName());
        }
        Page<Department> page = this.page(PageFactory.defaultPage(departmentPageParam.getPageSize(),departmentPageParam.getPageNo()), queryWrapper);
        List<DepartmentVO> departmentVOS = BeanCopyUtil.copyListProperties(page.getRecords(),DepartmentVO::new);
        Page<DepartmentVO> pageDepartmentVO =new Page<>();
        pageDepartmentVO.setCurrent(Convert.toInt(page.getCurrent()));
        pageDepartmentVO.setTotal(page.getTotal());
        pageDepartmentVO.setSize(page.getSize());
        return  new PageResult<>(pageDepartmentVO,departmentVOS);
    }

    @Override
    public void add(DepartmentAddParam departmentAddParam) {
         Department department =new Department();
         BeanUtils.copyProperties(departmentAddParam,department);
         department.setDepartmentNo(this.generatorOrderNo());
         this.save(department);
    }

    private String generatorOrderNo(){
        return (System.currentTimeMillis() + "" ).substring(0,10)+ (int) ((Math.random() * 9 + 1) * 10);
    }
}
