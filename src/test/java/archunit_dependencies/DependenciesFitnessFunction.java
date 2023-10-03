package archunit_dependencies;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "archunit_dependencies")
class DependenciesFitnessFunction {

    @ArchTest
    ArchRule no_dependencies_from_A_to_B =
            noClasses()
                    .that().resideInAPackage("..package_A..")
                    .should().dependOnClassesThat().resideInAPackage("..package_B..");

//    @ArchTest
//    ArchRule no_dependencies_from_B_to_A =
//            noClasses()
//            .that().resideInAPackage("..package_B..")
//            .should().dependOnClassesThat().resideInAPackage("..package_A..");

}
