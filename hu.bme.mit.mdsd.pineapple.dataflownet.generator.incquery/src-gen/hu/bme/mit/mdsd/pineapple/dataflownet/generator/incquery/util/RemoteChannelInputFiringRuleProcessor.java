package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util;

import dataflownet.FiringRule;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelInputFiringRuleMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannelInputFiringRule pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RemoteChannelInputFiringRuleProcessor implements IMatchProcessor<RemoteChannelInputFiringRuleMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFiringRule the value of pattern parameter firingRule in the currently processed match
   * 
   */
  public abstract void process(final FiringRule pFiringRule);
  
  @Override
  public void process(final RemoteChannelInputFiringRuleMatch match) {
    process(match.getFiringRule());
    
  }
}
