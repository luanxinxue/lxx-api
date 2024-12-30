package com.lxx.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxx.mapper.DepartmentMapper;
import com.lxx.model.manager.Department;
import com.lxx.model.manager.params.DepartmentChildrenParam;
import com.lxx.model.manager.vo.DepartmentChildrenVO;
import com.lxx.service.DepartmentService;
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

}
