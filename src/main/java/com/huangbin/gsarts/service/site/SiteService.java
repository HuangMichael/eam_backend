package com.huangbin.gsarts.service.site;

import com.huangbin.gsarts.dao.site.SiteRepository;
import com.huangbin.gsarts.model.site.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 站点信息接口
 */
@Service
public class SiteService {
    @Autowired
    SiteRepository siteRepository;

    /**
     * @return 查询所有的站点
     */
    public List<Site> findAll() {

        return siteRepository.findAll();
    }

    /**
     * @param id
     * @return 根据ID查询站点
     */
    public Site findById(Long id) {
        return siteRepository.findById(id);
    }
}
