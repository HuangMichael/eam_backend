package com.huangbin.gsarts.service.columns;

import com.huangbin.gsarts.dao.columns.ColumnsRepository;
import com.huangbin.gsarts.dao.unit.UnitRepository;
import com.huangbin.gsarts.model.columns.Columns;
import com.huangbin.gsarts.model.unit.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 栏目信息接口
 */
@Service
public class ColumnsService {
    @Autowired
    ColumnsRepository columnsRepository;

    /**
     * @return 查询所有的栏目
     */
    public List<Columns> findAll() {
        return columnsRepository.findAll();
    }

    /**
     * @param id
     * @return 根据ID查询栏目
     */
    public Columns findById(Long id) {
        return columnsRepository.findById(id);
    }
}
