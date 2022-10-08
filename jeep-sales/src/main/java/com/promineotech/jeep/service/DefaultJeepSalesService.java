/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

@Service
public class DefaultJeepSalesService implements JeepSalesService {

  Logger log = LoggerFactory.getLogger(getClass());
  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
   log.info("The fetchedJeeps method was called with model={} and trim={}", model, trim);
    
    
    return null;
  }

}
