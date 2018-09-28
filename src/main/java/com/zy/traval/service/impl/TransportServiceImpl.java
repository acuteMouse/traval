package com.zy.traval.service.impl;

import com.zy.traval.bean.Transport;
import com.zy.traval.dao.TransportDao;
import com.zy.traval.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author cgl
 * @date 2018/9/26 21:40
 */
@Service
@Transactional
public class TransportServiceImpl implements TransportService {

    @Autowired
    TransportDao transportDao;

    @Override
    public List<Transport> findAll() {
        return transportDao.findAll();
    }

    @Override
    public boolean save(Transport transport) {
        return transportDao.save(transport).getId() > 0;
    }
}
