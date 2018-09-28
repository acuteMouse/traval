package com.zy.traval.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author cgl
 * @date 2018/9/26 21:50
 */
@NoRepositoryBean
public interface BaseDao<T> extends JpaRepository<T, Integer>, CrudRepository<T, Integer> {
}
