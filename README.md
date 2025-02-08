
# Fitness Functions for Your Architecture

This repository contains examples of Fitness Functions for structures in certain architectural patterns and styles.
Fitness Functions are and important piece of [Evolutionary Architectures](https://evolutionaryarchitecture.com/).

The examples are written in Java and demonstrate two suitable tools/libraries for implementing structural
fitness functions: [ArchUnit](https://www.archunit.org/) and [jMolecules](https://xmolecules.org/).

You'll find the structure examples [here](src/main/java), along with visualizations (editable PNGs for
diagrams.net / draw.io).

The corresponding fitness functions are available [here](src/test/java).


## Note

- *All* fitness functions are expected to *fail* in order to demonstrate how unwanted dependencies are reported as
  violations. The failure messages hint at how the violations can be fixed easily.
- The example code deliberately violates some common Java coding conventions (especially regarding naming, like calling
  classes "Class..."), because this hopefully makes it easier for non-programmers to understand the structures and
  dependencies.


## Talks & Slides

- [OOP 2025](https://www.oop-konferenz.de/de/programm/konferenzprogramm#item-7725), 2025-02-06 ([PDF](https://thomas-much.de/presentations/FitnessFunctionsForYourArchitecture-OOP-2025.pdf))
- [Agile meets Architecture 2023](https://www.agile-meets-architecture.com/2023/schedule), 2023-10-05 ([PDF](https://thomas-much.de/presentations/FitnessFunctionsForYourArchitecture-AmA-2023.pdf), [Video](https://www.youtube.com/watch?v=qa-UDL_IWRk))
