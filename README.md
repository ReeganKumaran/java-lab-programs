# Java Lab Programs (S12BLH31 Programming in Java)

Lab programs for all five units, one folder per exercise. The code follows the lab manual, with compile errors and bugs fixed so every program builds.

## How to run

From inside an exercise folder:

```
javac *.java
java <ClassName>
```

For 3a (packages), run from `unit-3/3a-packages-interfaces`:

```
javac shapes/*.java Main.java
java Main
```

5c (servlet) and 5d (JSP) run on Apache Tomcat; see the notes in each file.

## Contents

| Unit | Exercise | Folder | Main class |
| --- | --- | --- | --- |
| I | 1.a1 Matrix addition | `unit-1/1a1-matrix-addition` | `MatrixAddition` |
| I | 1.a2 Matrix multiplication | `unit-1/1a2-matrix-multiplication` | `matrixmultiplication` |
| I | 1.a3 Matrix transpose | `unit-1/1a3-matrix-transpose` | `Transpose` |
| I | 1.b String operations | `unit-1/1b-string-operations` | `StringOperations` |
| I | 1.c Looping statements | `unit-1/1c-looping-statements` | `LoopExamples` |
| I | 1.d Conditional statements | `unit-1/1d-conditional-statements` | `StudentEvaluation` |
| II | 2.a1 Default constructor | `unit-2/2a1-default-constructor` | `Cabservice` |
| II | 2.a2 Parameterised constructor | `unit-2/2a2-parameterised-constructor` | `Employee_Sal` |
| II | 2.b1 Single inheritance | `unit-2/2b1-single-inheritance` | `SingleInheritanceDemo` |
| II | 2.b2 Multilevel inheritance | `unit-2/2b2-multilevel-inheritance` | `MultilevelInheritanceDemo` |
| II | 2.b3 Hierarchical inheritance | `unit-2/2b3-hierarchical-inheritance` | `HierarchicalInheritanceDemo` |
| II | 2.c1 Static polymorphism | `unit-2/2c1-static-polymorphism` | `Main` |
| II | 2.c2 Runtime polymorphism | `unit-2/2c2-runtime-polymorphism` | `Findareas` |
| II | 2.d Abstraction | `unit-2/2d-abstraction` | `Main1` |
| III | 3.a Packages and interfaces | `unit-3/3a-packages-interfaces` | `Main` |
| III | 3.b Multiple exceptions | `unit-3/3b-exception-handling` | `MultipleExceptionsExample` |
| III | 3.c Single vs multi-threading | `unit-3/3c-threads` | `SingleThreadDemo`, `MultiThreadDemo` |
| IV | 4a Write and read a file | `unit-4/4a-file-write` | `Writeonfile` |
| IV | 4b Copy a file | `unit-4/4b-file-copy` | `FileCopyAndDisplayExample` |
| IV | 4c Collections | `unit-4/4c-collections` | `CollectionsExample` |
| V | 5a AWT frame | `unit-5/5a-awt-frame` | `Testawt` |
| V | 5b AWT calculator | `unit-5/5b-awt-calculator` | `SimpleCalculator` |
| V | 5c Servlet Hello World | `unit-5/5c-servlet` | `HelloWorld` (Tomcat) |
| V | 5d JSP date and time | `unit-5/5d-jsp` | `showDateTime.jsp` (Tomcat) |

## Fixes from the manual

- 1.a3: transpose loops swapped so non-square matrices work.
- 2.b1: missing closing brace added.
- 3.a: `importshapes` typos fixed to `import shapes`.
- 3.b: `voidmain` and `intresult` typos fixed.
- 4a: curly quotes replaced with straight quotes; added reading the file back.
- 5a, 5b: window close button now works.
- 5b: Cancel works even when the boxes are empty.
