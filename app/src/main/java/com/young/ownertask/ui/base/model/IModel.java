package com.young.ownertask.ui.base.model;

/**
 * @author: young
 * email:1160415122@qq.com
 * date:16/7/20  15:17
 */
public interface IModel {
    void getData(ICallback callback);

    public interface ICallback{
        public void onResult(String data);
    }
}
