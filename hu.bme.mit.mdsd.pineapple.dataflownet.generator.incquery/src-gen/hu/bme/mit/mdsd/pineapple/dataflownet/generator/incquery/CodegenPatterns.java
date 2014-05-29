package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery;

import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.GetInputEndingMatcher;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.GetOutputEndingMatcher;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelInputFiringRuleMatcher;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelMatcher;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelOutputFiringRuleMatcher;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.GetInputEndingQuerySpecification;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.GetOutputEndingQuerySpecification;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.RemoteChannelInputFiringRuleQuerySpecification;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.RemoteChannelOutputFiringRuleQuerySpecification;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.RemoteChannelQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in codegenPatterns.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file codegenPatterns.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery, the group contains the definition of the following patterns: <ul>
 * <li>getInputEnding</li>
 * <li>getOutputEnding</li>
 * <li>remoteChannelOutputFiringRule</li>
 * <li>remoteChannelInputFiringRule</li>
 * <li>remoteChannel</li>
 * <li>topLevelElement</li>
 * <li>parent</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class CodegenPatterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static CodegenPatterns instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new CodegenPatterns();
    }
    return INSTANCE;
    
  }
  
  private static CodegenPatterns INSTANCE;
  
  private CodegenPatterns() throws IncQueryException {
    querySpecifications.add(GetInputEndingQuerySpecification.instance());
    querySpecifications.add(GetOutputEndingQuerySpecification.instance());
    querySpecifications.add(RemoteChannelOutputFiringRuleQuerySpecification.instance());
    querySpecifications.add(RemoteChannelInputFiringRuleQuerySpecification.instance());
    querySpecifications.add(RemoteChannelQuerySpecification.instance());
    
  }
  
  public GetInputEndingQuerySpecification getGetInputEnding() throws IncQueryException {
    return GetInputEndingQuerySpecification.instance();
  }
  
  public GetInputEndingMatcher getGetInputEnding(final IncQueryEngine engine) throws IncQueryException {
    return GetInputEndingMatcher.on(engine);
  }
  
  public GetOutputEndingQuerySpecification getGetOutputEnding() throws IncQueryException {
    return GetOutputEndingQuerySpecification.instance();
  }
  
  public GetOutputEndingMatcher getGetOutputEnding(final IncQueryEngine engine) throws IncQueryException {
    return GetOutputEndingMatcher.on(engine);
  }
  
  public RemoteChannelOutputFiringRuleQuerySpecification getRemoteChannelOutputFiringRule() throws IncQueryException {
    return RemoteChannelOutputFiringRuleQuerySpecification.instance();
  }
  
  public RemoteChannelOutputFiringRuleMatcher getRemoteChannelOutputFiringRule(final IncQueryEngine engine) throws IncQueryException {
    return RemoteChannelOutputFiringRuleMatcher.on(engine);
  }
  
  public RemoteChannelInputFiringRuleQuerySpecification getRemoteChannelInputFiringRule() throws IncQueryException {
    return RemoteChannelInputFiringRuleQuerySpecification.instance();
  }
  
  public RemoteChannelInputFiringRuleMatcher getRemoteChannelInputFiringRule(final IncQueryEngine engine) throws IncQueryException {
    return RemoteChannelInputFiringRuleMatcher.on(engine);
  }
  
  public RemoteChannelQuerySpecification getRemoteChannel() throws IncQueryException {
    return RemoteChannelQuerySpecification.instance();
  }
  
  public RemoteChannelMatcher getRemoteChannel(final IncQueryEngine engine) throws IncQueryException {
    return RemoteChannelMatcher.on(engine);
  }
}
