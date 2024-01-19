package com.camunda.demo.customeronboarding.adapter;

import com.camunda.demo.customeronboarding.model.NewApplication;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RejectPolicy {
  private static final Logger LOGGER = LoggerFactory.getLogger(RejectPolicy.class);


  @JobWorker(type = "rejectPolicy")
  public NewApplication issuePolicy(@VariablesAsType NewApplication newApplication) {

    LOGGER.info("Policy for %s rejected!", newApplication.getApplicant().getName());

    return newApplication;
  }

}
