![Kores](https://github.com/JonathanxD/Kores/blob/version/4.0.0/Kores-base.png?raw=true)

[![wercker status](https://app.wercker.com/status/5bb68f1c497f4e1cf3ff362874395e6f/s/version/4.0.0 "wercker status")](https://app.wercker.com/project/byKey/5bb68f1c497f4e1cf3ff362874395e6f)
[![jitpack](https://jitpack.io/v/JonathanxD/Kores.svg)](https://jitpack.io/#JonathanxD/Kores)
[![Discord](https://img.shields.io/discord/291407467286364164.svg)](https://discord.gg/3cQWmtj)

Kores is a framework which provide to developers a way to construct bytecode and source from a common structure.

## Projects using Kores

CodeAPI 2 (old name):

All my projects is already updated.

CodeAPI 3 (old name):

All my projects have a Kores 4 beta version.

Kores 4 (beta):

- [EventSys](https://github.com/ProjectSandstone/EventSys)
  - A dynamic property base event system written on top of Kores
  
- [CodeProxy](https://github.com/JonathanxD/CodeProxy)
  - A Proxy generator written on top of Kores, the key difference between Java proxies is that CodeProxies can extend classes.
  
- [AdapterHelper](https://github.com/JonathanxD/AdapterHelper)
  - A set of utilities to help with creation, registration and management of Adapters, some features requires Kores, such as deep instance adapting.

## Performance

In the beginning of Kores, performance was one of the priorities, but when I finished version 2, I noticed that the performance never was a problem, I always try to improve performance by looking the performance results (using JMH), the biggest performance problem is not with the project, but with JVM itself: classloading takes too much time.

Note for contributors: Performance improvement pull request will be always strictly analyzed, some optimizations that I thought about doing, was not needed because JVM was able to solve the problems in the 3rd-4th time execution of the code.

## Kores 4

In Kores 4, some interfaces was changed to concrete final classes (design decision...) to maintain consistency. 

The main difference between Kores 4 and older versions is that Kores 4 is written with JVM in mind, in older versions, you have the free to put whathever in anywhere, example, a `println` method invocation in `class` body or outside of the class, in Kores 4 it is not possible.

## Tutorials

**Coming soon**

## Code Generation and Reading

[BytecodeWriter](https://github.com/JonathanxD/Kores-BytecodeWriter)
[SourceWriter](https://github.com/JonathanxD/Kores-SourceWriter)
[BytecodeReader](https://github.com/JonathanxD/Kores-BytecodeReader)


# Systems

`Kores-Base` systems (may be interdependent):

- Structure (aka `base`)
  - Structure of the code, like classes, methods, fields, variable assignment, etc.
 
- Builder
  - Builder of instances, like structure instances and common classes instances.
  
- Factory
  - Factory of instances, like structure instances and common classes instances.
  
- Conversion
  - Conversions between types, from/to Kores type to/from other types.
  
- Inspection (only `inspect` package)
  - Inspections and analysis (flow analysis, code source analysis, ...).
  
- Generator
  - Generator from Kores structure to other structures.
  
- Validator
  - Validates Kores structures.
  
- Misc
  - Miscellaneous: cover all other systems, it includes `utility classes`, `modify.visit package`, `helper` classes, type inference, etc...
