package jmolecules_rings.some_bounded_context;

import org.jmolecules.architecture.onion.classical.InfrastructureRing;

@InfrastructureRing
public class RESTAdapter {

    ApplicationClass dependency_from_adapter_to_application;

    DatabaseAdapter unwanted_dependency_between_adapters;
    // not caught... maybe choose a different style (e.g. hexagonal)?

}
