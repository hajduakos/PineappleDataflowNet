package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery;

import dataflownet.Channel;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.RemoteChannelQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannel pattern,
 * to be used in conjunction with {@link RemoteChannelMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RemoteChannelMatcher
 * @see RemoteChannelProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RemoteChannelMatch extends BasePatternMatch {
  private Channel fChannel;
  
  private static List<String> parameterNames = makeImmutableList("channel");
  
  private RemoteChannelMatch(final Channel pChannel) {
    this.fChannel = pChannel;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("channel".equals(parameterName)) return this.fChannel;
    return null;
    
  }
  
  public Channel getChannel() {
    return this.fChannel;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("channel".equals(parameterName) ) {
    	this.fChannel = (dataflownet.Channel) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setChannel(final Channel pChannel) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChannel = pChannel;
    
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannel";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return RemoteChannelMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fChannel};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"channel\"=" + prettyPrintValue(fChannel));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fChannel == null) ? 0 : fChannel.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RemoteChannelMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    RemoteChannelMatch other = (RemoteChannelMatch) obj;
    if (fChannel == null) {if (other.fChannel != null) return false;}
    else if (!fChannel.equals(other.fChannel)) return false;
    return true;
  }
  
  @Override
  public RemoteChannelQuerySpecification specification() {
    try {
    	return RemoteChannelQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends RemoteChannelMatch {
    Mutable(final Channel pChannel) {
      super(pChannel);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends RemoteChannelMatch {
    Immutable(final Channel pChannel) {
      super(pChannel);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
