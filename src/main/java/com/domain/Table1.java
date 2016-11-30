package com.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "table1")
public class Table1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "column1")
    private Long column1;
    @Column(name = "column2")
    private String column2;
    @Column(name = "column3")
    private String column3;

    public Long getColumn1() {
        return column1;
    }

    public void setColumn1(Long column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }
}
