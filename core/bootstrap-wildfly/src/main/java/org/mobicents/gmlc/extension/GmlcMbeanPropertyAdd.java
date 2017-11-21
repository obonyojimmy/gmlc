package org.mobicents.gmlc.extension;

import static org.mobicents.gmlc.extension.GmlcMbeanPropertyDefinition.PROPERTY_ATTRIBUTES;

import org.jboss.as.controller.AbstractAddStepHandler;
import org.jboss.as.controller.OperationFailedException;
import org.jboss.as.controller.SimpleAttributeDefinition;
import org.jboss.dmr.ModelNode;

class GmlcMbeanPropertyAdd extends AbstractAddStepHandler {

    public static final GmlcMbeanPropertyAdd INSTANCE = new GmlcMbeanPropertyAdd();

    private GmlcMbeanPropertyAdd() {
    }

    @Override
    protected void populateModel(final ModelNode operation, final ModelNode model) throws OperationFailedException {
        GmlcMbeanPropertyDefinition.NAME_ATTR.validateAndSet(operation, model);
        for (SimpleAttributeDefinition def : PROPERTY_ATTRIBUTES) {
            def.validateAndSet(operation, model);
        }
    }
}