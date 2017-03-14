package com.cep.service.impl;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * HxServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十二月 26, 2016</pre>
 */
public class HxServiceImplTest {
    HxServiceImpl hxService;

    @Before
    public void before() throws Exception {
        hxService = new HxServiceImpl();

    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getPasswordReponsitory()
     */
    @Test
    public void testGetPasswordReponsitory() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setPasswordReponsitory(PasswordReponsitory passwordReponsitory)
     */
    @Test
    public void testSetPasswordReponsitory() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getUserBaseInfoRepository()
     */
    @Test
    public void testGetUserBaseInfoRepository() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: setUserBaseInfoRepository(UserBaseInfoRepository userBaseInfoRepository)
     */
    @Test
    public void testSetUserBaseInfoRepository() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: addUserFromFile()
     */
    @Test
    public void testAddUserFromFile() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: delAllUsers()
     */
    @Test
    public void testDelAllUsers() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: modifyPassword()
     */
    @Test
    public void testModifyPassword() throws Exception {
        hxService.modifyPassword();
    }

    @Test
    public void testModiryGaocong() throws Exception {
        if (hxService.modifyPass("15172414967", "0f8d3cacbe30c2c54458a536832e47a0")) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }


    /**
     * Method: addUser(String name, String password)
     */
    @Test
    public void testAddUser() throws Exception {
        String pass="1f4643422298873cb16fabb0762f5c3a";
        String user="13049804861";
        if (hxService.addUser(user, pass)) {
            System.out.println(pass);
            System.out.println(user);
            System.out.println("success");
        }

    }

    @Test
    public void delUser() {
        hxService.delUser("13673205968");
    }
    @Test
    public void modi() throws Exception {
        delUser();
        testAddUser();
    }

    /**
     * Method: addAllUsersFromDb()
     */
    @Test
    public void testAddAllUsersFromDb() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: queryToken()
     */
    @Test
    public void testQueryToken() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = HxServiceImpl.getClass().getMethod("queryToken"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }


} 
