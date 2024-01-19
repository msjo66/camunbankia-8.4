package com.camunda.demo.customeronboarding.adapter;

import org.springframework.stereotype.Component;

import com.camunda.demo.customeronboarding.model.NewApplication;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;

@Component
public class IssuePolicy {

  @JobWorker(type = "issuePolicy")
  public NewApplication issuePolicy(@VariablesAsType NewApplication newApplication) {

    newApplication.setContractNumber(String.valueOf(System.currentTimeMillis()));

    return newApplication;
  }

}
