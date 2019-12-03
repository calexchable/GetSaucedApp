package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Christopher Alex Chable'
 */
@Repository
@Transactional

public interface HotSauceDao extends CrudRepository<HotSauce, Integer>{

    List<HotSauce> findAll();

    HotSauce getByBrand(String brand);
    HotSauce getByName(String name);
    HotSauce getByDescription(String description);
}
