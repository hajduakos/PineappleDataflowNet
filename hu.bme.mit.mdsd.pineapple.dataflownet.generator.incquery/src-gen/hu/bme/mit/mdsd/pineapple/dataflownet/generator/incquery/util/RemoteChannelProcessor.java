package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util;

import dataflownet.Channel;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.remoteChannel pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RemoteChannelProcessor implements IMatchProcessor<RemoteChannelMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pChannel the value of pattern parameter channel in the currently processed match
   * 
   */
  public abstract void process(final Channel pChannel);
  
  @Override
  public void process(final RemoteChannelMatch match) {
    process(match.getChannel());
    
  }
}
