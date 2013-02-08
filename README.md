# Majordomo

## Prerequisites

You will need the Eclipse IDE (recommended 4.2 Juno release) accompanied by the Modeling Components, Xtext, Xtend, Xpand and ATL.

## Install

After cloning this repository you should import all projects into your workspace. This will result in some errors because there are files missing. You need to generated that missing files:

- Open *de.altimos.mdsd.majordomo\model\majordomo.genmodel* and choose "Generate All" from root element's context menu.
- Execute the MWE2 Workflow file *GenerateMajordomoDSL.mwe2* located in *de.altimos.mdsd.majordomo.dsl\src\de\altimos\mdsd\majordomo\dsl\GenerateMajordomoDsl.mwe2*

Now you should be able to launch another Eclipse instance from your current instance providing you with a comfortable DSL editor. If you want to use the Majordomo Simulator you'll need to generate parts of it's code:

- Execute the MWE2 Workflow located in *de.altimos.mdsd.majordomo.codegen\src\workflow\GenerateMajordomoCode.mwe2*. It will use *de.altimos.mdsd.majordomo.codegen\src\model\musterhaus.domo* and generate a matching simulator program.
- Launch *de.altimos.mdsd.majordomo.simulator.MajordomoSimulator* as a standard Java application.

To use the ATL model transformation execute the ATL file *de.altimos.mdsd.majordomo.house2domo\house2domo.atl* and providing suitable source and targets
model files in the Run Configuration.

## License

Copyright (c) 2012 Christian Nicolai, Jan Graichen

Licensed under EPL v1.0.

