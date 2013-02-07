# Majordomo

## Prerequisites

You will need the Eclipse IDE (authors used 4.2 Juno) accompanied by the Modeling Components, Xtext, Xtend and ATL.

## Install

After cloning this repository you should import all projects into your workspace, this will give you some errors because there are files missing that
you now need to generate:

- first find and open the *de.altimos.mdsd.majordomo\model\majordomo.genmodel* file and choose "Generate All" from context menu when clicking on the root element named "Majordomo"
- then execute the MWE2 Workflow file *GenerateMajordomoDSL.mwe2* located in *de.altimos.mdsd.majordomo.dsl\src\de\altimos\mdsd\majordomo\dsl\GenerateMajordomoDsl.mwe2*

Now you should be able to launch another Eclipse instance from your current instance providing you with a comfortable DSL editor. If you want to use the Majordomo Simulator you'll need to generate it's code via:

- execute the MWE2 Workflow located in *de.altimos.mdsd.majordomo.codegen\src\workflow\GenerateMajordomoCode.mwe2* that will consume *de.altimos.mdsd.majordomo.codegen\src\model\musterhaus.domo* and generate a matching simulator program for it which's main class that you need to launch is *de.altimos.mdsd.majordomo.simulator.MajordomoSimulator*

To use the ATL model transformation execute the ATL file *de.altimos.mdsd.majordomo.house2domo\house2domo.atl* and providing suitable source and targets
model files in the Run Configuration.
