package com.james.lion.type;

/**
 * Created by james.li on 2015-03-22 16:45:30.
 */
public enum NotifyType {

    INSERT(1),
    DELETE(2),
    UPDATE(3);

    public final int value;

    private NotifyType(int value) {
        this.value = value;
    }
}