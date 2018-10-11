/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import daos.GeneralDAO;
import daos.InterfaceDAO;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import model.Personaldata;
import model.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author Lenovo
 */
public class PersonalController {
    private final InterfaceDAO dAO;
    private final ToolsController tc;
    private final OsController oc;
    private final BhsaController fl;
    private final ProgrammingController pc;
    private final EducationController ec;
    private final AchievementController ac;
    private final NetworkingController nc;
    private final OrganizationController oc1;
    private final PengalamankerjaController pc1;
    private final TrainingController tc1;
    
    public PersonalController(SessionFactory factory) {
        this.dAO = new GeneralDAO(factory, Personaldata.class);
        tc = new ToolsController(factory);
        oc = new OsController(factory);
        fl = new BhsaController(factory);
        pc = new ProgrammingController(factory);
        ec = new EducationController(factory);
        ac = new AchievementController(factory);
        nc = new NetworkingController(factory);
        oc1 = new OrganizationController(factory);
        pc1 = new PengalamankerjaController(factory);
        tc1 = new TrainingController(factory);
    }
   /**
    * 
    * @param idpersonal
    * @param name
    * @param dateofbirth
    * @param nationality
    * @param maritalstatus
    * @param gender
    * @param phonenumber
    * @param email
    * @param foto
    * @return 
    */
//    public boolean saveOrUpdate(String idpersonal, String name, String dateofbirth, String nationality, String maritalstatus, String gender, String phonenumber, String email, String foto){
//        Personaldata pdata = new Personaldata(new BigDecimal(idpersonal), name, new Date (dateofbirth), nationality, maritalstatus, gender, phonenumber, email, foto);
//        return dAO.saveOrUpdate(pdata);
//    }
    /**
     * Method untuk melakukan penghapusan data Region
     * @param idpersonal  dengan tipe data String
     * @return iDAO mengembalikan nilai boolean
     */
    public boolean delete(String idpersonal){
        Personaldata pdata = new Personaldata(new BigDecimal(idpersonal));
        return dAO.delete(pdata);
    }
    /**
     * Method untuk menampilkan data Region berdasarkan IDnya
     * @param idPersonal   dengan tipe data String
     * @return iDAO mengembalikan nilai objek
     */
    public Personaldata getById (String idPersonal){
        return (Personaldata) dAO.getById(idPersonal);
    }
    
    /**
     * Method untuk mengambil semua data yang ada pada tabel Region
     * @return iDAO mengembalikan nilai List
     */
    public List<Object> getAll(){
        return dAO.getAll();
    }
    /**
     * Method untuk melakukan pencarian data Region berdasarkan kategori dan kata kunci
     * @param category dengan tipe data String, terdapat 2 kategori yaitu regionId dan regionName
     * @param key dengan tipe data key
     * @return iDAO mengembalikan nilai List
     */
    public List<Object> search(String category, Object key){
        return dAO.search(category, key);
    }
    /**
     * Method untuk membuat id baru secara increment +1
     * @return iDAO mengembalikan nilai object
     */
    public Object getAutoId(){
        Personaldata pdata =  (Personaldata) dAO.getLastId();
        BigDecimal one = new BigDecimal("1");
        return pdata.getIdpersonal().add(one);
    }
    
    public void loadCmbTools(JComboBox cmb, String model){
        switch (model) {
            case "tool":
                {
                    List<Object> objects = (List<Object>) tc.getAll();
                    objects.stream().map((object) -> (Tools) object).forEachOrdered((tools) -> {
                        cmb.addItem(tools.getToolname());
                    });     break;
                }
            case "os":
                {
                    List<Object> objects = (List<Object>) oc.getAll();
                    objects.stream().map((object) -> (Os) object).forEachOrdered((os) -> {
                        cmb.addItem(os.getOsname());
                    });     break;
                }
            case "bahasa1":
                {
                    List<Object> objects = (List<Object>) fl.getAll();
                    objects.stream().map((object) -> (Foreignlanguage) object).forEachOrdered((fla) -> {
                        cmb.addItem(fla.getLanguagename());
                    });     break;
                }
            case "bhsProg":
                {
                    List<Object> objects = (List<Object>) pc.getAll();
                    objects.stream().map((object) -> (Programming) object).forEachOrdered((pg) -> {
                        cmb.addItem(pg.getProgramminglanguage());
                    });     break;
                }
            case "edul":
                {
                    List<Object> objects = (List<Object>) ec.getAll();
                    objects.stream().map((object) -> (Education) object).forEachOrdered((ed) -> {
                        cmb.addItem(ed.getLeveleducation());
                    });     break;
                }
            case "eventPh":
                {
                    List<Object> objects = (List<Object>) ac.getAll();
                    objects.stream().map((object) -> (Achievement) object).forEachOrdered((ach) -> {
                        cmb.addItem(ach.getEventname());
                    });     break;
                }
            case "GPA":
                {
                    List<Object> objects = (List<Object>) ec.getAll();
                    objects.stream().map((object) -> (Education) object).forEachOrdered((ed) -> {
                        cmb.addItem(ed.getGpa());
                    });     break;
                }
            case "lulus":
                {
                    List<Object> objects = (List<Object>) ec.getAll();
                    objects.stream().map((object) -> (Education) object).forEachOrdered((ed) -> {
                        cmb.addItem(ed.getGraduation());
                    });     break;
                }
            case "yearin":
                {
                    List<Object> objects = (List<Object>) ec.getAll();
                    objects.stream().map((object) -> (Education) object).forEachOrdered((ed) -> {
                        cmb.addItem(ed.getYearin());
                    });     break;
                }
            case "major":
                {
                    List<Object> objects = (List<Object>) ec.getAll();
                    objects.stream().map((object) -> (Education) object).forEachOrdered((ed) -> {
                        cmb.addItem(ed.getMajor());
                    });     break;
                }
            case "insta":
                {
                    List<Object> objects = (List<Object>) ec.getAll();
                    objects.stream().map((object) -> (Education) object).forEachOrdered((ed) -> {
                        cmb.addItem(ed.getInstansi());
                    });     break;
                }
            case "jbatn":
                {
                    List<Object> objects = (List<Object>) oc1.getAll();
                    objects.stream().map((object) -> (Organization) object).forEachOrdered((or1) -> {
                        cmb.addItem(or1.getPosition());
                    });     break;
                }
            case "naOr":
                {
                    List<Object> objects = (List<Object>) oc1.getAll();
                    objects.stream().map((object) -> (Organization) object).forEachOrdered((or1) -> {
                        cmb.addItem(or1.getOrganizationname());
                    });     break;
                }
            case "thOrAw":
                {
                    List<Object> objects = (List<Object>) oc1.getAll();
                    objects.stream().map((object) -> (Organization) object).forEachOrdered((or1) -> {
                        cmb.addItem(or1.getStartdate().toString().substring(0, 10));
                    });     break;
                }
            case "thOrAk":
                {
                    List<Object> objects = (List<Object>) oc1.getAll();
                    objects.stream().map((object) -> (Organization) object).forEachOrdered((or1) -> {
                        cmb.addItem(or1.getEnddate().toString().substring(0, 10));
                    });     break;
                }
            case "network":
                {
                    List<Object> objects = (List<Object>) nc.getAll();
                    objects.stream().map((object) -> (Networking) object).forEachOrdered((net) -> {
                        cmb.addItem(net.getNetworkingskill());
                    });     break;
                }
            case "namaPr":
                {
                    List<Object> objects = (List<Object>) pc1.getAll();
                    objects.stream().map((object) -> (Workingexperience) object).forEachOrdered((prsh) -> {
                        cmb.addItem(prsh.getEmployer());
                    });     break;
                }
            case "jabatan":
                {
                    List<Object> objects = (List<Object>) pc1.getAll();
                    objects.stream().map((object) -> (Workingexperience) object).forEachOrdered((prsh) -> {
                        cmb.addItem(prsh.getJobtitle());
                    });     break;
                }
            case "thKrAk":
                {
                    List<Object> objects = (List<Object>) pc1.getAll();
                    objects.stream().map((object) -> (Workingexperience) object).forEachOrdered((prsh) -> {
                        cmb.addItem(prsh.getStartdate().toString().substring(0, 10));
                    });     break;
                }
            case "thKrAw":
                {
                    List<Object> objects = (List<Object>) pc1.getAll();
                    objects.stream().map((object) -> (Workingexperience) object).forEachOrdered((prsh) -> {
                        cmb.addItem(prsh.getEnddate().toString().substring(0, 10));
                    });     break;
                }
            case "nmPenghargaan":
                {
                    List<Object> objects = (List<Object>) ac.getAll();
                    objects.stream().map((object) -> (Achievement) object).forEachOrdered((ach) -> {
                        cmb.addItem(ach.getAchievementname());
                    });     break;
                }
            case "evPenghargaan":
                {
                    List<Object> objects = (List<Object>) ac.getAll();
                    objects.stream().map((object) -> (Achievement) object).forEachOrdered((ach) -> {
                        cmb.addItem(ach.getEventname());
                    });     break;
                }
            case "thPenghargaan":
                {
                    List<Object> objects = (List<Object>) ac.getAll();
                    objects.stream().map((object) -> (Achievement) object).forEachOrdered((ach) -> {
                        cmb.addItem(ach.getYear());
                    });     break;
                }
            case "nmTrain":
                {
                    List<Object> objects = (List<Object>) tc1.getAll();
                    objects.stream().map((object) -> (Training) object).forEachOrdered((tra) -> {
                        cmb.addItem(tra.getTrainingname());
                    });     break;
                }
            case "lgTrain":
                {
                    List<Object> objects = (List<Object>) tc1.getAll();
                    objects.stream().map((object) -> (Training) object).forEachOrdered((tra) -> {
                        cmb.addItem(tra.getTrainingorganization());
                    });     break;
                }
            case "awTrain":
                {
                    List<Object> objects = (List<Object>) tc1.getAll();
                    objects.stream().map((object) -> (Training) object).forEachOrdered((tra) -> {
                        cmb.addItem(tra.getStartdate().toString().substring(0, 10));
                    });     break;
                }
            case "akTrain":
                {
                    List<Object> objects = (List<Object>) tc1.getAll();
                    objects.stream().map((object) -> (Training) object).forEachOrdered((tra) -> {
                        cmb.addItem(tra.getEnddate().toString().substring(0, 10));
                    });     break;
                }
            default:
                break;
        }
    }
}
//        controller.loadCmbTools(cmbNamaPenghaargaan, "nmPenghargaan");
//        controller.loadCmbTools(cmbEventPenghargaan, "evPenghargaan");
//        controller.loadCmbTools(cmbTahunPenghargaan, "thPenghargaan");
//        controller.loadCmbTools(cmbNameTrain, "nmTrain");
//        controller.loadCmbTools(cmbLembgTraining, "lgTrain");
//        controller.loadCmbTools(cmbTglMulaiTraining, "awTrain");
//        controller.loadCmbTools(cmbTglSelesaiTrain, "akTrain");
