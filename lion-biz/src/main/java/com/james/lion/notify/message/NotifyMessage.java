package com.james.lion.notify.message;

import com.james.lion.dto.LionMapDTO;
import com.james.lion.type.NotifyType;

/**
 * Created by james.li on 2015-03-27 13:03:55.
 */
public class NotifyMessage {
    private LionMapDTO lionMapDTO;

    private NotifyType notifyType;

    public NotifyMessage(LionMapDTO lionMapDTO, NotifyType notifyType) {
        this.lionMapDTO = lionMapDTO;
        this.notifyType = notifyType;
    }

    public LionMapDTO getLionMapDTO() {
        return lionMapDTO;
    }

    public void setLionMapDTO(LionMapDTO lionMapDTO) {
        this.lionMapDTO = lionMapDTO;
    }

    public NotifyType getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(NotifyType notifyType) {
        this.notifyType = notifyType;
    }
}
