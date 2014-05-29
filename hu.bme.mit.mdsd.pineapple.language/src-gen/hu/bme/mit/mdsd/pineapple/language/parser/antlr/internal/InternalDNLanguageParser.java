package hu.bme.mit.mdsd.pineapple.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.mdsd.pineapple.language.services.DNLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDNLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DataflowSystem'", "'{'", "'protocol'", "'types'", "','", "'}'", "'nets'", "'channels'", "'processes'", "'DataflowNet'", "'outputChannels'", "'('", "')'", "'inputChannels'", "'process'", "'nodes'", "'ownChannels'", "'Channel'", "'type'", "'Process'", "'host'", "'IntType'", "'StringType'", "'UserType'", "'domain'", "'ComplexType'", "'containedTypes'", "'DoubleType'", "'BoolType'", "'StateMachine'", "'initialState'", "'firingRules'", "'StateMachineState'", "'inputTransitions'", "'outputTransitions'", "'FiringRule'", "'compType'", "'channel'", "'tokens'", "'StateMachineTransition'", "'priority'", "'toState'", "'inputs'", "'outputs'", "'-'", "'Token'", "'value'", "'Paho'", "'Akka'", "'Equal'", "'NotEqual'", "'Less'", "'Greater'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDNLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDNLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDNLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g"; }



     	private DNLanguageGrammarAccess grammarAccess;
     	
        public InternalDNLanguageParser(TokenStream input, DNLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DataflowSystem";	
       	}
       	
       	@Override
       	protected DNLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDataflowSystem"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:68:1: entryRuleDataflowSystem returns [EObject current=null] : iv_ruleDataflowSystem= ruleDataflowSystem EOF ;
    public final EObject entryRuleDataflowSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataflowSystem = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:69:2: (iv_ruleDataflowSystem= ruleDataflowSystem EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:70:2: iv_ruleDataflowSystem= ruleDataflowSystem EOF
            {
             newCompositeNode(grammarAccess.getDataflowSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataflowSystem_in_entryRuleDataflowSystem75);
            iv_ruleDataflowSystem=ruleDataflowSystem();

            state._fsp--;

             current =iv_ruleDataflowSystem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataflowSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataflowSystem"


    // $ANTLR start "ruleDataflowSystem"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:77:1: ruleDataflowSystem returns [EObject current=null] : (otherlv_0= 'DataflowSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'protocol' ( (lv_protocol_4_0= ruleProtocol ) ) (otherlv_5= 'types' otherlv_6= '{' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )? otherlv_11= 'nets' otherlv_12= '{' ( (lv_nets_13_0= ruleDataflowNet ) ) (otherlv_14= ',' ( (lv_nets_15_0= ruleDataflowNet ) ) )* otherlv_16= '}' (otherlv_17= 'channels' otherlv_18= '{' ( (lv_channels_19_0= ruleChannel ) ) (otherlv_20= ',' ( (lv_channels_21_0= ruleChannel ) ) )* otherlv_22= '}' )? otherlv_23= 'processes' otherlv_24= '{' ( (lv_processes_25_0= ruleProcess ) ) (otherlv_26= ',' ( (lv_processes_27_0= ruleProcess ) ) )* otherlv_28= '}' otherlv_29= '}' ) ;
    public final EObject ruleDataflowSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_protocol_4_0 = null;

        EObject lv_types_7_0 = null;

        EObject lv_types_9_0 = null;

        EObject lv_nets_13_0 = null;

        EObject lv_nets_15_0 = null;

        EObject lv_channels_19_0 = null;

        EObject lv_channels_21_0 = null;

        EObject lv_processes_25_0 = null;

        EObject lv_processes_27_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:80:28: ( (otherlv_0= 'DataflowSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'protocol' ( (lv_protocol_4_0= ruleProtocol ) ) (otherlv_5= 'types' otherlv_6= '{' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )? otherlv_11= 'nets' otherlv_12= '{' ( (lv_nets_13_0= ruleDataflowNet ) ) (otherlv_14= ',' ( (lv_nets_15_0= ruleDataflowNet ) ) )* otherlv_16= '}' (otherlv_17= 'channels' otherlv_18= '{' ( (lv_channels_19_0= ruleChannel ) ) (otherlv_20= ',' ( (lv_channels_21_0= ruleChannel ) ) )* otherlv_22= '}' )? otherlv_23= 'processes' otherlv_24= '{' ( (lv_processes_25_0= ruleProcess ) ) (otherlv_26= ',' ( (lv_processes_27_0= ruleProcess ) ) )* otherlv_28= '}' otherlv_29= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:81:1: (otherlv_0= 'DataflowSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'protocol' ( (lv_protocol_4_0= ruleProtocol ) ) (otherlv_5= 'types' otherlv_6= '{' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )? otherlv_11= 'nets' otherlv_12= '{' ( (lv_nets_13_0= ruleDataflowNet ) ) (otherlv_14= ',' ( (lv_nets_15_0= ruleDataflowNet ) ) )* otherlv_16= '}' (otherlv_17= 'channels' otherlv_18= '{' ( (lv_channels_19_0= ruleChannel ) ) (otherlv_20= ',' ( (lv_channels_21_0= ruleChannel ) ) )* otherlv_22= '}' )? otherlv_23= 'processes' otherlv_24= '{' ( (lv_processes_25_0= ruleProcess ) ) (otherlv_26= ',' ( (lv_processes_27_0= ruleProcess ) ) )* otherlv_28= '}' otherlv_29= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:81:1: (otherlv_0= 'DataflowSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'protocol' ( (lv_protocol_4_0= ruleProtocol ) ) (otherlv_5= 'types' otherlv_6= '{' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )? otherlv_11= 'nets' otherlv_12= '{' ( (lv_nets_13_0= ruleDataflowNet ) ) (otherlv_14= ',' ( (lv_nets_15_0= ruleDataflowNet ) ) )* otherlv_16= '}' (otherlv_17= 'channels' otherlv_18= '{' ( (lv_channels_19_0= ruleChannel ) ) (otherlv_20= ',' ( (lv_channels_21_0= ruleChannel ) ) )* otherlv_22= '}' )? otherlv_23= 'processes' otherlv_24= '{' ( (lv_processes_25_0= ruleProcess ) ) (otherlv_26= ',' ( (lv_processes_27_0= ruleProcess ) ) )* otherlv_28= '}' otherlv_29= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:81:3: otherlv_0= 'DataflowSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'protocol' ( (lv_protocol_4_0= ruleProtocol ) ) (otherlv_5= 'types' otherlv_6= '{' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )? otherlv_11= 'nets' otherlv_12= '{' ( (lv_nets_13_0= ruleDataflowNet ) ) (otherlv_14= ',' ( (lv_nets_15_0= ruleDataflowNet ) ) )* otherlv_16= '}' (otherlv_17= 'channels' otherlv_18= '{' ( (lv_channels_19_0= ruleChannel ) ) (otherlv_20= ',' ( (lv_channels_21_0= ruleChannel ) ) )* otherlv_22= '}' )? otherlv_23= 'processes' otherlv_24= '{' ( (lv_processes_25_0= ruleProcess ) ) (otherlv_26= ',' ( (lv_processes_27_0= ruleProcess ) ) )* otherlv_28= '}' otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDataflowSystem122); 

                	newLeafNode(otherlv_0, grammarAccess.getDataflowSystemAccess().getDataflowSystemKeyword_0());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:86:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:87:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataflowSystem143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataflowSystem155); 

                	newLeafNode(otherlv_2, grammarAccess.getDataflowSystemAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDataflowSystem167); 

                	newLeafNode(otherlv_3, grammarAccess.getDataflowSystemAccess().getProtocolKeyword_3());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:111:1: ( (lv_protocol_4_0= ruleProtocol ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:112:1: (lv_protocol_4_0= ruleProtocol )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:112:1: (lv_protocol_4_0= ruleProtocol )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:113:3: lv_protocol_4_0= ruleProtocol
            {
             
            	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getProtocolProtocolEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleProtocol_in_ruleDataflowSystem188);
            lv_protocol_4_0=ruleProtocol();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
            	        }
                   		set(
                   			current, 
                   			"protocol",
                    		lv_protocol_4_0, 
                    		"Protocol");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:129:2: (otherlv_5= 'types' otherlv_6= '{' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:129:4: otherlv_5= 'types' otherlv_6= '{' ( (lv_types_7_0= ruleType ) ) (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataflowSystem201); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataflowSystemAccess().getTypesKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataflowSystem213); 

                        	newLeafNode(otherlv_6, grammarAccess.getDataflowSystemAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:137:1: ( (lv_types_7_0= ruleType ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:138:1: (lv_types_7_0= ruleType )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:138:1: (lv_types_7_0= ruleType )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:139:3: lv_types_7_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getTypesTypeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleDataflowSystem234);
                    lv_types_7_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_7_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:155:2: (otherlv_8= ',' ( (lv_types_9_0= ruleType ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:155:4: otherlv_8= ',' ( (lv_types_9_0= ruleType ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataflowSystem247); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getDataflowSystemAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:159:1: ( (lv_types_9_0= ruleType ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:160:1: (lv_types_9_0= ruleType )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:160:1: (lv_types_9_0= ruleType )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:161:3: lv_types_9_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getTypesTypeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleDataflowSystem268);
                    	    lv_types_9_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_9_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataflowSystem282); 

                        	newLeafNode(otherlv_10, grammarAccess.getDataflowSystemAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataflowSystem296); 

                	newLeafNode(otherlv_11, grammarAccess.getDataflowSystemAccess().getNetsKeyword_6());
                
            otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataflowSystem308); 

                	newLeafNode(otherlv_12, grammarAccess.getDataflowSystemAccess().getLeftCurlyBracketKeyword_7());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:189:1: ( (lv_nets_13_0= ruleDataflowNet ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:190:1: (lv_nets_13_0= ruleDataflowNet )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:190:1: (lv_nets_13_0= ruleDataflowNet )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:191:3: lv_nets_13_0= ruleDataflowNet
            {
             
            	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getNetsDataflowNetParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataflowNet_in_ruleDataflowSystem329);
            lv_nets_13_0=ruleDataflowNet();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
            	        }
                   		add(
                   			current, 
                   			"nets",
                    		lv_nets_13_0, 
                    		"DataflowNet");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:207:2: (otherlv_14= ',' ( (lv_nets_15_0= ruleDataflowNet ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:207:4: otherlv_14= ',' ( (lv_nets_15_0= ruleDataflowNet ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataflowSystem342); 

            	        	newLeafNode(otherlv_14, grammarAccess.getDataflowSystemAccess().getCommaKeyword_9_0());
            	        
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:211:1: ( (lv_nets_15_0= ruleDataflowNet ) )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:212:1: (lv_nets_15_0= ruleDataflowNet )
            	    {
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:212:1: (lv_nets_15_0= ruleDataflowNet )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:213:3: lv_nets_15_0= ruleDataflowNet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getNetsDataflowNetParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDataflowNet_in_ruleDataflowSystem363);
            	    lv_nets_15_0=ruleDataflowNet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nets",
            	            		lv_nets_15_0, 
            	            		"DataflowNet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataflowSystem377); 

                	newLeafNode(otherlv_16, grammarAccess.getDataflowSystemAccess().getRightCurlyBracketKeyword_10());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:233:1: (otherlv_17= 'channels' otherlv_18= '{' ( (lv_channels_19_0= ruleChannel ) ) (otherlv_20= ',' ( (lv_channels_21_0= ruleChannel ) ) )* otherlv_22= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:233:3: otherlv_17= 'channels' otherlv_18= '{' ( (lv_channels_19_0= ruleChannel ) ) (otherlv_20= ',' ( (lv_channels_21_0= ruleChannel ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataflowSystem390); 

                        	newLeafNode(otherlv_17, grammarAccess.getDataflowSystemAccess().getChannelsKeyword_11_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataflowSystem402); 

                        	newLeafNode(otherlv_18, grammarAccess.getDataflowSystemAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:241:1: ( (lv_channels_19_0= ruleChannel ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:242:1: (lv_channels_19_0= ruleChannel )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:242:1: (lv_channels_19_0= ruleChannel )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:243:3: lv_channels_19_0= ruleChannel
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getChannelsChannelParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChannel_in_ruleDataflowSystem423);
                    lv_channels_19_0=ruleChannel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
                    	        }
                           		add(
                           			current, 
                           			"channels",
                            		lv_channels_19_0, 
                            		"Channel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:259:2: (otherlv_20= ',' ( (lv_channels_21_0= ruleChannel ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:259:4: otherlv_20= ',' ( (lv_channels_21_0= ruleChannel ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataflowSystem436); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getDataflowSystemAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:263:1: ( (lv_channels_21_0= ruleChannel ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:264:1: (lv_channels_21_0= ruleChannel )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:264:1: (lv_channels_21_0= ruleChannel )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:265:3: lv_channels_21_0= ruleChannel
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getChannelsChannelParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChannel_in_ruleDataflowSystem457);
                    	    lv_channels_21_0=ruleChannel();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"channels",
                    	            		lv_channels_21_0, 
                    	            		"Channel");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataflowSystem471); 

                        	newLeafNode(otherlv_22, grammarAccess.getDataflowSystemAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            otherlv_23=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDataflowSystem485); 

                	newLeafNode(otherlv_23, grammarAccess.getDataflowSystemAccess().getProcessesKeyword_12());
                
            otherlv_24=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataflowSystem497); 

                	newLeafNode(otherlv_24, grammarAccess.getDataflowSystemAccess().getLeftCurlyBracketKeyword_13());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:293:1: ( (lv_processes_25_0= ruleProcess ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:294:1: (lv_processes_25_0= ruleProcess )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:294:1: (lv_processes_25_0= ruleProcess )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:295:3: lv_processes_25_0= ruleProcess
            {
             
            	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getProcessesProcessParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_ruleDataflowSystem518);
            lv_processes_25_0=ruleProcess();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
            	        }
                   		add(
                   			current, 
                   			"processes",
                    		lv_processes_25_0, 
                    		"Process");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:311:2: (otherlv_26= ',' ( (lv_processes_27_0= ruleProcess ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:311:4: otherlv_26= ',' ( (lv_processes_27_0= ruleProcess ) )
            	    {
            	    otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataflowSystem531); 

            	        	newLeafNode(otherlv_26, grammarAccess.getDataflowSystemAccess().getCommaKeyword_15_0());
            	        
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:315:1: ( (lv_processes_27_0= ruleProcess ) )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:316:1: (lv_processes_27_0= ruleProcess )
            	    {
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:316:1: (lv_processes_27_0= ruleProcess )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:317:3: lv_processes_27_0= ruleProcess
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataflowSystemAccess().getProcessesProcessParserRuleCall_15_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleProcess_in_ruleDataflowSystem552);
            	    lv_processes_27_0=ruleProcess();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataflowSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"processes",
            	            		lv_processes_27_0, 
            	            		"Process");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_28=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataflowSystem566); 

                	newLeafNode(otherlv_28, grammarAccess.getDataflowSystemAccess().getRightCurlyBracketKeyword_16());
                
            otherlv_29=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataflowSystem578); 

                	newLeafNode(otherlv_29, grammarAccess.getDataflowSystemAccess().getRightCurlyBracketKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataflowSystem"


    // $ANTLR start "entryRuleType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:349:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:350:2: (iv_ruleType= ruleType EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:351:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType614);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:358:1: ruleType returns [EObject current=null] : (this_IntType_0= ruleIntType | this_StringType_1= ruleStringType | this_UserType_2= ruleUserType | this_ComplexType_3= ruleComplexType | this_DoubleType_4= ruleDoubleType | this_BoolType_5= ruleBoolType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_UserType_2 = null;

        EObject this_ComplexType_3 = null;

        EObject this_DoubleType_4 = null;

        EObject this_BoolType_5 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:361:28: ( (this_IntType_0= ruleIntType | this_StringType_1= ruleStringType | this_UserType_2= ruleUserType | this_ComplexType_3= ruleComplexType | this_DoubleType_4= ruleDoubleType | this_BoolType_5= ruleBoolType ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:362:1: (this_IntType_0= ruleIntType | this_StringType_1= ruleStringType | this_UserType_2= ruleUserType | this_ComplexType_3= ruleComplexType | this_DoubleType_4= ruleDoubleType | this_BoolType_5= ruleBoolType )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:362:1: (this_IntType_0= ruleIntType | this_StringType_1= ruleStringType | this_UserType_2= ruleUserType | this_ComplexType_3= ruleComplexType | this_DoubleType_4= ruleDoubleType | this_BoolType_5= ruleBoolType )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=4;
                }
                break;
            case 38:
                {
                alt7=5;
                }
                break;
            case 39:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:363:5: this_IntType_0= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getIntTypeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntType_in_ruleType671);
                    this_IntType_0=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:373:5: this_StringType_1= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringType_in_ruleType698);
                    this_StringType_1=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:383:5: this_UserType_2= ruleUserType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getUserTypeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUserType_in_ruleType725);
                    this_UserType_2=ruleUserType();

                    state._fsp--;

                     
                            current = this_UserType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:393:5: this_ComplexType_3= ruleComplexType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComplexType_in_ruleType752);
                    this_ComplexType_3=ruleComplexType();

                    state._fsp--;

                     
                            current = this_ComplexType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:403:5: this_DoubleType_4= ruleDoubleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDoubleTypeParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleType_in_ruleType779);
                    this_DoubleType_4=ruleDoubleType();

                    state._fsp--;

                     
                            current = this_DoubleType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:413:5: this_BoolType_5= ruleBoolType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBoolTypeParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBoolType_in_ruleType806);
                    this_BoolType_5=ruleBoolType();

                    state._fsp--;

                     
                            current = this_BoolType_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleNode"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:429:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:430:2: (iv_ruleNode= ruleNode EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:431:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_in_entryRuleNode841);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNode851); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:438:1: ruleNode returns [EObject current=null] : (this_StateMachine_0= ruleStateMachine | this_DataflowNet_1= ruleDataflowNet ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_StateMachine_0 = null;

        EObject this_DataflowNet_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:441:28: ( (this_StateMachine_0= ruleStateMachine | this_DataflowNet_1= ruleDataflowNet ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:442:1: (this_StateMachine_0= ruleStateMachine | this_DataflowNet_1= ruleDataflowNet )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:442:1: (this_StateMachine_0= ruleStateMachine | this_DataflowNet_1= ruleDataflowNet )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:443:5: this_StateMachine_0= ruleStateMachine
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getStateMachineParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleNode898);
                    this_StateMachine_0=ruleStateMachine();

                    state._fsp--;

                     
                            current = this_StateMachine_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:453:5: this_DataflowNet_1= ruleDataflowNet
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getDataflowNetParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDataflowNet_in_ruleNode925);
                    this_DataflowNet_1=ruleDataflowNet();

                    state._fsp--;

                     
                            current = this_DataflowNet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleEString"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:471:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:472:2: (iv_ruleEString= ruleEString EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:473:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString963);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString974); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:480:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:483:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:484:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:484:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:484:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1014); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:492:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1040); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDataflowNet"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:507:1: entryRuleDataflowNet returns [EObject current=null] : iv_ruleDataflowNet= ruleDataflowNet EOF ;
    public final EObject entryRuleDataflowNet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataflowNet = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:508:2: (iv_ruleDataflowNet= ruleDataflowNet EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:509:2: iv_ruleDataflowNet= ruleDataflowNet EOF
            {
             newCompositeNode(grammarAccess.getDataflowNetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataflowNet_in_entryRuleDataflowNet1085);
            iv_ruleDataflowNet=ruleDataflowNet();

            state._fsp--;

             current =iv_ruleDataflowNet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataflowNet1095); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataflowNet"


    // $ANTLR start "ruleDataflowNet"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:516:1: ruleDataflowNet returns [EObject current=null] : ( () otherlv_1= 'DataflowNet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outputChannels' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'inputChannels' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'process' ( ( ruleEString ) ) )? (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleNode ) ) )* otherlv_23= '}' )? (otherlv_24= 'ownChannels' otherlv_25= '{' ( (lv_ownChannels_26_0= ruleChannel ) ) (otherlv_27= ',' ( (lv_ownChannels_28_0= ruleChannel ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleDataflowNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_nodes_20_0 = null;

        EObject lv_nodes_22_0 = null;

        EObject lv_ownChannels_26_0 = null;

        EObject lv_ownChannels_28_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:519:28: ( ( () otherlv_1= 'DataflowNet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outputChannels' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'inputChannels' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'process' ( ( ruleEString ) ) )? (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleNode ) ) )* otherlv_23= '}' )? (otherlv_24= 'ownChannels' otherlv_25= '{' ( (lv_ownChannels_26_0= ruleChannel ) ) (otherlv_27= ',' ( (lv_ownChannels_28_0= ruleChannel ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:520:1: ( () otherlv_1= 'DataflowNet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outputChannels' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'inputChannels' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'process' ( ( ruleEString ) ) )? (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleNode ) ) )* otherlv_23= '}' )? (otherlv_24= 'ownChannels' otherlv_25= '{' ( (lv_ownChannels_26_0= ruleChannel ) ) (otherlv_27= ',' ( (lv_ownChannels_28_0= ruleChannel ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:520:1: ( () otherlv_1= 'DataflowNet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outputChannels' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'inputChannels' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'process' ( ( ruleEString ) ) )? (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleNode ) ) )* otherlv_23= '}' )? (otherlv_24= 'ownChannels' otherlv_25= '{' ( (lv_ownChannels_26_0= ruleChannel ) ) (otherlv_27= ',' ( (lv_ownChannels_28_0= ruleChannel ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:520:2: () otherlv_1= 'DataflowNet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'outputChannels' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'inputChannels' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'process' ( ( ruleEString ) ) )? (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleNode ) ) )* otherlv_23= '}' )? (otherlv_24= 'ownChannels' otherlv_25= '{' ( (lv_ownChannels_26_0= ruleChannel ) ) (otherlv_27= ',' ( (lv_ownChannels_28_0= ruleChannel ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:520:2: ()
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:521:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataflowNetAccess().getDataflowNetAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDataflowNet1141); 

                	newLeafNode(otherlv_1, grammarAccess.getDataflowNetAccess().getDataflowNetKeyword_1());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:530:1: ( (lv_name_2_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:531:1: (lv_name_2_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:531:1: (lv_name_2_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:532:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDataflowNetAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataflowNet1162);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataflowNetRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataflowNet1174); 

                	newLeafNode(otherlv_3, grammarAccess.getDataflowNetAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:552:1: (otherlv_4= 'outputChannels' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:552:3: otherlv_4= 'outputChannels' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDataflowNet1187); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataflowNetAccess().getOutputChannelsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDataflowNet1199); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataflowNetAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:560:1: ( ( ruleEString ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:561:1: ( ruleEString )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:561:1: ( ruleEString )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:562:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataflowNetRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDataflowNetAccess().getOutputChannelsChannelCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataflowNet1222);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:575:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:575:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataflowNet1235); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getDataflowNetAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:579:1: ( ( ruleEString ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:580:1: ( ruleEString )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:580:1: ( ruleEString )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:581:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDataflowNetRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataflowNetAccess().getOutputChannelsChannelCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataflowNet1258);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDataflowNet1272); 

                        	newLeafNode(otherlv_9, grammarAccess.getDataflowNetAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:598:3: (otherlv_10= 'inputChannels' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:598:5: otherlv_10= 'inputChannels' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDataflowNet1287); 

                        	newLeafNode(otherlv_10, grammarAccess.getDataflowNetAccess().getInputChannelsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleDataflowNet1299); 

                        	newLeafNode(otherlv_11, grammarAccess.getDataflowNetAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:606:1: ( ( ruleEString ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:607:1: ( ruleEString )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:607:1: ( ruleEString )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:608:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataflowNetRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDataflowNetAccess().getInputChannelsChannelCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataflowNet1322);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:621:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:621:4: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataflowNet1335); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getDataflowNetAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:625:1: ( ( ruleEString ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:626:1: ( ruleEString )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:626:1: ( ruleEString )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:627:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDataflowNetRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataflowNetAccess().getInputChannelsChannelCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataflowNet1358);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDataflowNet1372); 

                        	newLeafNode(otherlv_15, grammarAccess.getDataflowNetAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:644:3: (otherlv_16= 'process' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:644:5: otherlv_16= 'process' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDataflowNet1387); 

                        	newLeafNode(otherlv_16, grammarAccess.getDataflowNetAccess().getProcessKeyword_6_0());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:648:1: ( ( ruleEString ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:649:1: ( ruleEString )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:649:1: ( ruleEString )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:650:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataflowNetRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDataflowNetAccess().getProcessProcessCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDataflowNet1410);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:663:4: (otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleNode ) ) )* otherlv_23= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:663:6: otherlv_18= 'nodes' otherlv_19= '{' ( (lv_nodes_20_0= ruleNode ) ) (otherlv_21= ',' ( (lv_nodes_22_0= ruleNode ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDataflowNet1425); 

                        	newLeafNode(otherlv_18, grammarAccess.getDataflowNetAccess().getNodesKeyword_7_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataflowNet1437); 

                        	newLeafNode(otherlv_19, grammarAccess.getDataflowNetAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:671:1: ( (lv_nodes_20_0= ruleNode ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:672:1: (lv_nodes_20_0= ruleNode )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:672:1: (lv_nodes_20_0= ruleNode )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:673:3: lv_nodes_20_0= ruleNode
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataflowNetAccess().getNodesNodeParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleDataflowNet1458);
                    lv_nodes_20_0=ruleNode();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataflowNetRule());
                    	        }
                           		add(
                           			current, 
                           			"nodes",
                            		lv_nodes_20_0, 
                            		"Node");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:689:2: (otherlv_21= ',' ( (lv_nodes_22_0= ruleNode ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:689:4: otherlv_21= ',' ( (lv_nodes_22_0= ruleNode ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataflowNet1471); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getDataflowNetAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:693:1: ( (lv_nodes_22_0= ruleNode ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:694:1: (lv_nodes_22_0= ruleNode )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:694:1: (lv_nodes_22_0= ruleNode )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:695:3: lv_nodes_22_0= ruleNode
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataflowNetAccess().getNodesNodeParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleNode_in_ruleDataflowNet1492);
                    	    lv_nodes_22_0=ruleNode();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataflowNetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodes",
                    	            		lv_nodes_22_0, 
                    	            		"Node");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataflowNet1506); 

                        	newLeafNode(otherlv_23, grammarAccess.getDataflowNetAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:715:3: (otherlv_24= 'ownChannels' otherlv_25= '{' ( (lv_ownChannels_26_0= ruleChannel ) ) (otherlv_27= ',' ( (lv_ownChannels_28_0= ruleChannel ) ) )* otherlv_29= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:715:5: otherlv_24= 'ownChannels' otherlv_25= '{' ( (lv_ownChannels_26_0= ruleChannel ) ) (otherlv_27= ',' ( (lv_ownChannels_28_0= ruleChannel ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDataflowNet1521); 

                        	newLeafNode(otherlv_24, grammarAccess.getDataflowNetAccess().getOwnChannelsKeyword_8_0());
                        
                    otherlv_25=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataflowNet1533); 

                        	newLeafNode(otherlv_25, grammarAccess.getDataflowNetAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:723:1: ( (lv_ownChannels_26_0= ruleChannel ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:724:1: (lv_ownChannels_26_0= ruleChannel )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:724:1: (lv_ownChannels_26_0= ruleChannel )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:725:3: lv_ownChannels_26_0= ruleChannel
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataflowNetAccess().getOwnChannelsChannelParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleChannel_in_ruleDataflowNet1554);
                    lv_ownChannels_26_0=ruleChannel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataflowNetRule());
                    	        }
                           		add(
                           			current, 
                           			"ownChannels",
                            		lv_ownChannels_26_0, 
                            		"Channel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:741:2: (otherlv_27= ',' ( (lv_ownChannels_28_0= ruleChannel ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:741:4: otherlv_27= ',' ( (lv_ownChannels_28_0= ruleChannel ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDataflowNet1567); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getDataflowNetAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:745:1: ( (lv_ownChannels_28_0= ruleChannel ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:746:1: (lv_ownChannels_28_0= ruleChannel )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:746:1: (lv_ownChannels_28_0= ruleChannel )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:747:3: lv_ownChannels_28_0= ruleChannel
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataflowNetAccess().getOwnChannelsChannelParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleChannel_in_ruleDataflowNet1588);
                    	    lv_ownChannels_28_0=ruleChannel();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataflowNetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownChannels",
                    	            		lv_ownChannels_28_0, 
                    	            		"Channel");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataflowNet1602); 

                        	newLeafNode(otherlv_29, grammarAccess.getDataflowNetAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataflowNet1616); 

                	newLeafNode(otherlv_30, grammarAccess.getDataflowNetAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataflowNet"


    // $ANTLR start "entryRuleChannel"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:779:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:780:2: (iv_ruleChannel= ruleChannel EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:781:2: iv_ruleChannel= ruleChannel EOF
            {
             newCompositeNode(grammarAccess.getChannelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChannel_in_entryRuleChannel1652);
            iv_ruleChannel=ruleChannel();

            state._fsp--;

             current =iv_ruleChannel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChannel1662); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:788:1: ruleChannel returns [EObject current=null] : (otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:791:28: ( (otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:792:1: (otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:792:1: (otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:792:3: otherlv_0= 'Channel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleChannel1699); 

                	newLeafNode(otherlv_0, grammarAccess.getChannelAccess().getChannelKeyword_0());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:796:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:797:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:797:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:798:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChannelAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChannel1720);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChannelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleChannel1732); 

                	newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleChannel1744); 

                	newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getTypeKeyword_3());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:822:1: ( ( ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:823:1: ( ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:823:1: ( ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:824:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getChannelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getChannelAccess().getTypeTypeCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleChannel1767);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleChannel1779); 

                	newLeafNode(otherlv_5, grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleProcess"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:849:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:850:2: (iv_ruleProcess= ruleProcess EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:851:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_entryRuleProcess1815);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcess1825); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:858:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'host' ( (lv_host_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_host_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:861:28: ( (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'host' ( (lv_host_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:862:1: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'host' ( (lv_host_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:862:1: (otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'host' ( (lv_host_4_0= ruleEString ) ) otherlv_5= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:862:3: otherlv_0= 'Process' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'host' ( (lv_host_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleProcess1862); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:866:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:867:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:867:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:868:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcess1883);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProcess1895); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleProcess1907); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getHostKeyword_3());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:892:1: ( (lv_host_4_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:893:1: (lv_host_4_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:893:1: (lv_host_4_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:894:3: lv_host_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getHostEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcess1928);
            lv_host_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	        }
                   		set(
                   			current, 
                   			"host",
                    		lv_host_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProcess1940); 

                	newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleIntType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:922:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:923:2: (iv_ruleIntType= ruleIntType EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:924:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntType_in_entryRuleIntType1976);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntType1986); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:931:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'IntType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:934:28: ( ( () otherlv_1= 'IntType' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:935:1: ( () otherlv_1= 'IntType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:935:1: ( () otherlv_1= 'IntType' ( (lv_name_2_0= ruleEString ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:935:2: () otherlv_1= 'IntType' ( (lv_name_2_0= ruleEString ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:935:2: ()
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:936:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleIntType2032); 

                	newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntTypeKeyword_1());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:945:1: ( (lv_name_2_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:946:1: (lv_name_2_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:946:1: (lv_name_2_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:947:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIntTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIntType2053);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleStringType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:971:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:972:2: (iv_ruleStringType= ruleStringType EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:973:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringType_in_entryRuleStringType2089);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringType2099); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:980:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'StringType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:983:28: ( ( () otherlv_1= 'StringType' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:984:1: ( () otherlv_1= 'StringType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:984:1: ( () otherlv_1= 'StringType' ( (lv_name_2_0= ruleEString ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:984:2: () otherlv_1= 'StringType' ( (lv_name_2_0= ruleEString ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:984:2: ()
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:985:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleStringType2145); 

                	newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringTypeKeyword_1());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:994:1: ( (lv_name_2_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:995:1: (lv_name_2_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:995:1: (lv_name_2_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:996:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStringTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStringType2166);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleUserType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1020:1: entryRuleUserType returns [EObject current=null] : iv_ruleUserType= ruleUserType EOF ;
    public final EObject entryRuleUserType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserType = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1021:2: (iv_ruleUserType= ruleUserType EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1022:2: iv_ruleUserType= ruleUserType EOF
            {
             newCompositeNode(grammarAccess.getUserTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUserType_in_entryRuleUserType2202);
            iv_ruleUserType=ruleUserType();

            state._fsp--;

             current =iv_ruleUserType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUserType2212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserType"


    // $ANTLR start "ruleUserType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1029:1: ruleUserType returns [EObject current=null] : (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' otherlv_4= '{' ( (lv_domain_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_domain_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleUserType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_domain_5_0 = null;

        AntlrDatatypeRuleToken lv_domain_7_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1032:28: ( (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' otherlv_4= '{' ( (lv_domain_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_domain_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1033:1: (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' otherlv_4= '{' ( (lv_domain_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_domain_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1033:1: (otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' otherlv_4= '{' ( (lv_domain_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_domain_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1033:3: otherlv_0= 'UserType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'domain' otherlv_4= '{' ( (lv_domain_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_domain_7_0= ruleEString ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUserType2249); 

                	newLeafNode(otherlv_0, grammarAccess.getUserTypeAccess().getUserTypeKeyword_0());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1037:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1038:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1038:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1039:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUserTypeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUserType2270);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUserTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUserType2282); 

                	newLeafNode(otherlv_2, grammarAccess.getUserTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleUserType2294); 

                	newLeafNode(otherlv_3, grammarAccess.getUserTypeAccess().getDomainKeyword_3());
                
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUserType2306); 

                	newLeafNode(otherlv_4, grammarAccess.getUserTypeAccess().getLeftCurlyBracketKeyword_4());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1067:1: ( (lv_domain_5_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1068:1: (lv_domain_5_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1068:1: (lv_domain_5_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1069:3: lv_domain_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getUserTypeAccess().getDomainEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUserType2327);
            lv_domain_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUserTypeRule());
            	        }
                   		add(
                   			current, 
                   			"domain",
                    		lv_domain_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1085:2: (otherlv_6= ',' ( (lv_domain_7_0= ruleEString ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1085:4: otherlv_6= ',' ( (lv_domain_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUserType2340); 

            	        	newLeafNode(otherlv_6, grammarAccess.getUserTypeAccess().getCommaKeyword_6_0());
            	        
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1089:1: ( (lv_domain_7_0= ruleEString ) )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1090:1: (lv_domain_7_0= ruleEString )
            	    {
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1090:1: (lv_domain_7_0= ruleEString )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1091:3: lv_domain_7_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUserTypeAccess().getDomainEStringParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleUserType2361);
            	    lv_domain_7_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUserTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"domain",
            	            		lv_domain_7_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUserType2375); 

                	newLeafNode(otherlv_8, grammarAccess.getUserTypeAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUserType2387); 

                	newLeafNode(otherlv_9, grammarAccess.getUserTypeAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserType"


    // $ANTLR start "entryRuleComplexType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1123:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1124:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1125:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComplexType_in_entryRuleComplexType2423);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComplexType2433); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1132:1: ruleComplexType returns [EObject current=null] : (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containedTypes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1135:28: ( (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containedTypes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1136:1: (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containedTypes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1136:1: (otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containedTypes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1136:3: otherlv_0= 'ComplexType' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'containedTypes' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleComplexType2470); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_0());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1140:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1141:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1141:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1142:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getComplexTypeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComplexType2491);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComplexType2503); 

                	newLeafNode(otherlv_2, grammarAccess.getComplexTypeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleComplexType2515); 

                	newLeafNode(otherlv_3, grammarAccess.getComplexTypeAccess().getContainedTypesKeyword_3());
                
            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleComplexType2527); 

                	newLeafNode(otherlv_4, grammarAccess.getComplexTypeAccess().getLeftParenthesisKeyword_4());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1170:1: ( ( ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1171:1: ( ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1171:1: ( ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1172:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexTypeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getComplexTypeAccess().getContainedTypesSimpleTypeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComplexType2550);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1185:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1185:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleComplexType2563); 

            	        	newLeafNode(otherlv_6, grammarAccess.getComplexTypeAccess().getCommaKeyword_6_0());
            	        
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1189:1: ( ( ruleEString ) )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1190:1: ( ruleEString )
            	    {
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1190:1: ( ruleEString )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1191:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComplexTypeRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getComplexTypeAccess().getContainedTypesSimpleTypeCrossReference_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComplexType2586);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleComplexType2600); 

                	newLeafNode(otherlv_8, grammarAccess.getComplexTypeAccess().getRightParenthesisKeyword_7());
                
            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComplexType2612); 

                	newLeafNode(otherlv_9, grammarAccess.getComplexTypeAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleDoubleType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1220:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1221:2: (iv_ruleDoubleType= ruleDoubleType EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1222:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDoubleType_in_entryRuleDoubleType2648);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoubleType2658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleType"


    // $ANTLR start "ruleDoubleType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1229:1: ruleDoubleType returns [EObject current=null] : ( () otherlv_1= 'DoubleType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1232:28: ( ( () otherlv_1= 'DoubleType' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1233:1: ( () otherlv_1= 'DoubleType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1233:1: ( () otherlv_1= 'DoubleType' ( (lv_name_2_0= ruleEString ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1233:2: () otherlv_1= 'DoubleType' ( (lv_name_2_0= ruleEString ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1233:2: ()
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1234:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDoubleType2704); 

                	newLeafNode(otherlv_1, grammarAccess.getDoubleTypeAccess().getDoubleTypeKeyword_1());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1243:1: ( (lv_name_2_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1244:1: (lv_name_2_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1244:1: (lv_name_2_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1245:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDoubleTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDoubleType2725);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoubleTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleType"


    // $ANTLR start "entryRuleBoolType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1269:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1270:2: (iv_ruleBoolType= ruleBoolType EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1271:2: iv_ruleBoolType= ruleBoolType EOF
            {
             newCompositeNode(grammarAccess.getBoolTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBoolType_in_entryRuleBoolType2761);
            iv_ruleBoolType=ruleBoolType();

            state._fsp--;

             current =iv_ruleBoolType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolType2771); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolType"


    // $ANTLR start "ruleBoolType"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1278:1: ruleBoolType returns [EObject current=null] : ( () otherlv_1= 'BoolType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1281:28: ( ( () otherlv_1= 'BoolType' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1282:1: ( () otherlv_1= 'BoolType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1282:1: ( () otherlv_1= 'BoolType' ( (lv_name_2_0= ruleEString ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1282:2: () otherlv_1= 'BoolType' ( (lv_name_2_0= ruleEString ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1282:2: ()
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1283:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBoolTypeAccess().getBoolTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBoolType2817); 

                	newLeafNode(otherlv_1, grammarAccess.getBoolTypeAccess().getBoolTypeKeyword_1());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1292:1: ( (lv_name_2_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1293:1: (lv_name_2_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1293:1: (lv_name_2_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1294:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBoolTypeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBoolType2838);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBoolTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolType"


    // $ANTLR start "entryRuleStateMachine"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1318:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1319:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1320:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine2874);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine2884); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1327:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) otherlv_5= 'nodes' otherlv_6= '{' ( (lv_nodes_7_0= ruleStateMachineState ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleStateMachineState ) ) )* otherlv_10= '}' (otherlv_11= 'firingRules' otherlv_12= '{' ( (lv_firingRules_13_0= ruleFiringRule ) ) (otherlv_14= ',' ( (lv_firingRules_15_0= ruleFiringRule ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_nodes_7_0 = null;

        EObject lv_nodes_9_0 = null;

        EObject lv_firingRules_13_0 = null;

        EObject lv_firingRules_15_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1330:28: ( (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) otherlv_5= 'nodes' otherlv_6= '{' ( (lv_nodes_7_0= ruleStateMachineState ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleStateMachineState ) ) )* otherlv_10= '}' (otherlv_11= 'firingRules' otherlv_12= '{' ( (lv_firingRules_13_0= ruleFiringRule ) ) (otherlv_14= ',' ( (lv_firingRules_15_0= ruleFiringRule ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1331:1: (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) otherlv_5= 'nodes' otherlv_6= '{' ( (lv_nodes_7_0= ruleStateMachineState ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleStateMachineState ) ) )* otherlv_10= '}' (otherlv_11= 'firingRules' otherlv_12= '{' ( (lv_firingRules_13_0= ruleFiringRule ) ) (otherlv_14= ',' ( (lv_firingRules_15_0= ruleFiringRule ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1331:1: (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) otherlv_5= 'nodes' otherlv_6= '{' ( (lv_nodes_7_0= ruleStateMachineState ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleStateMachineState ) ) )* otherlv_10= '}' (otherlv_11= 'firingRules' otherlv_12= '{' ( (lv_firingRules_13_0= ruleFiringRule ) ) (otherlv_14= ',' ( (lv_firingRules_15_0= ruleFiringRule ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1331:3: otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initialState' ( ( ruleEString ) ) otherlv_5= 'nodes' otherlv_6= '{' ( (lv_nodes_7_0= ruleStateMachineState ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleStateMachineState ) ) )* otherlv_10= '}' (otherlv_11= 'firingRules' otherlv_12= '{' ( (lv_firingRules_13_0= ruleFiringRule ) ) (otherlv_14= ',' ( (lv_firingRules_15_0= ruleFiringRule ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleStateMachine2921); 

                	newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1335:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1336:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1336:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1337:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachine2942);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine2954); 

                	newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleStateMachine2966); 

                	newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getInitialStateKeyword_3());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1361:1: ( ( ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1362:1: ( ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1362:1: ( ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1363:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateMachineRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getInitialStateStateMachineStateCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachine2989);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStateMachine3001); 

                	newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getNodesKeyword_5());
                
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine3013); 

                	newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1384:1: ( (lv_nodes_7_0= ruleStateMachineState ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1385:1: (lv_nodes_7_0= ruleStateMachineState )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1385:1: (lv_nodes_7_0= ruleStateMachineState )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1386:3: lv_nodes_7_0= ruleStateMachineState
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getNodesStateMachineStateParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMachineState_in_ruleStateMachine3034);
            lv_nodes_7_0=ruleStateMachineState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	        }
                   		add(
                   			current, 
                   			"nodes",
                    		lv_nodes_7_0, 
                    		"StateMachineState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1402:2: (otherlv_8= ',' ( (lv_nodes_9_0= ruleStateMachineState ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1402:4: otherlv_8= ',' ( (lv_nodes_9_0= ruleStateMachineState ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine3047); 

            	        	newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getCommaKeyword_8_0());
            	        
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1406:1: ( (lv_nodes_9_0= ruleStateMachineState ) )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1407:1: (lv_nodes_9_0= ruleStateMachineState )
            	    {
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1407:1: (lv_nodes_9_0= ruleStateMachineState )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1408:3: lv_nodes_9_0= ruleStateMachineState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getNodesStateMachineStateParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleStateMachineState_in_ruleStateMachine3068);
            	    lv_nodes_9_0=ruleStateMachineState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_9_0, 
            	            		"StateMachineState");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine3082); 

                	newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_9());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1428:1: (otherlv_11= 'firingRules' otherlv_12= '{' ( (lv_firingRules_13_0= ruleFiringRule ) ) (otherlv_14= ',' ( (lv_firingRules_15_0= ruleFiringRule ) ) )* otherlv_16= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1428:3: otherlv_11= 'firingRules' otherlv_12= '{' ( (lv_firingRules_13_0= ruleFiringRule ) ) (otherlv_14= ',' ( (lv_firingRules_15_0= ruleFiringRule ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleStateMachine3095); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getFiringRulesKeyword_10_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine3107); 

                        	newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1436:1: ( (lv_firingRules_13_0= ruleFiringRule ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1437:1: (lv_firingRules_13_0= ruleFiringRule )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1437:1: (lv_firingRules_13_0= ruleFiringRule )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1438:3: lv_firingRules_13_0= ruleFiringRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getFiringRulesFiringRuleParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFiringRule_in_ruleStateMachine3128);
                    lv_firingRules_13_0=ruleFiringRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"firingRules",
                            		lv_firingRules_13_0, 
                            		"FiringRule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1454:2: (otherlv_14= ',' ( (lv_firingRules_15_0= ruleFiringRule ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1454:4: otherlv_14= ',' ( (lv_firingRules_15_0= ruleFiringRule ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine3141); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1458:1: ( (lv_firingRules_15_0= ruleFiringRule ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1459:1: (lv_firingRules_15_0= ruleFiringRule )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1459:1: (lv_firingRules_15_0= ruleFiringRule )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1460:3: lv_firingRules_15_0= ruleFiringRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getFiringRulesFiringRuleParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFiringRule_in_ruleStateMachine3162);
                    	    lv_firingRules_15_0=ruleFiringRule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"firingRules",
                    	            		lv_firingRules_15_0, 
                    	            		"FiringRule");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine3176); 

                        	newLeafNode(otherlv_16, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine3190); 

                	newLeafNode(otherlv_17, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleStateMachineState"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1492:1: entryRuleStateMachineState returns [EObject current=null] : iv_ruleStateMachineState= ruleStateMachineState EOF ;
    public final EObject entryRuleStateMachineState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachineState = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1493:2: (iv_ruleStateMachineState= ruleStateMachineState EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1494:2: iv_ruleStateMachineState= ruleStateMachineState EOF
            {
             newCompositeNode(grammarAccess.getStateMachineStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachineState_in_entryRuleStateMachineState3226);
            iv_ruleStateMachineState=ruleStateMachineState();

            state._fsp--;

             current =iv_ruleStateMachineState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachineState3236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachineState"


    // $ANTLR start "ruleStateMachineState"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1501:1: ruleStateMachineState returns [EObject current=null] : ( () otherlv_1= 'StateMachineState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputTransitions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputTransitions' otherlv_11= '{' ( (lv_outputTransitions_12_0= ruleStateMachineTransition ) ) (otherlv_13= ',' ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleStateMachineState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_outputTransitions_12_0 = null;

        EObject lv_outputTransitions_14_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1504:28: ( ( () otherlv_1= 'StateMachineState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputTransitions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputTransitions' otherlv_11= '{' ( (lv_outputTransitions_12_0= ruleStateMachineTransition ) ) (otherlv_13= ',' ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1505:1: ( () otherlv_1= 'StateMachineState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputTransitions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputTransitions' otherlv_11= '{' ( (lv_outputTransitions_12_0= ruleStateMachineTransition ) ) (otherlv_13= ',' ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1505:1: ( () otherlv_1= 'StateMachineState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputTransitions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputTransitions' otherlv_11= '{' ( (lv_outputTransitions_12_0= ruleStateMachineTransition ) ) (otherlv_13= ',' ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1505:2: () otherlv_1= 'StateMachineState' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'inputTransitions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outputTransitions' otherlv_11= '{' ( (lv_outputTransitions_12_0= ruleStateMachineTransition ) ) (otherlv_13= ',' ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1505:2: ()
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1506:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateMachineStateAccess().getStateMachineStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleStateMachineState3282); 

                	newLeafNode(otherlv_1, grammarAccess.getStateMachineStateAccess().getStateMachineStateKeyword_1());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1515:1: ( (lv_name_2_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1516:1: (lv_name_2_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1516:1: (lv_name_2_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1517:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachineState3303);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachineState3315); 

                	newLeafNode(otherlv_3, grammarAccess.getStateMachineStateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1537:1: (otherlv_4= 'inputTransitions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1537:3: otherlv_4= 'inputTransitions' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleStateMachineState3328); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateMachineStateAccess().getInputTransitionsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStateMachineState3340); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateMachineStateAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1545:1: ( ( ruleEString ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1546:1: ( ruleEString )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1546:1: ( ruleEString )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1547:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateMachineStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateMachineStateAccess().getInputTransitionsStateMachineTransitionCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachineState3363);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1560:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1560:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachineState3376); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getStateMachineStateAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1564:1: ( ( ruleEString ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1565:1: ( ruleEString )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1565:1: ( ruleEString )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1566:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateMachineStateRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineStateAccess().getInputTransitionsStateMachineTransitionCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachineState3399);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStateMachineState3413); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateMachineStateAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1583:3: (otherlv_10= 'outputTransitions' otherlv_11= '{' ( (lv_outputTransitions_12_0= ruleStateMachineTransition ) ) (otherlv_13= ',' ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) ) )* otherlv_15= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1583:5: otherlv_10= 'outputTransitions' otherlv_11= '{' ( (lv_outputTransitions_12_0= ruleStateMachineTransition ) ) (otherlv_13= ',' ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleStateMachineState3428); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateMachineStateAccess().getOutputTransitionsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachineState3440); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateMachineStateAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1591:1: ( (lv_outputTransitions_12_0= ruleStateMachineTransition ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1592:1: (lv_outputTransitions_12_0= ruleStateMachineTransition )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1592:1: (lv_outputTransitions_12_0= ruleStateMachineTransition )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1593:3: lv_outputTransitions_12_0= ruleStateMachineTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineStateAccess().getOutputTransitionsStateMachineTransitionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStateMachineTransition_in_ruleStateMachineState3461);
                    lv_outputTransitions_12_0=ruleStateMachineTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineStateRule());
                    	        }
                           		add(
                           			current, 
                           			"outputTransitions",
                            		lv_outputTransitions_12_0, 
                            		"StateMachineTransition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1609:2: (otherlv_13= ',' ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1609:4: otherlv_13= ',' ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachineState3474); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getStateMachineStateAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1613:1: ( (lv_outputTransitions_14_0= ruleStateMachineTransition ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1614:1: (lv_outputTransitions_14_0= ruleStateMachineTransition )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1614:1: (lv_outputTransitions_14_0= ruleStateMachineTransition )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1615:3: lv_outputTransitions_14_0= ruleStateMachineTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineStateAccess().getOutputTransitionsStateMachineTransitionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStateMachineTransition_in_ruleStateMachineState3495);
                    	    lv_outputTransitions_14_0=ruleStateMachineTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"outputTransitions",
                    	            		lv_outputTransitions_14_0, 
                    	            		"StateMachineTransition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachineState3509); 

                        	newLeafNode(otherlv_15, grammarAccess.getStateMachineStateAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachineState3523); 

                	newLeafNode(otherlv_16, grammarAccess.getStateMachineStateAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachineState"


    // $ANTLR start "entryRuleFiringRule"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1647:1: entryRuleFiringRule returns [EObject current=null] : iv_ruleFiringRule= ruleFiringRule EOF ;
    public final EObject entryRuleFiringRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFiringRule = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1648:2: (iv_ruleFiringRule= ruleFiringRule EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1649:2: iv_ruleFiringRule= ruleFiringRule EOF
            {
             newCompositeNode(grammarAccess.getFiringRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFiringRule_in_entryRuleFiringRule3559);
            iv_ruleFiringRule=ruleFiringRule();

            state._fsp--;

             current =iv_ruleFiringRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFiringRule3569); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFiringRule"


    // $ANTLR start "ruleFiringRule"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1656:1: ruleFiringRule returns [EObject current=null] : (otherlv_0= 'FiringRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'compType' ( (lv_compType_4_0= ruleComparation ) ) )? otherlv_5= 'channel' ( ( ruleEString ) ) otherlv_7= 'tokens' otherlv_8= '{' ( (lv_tokens_9_0= ruleToken ) ) otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleFiringRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_compType_4_0 = null;

        EObject lv_tokens_9_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1659:28: ( (otherlv_0= 'FiringRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'compType' ( (lv_compType_4_0= ruleComparation ) ) )? otherlv_5= 'channel' ( ( ruleEString ) ) otherlv_7= 'tokens' otherlv_8= '{' ( (lv_tokens_9_0= ruleToken ) ) otherlv_10= '}' otherlv_11= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1660:1: (otherlv_0= 'FiringRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'compType' ( (lv_compType_4_0= ruleComparation ) ) )? otherlv_5= 'channel' ( ( ruleEString ) ) otherlv_7= 'tokens' otherlv_8= '{' ( (lv_tokens_9_0= ruleToken ) ) otherlv_10= '}' otherlv_11= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1660:1: (otherlv_0= 'FiringRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'compType' ( (lv_compType_4_0= ruleComparation ) ) )? otherlv_5= 'channel' ( ( ruleEString ) ) otherlv_7= 'tokens' otherlv_8= '{' ( (lv_tokens_9_0= ruleToken ) ) otherlv_10= '}' otherlv_11= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1660:3: otherlv_0= 'FiringRule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'compType' ( (lv_compType_4_0= ruleComparation ) ) )? otherlv_5= 'channel' ( ( ruleEString ) ) otherlv_7= 'tokens' otherlv_8= '{' ( (lv_tokens_9_0= ruleToken ) ) otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleFiringRule3606); 

                	newLeafNode(otherlv_0, grammarAccess.getFiringRuleAccess().getFiringRuleKeyword_0());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1664:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1665:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1665:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1666:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFiringRuleAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFiringRule3627);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFiringRuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFiringRule3639); 

                	newLeafNode(otherlv_2, grammarAccess.getFiringRuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1686:1: (otherlv_3= 'compType' ( (lv_compType_4_0= ruleComparation ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1686:3: otherlv_3= 'compType' ( (lv_compType_4_0= ruleComparation ) )
                    {
                    otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleFiringRule3652); 

                        	newLeafNode(otherlv_3, grammarAccess.getFiringRuleAccess().getCompTypeKeyword_3_0());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1690:1: ( (lv_compType_4_0= ruleComparation ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1691:1: (lv_compType_4_0= ruleComparation )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1691:1: (lv_compType_4_0= ruleComparation )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1692:3: lv_compType_4_0= ruleComparation
                    {
                     
                    	        newCompositeNode(grammarAccess.getFiringRuleAccess().getCompTypeComparationEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComparation_in_ruleFiringRule3673);
                    lv_compType_4_0=ruleComparation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFiringRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"compType",
                            		lv_compType_4_0, 
                            		"Comparation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleFiringRule3687); 

                	newLeafNode(otherlv_5, grammarAccess.getFiringRuleAccess().getChannelKeyword_4());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1712:1: ( ( ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1713:1: ( ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1713:1: ( ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1714:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFiringRuleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFiringRuleAccess().getChannelChannelCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFiringRule3710);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleFiringRule3722); 

                	newLeafNode(otherlv_7, grammarAccess.getFiringRuleAccess().getTokensKeyword_6());
                
            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFiringRule3734); 

                	newLeafNode(otherlv_8, grammarAccess.getFiringRuleAccess().getLeftCurlyBracketKeyword_7());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1735:1: ( (lv_tokens_9_0= ruleToken ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1736:1: (lv_tokens_9_0= ruleToken )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1736:1: (lv_tokens_9_0= ruleToken )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1737:3: lv_tokens_9_0= ruleToken
            {
             
            	        newCompositeNode(grammarAccess.getFiringRuleAccess().getTokensTokenParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleToken_in_ruleFiringRule3755);
            lv_tokens_9_0=ruleToken();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFiringRuleRule());
            	        }
                   		set(
                   			current, 
                   			"tokens",
                    		lv_tokens_9_0, 
                    		"Token");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFiringRule3767); 

                	newLeafNode(otherlv_10, grammarAccess.getFiringRuleAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFiringRule3779); 

                	newLeafNode(otherlv_11, grammarAccess.getFiringRuleAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFiringRule"


    // $ANTLR start "entryRuleStateMachineTransition"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1769:1: entryRuleStateMachineTransition returns [EObject current=null] : iv_ruleStateMachineTransition= ruleStateMachineTransition EOF ;
    public final EObject entryRuleStateMachineTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachineTransition = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1770:2: (iv_ruleStateMachineTransition= ruleStateMachineTransition EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1771:2: iv_ruleStateMachineTransition= ruleStateMachineTransition EOF
            {
             newCompositeNode(grammarAccess.getStateMachineTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachineTransition_in_entryRuleStateMachineTransition3815);
            iv_ruleStateMachineTransition=ruleStateMachineTransition();

            state._fsp--;

             current =iv_ruleStateMachineTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachineTransition3825); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachineTransition"


    // $ANTLR start "ruleStateMachineTransition"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1778:1: ruleStateMachineTransition returns [EObject current=null] : (otherlv_0= 'StateMachineTransition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= ruleEInt ) ) otherlv_5= 'toState' ( ( ruleEString ) ) (otherlv_7= 'inputs' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'outputs' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) ;
    public final EObject ruleStateMachineTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_priority_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1781:28: ( (otherlv_0= 'StateMachineTransition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= ruleEInt ) ) otherlv_5= 'toState' ( ( ruleEString ) ) (otherlv_7= 'inputs' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'outputs' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1782:1: (otherlv_0= 'StateMachineTransition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= ruleEInt ) ) otherlv_5= 'toState' ( ( ruleEString ) ) (otherlv_7= 'inputs' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'outputs' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1782:1: (otherlv_0= 'StateMachineTransition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= ruleEInt ) ) otherlv_5= 'toState' ( ( ruleEString ) ) (otherlv_7= 'inputs' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'outputs' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1782:3: otherlv_0= 'StateMachineTransition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'priority' ( (lv_priority_4_0= ruleEInt ) ) otherlv_5= 'toState' ( ( ruleEString ) ) (otherlv_7= 'inputs' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'outputs' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleStateMachineTransition3862); 

                	newLeafNode(otherlv_0, grammarAccess.getStateMachineTransitionAccess().getStateMachineTransitionKeyword_0());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1786:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1787:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1787:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1788:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineTransitionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachineTransition3883);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachineTransition3895); 

                	newLeafNode(otherlv_2, grammarAccess.getStateMachineTransitionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleStateMachineTransition3907); 

                	newLeafNode(otherlv_3, grammarAccess.getStateMachineTransitionAccess().getPriorityKeyword_3());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1812:1: ( (lv_priority_4_0= ruleEInt ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1813:1: (lv_priority_4_0= ruleEInt )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1813:1: (lv_priority_4_0= ruleEInt )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1814:3: lv_priority_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineTransitionAccess().getPriorityEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleStateMachineTransition3928);
            lv_priority_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"priority",
                    		lv_priority_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleStateMachineTransition3940); 

                	newLeafNode(otherlv_5, grammarAccess.getStateMachineTransitionAccess().getToStateKeyword_5());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1834:1: ( ( ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1835:1: ( ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1835:1: ( ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1836:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateMachineTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStateMachineTransitionAccess().getToStateStateMachineStateCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachineTransition3963);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1849:2: (otherlv_7= 'inputs' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1849:4: otherlv_7= 'inputs' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleStateMachineTransition3976); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateMachineTransitionAccess().getInputsKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStateMachineTransition3988); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateMachineTransitionAccess().getLeftParenthesisKeyword_7_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1857:1: ( ( ruleEString ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1858:1: ( ruleEString )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1858:1: ( ruleEString )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1859:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateMachineTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateMachineTransitionAccess().getInputsFiringRuleCrossReference_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachineTransition4011);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1872:2: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1872:4: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachineTransition4024); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getStateMachineTransitionAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1876:1: ( ( ruleEString ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1877:1: ( ruleEString )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1877:1: ( ruleEString )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1878:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateMachineTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineTransitionAccess().getInputsFiringRuleCrossReference_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachineTransition4047);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStateMachineTransition4061); 

                        	newLeafNode(otherlv_12, grammarAccess.getStateMachineTransitionAccess().getRightParenthesisKeyword_7_4());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1895:3: (otherlv_13= 'outputs' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1895:5: otherlv_13= 'outputs' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleStateMachineTransition4076); 

                        	newLeafNode(otherlv_13, grammarAccess.getStateMachineTransitionAccess().getOutputsKeyword_8_0());
                        
                    otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStateMachineTransition4088); 

                        	newLeafNode(otherlv_14, grammarAccess.getStateMachineTransitionAccess().getLeftParenthesisKeyword_8_1());
                        
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1903:1: ( ( ruleEString ) )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1904:1: ( ruleEString )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1904:1: ( ruleEString )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1905:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateMachineTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateMachineTransitionAccess().getOutputsFiringRuleCrossReference_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachineTransition4111);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1918:2: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1918:4: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachineTransition4124); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getStateMachineTransitionAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1922:1: ( ( ruleEString ) )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1923:1: ( ruleEString )
                    	    {
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1923:1: ( ruleEString )
                    	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1924:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateMachineTransitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineTransitionAccess().getOutputsFiringRuleCrossReference_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachineTransition4147);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStateMachineTransition4161); 

                        	newLeafNode(otherlv_18, grammarAccess.getStateMachineTransitionAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachineTransition4175); 

                	newLeafNode(otherlv_19, grammarAccess.getStateMachineTransitionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachineTransition"


    // $ANTLR start "entryRuleEInt"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1953:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1954:2: (iv_ruleEInt= ruleEInt EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1955:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt4212);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt4223); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1962:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1965:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1966:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1966:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1966:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1966:2: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==55) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1967:2: kw= '-'
                    {
                    kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEInt4262); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt4279); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleToken"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1987:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1988:2: (iv_ruleToken= ruleToken EOF )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1989:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleToken_in_entryRuleToken4324);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleToken4334); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1996:1: ruleToken returns [EObject current=null] : (otherlv_0= 'Token' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleEString ) ) )* otherlv_7= '}' otherlv_8= 'type' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:1999:28: ( (otherlv_0= 'Token' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleEString ) ) )* otherlv_7= '}' otherlv_8= 'type' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2000:1: (otherlv_0= 'Token' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleEString ) ) )* otherlv_7= '}' otherlv_8= 'type' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2000:1: (otherlv_0= 'Token' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleEString ) ) )* otherlv_7= '}' otherlv_8= 'type' ( ( ruleEString ) ) otherlv_10= '}' )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2000:3: otherlv_0= 'Token' otherlv_1= '{' otherlv_2= 'value' otherlv_3= '{' ( (lv_value_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_value_6_0= ruleEString ) ) )* otherlv_7= '}' otherlv_8= 'type' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleToken4371); 

                	newLeafNode(otherlv_0, grammarAccess.getTokenAccess().getTokenKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleToken4383); 

                	newLeafNode(otherlv_1, grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleToken4395); 

                	newLeafNode(otherlv_2, grammarAccess.getTokenAccess().getValueKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleToken4407); 

                	newLeafNode(otherlv_3, grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2016:1: ( (lv_value_4_0= ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2017:1: (lv_value_4_0= ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2017:1: (lv_value_4_0= ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2018:3: lv_value_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTokenAccess().getValueEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleToken4428);
            lv_value_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTokenRule());
            	        }
                   		add(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2034:2: (otherlv_5= ',' ( (lv_value_6_0= ruleEString ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==15) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2034:4: otherlv_5= ',' ( (lv_value_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleToken4441); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTokenAccess().getCommaKeyword_5_0());
            	        
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2038:1: ( (lv_value_6_0= ruleEString ) )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2039:1: (lv_value_6_0= ruleEString )
            	    {
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2039:1: (lv_value_6_0= ruleEString )
            	    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2040:3: lv_value_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTokenAccess().getValueEStringParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleToken4462);
            	    lv_value_6_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTokenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_6_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleToken4476); 

                	newLeafNode(otherlv_7, grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleToken4488); 

                	newLeafNode(otherlv_8, grammarAccess.getTokenAccess().getTypeKeyword_7());
                
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2064:1: ( ( ruleEString ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2065:1: ( ruleEString )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2065:1: ( ruleEString )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2066:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTokenRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTokenAccess().getTypeTypeCrossReference_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleToken4511);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleToken4523); 

                	newLeafNode(otherlv_10, grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "ruleProtocol"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2091:1: ruleProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'Paho' ) | (enumLiteral_1= 'Akka' ) ) ;
    public final Enumerator ruleProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2093:28: ( ( (enumLiteral_0= 'Paho' ) | (enumLiteral_1= 'Akka' ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2094:1: ( (enumLiteral_0= 'Paho' ) | (enumLiteral_1= 'Akka' ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2094:1: ( (enumLiteral_0= 'Paho' ) | (enumLiteral_1= 'Akka' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==58) ) {
                alt35=1;
            }
            else if ( (LA35_0==59) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2094:2: (enumLiteral_0= 'Paho' )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2094:2: (enumLiteral_0= 'Paho' )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2094:4: enumLiteral_0= 'Paho'
                    {
                    enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleProtocol4573); 

                            current = grammarAccess.getProtocolAccess().getPahoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProtocolAccess().getPahoEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2100:6: (enumLiteral_1= 'Akka' )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2100:6: (enumLiteral_1= 'Akka' )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2100:8: enumLiteral_1= 'Akka'
                    {
                    enumLiteral_1=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleProtocol4590); 

                            current = grammarAccess.getProtocolAccess().getAkkaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getProtocolAccess().getAkkaEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "ruleComparation"
    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2110:1: ruleComparation returns [Enumerator current=null] : ( (enumLiteral_0= 'Equal' ) | (enumLiteral_1= 'NotEqual' ) | (enumLiteral_2= 'Less' ) | (enumLiteral_3= 'Greater' ) ) ;
    public final Enumerator ruleComparation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2112:28: ( ( (enumLiteral_0= 'Equal' ) | (enumLiteral_1= 'NotEqual' ) | (enumLiteral_2= 'Less' ) | (enumLiteral_3= 'Greater' ) ) )
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2113:1: ( (enumLiteral_0= 'Equal' ) | (enumLiteral_1= 'NotEqual' ) | (enumLiteral_2= 'Less' ) | (enumLiteral_3= 'Greater' ) )
            {
            // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2113:1: ( (enumLiteral_0= 'Equal' ) | (enumLiteral_1= 'NotEqual' ) | (enumLiteral_2= 'Less' ) | (enumLiteral_3= 'Greater' ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt36=1;
                }
                break;
            case 61:
                {
                alt36=2;
                }
                break;
            case 62:
                {
                alt36=3;
                }
                break;
            case 63:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2113:2: (enumLiteral_0= 'Equal' )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2113:2: (enumLiteral_0= 'Equal' )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2113:4: enumLiteral_0= 'Equal'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleComparation4635); 

                            current = grammarAccess.getComparationAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparationAccess().getEqualEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2119:6: (enumLiteral_1= 'NotEqual' )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2119:6: (enumLiteral_1= 'NotEqual' )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2119:8: enumLiteral_1= 'NotEqual'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleComparation4652); 

                            current = grammarAccess.getComparationAccess().getNotEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparationAccess().getNotEqualEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2125:6: (enumLiteral_2= 'Less' )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2125:6: (enumLiteral_2= 'Less' )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2125:8: enumLiteral_2= 'Less'
                    {
                    enumLiteral_2=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleComparation4669); 

                            current = grammarAccess.getComparationAccess().getLessEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparationAccess().getLessEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2131:6: (enumLiteral_3= 'Greater' )
                    {
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2131:6: (enumLiteral_3= 'Greater' )
                    // ../hu.bme.mit.mdsd.pineapple.language/src-gen/hu/bme/mit/mdsd/pineapple/language/parser/antlr/internal/InternalDNLanguage.g:2131:8: enumLiteral_3= 'Greater'
                    {
                    enumLiteral_3=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleComparation4686); 

                            current = grammarAccess.getComparationAccess().getGreaterEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparationAccess().getGreaterEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparation"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDataflowSystem_in_entryRuleDataflowSystem75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataflowSystem85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDataflowSystem122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataflowSystem143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataflowSystem155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDataflowSystem167 = new BitSet(new long[]{0x0C00000000000000L});
        public static final BitSet FOLLOW_ruleProtocol_in_ruleDataflowSystem188 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleDataflowSystem201 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataflowSystem213 = new BitSet(new long[]{0x000000D700000000L});
        public static final BitSet FOLLOW_ruleType_in_ruleDataflowSystem234 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleDataflowSystem247 = new BitSet(new long[]{0x000000D700000000L});
        public static final BitSet FOLLOW_ruleType_in_ruleDataflowSystem268 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleDataflowSystem282 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDataflowSystem296 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataflowSystem308 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleDataflowNet_in_ruleDataflowSystem329 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleDataflowSystem342 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleDataflowNet_in_ruleDataflowSystem363 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleDataflowSystem377 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDataflowSystem390 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataflowSystem402 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleChannel_in_ruleDataflowSystem423 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleDataflowSystem436 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleChannel_in_ruleDataflowSystem457 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleDataflowSystem471 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleDataflowSystem485 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataflowSystem497 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleProcess_in_ruleDataflowSystem518 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleDataflowSystem531 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleProcess_in_ruleDataflowSystem552 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleDataflowSystem566 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDataflowSystem578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType614 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntType_in_ruleType671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringType_in_ruleType698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUserType_in_ruleType725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComplexType_in_ruleType752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleType_in_ruleType779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolType_in_ruleType806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_in_entryRuleNode841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNode851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleNode898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataflowNet_in_ruleNode925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataflowNet_in_entryRuleDataflowNet1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataflowNet1095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleDataflowNet1141 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataflowNet1162 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataflowNet1174 = new BitSet(new long[]{0x000000000F210000L});
        public static final BitSet FOLLOW_21_in_ruleDataflowNet1187 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleDataflowNet1199 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataflowNet1222 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_15_in_ruleDataflowNet1235 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataflowNet1258 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleDataflowNet1272 = new BitSet(new long[]{0x000000000F010000L});
        public static final BitSet FOLLOW_24_in_ruleDataflowNet1287 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleDataflowNet1299 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataflowNet1322 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_15_in_ruleDataflowNet1335 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataflowNet1358 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleDataflowNet1372 = new BitSet(new long[]{0x000000000E010000L});
        public static final BitSet FOLLOW_25_in_ruleDataflowNet1387 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDataflowNet1410 = new BitSet(new long[]{0x000000000C010000L});
        public static final BitSet FOLLOW_26_in_ruleDataflowNet1425 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataflowNet1437 = new BitSet(new long[]{0x0000010000100000L});
        public static final BitSet FOLLOW_ruleNode_in_ruleDataflowNet1458 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleDataflowNet1471 = new BitSet(new long[]{0x0000010000100000L});
        public static final BitSet FOLLOW_ruleNode_in_ruleDataflowNet1492 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleDataflowNet1506 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_27_in_ruleDataflowNet1521 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataflowNet1533 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleChannel_in_ruleDataflowNet1554 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleDataflowNet1567 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleChannel_in_ruleDataflowNet1588 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleDataflowNet1602 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDataflowNet1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChannel_in_entryRuleChannel1652 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChannel1662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleChannel1699 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChannel1720 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleChannel1732 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleChannel1744 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleChannel1767 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleChannel1779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess1815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcess1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleProcess1862 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcess1883 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProcess1895 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleProcess1907 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcess1928 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleProcess1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType1976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntType1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleIntType2032 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIntType2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType2089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringType2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleStringType2145 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStringType2166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUserType_in_entryRuleUserType2202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUserType2212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUserType2249 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUserType2270 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUserType2282 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleUserType2294 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUserType2306 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUserType2327 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleUserType2340 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleUserType2361 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleUserType2375 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleUserType2387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType2423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComplexType2433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleComplexType2470 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComplexType2491 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComplexType2503 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleComplexType2515 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleComplexType2527 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComplexType2550 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_15_in_ruleComplexType2563 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComplexType2586 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleComplexType2600 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleComplexType2612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleType_in_entryRuleDoubleType2648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoubleType2658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDoubleType2704 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDoubleType2725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolType_in_entryRuleBoolType2761 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolType2771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleBoolType2817 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBoolType2838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine2874 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine2884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleStateMachine2921 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachine2942 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine2954 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleStateMachine2966 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachine2989 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleStateMachine3001 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine3013 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleStateMachineState_in_ruleStateMachine3034 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine3047 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleStateMachineState_in_ruleStateMachine3068 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine3082 = new BitSet(new long[]{0x0000040000010000L});
        public static final BitSet FOLLOW_42_in_ruleStateMachine3095 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine3107 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleFiringRule_in_ruleStateMachine3128 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine3141 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_ruleFiringRule_in_ruleStateMachine3162 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine3176 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine3190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachineState_in_entryRuleStateMachineState3226 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachineState3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleStateMachineState3282 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachineState3303 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachineState3315 = new BitSet(new long[]{0x0000300000010000L});
        public static final BitSet FOLLOW_44_in_ruleStateMachineState3328 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStateMachineState3340 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachineState3363 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachineState3376 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachineState3399 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleStateMachineState3413 = new BitSet(new long[]{0x0000200000010000L});
        public static final BitSet FOLLOW_45_in_ruleStateMachineState3428 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachineState3440 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleStateMachineTransition_in_ruleStateMachineState3461 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachineState3474 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_ruleStateMachineTransition_in_ruleStateMachineState3495 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachineState3509 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachineState3523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFiringRule_in_entryRuleFiringRule3559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFiringRule3569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleFiringRule3606 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFiringRule3627 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFiringRule3639 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_47_in_ruleFiringRule3652 = new BitSet(new long[]{0xF000000000000000L});
        public static final BitSet FOLLOW_ruleComparation_in_ruleFiringRule3673 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleFiringRule3687 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFiringRule3710 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleFiringRule3722 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFiringRule3734 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_ruleToken_in_ruleFiringRule3755 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFiringRule3767 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleFiringRule3779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachineTransition_in_entryRuleStateMachineTransition3815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachineTransition3825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleStateMachineTransition3862 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachineTransition3883 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachineTransition3895 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleStateMachineTransition3907 = new BitSet(new long[]{0x0080000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleStateMachineTransition3928 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleStateMachineTransition3940 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachineTransition3963 = new BitSet(new long[]{0x0060000000010000L});
        public static final BitSet FOLLOW_53_in_ruleStateMachineTransition3976 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStateMachineTransition3988 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachineTransition4011 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachineTransition4024 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachineTransition4047 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleStateMachineTransition4061 = new BitSet(new long[]{0x0040000000010000L});
        public static final BitSet FOLLOW_54_in_ruleStateMachineTransition4076 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStateMachineTransition4088 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachineTransition4111 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachineTransition4124 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachineTransition4147 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleStateMachineTransition4161 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachineTransition4175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt4212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt4223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleEInt4262 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt4279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleToken_in_entryRuleToken4324 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleToken4334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleToken4371 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleToken4383 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleToken4395 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleToken4407 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleToken4428 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleToken4441 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleToken4462 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleToken4476 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleToken4488 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleToken4511 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleToken4523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleProtocol4573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleProtocol4590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleComparation4635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleComparation4652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleComparation4669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleComparation4686 = new BitSet(new long[]{0x0000000000000002L});
    }


}