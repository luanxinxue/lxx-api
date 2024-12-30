package com.lxx.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lxx.model.manager.Department;
import com.lxx.model.manager.params.DepartmentChildrenParam;
import com.lxx.model.manager.vo.DepartmentChildrenVO;

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
}
