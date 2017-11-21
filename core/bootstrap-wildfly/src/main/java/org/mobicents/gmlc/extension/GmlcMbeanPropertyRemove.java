package org.mobicents.gmlc.extension;

import org.jboss.as.controller.AbstractRemoveStepHandler;

class GmlcMbeanPropertyRemove extends AbstractRemoveStepHandler {

    public static final GmlcMbeanPropertyRemove INSTANCE = new GmlcMbeanPropertyRemove();

    private GmlcMbeanPropertyRemove() {
    }
}