
import controller.EducationController;
import daos.GeneralDAO;
import daos.InterfaceDAO;
import model.*;
import tools.HibernateUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("heloo");
        InterfaceDAO iDAO = new GeneralDAO(HibernateUtil.getSessionFactory(), Achievement.class);
        EducationController controller = new EducationController(HibernateUtil.getSessionFactory());
        for (Object ob : controller.getAll()) {
            Education e = (Education) ob;
            System.out.println(e.getIdeducation()+" "+e.getMajor());
        }
//        for (Object object : controller.getAll() {
//            Education e = (Achievement) object;
//            System.out.println(achievement.getAchievementname()+" - "+achievement.getIdachievement());
//        }
    }
    
}
