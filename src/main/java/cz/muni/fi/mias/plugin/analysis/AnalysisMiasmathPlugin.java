package cz.muni.fi.mias.plugin.analysis;

import cz.muni.fi.mias.MathTokenizerFactory;
import org.elasticsearch.index.analysis.TokenizerFactory;
import org.elasticsearch.indices.analysis.AnalysisModule;
import org.elasticsearch.plugins.AnalysisPlugin;
import org.elasticsearch.plugins.Plugin;

import java.util.HashMap;
import java.util.Map;

public class AnalysisMiasmathPlugin extends Plugin implements AnalysisPlugin {

    public Map<String, AnalysisModule.AnalysisProvider<TokenizerFactory>> getTokenizers() {
        Map<String, AnalysisModule.AnalysisProvider<TokenizerFactory>> extra = new HashMap<>();

        extra.put("miasmath-tokenizer", MathTokenizerFactory::getMathTokenizerFactory);

        return extra;
    }
}
