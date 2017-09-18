package com.james.lion.test.lion;

import com.google.common.collect.Lists;
import com.james.lion.biz.LionMapBiz;
import com.james.lion.entity.LionMap;
import com.james.lion.type.LionEnv;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

//import com.james.lion.utils.LionManager;

/**
 * Created by james.li on 2015-03-05 15:44:31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:spring/common/appcontext-*.xml"})
@Slf4j
public class LionMapTest {

    @Autowired
    private LionMapBiz lionMapBiz;

    @Test
    public void testGetAll() {
        List<LionMap> lionMaps = lionMapBiz.getByProjectAndEnv("lion", LionEnv.DEVELOP.value);
        for (LionMap lionMap : lionMaps) {
            System.out.println(lionMap);
        }
//        log.info("#########娃哈哈james");
//        System.out.println(LionUtils.getProperty("lion.driverClassName", "default"));
//        System.out.println(LionUtils.getProperty("wawa.sss", "default"));
//        System.out.println(LionUtils.getProperty("wawa.ss", "default"));
    }

    @Test
    public void testInserts() {
        LionMap lionMap = new LionMap();
        lionMap.setMapKey("male");
        lionMap.setMapValue("james");
        lionMap.setLazy(false);
        lionMap.setProjectName("lion");
        lionMap.setEnv(LionEnv.DEVELOP.value);
        LionMap lionMap3 = new LionMap();
        lionMap3.setMapKey("male");
        lionMap3.setMapValue("james3");
        lionMap3.setLazy(true);
        lionMap3.setProjectName("lion");
        lionMap3.setEnv(LionEnv.ARK.value);

        LionMap lionMap2 = new LionMap();
        lionMap2.setMapKey("female");
        lionMap2.setMapValue("冬冬");
        lionMap2.setLazy(true);
        lionMap2.setProjectName("lion");
        lionMap2.setEnv(LionEnv.DEVELOP.value);

        List<LionMap> lionMapList = Lists.newArrayList();
        lionMapList.add(lionMap);
        lionMapList.add(lionMap2);
        lionMapList.add(lionMap3);


        int result = lionMapBiz.inserts(lionMapList);
        System.out.println(result);
        for (LionMap l : lionMapList) {
            System.out.println(l.getId());
        }
    }

    @Test
    public void testDeleteById() {
        //        int result = lionMapBiz.deleteByID(128);
        //        System.out.println(result);
//        System.out.println(LionManager.CUR_ENV);
    }

//    @Test
//    public void testGetAll2() {
//        List<LionMapDTO> lionMaps = lionService.getAll();
//        for (LionMapDTO lionMap : lionMaps) {
//            System.out.println(lionMap);
//        }
//    }


    public static void main(String args[])
    {

        String url = "jdbc:mysql://localhost:3306/lion";
        String driver = "com.mysql.jdbc.Driver";
        try{
            Class.forName(driver);
        }catch(Exception e){
            System.out.println("无法加载驱动");
        }

        try {
            Connection con = DriverManager.getConnection(url,"root","1qaz!QAZ");
            if(!con.isClosed())
                System.out.println("success");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
