package com.zy.traval.service;

import com.zy.traval.bean.Transport;

import java.util.List;

/**
 * 交通工具业务
 *
 * @author cgl
 * @date 2018/9/26 21:38
 */
public interface TransportService {
    /**
     * 查询所有的交通工具
     *
     * @return
     */
    List<Transport> findAll();

    /**
     * 保存
     *
     * @param transport
     * @return
     */
    boolean save(Transport transport);
}
