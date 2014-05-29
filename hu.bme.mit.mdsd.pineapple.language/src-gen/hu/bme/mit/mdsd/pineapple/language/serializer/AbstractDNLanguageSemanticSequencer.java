package hu.bme.mit.mdsd.pineapple.language.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dataflownet.Channel;
import dataflownet.DataflowNet;
import dataflownet.DataflowSystem;
import dataflownet.DataflownetPackage;
import dataflownet.FiringRule;
import dataflownet.StateMachine;
import dataflownet.StateMachineState;
import dataflownet.StateMachineTransition;
import dataflownet.Token;
import hu.bme.mit.mdsd.pineapple.language.services.DNLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import typehierarchy.BoolType;
import typehierarchy.ComplexType;
import typehierarchy.DoubleType;
import typehierarchy.IntType;
import typehierarchy.StringType;
import typehierarchy.TypehierarchyPackage;
import typehierarchy.UserType;

@SuppressWarnings("all")
public abstract class AbstractDNLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DNLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DataflownetPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DataflownetPackage.CHANNEL:
				if(context == grammarAccess.getChannelRule()) {
					sequence_Channel(context, (Channel) semanticObject); 
					return; 
				}
				else break;
			case DataflownetPackage.DATAFLOW_NET:
				if(context == grammarAccess.getDataflowNetRule() ||
				   context == grammarAccess.getNodeRule()) {
					sequence_DataflowNet(context, (DataflowNet) semanticObject); 
					return; 
				}
				else break;
			case DataflownetPackage.DATAFLOW_SYSTEM:
				if(context == grammarAccess.getDataflowSystemRule()) {
					sequence_DataflowSystem(context, (DataflowSystem) semanticObject); 
					return; 
				}
				else break;
			case DataflownetPackage.FIRING_RULE:
				if(context == grammarAccess.getFiringRuleRule()) {
					sequence_FiringRule(context, (FiringRule) semanticObject); 
					return; 
				}
				else break;
			case DataflownetPackage.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (dataflownet.Process) semanticObject); 
					return; 
				}
				else break;
			case DataflownetPackage.STATE_MACHINE:
				if(context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getStateMachineRule()) {
					sequence_StateMachine(context, (StateMachine) semanticObject); 
					return; 
				}
				else break;
			case DataflownetPackage.STATE_MACHINE_STATE:
				if(context == grammarAccess.getStateMachineStateRule()) {
					sequence_StateMachineState(context, (StateMachineState) semanticObject); 
					return; 
				}
				else break;
			case DataflownetPackage.STATE_MACHINE_TRANSITION:
				if(context == grammarAccess.getStateMachineTransitionRule()) {
					sequence_StateMachineTransition(context, (StateMachineTransition) semanticObject); 
					return; 
				}
				else break;
			case DataflownetPackage.TOKEN:
				if(context == grammarAccess.getTokenRule()) {
					sequence_Token(context, (Token) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypehierarchyPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypehierarchyPackage.BOOL_TYPE:
				if(context == grammarAccess.getBoolTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BoolType(context, (BoolType) semanticObject); 
					return; 
				}
				else break;
			case TypehierarchyPackage.COMPLEX_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ComplexType(context, (ComplexType) semanticObject); 
					return; 
				}
				else break;
			case TypehierarchyPackage.DOUBLE_TYPE:
				if(context == grammarAccess.getDoubleTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DoubleType(context, (DoubleType) semanticObject); 
					return; 
				}
				else break;
			case TypehierarchyPackage.INT_TYPE:
				if(context == grammarAccess.getIntTypeRule() ||
				   context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_IntType(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case TypehierarchyPackage.STRING_TYPE:
				if(context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getStringTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_StringType(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			case TypehierarchyPackage.USER_TYPE:
				if(context == grammarAccess.getSimpleTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUserTypeRule()) {
					sequence_UserType(context, (UserType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_BoolType(EObject context, BoolType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypehierarchyPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypehierarchyPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolTypeAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=[Type|EString])
	 */
	protected void sequence_Channel(EObject context, Channel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DataflownetPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflownetPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, DataflownetPackage.Literals.CHANNEL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflownetPackage.Literals.CHANNEL__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChannelAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getChannelAccess().getTypeTypeEStringParserRuleCall_4_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString containedTypes+=[SimpleType|EString] containedTypes+=[SimpleType|EString]*)
	 */
	protected void sequence_ComplexType(EObject context, ComplexType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (outputChannels+=[Channel|EString] outputChannels+=[Channel|EString]*)? 
	 *         (inputChannels+=[Channel|EString] inputChannels+=[Channel|EString]*)? 
	 *         process=[Process|EString]? 
	 *         (nodes+=Node nodes+=Node*)? 
	 *         (ownChannels+=Channel ownChannels+=Channel*)?
	 *     )
	 */
	protected void sequence_DataflowNet(EObject context, DataflowNet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         protocol=Protocol 
	 *         (types+=Type types+=Type*)? 
	 *         nets+=DataflowNet 
	 *         nets+=DataflowNet* 
	 *         (channels+=Channel channels+=Channel*)? 
	 *         processes+=Process 
	 *         processes+=Process*
	 *     )
	 */
	protected void sequence_DataflowSystem(EObject context, DataflowSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_DoubleType(EObject context, DoubleType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypehierarchyPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypehierarchyPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleTypeAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString compType=Comparation? channel=[Channel|EString] tokens=Token)
	 */
	protected void sequence_FiringRule(EObject context, FiringRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_IntType(EObject context, IntType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypehierarchyPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypehierarchyPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntTypeAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString host=EString)
	 */
	protected void sequence_Process(EObject context, dataflownet.Process semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DataflownetPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflownetPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, DataflownetPackage.Literals.PROCESS__HOST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataflownetPackage.Literals.PROCESS__HOST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProcessAccess().getHostEStringParserRuleCall_4_0(), semanticObject.getHost());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (inputTransitions+=[StateMachineTransition|EString] inputTransitions+=[StateMachineTransition|EString]*)? 
	 *         (outputTransitions+=StateMachineTransition outputTransitions+=StateMachineTransition*)?
	 *     )
	 */
	protected void sequence_StateMachineState(EObject context, StateMachineState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         priority=EInt 
	 *         toState=[StateMachineState|EString] 
	 *         (inputs+=[FiringRule|EString] inputs+=[FiringRule|EString]*)? 
	 *         (outputs+=[FiringRule|EString] outputs+=[FiringRule|EString]*)?
	 *     )
	 */
	protected void sequence_StateMachineTransition(EObject context, StateMachineTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         initialState=[StateMachineState|EString] 
	 *         nodes+=StateMachineState 
	 *         nodes+=StateMachineState* 
	 *         (firingRules+=FiringRule firingRules+=FiringRule*)?
	 *     )
	 */
	protected void sequence_StateMachine(EObject context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_StringType(EObject context, StringType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TypehierarchyPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TypehierarchyPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringTypeAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value+=EString value+=EString* type=[Type|EString])
	 */
	protected void sequence_Token(EObject context, Token semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString domain+=EString domain+=EString*)
	 */
	protected void sequence_UserType(EObject context, UserType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
