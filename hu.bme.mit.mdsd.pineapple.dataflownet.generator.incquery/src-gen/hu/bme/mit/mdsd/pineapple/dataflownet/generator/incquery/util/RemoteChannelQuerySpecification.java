package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelMatcher;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.TopLevelElementQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RemoteChannelMatcher in a type-safe way.
 * 
 * @see RemoteChannelMatcher
 * @see RemoteChannelMatch
 * 
 */
@SuppressWarnings("all")
public final class RemoteChannelQuerySpecification extends BaseGeneratedQuerySpecification<RemoteChannelMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RemoteChannelQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected RemoteChannelMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RemoteChannelMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannel";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("channel");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("channel", "dataflownet.Channel"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_channel = body.getOrCreateVariableByName("channel");
      PVariable var__dataflowSystem = body.getOrCreateVariableByName("_dataflowSystem");
      PVariable var_outDataflowNet = body.getOrCreateVariableByName("outDataflowNet");
      PVariable var_inDataflowNet = body.getOrCreateVariableByName("inDataflowNet");
      PVariable var_topLevelOutDataflowNet = body.getOrCreateVariableByName("topLevelOutDataflowNet");
      PVariable var_topLevelInDataflowNet = body.getOrCreateVariableByName("topLevelInDataflowNet");
      PVariable var_process1 = body.getOrCreateVariableByName("process1");
      PVariable var_process2 = body.getOrCreateVariableByName("process2");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_channel, "channel")
      ));
      
      new TypeBinary(body, context, var__dataflowSystem, var_channel, getFeatureLiteral("http://dataflownet/1.0", "DataflowSystem", "channels"), "http://dataflownet/1.0/DataflowSystem.channels");
      new TypeBinary(body, context, var_outDataflowNet, var_channel, getFeatureLiteral("http://dataflownet/1.0", "DataflowNet", "outputChannels"), "http://dataflownet/1.0/DataflowNet.outputChannels");
      new TypeBinary(body, context, var_inDataflowNet, var_channel, getFeatureLiteral("http://dataflownet/1.0", "DataflowNet", "inputChannels"), "http://dataflownet/1.0/DataflowNet.inputChannels");
      new PositivePatternCall(body, new FlatTuple(var_outDataflowNet, var_topLevelOutDataflowNet), TopLevelElementQuerySpecification.instance());
      new PositivePatternCall(body, new FlatTuple(var_inDataflowNet, var_topLevelInDataflowNet), TopLevelElementQuerySpecification.instance());
      new TypeBinary(body, context, var_topLevelInDataflowNet, var_process1, getFeatureLiteral("http://dataflownet/1.0", "DataflowNet", "process"), "http://dataflownet/1.0/DataflowNet.process");
      new TypeBinary(body, context, var_topLevelOutDataflowNet, var_process2, getFeatureLiteral("http://dataflownet/1.0", "DataflowNet", "process"), "http://dataflownet/1.0/DataflowNet.process");
      new Inequality(body, var_process1, var_process2);
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private RemoteChannelQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<RemoteChannelQuerySpecification> {
    @Override
    public RemoteChannelQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static RemoteChannelQuerySpecification INSTANCE = make();
    
    public static RemoteChannelQuerySpecification make() {
      try {
      	return new RemoteChannelQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
