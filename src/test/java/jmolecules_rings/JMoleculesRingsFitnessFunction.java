package jmolecules_rings;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesArchitectureRules;

@AnalyzeClasses(packages = "jmolecules_rings.some_bounded_context")
public class JMoleculesRingsFitnessFunction {

    @ArchTest
    ArchRule jmolecules_rings = JMoleculesArchitectureRules.ensureOnionClassical();

}
