package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelOutputFiringRuleMatcher;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.ParentQuerySpecification;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.RemoteChannelQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.context.EMFPatternMatcherContext;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RemoteChannelOutputFiringRuleMatcher in a type-safe way.
 * 
 * @see RemoteChannelOutputFiringRuleMatcher
 * @see RemoteChannelOutputFiringRuleMatch
 * 
 */
@SuppressWarnings("all")
public final class RemoteChannelOutputFiringRuleQuerySpecification extends BaseGeneratedQuerySpecification<RemoteChannelOutputFiringRuleMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RemoteChannelOutputFiringRuleQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected RemoteChannelOutputFiringRuleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RemoteChannelOutputFiringRuleMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannelOutputFiringRule";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("firingRule");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("firingRule", "dataflownet.FiringRule"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_firingRule = body.getOrCreateVariableByName("firingRule");
      PVariable var_channel = body.getOrCreateVariableByName("channel");
      PVariable var_stateMachine = body.getOrCreateVariableByName("stateMachine");
      PVariable var_referrerDataflowNet = body.getOrCreateVariableByName("referrerDataflowNet");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_firingRule, "firingRule")
      ));
      
      new PositivePatternCall(body, new FlatTuple(var_channel), RemoteChannelQuerySpecification.instance());
      new TypeBinary(body, context, var_firingRule, var_channel, getFeatureLiteral("http://dataflownet/1.0", "FiringRule", "channel"), "http://dataflownet/1.0/FiringRule.channel");
      new TypeBinary(body, context, var_stateMachine, var_firingRule, getFeatureLiteral("http://dataflownet/1.0", "StateMachine", "firingRules"), "http://dataflownet/1.0/StateMachine.firingRules");
      new BinaryTransitiveClosure(body, new FlatTuple(var_stateMachine, var_referrerDataflowNet), ParentQuerySpecification.instance().instance());
      new TypeBinary(body, context, var_referrerDataflowNet, var_channel, getFeatureLiteral("http://dataflownet/1.0", "DataflowNet", "outputChannels"), "http://dataflownet/1.0/DataflowNet.outputChannels");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private RemoteChannelOutputFiringRuleQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<RemoteChannelOutputFiringRuleQuerySpecification> {
    @Override
    public RemoteChannelOutputFiringRuleQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static RemoteChannelOutputFiringRuleQuerySpecification INSTANCE = make();
    
    public static RemoteChannelOutputFiringRuleQuerySpecification make() {
      try {
      	return new RemoteChannelOutputFiringRuleQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
