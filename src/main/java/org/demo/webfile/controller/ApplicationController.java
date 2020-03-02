package org.demo.webfile.controller;

import org.demo.webfile.dto.ApplicationDTO;
import org.demo.webfile.service.ApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/app")
public class ApplicationController {
  private final ApplicationService applicationService;

  public ApplicationController(ApplicationService applicationService) {
    this.applicationService = applicationService;
  }

  @PostMapping("/")
  public void log(@RequestBody ApplicationDTO applicationDTO) {
    applicationService.logThis(applicationDTO);
  }
}
