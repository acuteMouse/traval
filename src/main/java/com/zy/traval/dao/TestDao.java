package com.zy.traval.dao;

import com.zy.traval.bean.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.BitSet;

/**
 * @author cgl
 * @date 2018/9/24 18:18
 */
@Repository
public interface TestDao extends CrudRepository<Test, Integer> {

}
