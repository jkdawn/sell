package com.canteen.sell.service;

import com.canteen.sell.dataobject.ProductCategory;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by SqMax on 2018/3/17.
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
