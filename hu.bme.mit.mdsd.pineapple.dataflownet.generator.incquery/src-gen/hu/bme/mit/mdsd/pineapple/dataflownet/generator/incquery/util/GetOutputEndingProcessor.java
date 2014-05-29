package hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.util;

import dataflownet.Channel;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.GetOutputEndingMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.getOutputEnding pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class GetOutputEndingProcessor implements IMatchProcessor<GetOutputEndingMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pChannel the value of pattern parameter channel in the currently processed match
   * @param pProcess the value of pattern parameter process in the currently processed match
   * 
   */
  public abstract void process(final Channel pChannel, final dataflownet.Process pProcess);
  
  @Override
  public void process(final GetOutputEndingMatch match) {
    process(match.getChannel(), match.getProcess());
    
  }
}
