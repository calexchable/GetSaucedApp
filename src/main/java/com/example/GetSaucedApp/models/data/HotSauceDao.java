package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;
import com.example.GetSaucedApp.models.SearchCategory;
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

    List<HotSauce> getAllSauces();
    ArrayList<HotSauce> findByValue(String value);
    String getFieldByType (HotSauce hotSauce, SearchCategory type);
    ArrayList<HotSauce> findByColumnAndValue(SearchCategory column, String value);

}
