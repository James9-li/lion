package com.james.lion.transformer;

import com.james.lion.dto.LionMapDTO;
import com.james.lion.entity.LionMap;
import com.google.common.base.Function;

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
}
