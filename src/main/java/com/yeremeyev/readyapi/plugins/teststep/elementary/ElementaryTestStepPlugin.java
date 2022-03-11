package com.yeremeyev.readyapi.plugins.teststep.elementary;

import com.eviware.soapui.plugins.PluginAdapter;
import com.eviware.soapui.plugins.PluginConfiguration;
import com.eviware.soapui.plugins.SoapUIFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@PluginConfiguration(
        groupId = "com.yeremeyev.readyapi.plugins.teststep.elementary",
        name = "Elementary Test Step",
        version = "1.0.0",
        autoDetect = false,
        description = "A plugin which contains elementary test step. It do nothind :)",
        infoUrl = "https://github.com/AlexanderYeremeyev/elementary-test-step.git"
)
public class ElementaryTestStepPlugin extends PluginAdapter {
    private ElementaryStepFactory elementaryStepFactory;

    public ElementaryTestStepPlugin() {
        super();
    }

    @Override
    public void initialize() {
    }

    @Override
    public Collection<? extends SoapUIFactory> getFactories() {
        if (elementaryStepFactory == null) {
            elementaryStepFactory = new ElementaryStepFactory();
        }

        List result = new ArrayList();
        result.add(elementaryStepFactory);
        return result;
    }

}
