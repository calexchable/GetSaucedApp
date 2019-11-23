package com.example.GetSaucedApp.models.data;

import com.example.GetSaucedApp.models.HotSauce;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * Created by Christopher Alex Chable'
 */
@Repository
@Transactional
public interface HotSauceDao extends CrudRepository<HotSauce, Integer>{

}
