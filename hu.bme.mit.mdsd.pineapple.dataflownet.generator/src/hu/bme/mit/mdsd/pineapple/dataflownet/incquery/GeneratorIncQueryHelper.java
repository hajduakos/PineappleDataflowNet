package hu.bme.mit.mdsd.pineapple.dataflownet.incquery;

import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.CodegenPatterns;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelInputFiringRuleMatch;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelMatch;
import hu.bme.mit.mdsd.pineapple.dataflownet.generator.incquery.RemoteChannelOutputFiringRuleMatch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;

import dataflownet.Channel;
import dataflownet.DataflowSystem;
import dataflownet.FiringRule;
import dataflownet.Process;

public class GeneratorIncQueryHelper {
	
	public static List<Channel> getRemoteChannels(DataflowSystem ds){
		List<Channel> channels = new ArrayList<>();
		
		IncQueryEngine engine = null;
        try {
            engine = IncQueryEngine.on(ds);
        } catch (IncQueryException e) {
           
        }
        
        CodegenPatterns patterns = null;
        
        try {
			patterns = CodegenPatterns.instance();
		} catch (IncQueryException e) {
			
		}
        
        try {
			Collection<RemoteChannelMatch> allMatches = patterns.getRemoteChannel(engine).getAllMatches();
			for (RemoteChannelMatch remoteChannelMatch : allMatches) {
				channels.add(remoteChannelMatch.getChannel());
			}
		} catch (IncQueryException e) {
			
		}
        
        return channels;
	}
	
	public static Set<FiringRule> getRemoteChannelInputFiringRules(DataflowSystem ds){
		Set<FiringRule> firingRules = new HashSet<>();
		
		IncQueryEngine engine = null;
        try {
            engine = IncQueryEngine.on(ds);
        } catch (IncQueryException e) {
           
        }
        
        CodegenPatterns patterns = null;
        
        try {
			patterns = CodegenPatterns.instance();
		} catch (IncQueryException e) {
			
		}
        
        try {
			Collection<RemoteChannelInputFiringRuleMatch> ruleMatches = patterns.getRemoteChannelInputFiringRule(engine).getAllMatches();
			for (RemoteChannelInputFiringRuleMatch remoteChannelInputFiringRuleMatch : ruleMatches) {
				firingRules.add(remoteChannelInputFiringRuleMatch.getFiringRule());
			}
		} catch (IncQueryException e) {
			
		}
		
		return firingRules;
	}
	
	public static Set<FiringRule> getRemoteChannelOutputFiringRules(DataflowSystem ds){
		Set<FiringRule> firingRules = new HashSet<>();
		
		IncQueryEngine engine = null;
        try {
            engine = IncQueryEngine.on(ds);
        } catch (IncQueryException e) {
           
        }
        
        CodegenPatterns patterns = null;
        
        try {
			patterns = CodegenPatterns.instance();
		} catch (IncQueryException e) {
			
		}
        
        try {
			Collection<RemoteChannelOutputFiringRuleMatch> ruleMatches = patterns.getRemoteChannelOutputFiringRule(engine).getAllMatches();
			for (RemoteChannelOutputFiringRuleMatch remoteChannelOutputFiringRuleMatch : ruleMatches) {
				firingRules.add(remoteChannelOutputFiringRuleMatch.getFiringRule());
			}
		} catch (IncQueryException e) {
			
		}
		
		return firingRules;
	}
	
	public static Process getRemoteInputEnding(DataflowSystem ds, Channel channel){
		Process p = null;
		
		IncQueryEngine engine = null;
        try {
            engine = IncQueryEngine.on(ds);
        } catch (IncQueryException e) {
           
        }
        
        CodegenPatterns patterns = null;
        
        try {
			patterns = CodegenPatterns.instance();
		} catch (IncQueryException e) {
			
		}
        
        try {
			p = patterns.getGetInputEnding(engine).getAllValuesOfprocess(channel).iterator().next();
		} catch (IncQueryException e) {
			
		}
        
        return p;
	}
	
	public static Process getRemoteOutputEnding(DataflowSystem ds, Channel channel){
		Process p = null;
		
		IncQueryEngine engine = null;
        try {
            engine = IncQueryEngine.on(ds);
        } catch (IncQueryException e) {
           
        }
        
        CodegenPatterns patterns = null;
        
        try {
			patterns = CodegenPatterns.instance();
		} catch (IncQueryException e) {
			
		}
        
        try {
			p = patterns.getGetOutputEnding(engine).getAllValuesOfprocess(channel).iterator().next();
		} catch (IncQueryException e) {
			
		}
        
        return p;
	}

}
