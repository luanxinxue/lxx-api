package com.lxx.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxx.mapper.EmployeeMapper;
import com.lxx.model.manager.Employee;
import com.lxx.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *   服务实现类
 * </p>
 *
 * @author luanxinxue
 * @since 2024-12-25
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
	
}
