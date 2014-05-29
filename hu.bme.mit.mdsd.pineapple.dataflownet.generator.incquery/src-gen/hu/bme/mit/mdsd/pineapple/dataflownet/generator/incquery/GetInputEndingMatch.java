package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery;

import dataflownet.Channel;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.GetInputEndingQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.getInputEnding pattern,
 * to be used in conjunction with {@link GetInputEndingMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see GetInputEndingMatcher
 * @see GetInputEndingProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class GetInputEndingMatch extends BasePatternMatch {
  private Channel fChannel;
  
  private dataflownet.Process fProcess;
  
  private static List<String> parameterNames = makeImmutableList("channel", "process");
  
  private GetInputEndingMatch(final Channel pChannel, final dataflownet.Process pProcess) {
    this.fChannel = pChannel;
    this.fProcess = pProcess;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("channel".equals(parameterName)) return this.fChannel;
    if ("process".equals(parameterName)) return this.fProcess;
    return null;
    
  }
  
  public Channel getChannel() {
    return this.fChannel;
    
  }
  
  public dataflownet.Process getProcess() {
    return this.fProcess;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("channel".equals(parameterName) ) {
    	this.fChannel = (dataflownet.Channel) newValue;
    	return true;
    }
    if ("process".equals(parameterName) ) {
    	this.fProcess = (dataflownet.Process) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setChannel(final Channel pChannel) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChannel = pChannel;
    
  }
  
  public void setProcess(final dataflownet.Process pProcess) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fProcess = pProcess;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.getInputEnding";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return GetInputEndingMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fChannel, fProcess};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"channel\"=" + prettyPrintValue(fChannel) + ", ");
    result.append("\"process\"=" + prettyPrintValue(fProcess));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fChannel == null) ? 0 : fChannel.hashCode());
    result = prime * result + ((fProcess == null) ? 0 : fProcess.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof GetInputEndingMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    GetInputEndingMatch other = (GetInputEndingMatch) obj;
    if (fChannel == null) {if (other.fChannel != null) return false;}
    else if (!fChannel.equals(other.fChannel)) return false;
    if (fProcess == null) {if (other.fProcess != null) return false;}
    else if (!fProcess.equals(other.fProcess)) return false;
    return true;
  }
  
  @Override
  public GetInputEndingQuerySpecification specification() {
    try {
    	return GetInputEndingQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends GetInputEndingMatch {
    Mutable(final Channel pChannel, final dataflownet.Process pProcess) {
      super(pChannel, pProcess);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends GetInputEndingMatch {
    Immutable(final Channel pChannel, final dataflownet.Process pProcess) {
      super(pChannel, pProcess);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
