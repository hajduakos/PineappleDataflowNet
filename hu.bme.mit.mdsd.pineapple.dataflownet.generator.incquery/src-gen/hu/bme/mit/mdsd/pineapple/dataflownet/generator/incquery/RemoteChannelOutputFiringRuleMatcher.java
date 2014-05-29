package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery;

import dataflownet.FiringRule;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelOutputFiringRuleMatch;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util.RemoteChannelOutputFiringRuleQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannelOutputFiringRule pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RemoteChannelOutputFiringRuleMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern remoteChannelOutputFiringRule(firingRule : FiringRule) {
 * 	find remoteChannel(channel);
 * 	FiringRule.channel(firingRule,channel);
 * 	StateMachine.firingRules(stateMachine,firingRule);
 * 	find parent+(stateMachine,referrerDataflowNet);
 * 	DataflowNet.outputChannels(referrerDataflowNet,channel);
 * }
 * </pre></code>
 * 
 * @see RemoteChannelOutputFiringRuleMatch
 * @see RemoteChannelOutputFiringRuleProcessor
 * @see RemoteChannelOutputFiringRuleQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RemoteChannelOutputFiringRuleMatcher extends BaseMatcher<RemoteChannelOutputFiringRuleMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<RemoteChannelOutputFiringRuleMatcher> querySpecification() throws IncQueryException {
    return RemoteChannelOutputFiringRuleQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RemoteChannelOutputFiringRuleMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    RemoteChannelOutputFiringRuleMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new RemoteChannelOutputFiringRuleMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_FIRINGRULE = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(RemoteChannelOutputFiringRuleMatcher.class);
  
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
  public RemoteChannelOutputFiringRuleMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public RemoteChannelOutputFiringRuleMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFiringRule the fixed value of pattern parameter firingRule, or null if not bound.
   * @return matches represented as a RemoteChannelOutputFiringRuleMatch object.
   * 
   */
  public Collection<RemoteChannelOutputFiringRuleMatch> getAllMatches(final FiringRule pFiringRule) {
    return rawGetAllMatches(new Object[]{pFiringRule});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFiringRule the fixed value of pattern parameter firingRule, or null if not bound.
   * @return a match represented as a RemoteChannelOutputFiringRuleMatch object, or null if no match is found.
   * 
   */
  public RemoteChannelOutputFiringRuleMatch getOneArbitraryMatch(final FiringRule pFiringRule) {
    return rawGetOneArbitraryMatch(new Object[]{pFiringRule});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pFiringRule the fixed value of pattern parameter firingRule, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final FiringRule pFiringRule) {
    return rawHasMatch(new Object[]{pFiringRule});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFiringRule the fixed value of pattern parameter firingRule, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final FiringRule pFiringRule) {
    return rawCountMatches(new Object[]{pFiringRule});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pFiringRule the fixed value of pattern parameter firingRule, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final FiringRule pFiringRule, final IMatchProcessor<? super RemoteChannelOutputFiringRuleMatch> processor) {
    rawForEachMatch(new Object[]{pFiringRule}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFiringRule the fixed value of pattern parameter firingRule, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final FiringRule pFiringRule, final IMatchProcessor<? super RemoteChannelOutputFiringRuleMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pFiringRule}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pFiringRule the fixed value of pattern parameter firingRule, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<RemoteChannelOutputFiringRuleMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final FiringRule pFiringRule) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pFiringRule});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pFiringRule the fixed value of pattern parameter firingRule, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RemoteChannelOutputFiringRuleMatch newMatch(final FiringRule pFiringRule) {
    return new RemoteChannelOutputFiringRuleMatch.Immutable(pFiringRule);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for firingRule.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<FiringRule> rawAccumulateAllValuesOffiringRule(final Object[] parameters) {
    Set<FiringRule> results = new HashSet<FiringRule>();
    rawAccumulateAllValues(POSITION_FIRINGRULE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for firingRule.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<FiringRule> getAllValuesOffiringRule() {
    return rawAccumulateAllValuesOffiringRule(emptyArray());
  }
  
  @Override
  protected RemoteChannelOutputFiringRuleMatch tupleToMatch(final Tuple t) {
    try {
      return new RemoteChannelOutputFiringRuleMatch.Immutable((dataflownet.FiringRule) t.get(POSITION_FIRINGRULE));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected RemoteChannelOutputFiringRuleMatch arrayToMatch(final Object[] match) {
    try {
      return new RemoteChannelOutputFiringRuleMatch.Immutable((dataflownet.FiringRule) match[POSITION_FIRINGRULE]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected RemoteChannelOutputFiringRuleMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new RemoteChannelOutputFiringRuleMatch.Mutable((dataflownet.FiringRule) match[POSITION_FIRINGRULE]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
