package ca.corefacility.bioinformatics.irida.plugins;

import java.awt.Color;
import java.util.Optional;
import java.util.UUID;

import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import ca.corefacility.bioinformatics.irida.model.workflow.analysis.type.AnalysisType;
import ca.corefacility.bioinformatics.irida.pipeline.results.updater.AnalysisSampleUpdater;
import ca.corefacility.bioinformatics.irida.service.sample.MetadataTemplateService;
import ca.corefacility.bioinformatics.irida.service.sample.SampleService;
import ca.corefacility.bioinformatics.irida.service.workflow.IridaWorkflowsService;

/**
 * An example {@link IridaPlugin} implementation which will extract some
 * information from the sequencing reads.
 */
public class LMPlugin extends Plugin {

	public static final AnalysisType listeria_typing_pipeline = new AnalysisType("listeria_typing_pipeline");

	public LMPlugin(PluginWrapper wrapper) {
		super(wrapper);
	}

	@Extension
	public static class PluginInfo implements IridaPlugin {

		@Override
		public AnalysisType getAnalysisType() {
			return listeria_typing_pipeline;
		}

		@Override
		public UUID getDefaultWorkflowUUID() {
			return UUID.fromString("995c830e-b126-45b1-9020-80bafcdc6374");
		}

		@Override
		public Optional<Color> getBackgroundColor() {
			return Optional.of(Color.decode("#8E44AD"));
		}

		@Override
		public Optional<Color> getTextColor() {
			return Optional.of(Color.BLACK);
		}

        /**
		* @Override
		* public Optional<AnalysisSampleUpdater> getUpdater(MetadataTemplateService metadataTemplateService,
		*		SampleService sampleService, IridaWorkflowsService iridaWorkflowsService) throws IridaPluginException {
		*	return Optional.of(new ExamplePluginUpdater(metadataTemplateService, sampleService, iridaWorkflowsService));
		* }
        */
	}
}
