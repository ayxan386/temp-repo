package org.demo.webfile.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ApplicationService {

  public void logThis(Object applicationDTO) {
    log.info(applicationDTO.toString());
  }
}
