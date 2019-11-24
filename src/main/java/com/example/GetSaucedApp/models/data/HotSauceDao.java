package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christopher Alex Chable'
 */
@Repository
@Transactional
public interface HotSauceDao extends CrudRepository<HotSauce, Integer>{

    List<HotSauce> findAll();
//    List<HotSauce> findByBrand();
//    List<HotSauce> findByName();
//    List<HotSauce> findByDescription();

}
