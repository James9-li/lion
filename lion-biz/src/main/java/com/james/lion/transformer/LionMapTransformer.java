package com.james.lion.transformer;

import com.james.lion.dto.LionMapDTO;
import com.james.lion.entity.LionMap;
import com.google.common.base.Function;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by james.li on 2015-03-11 10:01:03.
 */
public class LionMapTransformer implements Function<LionMapDTO, LionMap> {

    public static final LionMapTransformer INSTANCE = new LionMapTransformer();

    @Override
    public LionMap apply(LionMapDTO src) {
        if (src == null) {
            return null;
        }
        LionMap des = new LionMap();
        des.setId(src.getId());
        des.setMapKey(src.getMapKey());
        des.setMapValue(src.getMapValue());
        des.setProjectName(src.getProjectName());
        des.setLazy(src.isLazy());
        des.setEnv(src.getEnv());
        return des;
    }


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
