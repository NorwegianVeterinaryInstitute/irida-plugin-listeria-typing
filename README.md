# IRIDA plugin for Listeria monocytogenes typing

IRIDA plugin takes fastq reads as input, uses the list of following steps and produces Listeria monocytogenes typing report.
As of June 2021, the plugin is actively upgraded and new tools will be added.

* [MASH screen](https://mash.readthedocs.io/en/latest/tutorials.html) - Species identification and confirmation 
* [Shovill pipeline](https://github.com/tseemann/shovill) - Assembly
* [CheckM](https://github.com/Ecogenomics/CheckM) - Genome assembly integrity check
* [MLST](https://github.com/tseemann/mlst) - Typing

IRIDA plugins are originally [galaxy workflows](https://galaxyproject.org/learn/advanced-workflow/) which are converted to IRIDA plugin (.jar file) using [IRIDA plugin development documentation](https://github.com/phac-nml/irida-plugin-example)  


## Plugin installation
### Dependenceis:
  * IRIDA 20.01 (It may work in other versions)
  * Galaxy >= 16.01
  * Shovill 
  * CheckM
  * MLST
 

### Installation:
  * Install required tools in IRIDA-galaxy
  * Download the listeria_typing_pipeline-0.1.1.jar file 
  * copy the file into "plugins" directory in IRIDA installation
  * Restart IRIDA (Tomcat).  

### Galaxy workflow
![Plugin in IRIDA](Galaxy_WorkFlow.png?raw=true "Title")


### Pipeline in IRIDA
![Plugin in IRIDA](Pipeline.png?raw=true "Title")

### Parameters
![Plugin in IRIDA](Parameters.png?raw=true "Title")


