package com.drouter.api.action;

import android.content.Context;

import com.drouter.api.result.RouterResult;

import java.util.Map;

/**
 * description:
 * author: Darren on 2018/1/22 10:32
 * email: 240336124@qq.com
 * version: 1.0
 */
public interface IRouterAction {
    // 执行方法
    RouterResult connect(Context context, Map<String, Object> requestData);
}
