package com.lxx.controller.manager;

import com.lxx.model.manager.params.DepartmentChildrenParam;
import com.lxx.model.manager.vo.DepartmentChildrenVO;
import com.lxx.model.manager.vo.DepartmentVO;
import com.lxx.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *   前端控制器
 * </p>
 *
 * @author luanxinxue
 * @since 2024-11-14
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    @RequestMapping("children")
    public List<DepartmentChildrenVO> countEmployee(DepartmentChildrenParam departmentChildrenParam){
        return departmentService.getChildren(departmentChildrenParam);
    }
	
}
