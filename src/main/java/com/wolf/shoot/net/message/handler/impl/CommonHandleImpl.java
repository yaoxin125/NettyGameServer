package com.wolf.shoot.net.message.handler.impl;

import com.wolf.shoot.net.message.NetMessage;
import com.wolf.shoot.net.message.handler.auto.common.CommonHandler;
import com.wolf.shoot.net.message.logic.tcp.common.CommonServerErrorResponseMessage;
import com.wolf.shoot.net.message.logic.tcp.online.OnlineHeartMessage;

/**
 * Created by jiangwenping on 17/2/15.
 */
public class CommonHandleImpl extends CommonHandler{
    @Override
    public NetMessage handleOnlineHeartMessageImpl(OnlineHeartMessage message) throws Exception {
        CommonServerErrorResponseMessage response = new CommonServerErrorResponseMessage();
        response.setCmd(message.getCmd());
        return response;
    }
}