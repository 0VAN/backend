package com.service;

import com.domain.Table1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.repository.Table1Repository;

import java.util.List;

/**
 * Created by alex on 12/11/16.
 */
@Service
public class Table1Service {
    @Autowired
    Table1Repository table1Repository;

    public List<Table1> getAll(){
        return table1Repository.findAll();
    }

}
