## IRIDA plugin for Listeria monocytogenes typing

IRIDA plugin takes fastq reads as input, uses the list of following steps and produces Listeria monocytogenes typing report.
As of June 2021, the plugin is actively upgraded and new tools will be added.

* MASH screen - Species identification and confirmation 
* Shovill pipeline - Assembly
* CheckM - Genome assembly integrity check
* MLST - Typing


## Plugin installation
# Requirements:
  * IRIDA 20.01 (It may work in other versions)
  * Shovill 
  * CheckM
  * MLST
 

Download the .jar file, copy the file into "plugins" directory in IRIDA installation and restart IRIDA (Tomcat).  





