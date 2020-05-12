package com.example.springcloud.hasor.module;

import net.hasor.core.ApiBinder;
import net.hasor.core.DimModule;
import net.hasor.db.JdbcModule;
import net.hasor.db.Level;
import net.hasor.spring.SpringModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/5/6 14:03
 */
@DimModule
@Component
public class ExampleModule implements SpringModule
{
    @Autowired
    private DataSource dataSource;
    @Override
    public void loadModule(ApiBinder apiBinder) throws Throwable
    {
        apiBinder.installModule(new JdbcModule(Level.Full,this.dataSource));
    }
}
