package jmolecules_layers;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesArchitectureRules;

@AnalyzeClasses(packages = "jmolecules_layers")
public class JMoleculesLayersFitnessFunction {

    @ArchTest
    ArchRule jmolecules_layers = JMoleculesArchitectureRules.ensureLayeringStrict();

//    @ArchTest
//    ArchRule jmolecules_layers_nonstrict = JMoleculesArchitectureRules.ensureLayering();

}
