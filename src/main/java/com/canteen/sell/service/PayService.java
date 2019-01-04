package com.canteen.sell.service;

import com.canteen.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import org.springframework.web.servlet.ModelAndView;

/**
 * 支付
 * Created by SqMax on 2018/3/26.
 */
public interface PayService {
    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}
