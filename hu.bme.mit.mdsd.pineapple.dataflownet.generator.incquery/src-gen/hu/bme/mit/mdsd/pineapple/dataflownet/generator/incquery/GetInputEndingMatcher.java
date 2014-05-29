package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery;

import dataflownet.Channel;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.GetInputEndingMatch;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.GetInputEndingQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.getInputEnding pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link GetInputEndingMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern getInputEnding(channel : Channel, process : Process) {
 * 	find remoteChannel(channel);
 * 	DataflowNet.inputChannels(dataflowNet,channel);
 * 	DataflowNet.process(dataflowNet,process);
 * }
 * </pre></code>
 * 
 * @see GetInputEndingMatch
 * @see GetInputEndingProcessor
 * @see GetInputEndingQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class GetInputEndingMatcher extends BaseMatcher<GetInputEndingMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<GetInputEndingMatcher> querySpecification() throws IncQueryException {
    return GetInputEndingQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static GetInputEndingMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    GetInputEndingMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new GetInputEndingMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CHANNEL = 0;
  
  private final static int POSITION_PROCESS = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(GetInputEndingMatcher.class);
  
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
  public GetInputEndingMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public GetInputEndingMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param pProcess the fixed value of pattern parameter process, or null if not bound.
   * @return matches represented as a GetInputEndingMatch object.
   * 
   */
  public Collection<GetInputEndingMatch> getAllMatches(final Channel pChannel, final dataflownet.Process pProcess) {
    return rawGetAllMatches(new Object[]{pChannel, pProcess});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param pProcess the fixed value of pattern parameter process, or null if not bound.
   * @return a match represented as a GetInputEndingMatch object, or null if no match is found.
   * 
   */
  public GetInputEndingMatch getOneArbitraryMatch(final Channel pChannel, final dataflownet.Process pProcess) {
    return rawGetOneArbitraryMatch(new Object[]{pChannel, pProcess});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param pProcess the fixed value of pattern parameter process, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Channel pChannel, final dataflownet.Process pProcess) {
    return rawHasMatch(new Object[]{pChannel, pProcess});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param pProcess the fixed value of pattern parameter process, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Channel pChannel, final dataflownet.Process pProcess) {
    return rawCountMatches(new Object[]{pChannel, pProcess});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param pProcess the fixed value of pattern parameter process, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Channel pChannel, final dataflownet.Process pProcess, final IMatchProcessor<? super GetInputEndingMatch> processor) {
    rawForEachMatch(new Object[]{pChannel, pProcess}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param pProcess the fixed value of pattern parameter process, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Channel pChannel, final dataflownet.Process pProcess, final IMatchProcessor<? super GetInputEndingMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pChannel, pProcess}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param pProcess the fixed value of pattern parameter process, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<GetInputEndingMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Channel pChannel, final dataflownet.Process pProcess) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pChannel, pProcess});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pChannel the fixed value of pattern parameter channel, or null if not bound.
   * @param pProcess the fixed value of pattern parameter process, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public GetInputEndingMatch newMatch(final Channel pChannel, final dataflownet.Process pProcess) {
    return new GetInputEndingMatch.Immutable(pChannel, pProcess);
    
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
  
  /**
   * Retrieve the set of values that occur in matches for channel.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Channel> getAllValuesOfchannel(final GetInputEndingMatch partialMatch) {
    return rawAccumulateAllValuesOfchannel(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for channel.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Channel> getAllValuesOfchannel(final dataflownet.Process pProcess) {
    return rawAccumulateAllValuesOfchannel(new Object[]{null, pProcess});
  }
  
  /**
   * Retrieve the set of values that occur in matches for process.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<dataflownet.Process> rawAccumulateAllValuesOfprocess(final Object[] parameters) {
    Set<dataflownet.Process> results = new HashSet<dataflownet.Process>();
    rawAccumulateAllValues(POSITION_PROCESS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for process.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<dataflownet.Process> getAllValuesOfprocess() {
    return rawAccumulateAllValuesOfprocess(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for process.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<dataflownet.Process> getAllValuesOfprocess(final GetInputEndingMatch partialMatch) {
    return rawAccumulateAllValuesOfprocess(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for process.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<dataflownet.Process> getAllValuesOfprocess(final Channel pChannel) {
    return rawAccumulateAllValuesOfprocess(new Object[]{pChannel, null});
  }
  
  @Override
  protected GetInputEndingMatch tupleToMatch(final Tuple t) {
    try {
      return new GetInputEndingMatch.Immutable((dataflownet.Channel) t.get(POSITION_CHANNEL), (dataflownet.Process) t.get(POSITION_PROCESS));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected GetInputEndingMatch arrayToMatch(final Object[] match) {
    try {
      return new GetInputEndingMatch.Immutable((dataflownet.Channel) match[POSITION_CHANNEL], (dataflownet.Process) match[POSITION_PROCESS]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected GetInputEndingMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new GetInputEndingMatch.Mutable((dataflownet.Channel) match[POSITION_CHANNEL], (dataflownet.Process) match[POSITION_PROCESS]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
