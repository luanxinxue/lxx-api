package com.lxx.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lxx.common.page.PageResult;
import com.lxx.model.manager.Department;
import com.lxx.model.manager.params.DepartmentAddParam;
import com.lxx.model.manager.params.DepartmentChildrenParam;
import com.lxx.model.manager.params.DepartmentPageParam;
import com.lxx.model.manager.vo.DepartmentChildrenVO;
import com.lxx.model.manager.vo.DepartmentVO;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author luanxinxue
 * @since 2024-12-25
 */
public interface DepartmentService extends IService<Department> {
    List<DepartmentChildrenVO> getChildren(DepartmentChildrenParam departmentChildrenParam);

    PageResult<DepartmentVO> pageList(DepartmentPageParam departmentPageParam);

    void add(DepartmentAddParam departmentAddParam);
}
