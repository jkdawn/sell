package com.canteen.sell.service;

import com.canteen.sell.dto.OrderDTO;

/**
 * 推送消息
 * Created by SqMax on 2018/4/2.
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
