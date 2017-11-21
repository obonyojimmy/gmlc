package org.mobicents.gmlc.extension;

import org.jboss.as.controller.AbstractRemoveStepHandler;

class GmlcMbeanRemove extends AbstractRemoveStepHandler {

    static final GmlcMbeanRemove INSTANCE = new GmlcMbeanRemove();

    private GmlcMbeanRemove() {
    }
}