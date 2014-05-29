package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.ParentQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.context.EMFPatternMatcherContext;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate TopLevelElementMatcher in a type-safe way.
 * 
 * @see TopLevelElementMatcher
 * @see TopLevelElementMatch
 * 
 */
@SuppressWarnings("all")
final class TopLevelElementQuerySpecification extends BaseGeneratedQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TopLevelElementQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected IncQueryMatcher<IPatternMatch> instantiate(final IncQueryEngine engine) throws IncQueryException {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.topLevelElement";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("n1","n2");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("n1", "dataflownet.Node"),new PParameter("n2", "dataflownet.Node"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_n1 = body.getOrCreateVariableByName("n1");
      PVariable var_n2 = body.getOrCreateVariableByName("n2");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_n1, "n1"), 
        new ExportedParameter(body, var_n2, "n2")
      ));
      
      new TypeUnary(body, var_n1, getClassifierLiteral("http://dataflownet/1.0", "Node"), "http://dataflownet/1.0/Node");
      
      new TypeUnary(body, var_n2, getClassifierLiteral("http://dataflownet/1.0", "Node"), "http://dataflownet/1.0/Node");
      new BinaryTransitiveClosure(body, new FlatTuple(var_n1, var_n2), ParentQuerySpecification.instance().instance());
      bodies.add(body);
    }{
      PBody body = new PBody(this);
      PVariable var_n2 = body.getOrCreateVariableByName("n2");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_n2, "n1"), 
        new ExportedParameter(body, var_n2, "n2")
      ));
      
      new TypeUnary(body, var_n2, getClassifierLiteral("http://dataflownet/1.0", "Node"), "http://dataflownet/1.0/Node");
      
      bodies.add(body);
    }setStatus(PQuery.PQueryStatus.OK);
    return bodies;
  }
  
  private TopLevelElementQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQuery.PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TopLevelElementQuerySpecification INSTANCE = make();
    
    public static TopLevelElementQuerySpecification make() {
      try {
      	return new TopLevelElementQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
