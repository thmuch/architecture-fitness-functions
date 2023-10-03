package archunit_rings.adapter.api;

import archunit_rings.adapter.persistence.DatabaseAdapter;
import archunit_rings.application.ApplicationClass;

public class RESTAdapter {

    ApplicationClass dependency_from_adapter_to_application;

    DatabaseAdapter unwanted_dependency_between_adapters;

}
