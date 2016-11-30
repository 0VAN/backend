package com.repository;

import com.domain.Table1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by alex on 12/11/16.
 */
@Repository
public interface Table1Repository extends JpaRepository<Table1,Long> {
}
