package com.yeremeyev.readyapi.plugins.teststep.elementary;

import com.eviware.soapui.config.TestStepConfig;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.registry.WsdlTestStepFactory;
import com.eviware.soapui.plugins.SoapUIFactory;
import com.eviware.soapui.support.svg.SVGCollectionManager;
import com.yeremeyev.readyapi.plugins.teststep.elementary.step.ElementaryTestStep;

public class ElementaryStepFactory extends WsdlTestStepFactory implements SoapUIFactory {
    public static final String ELEMENTARY_TYPE = "elementary-step-type";

    public ElementaryStepFactory() {
        super(ELEMENTARY_TYPE, "Elementary Test Step", "Empty test step to check LoadUI agents", SVGCollectionManager.INFORMATION_HELP_PATH);
    }

    @Override
    public WsdlTestStep buildTestStep(WsdlTestCase wsdlTestCase, TestStepConfig testStepConfig, boolean forLoadTest) {
        return new ElementaryTestStep(wsdlTestCase, testStepConfig, forLoadTest);
    }

    @Override
    public TestStepConfig createNewTestStep(WsdlTestCase wsdlTestCase, String name) {
        TestStepConfig testStepConfig = TestStepConfig.Factory.newInstance();
        testStepConfig.setType(ELEMENTARY_TYPE);
        testStepConfig.setName(name);
        return testStepConfig;
    }

    @Override
    public boolean canCreate() {
        return true;
    }

    @Override
    public Class<?> getFactoryType() {
        return WsdlTestStepFactory.class;
    }
}
