package com.cep.service.impl;

import com.cep.Application;
import com.cep.service.DbService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.*;

/**
 * DbServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>一月 12, 2017</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DbServiceImplTest {
    private DbService dbService;

    public DbService getDbService() {
        return dbService;
    }

    @Autowired
    public void setDbService(DbService dbService) {
        this.dbService = dbService;
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getFileInfoReponsitory()
     */
    @Test
    public void testGetFileInfoReponsitory() throws Exception {
    }

    /**
     * Method: setFileInfoReponsitory(UploadFileInfoReponsitory fileInfoReponsitory)
     */
    @Test
    public void testSetFileInfoReponsitory() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: modifyFileName()
     */
    @Test
    public void testModifyFileName() throws Exception {
        if (dbService.modifyFileName()) {
            System.out.println("success");
        }

    }

    /**
     * Method: getNameByRegex(String name)
     */
    @Test
    public void testGetNameByRegex() throws Exception {
//TODO: Test goes here... 
    }


} 
