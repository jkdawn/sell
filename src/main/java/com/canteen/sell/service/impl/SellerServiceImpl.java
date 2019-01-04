package com.canteen.sell.service.impl;

import com.canteen.sell.dataobject.SellerInfo;
import com.canteen.sell.repository.SellerInfoRepository;
import com.canteen.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SqMax on 2018/4/1.
 */
@Service
public class SellerServiceImpl implements SellerService{

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
