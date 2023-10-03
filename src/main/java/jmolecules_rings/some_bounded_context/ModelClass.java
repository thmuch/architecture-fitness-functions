package jmolecules_rings.some_bounded_context;

import org.jmolecules.architecture.onion.classical.DomainModelRing;

@DomainModelRing
public class ModelClass {

    ServiceClass unwanted_dependency_from_model_to_service;

}
