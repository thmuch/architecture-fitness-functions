package archunit_rings;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "archunit_rings")
class RingsFitnessFunction {

    @ArchTest
    ArchRule rings_and_adapters =
            onionArchitecture()
                    .domainModels("..domain.model..")
                    .domainServices("..domain.services..")
                    .applicationServices("..application..")
                    .adapter("REST API", "..adapter.api..")
                    .adapter("Database", "..adapter.persistence..");

}
