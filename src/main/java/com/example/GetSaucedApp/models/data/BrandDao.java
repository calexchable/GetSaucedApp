package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

/**
 * Created by Christopher Alex Chable'
 */
@Repository
@Transactional
public interface BrandDao extends CrudRepository<Brand, Integer> {

}