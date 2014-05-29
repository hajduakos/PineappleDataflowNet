package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery;

import dataflownet.FiringRule;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.RemoteChannelInputFiringRuleQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannelInputFiringRule pattern,
 * to be used in conjunction with {@link RemoteChannelInputFiringRuleMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RemoteChannelInputFiringRuleMatcher
 * @see RemoteChannelInputFiringRuleProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RemoteChannelInputFiringRuleMatch extends BasePatternMatch {
  private FiringRule fFiringRule;
  
  private static List<String> parameterNames = makeImmutableList("firingRule");
  
  private RemoteChannelInputFiringRuleMatch(final FiringRule pFiringRule) {
    this.fFiringRule = pFiringRule;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("firingRule".equals(parameterName)) return this.fFiringRule;
    return null;
    
  }
  
  public FiringRule getFiringRule() {
    return this.fFiringRule;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("firingRule".equals(parameterName) ) {
    	this.fFiringRule = (dataflownet.FiringRule) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setFiringRule(final FiringRule pFiringRule) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fFiringRule = pFiringRule;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannelInputFiringRule";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return RemoteChannelInputFiringRuleMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fFiringRule};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"firingRule\"=" + prettyPrintValue(fFiringRule));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fFiringRule == null) ? 0 : fFiringRule.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RemoteChannelInputFiringRuleMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    RemoteChannelInputFiringRuleMatch other = (RemoteChannelInputFiringRuleMatch) obj;
    if (fFiringRule == null) {if (other.fFiringRule != null) return false;}
    else if (!fFiringRule.equals(other.fFiringRule)) return false;
    return true;
  }
  
  @Override
  public RemoteChannelInputFiringRuleQuerySpecification specification() {
    try {
    	return RemoteChannelInputFiringRuleQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends RemoteChannelInputFiringRuleMatch {
    Mutable(final FiringRule pFiringRule) {
      super(pFiringRule);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends RemoteChannelInputFiringRuleMatch {
    Immutable(final FiringRule pFiringRule) {
      super(pFiringRule);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
