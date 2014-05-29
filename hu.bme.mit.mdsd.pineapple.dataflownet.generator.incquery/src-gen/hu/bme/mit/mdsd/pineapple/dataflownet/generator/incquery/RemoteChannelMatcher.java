package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery;

import dataflownet.Channel;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelMatch;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.RemoteChannelQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannel pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RemoteChannelMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern remoteChannel(channel: Channel){
 * 	DataflowSystem.channels(_dataflowSystem,channel);
 * 	DataflowNet.outputChannels(outDataflowNet,channel);
 * 	DataflowNet.inputChannels(inDataflowNet,channel);
 * 	find topLevelElement(outDataflowNet,topLevelOutDataflowNet);
 * 	find topLevelElement(inDataflowNet,topLevelInDataflowNet);
 * 	DataflowNet.process(topLevelInDataflowNet,process1);
 * 	DataflowNet.process(topLevelOutDataflowNet,process2);
 * 	process1 != process2;
 * }
 * </pre></code>
 * 
 * @see RemoteChannelMatch
 * @see RemoteChannelProcessor
 * @see RemoteChannelQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RemoteChannelMatcher extends BaseMatcher<RemoteChannelMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<RemoteChannelMatcher> querySpecification() throws IncQueryException {
    return RemoteChannelQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RemoteChannelMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    RemoteChannelMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new RemoteChannelMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CHANNEL = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(RemoteChannelMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public RemoteChannelMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public RemoteChannelMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @return matches represented as a RemoteChannelMatch object.
   * 
   */
  public Collection<RemoteChannelMatch> getAllMatches(final Channel pChannel) {
    return rawGetAllMatches(new Object[]{pChannel});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @return a match represented as a RemoteChannelMatch object, or null if no match is found.
   * 
   */
  public RemoteChannelMatch getOneArbitraryMatch(final Channel pChannel) {
    return rawGetOneArbitraryMatch(new Object[]{pChannel});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Channel pChannel) {
    return rawHasMatch(new Object[]{pChannel});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Channel pChannel) {
    return rawCountMatches(new Object[]{pChannel});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Channel pChannel, final IMatchProcessor<? super RemoteChannelMatch> processor) {
    rawForEachMatch(new Object[]{pChannel}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Channel pChannel, final IMatchProcessor<? super RemoteChannelMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pChannel}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<RemoteChannelMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Channel pChannel) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pChannel});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RemoteChannelMatch newMatch(final Channel pChannel) {
    return new RemoteChannelMatch.Immutable(pChannel);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for channel.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Channel> rawAccumulateAllValuesOfchannel(final Object[] parameters) {
    Set<Channel> results = new HashSet<Channel>();
    rawAccumulateAllValues(POSITION_CHANNEL, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for channel.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Channel> getAllValuesOfchannel() {
    return rawAccumulateAllValuesOfchannel(emptyArray());
  }
  
  @Override
  protected RemoteChannelMatch tupleToMatch(final Tuple t) {
    try {
      return new RemoteChannelMatch.Immutable((dataflownet.Channel) t.get(POSITION_CHANNEL));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected RemoteChannelMatch arrayToMatch(final Object[] match) {
    try {
      return new RemoteChannelMatch.Immutable((dataflownet.Channel) match[POSITION_CHANNEL]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected RemoteChannelMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new RemoteChannelMatch.Mutable((dataflownet.Channel) match[POSITION_CHANNEL]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
