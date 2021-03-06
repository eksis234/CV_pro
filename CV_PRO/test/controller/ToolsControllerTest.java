/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chochong
 */
public class ToolsControllerTest {

    public ToolsControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of saveOrUpdate method, of class ToolsController.
     */
    @Test
    public void testSaveOrUpdate() {
        System.out.println("====================================================");
        System.out.println("saveOrUpdate");
        String idtool = "";
        String toolname = "b";
        ToolsController instance = new ToolsController(tools.HibernateUtil.getSessionFactory());
        for (int i = 0; i < 3; i++) {
            try {
                switch (i) {
                    case 1:
                        idtool = "2";
                        break;
                    case 2:
                        idtool = "b";
                        break;
                    default:
                        idtool = "1b";
                        break;
                }
                boolean result = instance.saveOrUpdate(idtool, toolname);
                assertTrue(result);
                System.out.println("berhasil simpan karena id = " + idtool);
            } catch (Exception e) {
                System.out.println("gagal simpan karena id = " + idtool);
            }
        }
    }

    /**
     * Test of delete method, of class ToolsController.
     */
    @Test
    public void testDelete() {
        System.out.println("====================================================");
        System.out.println("delete");
        String idtool = "3";
        ToolsController instance = new ToolsController(tools.HibernateUtil.getSessionFactory());
        for (int i = 0; i < 3; i++) {
            try {
                switch (i) {
                    case 1:
                        idtool = "2";
                        break;
                    case 2:
                        idtool = "b";
                        break;
                    default:
                        idtool = "1b";
                        break;
                }
                boolean result = instance.delete(idtool);
                assertTrue(result);
                System.out.println("berhasil hapus karena id = " + idtool);
            } catch (Exception e) {
                System.out.println("gagal hapus karena id = " + idtool);
            }
        }
    }

    /**
     * Test of getAll method, of class ToolsController.
     */
    @Test
    public void testGetAll() {
        System.out.println("====================================================");
        try {
            ToolsController instance = new ToolsController(tools.HibernateUtil.getSessionFactory());
            List<Object> result = instance.getAll();
            assertNotNull(result);
            System.out.println("getAll berhasil");
        } catch (Exception e) {
            System.out.println("getAll gagal");
        }

    }

    /**
     * Test of getAutoId method, of class ToolsController.
     */
    @Test
    public void testGetAutoId() {
        System.out.println("====================================================");
        try {
            ToolsController instance = new ToolsController(tools.HibernateUtil.getSessionFactory());
            Object result = instance.getAutoId();
            assertNotNull(result);
            System.out.println("getAutoId berhasil");
        } catch (Exception e) {
            System.out.println("getAutoId gagal");
        }

    }
}
