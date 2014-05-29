package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.GetInputEndingMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate GetInputEndingMatcher in a type-safe way.
 * 
 * @see GetInputEndingMatcher
 * @see GetInputEndingMatch
 * 
 */
@SuppressWarnings("all")
public final class GetInputEndingQuerySpecification extends BaseGeneratedQuerySpecification<GetInputEndingMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static GetInputEndingQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected GetInputEndingMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return GetInputEndingMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.getInputEnding";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("channel","process");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("channel", "dataflownet.Channel"),new PParameter("process", "dataflownet.Process"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_channel = body.getOrCreateVariableByName("channel");
      PVariable var_process = body.getOrCreateVariableByName("process");
      PVariable var_dataflowNet = body.getOrCreateVariableByName("dataflowNet");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_channel, "channel"), 
        new ExportedParameter(body, var_process, "process")
      ));
      
      
      new PositivePatternCall(body, new FlatTuple(var_channel), RemoteChannelQuerySpecification.instance());
      new TypeBinary(body, context, var_dataflowNet, var_channel, getFeatureLiteral("http://dataflownet/1.0", "DataflowNet", "inputChannels"), "http://dataflownet/1.0/DataflowNet.inputChannels");
      new TypeBinary(body, context, var_dataflowNet, var_process, getFeatureLiteral("http://dataflownet/1.0", "DataflowNet", "process"), "http://dataflownet/1.0/DataflowNet.process");
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private GetInputEndingQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<GetInputEndingQuerySpecification> {
    @Override
    public GetInputEndingQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static GetInputEndingQuerySpecification INSTANCE = make();
    
    public static GetInputEndingQuerySpecification make() {
      try {
      	return new GetInputEndingQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
