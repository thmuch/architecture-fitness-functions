package archunit_slices;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

@AnalyzeClasses(packages = "archunit_slices")
class VerticalSlicesFitnessFunction {

    @ArchTest
    ArchRule vertical_slices_dependencies = slices()
            .matching("archunit_slices.(*)..")
            .should().notDependOnEachOther();
//            .should().beFreeOfCycles();

}
