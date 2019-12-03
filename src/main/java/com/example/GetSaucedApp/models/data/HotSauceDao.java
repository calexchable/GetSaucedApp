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

    ArrayList<HotSauce> getByBrand(String brand);
    ArrayList<HotSauce> getByName(String name);
    ArrayList<HotSauce> getByDescription(String description);
}
