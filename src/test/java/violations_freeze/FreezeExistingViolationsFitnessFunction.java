package violations_freeze;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesArchitectureRules;

import static com.tngtech.archunit.library.freeze.FreezingArchRule.freeze;

@AnalyzeClasses(packages = "jmolecules_layers")
public class FreezeExistingViolationsFitnessFunction {

    @ArchTest
    ArchRule jmolecules_layers = freeze(
            JMoleculesArchitectureRules.ensureLayeringStrict()
    );

}
