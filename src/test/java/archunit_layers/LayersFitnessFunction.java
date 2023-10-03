package archunit_layers;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "archunit_layers")
class LayersFitnessFunction {

    @ArchTest
    ArchRule layer_dependencies =
            layeredArchitecture()
                    .consideringAllDependencies()

                    .layer("User Interface").definedBy("..a_user_interface..")
                    .layer("Application").definedBy("..b_application..")
                    .layer("Domain").definedBy("..c_domain..")
                    .layer("Infrastructure").definedBy("..d_infrastructure..")

                    .whereLayer("User Interface").mayNotBeAccessedByAnyLayer()
                    .whereLayer("Application").mayOnlyBeAccessedByLayers("User Interface")
                    .whereLayer("Domain").mayOnlyBeAccessedByLayers("Application")
                    .whereLayer("Infrastructure").mayOnlyBeAccessedByLayers("Domain");

}
