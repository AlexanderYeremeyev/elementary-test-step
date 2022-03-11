package com.yeremeyev.readyapi.plugins.teststep.elementary.step;

import com.eviware.soapui.config.TestStepConfig;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStepResult;
import com.eviware.soapui.model.testsuite.TestCaseRunContext;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestProperty;
import com.eviware.soapui.model.testsuite.TestPropertyListener;
import com.eviware.soapui.model.testsuite.TestStepResult;

import java.util.List;
import java.util.Map;

public class ElementaryTestStep extends WsdlTestStep {

    public ElementaryTestStep(WsdlTestCase wsdlTestCase, TestStepConfig testStepConfig, boolean forLoadTest) {
        super(wsdlTestCase, testStepConfig, false, forLoadTest);
    }

    @Override
    public TestStepResult run(TestCaseRunner testCaseRunner, TestCaseRunContext testCaseRunContext) {
        WsdlTestStepResult result = new WsdlTestStepResult(this);

        result.startTimer();
        result.stopTimer();

        result.setStatus(TestStepResult.TestStepStatus.OK);

        return result;
    }

    @Override
    public String[] getPropertyNames() {
        return new String[0];
    }

    @Override
    public void setPropertyValue(String s, String s1) {

    }

    @Override
    public String getPropertyValue(String s) {
        return null;
    }

    @Override
    public TestProperty getProperty(String s) {
        return null;
    }

    @Override
    public Map<String, TestProperty> getProperties() {
        return null;
    }

    @Override
    public void addTestPropertyListener(TestPropertyListener testPropertyListener) {

    }

    @Override
    public void removeTestPropertyListener(TestPropertyListener testPropertyListener) {

    }

    @Override
    public boolean hasProperty(String s) {
        return false;
    }

    @Override
    public int getPropertyCount() {
        return 0;
    }

    @Override
    public List<TestProperty> getPropertyList() {
        return null;
    }

    @Override
    public TestProperty getPropertyAt(int i) {
        return null;
    }
}
