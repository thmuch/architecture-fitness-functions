package jmolecules_layers.a_frontend;

import jmolecules_layers.b_services.ServiceClass;
import jmolecules_layers.c_entities.EntityClass;

public class FrontendClass {

    ServiceClass strict_dependency_from_frontend_to_service;

    EntityClass nonstrict_dependency_from_frontend_to_entity;

}
