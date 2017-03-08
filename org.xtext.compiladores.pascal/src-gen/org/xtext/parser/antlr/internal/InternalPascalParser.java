package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OPERATOR", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_STRING", "RULE_REAL_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_NUMERIC_SUBRANGE", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "'in'", "'='", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'not'", "'while'", "'do'", "'repeat'", "'until'", "'for'", "'to'", "'downto'", "'if'", "'then'", "'else'", "'case'", "'of'", "'with'", "'goto'", "'label'", "'const'", "'type'", "'..'", "'packed'", "'array'", "'record'", "'set'", "'file'", "'var'", "'forward'", "'procedure'", "'function'"
    };
    public static final int T__50=50;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=14;
    public static final int RULE_REAL_NUMBER=11;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_NUMERIC_SUBRANGE=13;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=16;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=18;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_RELATIONAL_OPERATOR=7;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_DIGIT_SEQUENCE=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=20;
    public static final int RULE_MULTIPLICATION_OPERATOR=9;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int T__48=48;
    public static final int RULE_ADDITION_OPERATOR=8;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascal.g"; }



     	private PascalGrammarAccess grammarAccess;

        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "pascal";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulepascal"
    // InternalPascal.g:64:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // InternalPascal.g:64:47: (iv_rulepascal= rulepascal EOF )
            // InternalPascal.g:65:2: iv_rulepascal= rulepascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepascal=rulepascal();

            state._fsp--;

             current =iv_rulepascal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // InternalPascal.g:71:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:77:2: ( ( (lv_program_0_0= ruleprogram ) ) )
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            {
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            {
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            // InternalPascal.g:80:4: lv_program_0_0= ruleprogram
            {

            				newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_program_0_0=ruleprogram();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPascalRule());
            				}
            				add(
            					current,
            					"program",
            					lv_program_0_0,
            					"org.xtext.Pascal.program");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:100:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:100:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:101:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:107:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:113:2: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) )
            // InternalPascal.g:114:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            {
            // InternalPascal.g:114:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            // InternalPascal.g:115:3: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.'
            {
            // InternalPascal.g:115:3: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // InternalPascal.g:116:4: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // InternalPascal.g:116:4: (lv_heading_0_0= ruleprogram_heading_block )
            // InternalPascal.g:117:5: lv_heading_0_0= ruleprogram_heading_block
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_heading_0_0=ruleprogram_heading_block();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.Pascal.program_heading_block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:134:3: ( (lv_block_1_0= ruleblock ) )
            // InternalPascal.g:135:4: (lv_block_1_0= ruleblock )
            {
            // InternalPascal.g:135:4: (lv_block_1_0= ruleblock )
            // InternalPascal.g:136:5: lv_block_1_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_block_1_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"org.xtext.Pascal.block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // InternalPascal.g:161:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // InternalPascal.g:161:62: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // InternalPascal.g:162:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
             newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;

             current =iv_ruleprogram_heading_block; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // InternalPascal.g:168:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifiers_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:174:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // InternalPascal.g:175:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // InternalPascal.g:175:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // InternalPascal.g:176:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
            		
            // InternalPascal.g:180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:181:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:182:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgram_heading_blockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:198:3: (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:199:4: otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalPascal.g:203:4: ( (lv_identifiers_3_0= ruleidentifier_list ) )
                    // InternalPascal.g:204:5: (lv_identifiers_3_0= ruleidentifier_list )
                    {
                    // InternalPascal.g:204:5: (lv_identifiers_3_0= ruleidentifier_list )
                    // InternalPascal.g:205:6: lv_identifiers_3_0= ruleidentifier_list
                    {

                    						newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_identifiers_3_0=ruleidentifier_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgram_heading_blockRule());
                    						}
                    						set(
                    							current,
                    							"identifiers",
                    							lv_identifiers_3_0,
                    							"org.xtext.Pascal.identifier_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascal.g:235:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:235:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:236:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalPascal.g:242:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:248:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:249:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:249:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:250:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:250:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:251:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:251:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:252:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_names_0_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:268:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:269:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:273:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:274:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:274:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:275:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIdentifier_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:296:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:296:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:297:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:303:1: ruleblock returns [EObject current=null] : ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_label_0_0 = null;

        EObject lv_constant_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_abstraction_4_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:309:2: ( ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) )
            // InternalPascal.g:310:2: ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:310:2: ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            // InternalPascal.g:311:3: ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) )
            {
            // InternalPascal.g:311:3: ( (lv_label_0_0= rulelabel_declaration_part ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==59) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:312:4: (lv_label_0_0= rulelabel_declaration_part )
                    {
                    // InternalPascal.g:312:4: (lv_label_0_0= rulelabel_declaration_part )
                    // InternalPascal.g:313:5: lv_label_0_0= rulelabel_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getLabelLabel_declaration_partParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_label_0_0=rulelabel_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"label",
                    						lv_label_0_0,
                    						"org.xtext.Pascal.label_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:330:3: ( (lv_constant_1_0= ruleconstant_definition_part ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==60) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:331:4: (lv_constant_1_0= ruleconstant_definition_part )
                    {
                    // InternalPascal.g:331:4: (lv_constant_1_0= ruleconstant_definition_part )
                    // InternalPascal.g:332:5: lv_constant_1_0= ruleconstant_definition_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_constant_1_0=ruleconstant_definition_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_1_0,
                    						"org.xtext.Pascal.constant_definition_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:349:3: ( (lv_type_2_0= ruletype_definition_part ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==61) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:350:4: (lv_type_2_0= ruletype_definition_part )
                    {
                    // InternalPascal.g:350:4: (lv_type_2_0= ruletype_definition_part )
                    // InternalPascal.g:351:5: lv_type_2_0= ruletype_definition_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_type_2_0=ruletype_definition_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"org.xtext.Pascal.type_definition_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:368:3: ( (lv_variable_3_0= rulevariable_declaration_part ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==68) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:369:4: (lv_variable_3_0= rulevariable_declaration_part )
                    {
                    // InternalPascal.g:369:4: (lv_variable_3_0= rulevariable_declaration_part )
                    // InternalPascal.g:370:5: lv_variable_3_0= rulevariable_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_variable_3_0=rulevariable_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_3_0,
                    						"org.xtext.Pascal.variable_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:387:3: ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=70 && LA7_0<=71)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:388:4: (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part )
                    {
                    // InternalPascal.g:388:4: (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part )
                    // InternalPascal.g:389:5: lv_abstraction_4_0= ruleprocedure_and_function_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getAbstractionProcedure_and_function_declaration_partParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_abstraction_4_0=ruleprocedure_and_function_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"abstraction",
                    						lv_abstraction_4_0,
                    						"org.xtext.Pascal.procedure_and_function_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:406:3: ( (lv_statement_5_0= rulestatement_part ) )
            // InternalPascal.g:407:4: (lv_statement_5_0= rulestatement_part )
            {
            // InternalPascal.g:407:4: (lv_statement_5_0= rulestatement_part )
            // InternalPascal.g:408:5: lv_statement_5_0= rulestatement_part
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_5_0=rulestatement_part();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_5_0,
            						"org.xtext.Pascal.statement_part");
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
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // InternalPascal.g:429:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:429:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:430:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // InternalPascal.g:436:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:442:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:443:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:443:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:444:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:448:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:449:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:449:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:450:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatement_partRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.Pascal.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
            		

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
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // InternalPascal.g:475:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:475:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:476:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // InternalPascal.g:482:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:488:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:489:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:489:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:490:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:490:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:491:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:491:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:492:5: lv_statements_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_statements_0_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_0_0,
            						"org.xtext.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:509:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPascal.g:510:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:514:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:515:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:515:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:516:6: lv_statements_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_2_0,
            	    							"org.xtext.Pascal.statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:538:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:538:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:539:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:545:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;

        EObject lv_structured_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:551:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) )
            // InternalPascal.g:552:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            {
            // InternalPascal.g:552:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:553:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:553:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_SIGNED_INTEGER_NUMBER && LA9_0<=RULE_INTEGER_NUMBER)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:554:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:554:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:555:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:555:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:556:6: lv_label_0_0= rulelabel
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_label_0_0=rulelabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_0_0,
                    							"org.xtext.Pascal.label");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:578:3: ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EOF||LA10_0==RULE_ID||LA10_0==26||LA10_0==29||LA10_0==48||LA10_0==54||LA10_0==58) ) {
                alt10=1;
            }
            else if ( (LA10_0==28||LA10_0==45||LA10_0==47||LA10_0==49||LA10_0==52||LA10_0==55||LA10_0==57) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:579:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:579:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    // InternalPascal.g:580:5: (lv_simple_2_0= rulesimple_statement )
                    {
                    // InternalPascal.g:580:5: (lv_simple_2_0= rulesimple_statement )
                    // InternalPascal.g:581:6: lv_simple_2_0= rulesimple_statement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_simple_2_0=rulesimple_statement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"simple",
                    							lv_simple_2_0,
                    							"org.xtext.Pascal.simple_statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:599:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:599:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    // InternalPascal.g:600:5: (lv_structured_3_0= rulestructured_statement )
                    {
                    // InternalPascal.g:600:5: (lv_structured_3_0= rulestructured_statement )
                    // InternalPascal.g:601:6: lv_structured_3_0= rulestructured_statement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_structured_3_0=rulestructured_statement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"structured",
                    							lv_structured_3_0,
                    							"org.xtext.Pascal.structured_statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:623:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:623:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:624:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:630:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:636:2: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // InternalPascal.g:637:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // InternalPascal.g:637:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INTEGER_NUMBER) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:638:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:638:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:639:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:639:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:640:5: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_0_0, grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.xtext.Pascal.SIGNED_INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:657:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:657:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:658:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:658:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:659:5: lv_number_1_0= RULE_INTEGER_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_1_0, grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"org.xtext.Pascal.INTEGER_NUMBER");
                    				

                    }


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
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:679:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:679:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:680:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalPascal.g:686:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token lv_function_noargs_3_0=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;

        EObject lv_goto_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:692:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? )
            // InternalPascal.g:693:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            {
            // InternalPascal.g:693:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            int alt12=5;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case 22:
                    case 31:
                    case 32:
                    case 34:
                        {
                        alt12=1;
                        }
                        break;
                    case 24:
                        {
                        alt12=2;
                        }
                        break;
                    case EOF:
                    case 26:
                    case 29:
                    case 48:
                    case 54:
                        {
                        alt12=4;
                        }
                        break;
                }

            }
            else if ( (LA12_0==58) ) {
                alt12=3;
            }
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:694:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:694:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascal.g:695:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:695:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascal.g:696:5: lv_assignment_0_0= ruleassignment_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assignment_0_0=ruleassignment_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"assignment",
                    						lv_assignment_0_0,
                    						"org.xtext.Pascal.assignment_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:714:3: ( (lv_function_1_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:714:3: ( (lv_function_1_0= rulefunction_designator ) )
                    // InternalPascal.g:715:4: (lv_function_1_0= rulefunction_designator )
                    {
                    // InternalPascal.g:715:4: (lv_function_1_0= rulefunction_designator )
                    // InternalPascal.g:716:5: lv_function_1_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_1_0=rulefunction_designator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_1_0,
                    						"org.xtext.Pascal.function_designator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:734:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    {
                    // InternalPascal.g:734:3: ( (lv_goto_2_0= rulegoto_statement ) )
                    // InternalPascal.g:735:4: (lv_goto_2_0= rulegoto_statement )
                    {
                    // InternalPascal.g:735:4: (lv_goto_2_0= rulegoto_statement )
                    // InternalPascal.g:736:5: lv_goto_2_0= rulegoto_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getGotoGoto_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_goto_2_0=rulegoto_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"goto",
                    						lv_goto_2_0,
                    						"org.xtext.Pascal.goto_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:754:3: ( (lv_function_noargs_3_0= RULE_ID ) )
                    {
                    // InternalPascal.g:754:3: ( (lv_function_noargs_3_0= RULE_ID ) )
                    // InternalPascal.g:755:4: (lv_function_noargs_3_0= RULE_ID )
                    {
                    // InternalPascal.g:755:4: (lv_function_noargs_3_0= RULE_ID )
                    // InternalPascal.g:756:5: lv_function_noargs_3_0= RULE_ID
                    {
                    lv_function_noargs_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_function_noargs_3_0, grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_statementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"function_noargs",
                    						lv_function_noargs_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:776:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:776:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:777:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalPascal.g:783:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:789:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:790:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:790:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:791:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:791:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:792:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:792:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:793:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_variable_0_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.xtext.Pascal.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
            		
            // InternalPascal.g:814:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:815:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:815:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:816:5: lv_expression_2_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.Pascal.expression");
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
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:837:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:837:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:838:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:844:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:850:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) )
            // InternalPascal.g:851:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            {
            // InternalPascal.g:851:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            // InternalPascal.g:852:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) )
            {
            // InternalPascal.g:852:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:853:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:853:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:854:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:870:3: ( (lv_variable_1_0= rulevar_ ) )
            // InternalPascal.g:871:4: (lv_variable_1_0= rulevar_ )
            {
            // InternalPascal.g:871:4: (lv_variable_1_0= rulevar_ )
            // InternalPascal.g:872:5: lv_variable_1_0= rulevar_
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_variable_1_0=rulevar_();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.Pascal.var_");
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
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevar_"
    // InternalPascal.g:893:1: entryRulevar_ returns [EObject current=null] : iv_rulevar_= rulevar_ EOF ;
    public final EObject entryRulevar_() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_ = null;


        try {
            // InternalPascal.g:893:45: (iv_rulevar_= rulevar_ EOF )
            // InternalPascal.g:894:2: iv_rulevar_= rulevar_ EOF
            {
             newCompositeNode(grammarAccess.getVar_Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulevar_=rulevar_();

            state._fsp--;

             current =iv_rulevar_; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevar_"


    // $ANTLR start "rulevar_"
    // InternalPascal.g:900:1: rulevar_ returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? ;
    public final EObject rulevar_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_accessor_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_array_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_pointer_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:906:2: ( ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? )
            // InternalPascal.g:907:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            {
            // InternalPascal.g:907:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            int alt13=4;
            switch ( input.LA(1) ) {
                case 32:
                    {
                    alt13=1;
                    }
                    break;
                case 22:
                    {
                    alt13=2;
                    }
                    break;
                case 34:
                    {
                    alt13=3;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // InternalPascal.g:908:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:908:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    // InternalPascal.g:909:4: otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalPascal.g:913:4: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // InternalPascal.g:914:5: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:914:5: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:915:6: lv_expressions_1_0= ruleexpression_list
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"expressions",
                    							lv_expressions_1_0,
                    							"org.xtext.Pascal.expression_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2());
                    			
                    // InternalPascal.g:936:4: ( (lv_array_3_0= rulevar_ ) )
                    // InternalPascal.g:937:5: (lv_array_3_0= rulevar_ )
                    {
                    // InternalPascal.g:937:5: (lv_array_3_0= rulevar_ )
                    // InternalPascal.g:938:6: lv_array_3_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_array_3_0=rulevar_();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"array",
                    							lv_array_3_0,
                    							"org.xtext.Pascal.var_");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:957:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:957:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    // InternalPascal.g:958:4: ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) )
                    {
                    // InternalPascal.g:958:4: ( (lv_accessor_4_0= '.' ) )
                    // InternalPascal.g:959:5: (lv_accessor_4_0= '.' )
                    {
                    // InternalPascal.g:959:5: (lv_accessor_4_0= '.' )
                    // InternalPascal.g:960:6: lv_accessor_4_0= '.'
                    {
                    lv_accessor_4_0=(Token)match(input,22,FOLLOW_5); 

                    						newLeafNode(lv_accessor_4_0, grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVar_Rule());
                    						}
                    						setWithLastConsumed(current, "accessor", true, ".");
                    					

                    }


                    }

                    // InternalPascal.g:972:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalPascal.g:973:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalPascal.g:973:5: (lv_name_5_0= RULE_ID )
                    // InternalPascal.g:974:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVar_Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalPascal.g:990:4: ( (lv_variable_6_0= rulevar_ ) )
                    // InternalPascal.g:991:5: (lv_variable_6_0= rulevar_ )
                    {
                    // InternalPascal.g:991:5: (lv_variable_6_0= rulevar_ )
                    // InternalPascal.g:992:6: lv_variable_6_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variable_6_0=rulevar_();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_6_0,
                    							"org.xtext.Pascal.var_");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1011:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:1011:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    // InternalPascal.g:1012:4: otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0());
                    			
                    // InternalPascal.g:1016:4: ( (lv_pointer_8_0= rulevar_ ) )
                    // InternalPascal.g:1017:5: (lv_pointer_8_0= rulevar_ )
                    {
                    // InternalPascal.g:1017:5: (lv_pointer_8_0= rulevar_ )
                    // InternalPascal.g:1018:6: lv_pointer_8_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pointer_8_0=rulevar_();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"pointer",
                    							lv_pointer_8_0,
                    							"org.xtext.Pascal.var_");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "rulevar_"


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:1040:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:1040:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:1041:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // InternalPascal.g:1047:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1053:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:1054:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:1054:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:1055:3: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:1055:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:1056:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:1056:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:1057:5: lv_expressions_0_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_listRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1074:3: (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:1075:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:1079:4: ( (lv_expressions_2_0= ruleexpression ) )
            	    // InternalPascal.g:1080:5: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:1080:5: (lv_expressions_2_0= ruleexpression )
            	    // InternalPascal.g:1081:6: lv_expressions_2_0= ruleexpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_expressions_2_0=ruleexpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_2_0,
            	    							"org.xtext.Pascal.expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:1103:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:1103:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:1104:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:1110:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1116:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:1117:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:1117:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:1118:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:1118:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:1119:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:1119:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:1120:5: lv_expressions_0_0= rulesimple_expression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_expressions_0_0=rulesimple_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.Pascal.simple_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1137:3: ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_RELATIONAL_OPERATOR||(LA16_0>=35 && LA16_0<=36)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1138:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1138:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) )
                    int alt15=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OPERATOR:
                        {
                        alt15=1;
                        }
                        break;
                    case 35:
                        {
                        alt15=2;
                        }
                        break;
                    case 36:
                        {
                        alt15=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // InternalPascal.g:1139:5: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            {
                            // InternalPascal.g:1139:5: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            // InternalPascal.g:1140:6: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            {
                            // InternalPascal.g:1140:6: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            // InternalPascal.g:1141:7: lv_operators_1_0= RULE_RELATIONAL_OPERATOR
                            {
                            lv_operators_1_0=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_15); 

                            							newLeafNode(lv_operators_1_0, grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPERATORTerminalRuleCall_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"operators",
                            								lv_operators_1_0,
                            								"org.xtext.Pascal.RELATIONAL_OPERATOR");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:1158:5: ( (lv_operators_2_0= 'in' ) )
                            {
                            // InternalPascal.g:1158:5: ( (lv_operators_2_0= 'in' ) )
                            // InternalPascal.g:1159:6: (lv_operators_2_0= 'in' )
                            {
                            // InternalPascal.g:1159:6: (lv_operators_2_0= 'in' )
                            // InternalPascal.g:1160:7: lv_operators_2_0= 'in'
                            {
                            lv_operators_2_0=(Token)match(input,35,FOLLOW_15); 

                            							newLeafNode(lv_operators_2_0, grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_2_0, "in");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPascal.g:1173:5: ( (lv_operators_3_0= '=' ) )
                            {
                            // InternalPascal.g:1173:5: ( (lv_operators_3_0= '=' ) )
                            // InternalPascal.g:1174:6: (lv_operators_3_0= '=' )
                            {
                            // InternalPascal.g:1174:6: (lv_operators_3_0= '=' )
                            // InternalPascal.g:1175:7: lv_operators_3_0= '='
                            {
                            lv_operators_3_0=(Token)match(input,36,FOLLOW_15); 

                            							newLeafNode(lv_operators_3_0, grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_3_0, "=");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalPascal.g:1188:4: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // InternalPascal.g:1189:5: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1189:5: (lv_expressions_4_0= rulesimple_expression )
                    // InternalPascal.g:1190:6: lv_expressions_4_0= rulesimple_expression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_4_0=rulesimple_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_4_0,
                    							"org.xtext.Pascal.simple_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascal.g:1212:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:1214:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1215:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalPascal.g:1224:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        Token lv_prefixOperator_0_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_terms_1_0 = null;

        EObject lv_terms_4_0 = null;

        EObject lv_terms_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:1231:2: ( ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) )
            // InternalPascal.g:1232:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            {
            // InternalPascal.g:1232:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            // InternalPascal.g:1233:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            {
            // InternalPascal.g:1233:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ADDITION_OPERATOR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:1234:4: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    {
                    // InternalPascal.g:1234:4: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    // InternalPascal.g:1235:5: lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR
                    {
                    lv_prefixOperator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_15); 

                    					newLeafNode(lv_prefixOperator_0_0, grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPERATORTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_expressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"prefixOperator",
                    						lv_prefixOperator_0_0,
                    						"org.xtext.Pascal.ADDITION_OPERATOR");
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:1251:3: ( (lv_terms_1_0= ruleterm ) )
            // InternalPascal.g:1252:4: (lv_terms_1_0= ruleterm )
            {
            // InternalPascal.g:1252:4: (lv_terms_1_0= ruleterm )
            // InternalPascal.g:1253:5: lv_terms_1_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_terms_1_0=ruleterm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            					}
            					add(
            						current,
            						"terms",
            						lv_terms_1_0,
            						"org.xtext.Pascal.term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1270:3: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ADDITION_OPERATOR||LA19_0==37) ) {
                    alt19=1;
                }
                else if ( (LA19_0==RULE_INTEGER_NUMBER||LA19_0==RULE_REAL_NUMBER) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPascal.g:1271:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // InternalPascal.g:1271:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // InternalPascal.g:1272:5: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // InternalPascal.g:1272:5: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_ADDITION_OPERATOR) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==37) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalPascal.g:1273:6: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            {
            	            // InternalPascal.g:1273:6: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            // InternalPascal.g:1274:7: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            {
            	            // InternalPascal.g:1274:7: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            // InternalPascal.g:1275:8: lv_operators_2_0= RULE_ADDITION_OPERATOR
            	            {
            	            lv_operators_2_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_15); 

            	            								newLeafNode(lv_operators_2_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_2_0_0_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"operators",
            	            									lv_operators_2_0,
            	            									"org.xtext.Pascal.ADDITION_OPERATOR");
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1292:6: ( (lv_operators_3_0= 'or' ) )
            	            {
            	            // InternalPascal.g:1292:6: ( (lv_operators_3_0= 'or' ) )
            	            // InternalPascal.g:1293:7: (lv_operators_3_0= 'or' )
            	            {
            	            // InternalPascal.g:1293:7: (lv_operators_3_0= 'or' )
            	            // InternalPascal.g:1294:8: lv_operators_3_0= 'or'
            	            {
            	            lv_operators_3_0=(Token)match(input,37,FOLLOW_15); 

            	            								newLeafNode(lv_operators_3_0, grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            								}
            	            								addWithLastConsumed(current, "operators", lv_operators_3_0, "or");
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:1307:5: ( (lv_terms_4_0= ruleterm ) )
            	    // InternalPascal.g:1308:6: (lv_terms_4_0= ruleterm )
            	    {
            	    // InternalPascal.g:1308:6: (lv_terms_4_0= ruleterm )
            	    // InternalPascal.g:1309:7: lv_terms_4_0= ruleterm
            	    {

            	    							newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_terms_4_0=ruleterm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"terms",
            	    								lv_terms_4_0,
            	    								"org.xtext.Pascal.term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:1328:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    {
            	    // InternalPascal.g:1328:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    // InternalPascal.g:1329:5: (lv_terms_5_0= ruleunsigned_number )
            	    {
            	    // InternalPascal.g:1329:5: (lv_terms_5_0= ruleunsigned_number )
            	    // InternalPascal.g:1330:6: lv_terms_5_0= ruleunsigned_number
            	    {

            	    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_terms_5_0=ruleunsigned_number();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_5_0,
            	    							"org.xtext.Pascal.unsigned_number");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:1355:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1355:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1356:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:1362:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        Token lv_operators_4_0=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1368:2: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // InternalPascal.g:1369:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:1369:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // InternalPascal.g:1370:3: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // InternalPascal.g:1370:3: ( (lv_factors_0_0= rulefactor ) )
            // InternalPascal.g:1371:4: (lv_factors_0_0= rulefactor )
            {
            // InternalPascal.g:1371:4: (lv_factors_0_0= rulefactor )
            // InternalPascal.g:1372:5: lv_factors_0_0= rulefactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_factors_0_0=rulefactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_0_0,
            						"org.xtext.Pascal.factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1389:3: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MULTIPLICATION_OPERATOR||(LA21_0>=38 && LA21_0<=40)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPascal.g:1390:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:1390:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OPERATOR:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // InternalPascal.g:1391:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            {
            	            // InternalPascal.g:1391:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            // InternalPascal.g:1392:6: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            {
            	            // InternalPascal.g:1392:6: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            // InternalPascal.g:1393:7: lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR
            	            {
            	            lv_operators_1_0=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_15); 

            	            							newLeafNode(lv_operators_1_0, grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPERATORTerminalRuleCall_1_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"operators",
            	            								lv_operators_1_0,
            	            								"org.xtext.Pascal.MULTIPLICATION_OPERATOR");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1410:5: ( (lv_operators_2_0= 'div' ) )
            	            {
            	            // InternalPascal.g:1410:5: ( (lv_operators_2_0= 'div' ) )
            	            // InternalPascal.g:1411:6: (lv_operators_2_0= 'div' )
            	            {
            	            // InternalPascal.g:1411:6: (lv_operators_2_0= 'div' )
            	            // InternalPascal.g:1412:7: lv_operators_2_0= 'div'
            	            {
            	            lv_operators_2_0=(Token)match(input,38,FOLLOW_15); 

            	            							newLeafNode(lv_operators_2_0, grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_2_0, "div");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalPascal.g:1425:5: ( (lv_operators_3_0= 'mod' ) )
            	            {
            	            // InternalPascal.g:1425:5: ( (lv_operators_3_0= 'mod' ) )
            	            // InternalPascal.g:1426:6: (lv_operators_3_0= 'mod' )
            	            {
            	            // InternalPascal.g:1426:6: (lv_operators_3_0= 'mod' )
            	            // InternalPascal.g:1427:7: lv_operators_3_0= 'mod'
            	            {
            	            lv_operators_3_0=(Token)match(input,39,FOLLOW_15); 

            	            							newLeafNode(lv_operators_3_0, grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_3_0, "mod");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalPascal.g:1440:5: ( (lv_operators_4_0= 'and' ) )
            	            {
            	            // InternalPascal.g:1440:5: ( (lv_operators_4_0= 'and' ) )
            	            // InternalPascal.g:1441:6: (lv_operators_4_0= 'and' )
            	            {
            	            // InternalPascal.g:1441:6: (lv_operators_4_0= 'and' )
            	            // InternalPascal.g:1442:7: lv_operators_4_0= 'and'
            	            {
            	            lv_operators_4_0=(Token)match(input,40,FOLLOW_15); 

            	            							newLeafNode(lv_operators_4_0, grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_4_0, "and");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:1455:4: ( (lv_factors_5_0= rulefactor ) )
            	    // InternalPascal.g:1456:5: (lv_factors_5_0= rulefactor )
            	    {
            	    // InternalPascal.g:1456:5: (lv_factors_5_0= rulefactor )
            	    // InternalPascal.g:1457:6: lv_factors_5_0= rulefactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_factors_5_0=rulefactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factors",
            	    							lv_factors_5_0,
            	    							"org.xtext.Pascal.factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:1479:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1479:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1480:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:1486:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_4_0=null;
        Token lv_boolean_5_0=null;
        Token lv_boolean_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_0_0 = null;

        EObject lv_number_1_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_function_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_not_12_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1492:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) )
            // InternalPascal.g:1493:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            {
            // InternalPascal.g:1493:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            int alt22=10;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:1494:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1494:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1495:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1495:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1496:5: lv_variable_0_0= rulevariable
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_0_0,
                    						"org.xtext.Pascal.variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1514:3: ( (lv_number_1_0= rulenumber ) )
                    {
                    // InternalPascal.g:1514:3: ( (lv_number_1_0= rulenumber ) )
                    // InternalPascal.g:1515:4: (lv_number_1_0= rulenumber )
                    {
                    // InternalPascal.g:1515:4: (lv_number_1_0= rulenumber )
                    // InternalPascal.g:1516:5: lv_number_1_0= rulenumber
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=rulenumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"org.xtext.Pascal.number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1534:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:1534:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:1535:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:1535:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:1536:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1553:3: ( (lv_set_3_0= ruleset ) )
                    {
                    // InternalPascal.g:1553:3: ( (lv_set_3_0= ruleset ) )
                    // InternalPascal.g:1554:4: (lv_set_3_0= ruleset )
                    {
                    // InternalPascal.g:1554:4: (lv_set_3_0= ruleset )
                    // InternalPascal.g:1555:5: lv_set_3_0= ruleset
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_3_0=ruleset();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_3_0,
                    						"org.xtext.Pascal.set");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1573:3: ( (lv_nil_4_0= 'nil' ) )
                    {
                    // InternalPascal.g:1573:3: ( (lv_nil_4_0= 'nil' ) )
                    // InternalPascal.g:1574:4: (lv_nil_4_0= 'nil' )
                    {
                    // InternalPascal.g:1574:4: (lv_nil_4_0= 'nil' )
                    // InternalPascal.g:1575:5: lv_nil_4_0= 'nil'
                    {
                    lv_nil_4_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_nil_4_0, grammarAccess.getFactorAccess().getNilNilKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "nil", true, "nil");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1588:3: ( (lv_boolean_5_0= 'true' ) )
                    {
                    // InternalPascal.g:1588:3: ( (lv_boolean_5_0= 'true' ) )
                    // InternalPascal.g:1589:4: (lv_boolean_5_0= 'true' )
                    {
                    // InternalPascal.g:1589:4: (lv_boolean_5_0= 'true' )
                    // InternalPascal.g:1590:5: lv_boolean_5_0= 'true'
                    {
                    lv_boolean_5_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_boolean_5_0, grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_5_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1603:3: ( (lv_boolean_6_0= 'false' ) )
                    {
                    // InternalPascal.g:1603:3: ( (lv_boolean_6_0= 'false' ) )
                    // InternalPascal.g:1604:4: (lv_boolean_6_0= 'false' )
                    {
                    // InternalPascal.g:1604:4: (lv_boolean_6_0= 'false' )
                    // InternalPascal.g:1605:5: lv_boolean_6_0= 'false'
                    {
                    lv_boolean_6_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_boolean_6_0, grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_6_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1618:3: ( (lv_function_7_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:1618:3: ( (lv_function_7_0= rulefunction_designator ) )
                    // InternalPascal.g:1619:4: (lv_function_7_0= rulefunction_designator )
                    {
                    // InternalPascal.g:1619:4: (lv_function_7_0= rulefunction_designator )
                    // InternalPascal.g:1620:5: lv_function_7_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_7_0=rulefunction_designator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_7_0,
                    						"org.xtext.Pascal.function_designator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:1638:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    {
                    // InternalPascal.g:1638:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    // InternalPascal.g:1639:4: otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalPascal.g:1643:4: ( (lv_expression_9_0= ruleexpression ) )
                    // InternalPascal.g:1644:5: (lv_expression_9_0= ruleexpression )
                    {
                    // InternalPascal.g:1644:5: (lv_expression_9_0= ruleexpression )
                    // InternalPascal.g:1645:6: lv_expression_9_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expression_9_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_9_0,
                    							"org.xtext.Pascal.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalPascal.g:1668:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1668:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    // InternalPascal.g:1669:4: otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                    			
                    // InternalPascal.g:1673:4: ( (lv_not_12_0= rulefactor ) )
                    // InternalPascal.g:1674:5: (lv_not_12_0= rulefactor )
                    {
                    // InternalPascal.g:1674:5: (lv_not_12_0= rulefactor )
                    // InternalPascal.g:1675:6: lv_not_12_0= rulefactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_not_12_0=rulefactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"not",
                    							lv_not_12_0,
                    							"org.xtext.Pascal.factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:1697:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:1697:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:1698:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalPascal.g:1704:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1710:2: ( ( (lv_number_0_0= ruleany_number ) ) )
            // InternalPascal.g:1711:2: ( (lv_number_0_0= ruleany_number ) )
            {
            // InternalPascal.g:1711:2: ( (lv_number_0_0= ruleany_number ) )
            // InternalPascal.g:1712:3: (lv_number_0_0= ruleany_number )
            {
            // InternalPascal.g:1712:3: (lv_number_0_0= ruleany_number )
            // InternalPascal.g:1713:4: lv_number_0_0= ruleany_number
            {

            				newCompositeNode(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_number_0_0=ruleany_number();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberRule());
            				}
            				set(
            					current,
            					"number",
            					lv_number_0_0,
            					"org.xtext.Pascal.any_number");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // InternalPascal.g:1733:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // InternalPascal.g:1733:51: (iv_ruleany_number= ruleany_number EOF )
            // InternalPascal.g:1734:2: iv_ruleany_number= ruleany_number EOF
            {
             newCompositeNode(grammarAccess.getAny_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleany_number=ruleany_number();

            state._fsp--;

             current =iv_ruleany_number; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleany_number"


    // $ANTLR start "ruleany_number"
    // InternalPascal.g:1740:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:1746:2: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // InternalPascal.g:1747:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // InternalPascal.g:1747:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INTEGER_NUMBER||LA23_0==RULE_REAL_NUMBER) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_SIGNED_INTEGER_NUMBER||LA23_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:1748:3: this_unsigned_number_0= ruleunsigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                    			current = this_unsigned_number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1757:3: this_signed_number_1= rulesigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_signed_number_1=rulesigned_number();

                    state._fsp--;


                    			current = this_signed_number_1;
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
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalPascal.g:1769:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:1769:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:1770:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // InternalPascal.g:1776:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1782:2: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // InternalPascal.g:1783:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:1783:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INTEGER_NUMBER) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_REAL_NUMBER) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:1784:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:1784:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:1785:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:1785:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:1786:5: lv_integer_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.Pascal.INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1803:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:1803:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // InternalPascal.g:1804:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // InternalPascal.g:1804:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    // InternalPascal.g:1805:5: lv_real_1_0= RULE_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"real",
                    						lv_real_1_0,
                    						"org.xtext.Pascal.REAL_NUMBER");
                    				

                    }


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
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:1825:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // InternalPascal.g:1825:54: (iv_rulesigned_number= rulesigned_number EOF )
            // InternalPascal.g:1826:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // InternalPascal.g:1832:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1838:2: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // InternalPascal.g:1839:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:1839:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:1840:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:1840:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:1841:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:1841:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:1842:5: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.Pascal.SIGNED_INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1859:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:1859:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // InternalPascal.g:1860:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // InternalPascal.g:1860:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // InternalPascal.g:1861:5: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"real",
                    						lv_real_1_0,
                    						"org.xtext.Pascal.SIGNED_REAL_NUMBER");
                    				

                    }


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
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:1881:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:1881:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:1882:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalPascal.g:1888:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1894:2: ( ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) )
            // InternalPascal.g:1895:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            {
            // InternalPascal.g:1895:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            // InternalPascal.g:1896:3: ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) )
            {
            // InternalPascal.g:1896:3: ( (lv_brackets_0_0= '[' ) )
            // InternalPascal.g:1897:4: (lv_brackets_0_0= '[' )
            {
            // InternalPascal.g:1897:4: (lv_brackets_0_0= '[' )
            // InternalPascal.g:1898:5: lv_brackets_0_0= '['
            {
            lv_brackets_0_0=(Token)match(input,32,FOLLOW_21); 

            					newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
            				

            }


            }

            // InternalPascal.g:1910:3: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INTEGER_NUMBER)||LA26_0==RULE_ADDITION_OPERATOR||(LA26_0>=RULE_STRING && LA26_0<=RULE_SIGNED_REAL_NUMBER)||LA26_0==24||LA26_0==32||(LA26_0>=41 && LA26_0<=44)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:1911:4: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:1911:4: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:1912:5: lv_expressions_1_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSetRule());
                    					}
                    					set(
                    						current,
                    						"expressions",
                    						lv_expressions_1_0,
                    						"org.xtext.Pascal.expression_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:1929:3: ( (lv_brackets_2_0= ']' ) )
            // InternalPascal.g:1930:4: (lv_brackets_2_0= ']' )
            {
            // InternalPascal.g:1930:4: (lv_brackets_2_0= ']' )
            // InternalPascal.g:1931:5: lv_brackets_2_0= ']'
            {
            lv_brackets_2_0=(Token)match(input,33,FOLLOW_2); 

            					newLeafNode(lv_brackets_2_0, grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_2_0, "]");
            				

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
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:1947:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:1947:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:1948:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalPascal.g:1954:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1960:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) )
            // InternalPascal.g:1961:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            {
            // InternalPascal.g:1961:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            // InternalPascal.g:1962:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')'
            {
            // InternalPascal.g:1962:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:1963:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:1963:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:1964:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_designatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:1984:3: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INTEGER_NUMBER)||LA27_0==RULE_ADDITION_OPERATOR||(LA27_0>=RULE_STRING && LA27_0<=RULE_SIGNED_REAL_NUMBER)||LA27_0==24||LA27_0==32||(LA27_0>=41 && LA27_0<=44)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:1985:4: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // InternalPascal.g:1985:4: (lv_expressions_2_0= ruleexpression_list )
                    // InternalPascal.g:1986:5: lv_expressions_2_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_expressions_2_0=ruleexpression_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
                    					}
                    					set(
                    						current,
                    						"expressions",
                    						lv_expressions_2_0,
                    						"org.xtext.Pascal.expression_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:2011:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:2011:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:2012:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalPascal.g:2018:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_0_0 = null;

        EObject lv_repetitive_1_0 = null;

        EObject lv_conditional_2_0 = null;

        EObject lv_withStmt_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2024:2: ( ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) )
            // InternalPascal.g:2025:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            {
            // InternalPascal.g:2025:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt28=1;
                }
                break;
            case 45:
            case 47:
            case 49:
                {
                alt28=2;
                }
                break;
            case 52:
            case 55:
                {
                alt28=3;
                }
                break;
            case 57:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2026:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    {
                    // InternalPascal.g:2026:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    // InternalPascal.g:2027:4: (lv_compound_0_0= rulecompound_statement )
                    {
                    // InternalPascal.g:2027:4: (lv_compound_0_0= rulecompound_statement )
                    // InternalPascal.g:2028:5: lv_compound_0_0= rulecompound_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_compound_0_0=rulecompound_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"compound",
                    						lv_compound_0_0,
                    						"org.xtext.Pascal.compound_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2046:3: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    {
                    // InternalPascal.g:2046:3: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    // InternalPascal.g:2047:4: (lv_repetitive_1_0= rulerepetitive_statement )
                    {
                    // InternalPascal.g:2047:4: (lv_repetitive_1_0= rulerepetitive_statement )
                    // InternalPascal.g:2048:5: lv_repetitive_1_0= rulerepetitive_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitiveRepetitive_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repetitive_1_0=rulerepetitive_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"repetitive",
                    						lv_repetitive_1_0,
                    						"org.xtext.Pascal.repetitive_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2066:3: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    {
                    // InternalPascal.g:2066:3: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    // InternalPascal.g:2067:4: (lv_conditional_2_0= ruleconditional_statement )
                    {
                    // InternalPascal.g:2067:4: (lv_conditional_2_0= ruleconditional_statement )
                    // InternalPascal.g:2068:5: lv_conditional_2_0= ruleconditional_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getConditionalConditional_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_2_0=ruleconditional_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"org.xtext.Pascal.conditional_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2086:3: ( (lv_withStmt_3_0= rulewith_statement ) )
                    {
                    // InternalPascal.g:2086:3: ( (lv_withStmt_3_0= rulewith_statement ) )
                    // InternalPascal.g:2087:4: (lv_withStmt_3_0= rulewith_statement )
                    {
                    // InternalPascal.g:2087:4: (lv_withStmt_3_0= rulewith_statement )
                    // InternalPascal.g:2088:5: lv_withStmt_3_0= rulewith_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getWithStmtWith_statementParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_withStmt_3_0=rulewith_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"withStmt",
                    						lv_withStmt_3_0,
                    						"org.xtext.Pascal.with_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:2109:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:2109:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:2110:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalPascal.g:2116:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2122:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:2123:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:2123:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:2124:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:2128:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:2129:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:2129:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:2130:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompound_statementRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.Pascal.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
            		

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
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // InternalPascal.g:2155:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // InternalPascal.g:2155:61: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // InternalPascal.g:2156:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // InternalPascal.g:2162:1: rulerepetitive_statement returns [EObject current=null] : ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_whileStmt_0_0 = null;

        EObject lv_repeatStmt_1_0 = null;

        EObject lv_forStmt_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2168:2: ( ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) )
            // InternalPascal.g:2169:2: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            {
            // InternalPascal.g:2169:2: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt29=1;
                }
                break;
            case 47:
                {
                alt29=2;
                }
                break;
            case 49:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2170:3: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    {
                    // InternalPascal.g:2170:3: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    // InternalPascal.g:2171:4: (lv_whileStmt_0_0= rulewhile_statement )
                    {
                    // InternalPascal.g:2171:4: (lv_whileStmt_0_0= rulewhile_statement )
                    // InternalPascal.g:2172:5: lv_whileStmt_0_0= rulewhile_statement
                    {

                    					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhileStmtWhile_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_whileStmt_0_0=rulewhile_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    					}
                    					set(
                    						current,
                    						"whileStmt",
                    						lv_whileStmt_0_0,
                    						"org.xtext.Pascal.while_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2190:3: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    {
                    // InternalPascal.g:2190:3: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    // InternalPascal.g:2191:4: (lv_repeatStmt_1_0= rulerepeat_statement )
                    {
                    // InternalPascal.g:2191:4: (lv_repeatStmt_1_0= rulerepeat_statement )
                    // InternalPascal.g:2192:5: lv_repeatStmt_1_0= rulerepeat_statement
                    {

                    					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeatStmtRepeat_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repeatStmt_1_0=rulerepeat_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    					}
                    					set(
                    						current,
                    						"repeatStmt",
                    						lv_repeatStmt_1_0,
                    						"org.xtext.Pascal.repeat_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2210:3: ( (lv_forStmt_2_0= rulefor_statement ) )
                    {
                    // InternalPascal.g:2210:3: ( (lv_forStmt_2_0= rulefor_statement ) )
                    // InternalPascal.g:2211:4: (lv_forStmt_2_0= rulefor_statement )
                    {
                    // InternalPascal.g:2211:4: (lv_forStmt_2_0= rulefor_statement )
                    // InternalPascal.g:2212:5: lv_forStmt_2_0= rulefor_statement
                    {

                    					newCompositeNode(grammarAccess.getRepetitive_statementAccess().getForStmtFor_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_forStmt_2_0=rulefor_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    					}
                    					set(
                    						current,
                    						"forStmt",
                    						lv_forStmt_2_0,
                    						"org.xtext.Pascal.for_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulewhile_statement"
    // InternalPascal.g:2233:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // InternalPascal.g:2233:56: (iv_rulewhile_statement= rulewhile_statement EOF )
            // InternalPascal.g:2234:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // InternalPascal.g:2240:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2246:2: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) ) )
            // InternalPascal.g:2247:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            {
            // InternalPascal.g:2247:2: (otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) ) )
            // InternalPascal.g:2248:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'do' ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
            		
            // InternalPascal.g:2252:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:2253:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:2253:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:2254:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
            		
            // InternalPascal.g:2275:3: ( (lv_statement_3_0= rulestatement ) )
            // InternalPascal.g:2276:4: (lv_statement_3_0= rulestatement )
            {
            // InternalPascal.g:2276:4: (lv_statement_3_0= rulestatement )
            // InternalPascal.g:2277:5: lv_statement_3_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_3_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"org.xtext.Pascal.statement");
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
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulerepeat_statement"
    // InternalPascal.g:2298:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // InternalPascal.g:2298:57: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // InternalPascal.g:2299:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
             newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;

             current =iv_rulerepeat_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerepeat_statement"


    // $ANTLR start "rulerepeat_statement"
    // InternalPascal.g:2305:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2311:2: ( (otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) ) )
            // InternalPascal.g:2312:2: (otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // InternalPascal.g:2312:2: (otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) ) )
            // InternalPascal.g:2313:3: otherlv_0= 'repeat' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
            		
            // InternalPascal.g:2317:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:2318:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:2318:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:2319:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getRepeat_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.Pascal.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2());
            		
            // InternalPascal.g:2340:3: ( (lv_expression_3_0= ruleexpression ) )
            // InternalPascal.g:2341:4: (lv_expression_3_0= ruleexpression )
            {
            // InternalPascal.g:2341:4: (lv_expression_3_0= ruleexpression )
            // InternalPascal.g:2342:5: lv_expression_3_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.Pascal.expression");
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
    // $ANTLR end "rulerepeat_statement"


    // $ANTLR start "entryRulefor_statement"
    // InternalPascal.g:2363:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // InternalPascal.g:2363:54: (iv_rulefor_statement= rulefor_statement EOF )
            // InternalPascal.g:2364:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // InternalPascal.g:2370:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) ) ;
    public final EObject rulefor_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assignment_1_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_statement_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2376:2: ( (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) ) )
            // InternalPascal.g:2377:2: (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) )
            {
            // InternalPascal.g:2377:2: (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) )
            // InternalPascal.g:2378:3: otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
            		
            // InternalPascal.g:2382:3: ( (lv_assignment_1_0= ruleassignment_statement ) )
            // InternalPascal.g:2383:4: (lv_assignment_1_0= ruleassignment_statement )
            {
            // InternalPascal.g:2383:4: (lv_assignment_1_0= ruleassignment_statement )
            // InternalPascal.g:2384:5: lv_assignment_1_0= ruleassignment_statement
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_assignment_1_0=ruleassignment_statement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"assignment",
            						lv_assignment_1_0,
            						"org.xtext.Pascal.assignment_statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2401:3: (otherlv_2= 'to' | otherlv_3= 'downto' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            else if ( (LA30_0==51) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:2402:4: otherlv_2= 'to'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getFor_statementAccess().getToKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2407:4: otherlv_3= 'downto'
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:2412:3: ( (lv_expression_4_0= ruleexpression ) )
            // InternalPascal.g:2413:4: (lv_expression_4_0= ruleexpression )
            {
            // InternalPascal.g:2413:4: (lv_expression_4_0= ruleexpression )
            // InternalPascal.g:2414:5: lv_expression_4_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_expression_4_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"org.xtext.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDoKeyword_4());
            		
            // InternalPascal.g:2435:3: ( (lv_statement_6_0= rulestatement ) )
            // InternalPascal.g:2436:4: (lv_statement_6_0= rulestatement )
            {
            // InternalPascal.g:2436:4: (lv_statement_6_0= rulestatement )
            // InternalPascal.g:2437:5: lv_statement_6_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_6_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_6_0,
            						"org.xtext.Pascal.statement");
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
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // InternalPascal.g:2458:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // InternalPascal.g:2458:62: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // InternalPascal.g:2459:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // InternalPascal.g:2465:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifStmt_0_0 = null;

        EObject lv_caseStmt_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2471:2: ( ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) )
            // InternalPascal.g:2472:2: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            {
            // InternalPascal.g:2472:2: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            else if ( (LA31_0==55) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalPascal.g:2473:3: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    {
                    // InternalPascal.g:2473:3: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    // InternalPascal.g:2474:4: (lv_ifStmt_0_0= ruleif_statement )
                    {
                    // InternalPascal.g:2474:4: (lv_ifStmt_0_0= ruleif_statement )
                    // InternalPascal.g:2475:5: lv_ifStmt_0_0= ruleif_statement
                    {

                    					newCompositeNode(grammarAccess.getConditional_statementAccess().getIfStmtIf_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ifStmt_0_0=ruleif_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    					}
                    					set(
                    						current,
                    						"ifStmt",
                    						lv_ifStmt_0_0,
                    						"org.xtext.Pascal.if_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2493:3: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    {
                    // InternalPascal.g:2493:3: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    // InternalPascal.g:2494:4: (lv_caseStmt_1_0= rulecase_statement )
                    {
                    // InternalPascal.g:2494:4: (lv_caseStmt_1_0= rulecase_statement )
                    // InternalPascal.g:2495:5: lv_caseStmt_1_0= rulecase_statement
                    {

                    					newCompositeNode(grammarAccess.getConditional_statementAccess().getCaseStmtCase_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_caseStmt_1_0=rulecase_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    					}
                    					set(
                    						current,
                    						"caseStmt",
                    						lv_caseStmt_1_0,
                    						"org.xtext.Pascal.case_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // InternalPascal.g:2516:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // InternalPascal.g:2516:53: (iv_ruleif_statement= ruleif_statement EOF )
            // InternalPascal.g:2517:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // InternalPascal.g:2523:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? ) ;
    public final EObject ruleif_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_elseStatement_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2529:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? ) )
            // InternalPascal.g:2530:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            {
            // InternalPascal.g:2530:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            // InternalPascal.g:2531:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
            		
            // InternalPascal.g:2535:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:2536:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:2536:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:2537:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIf_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
            		
            // InternalPascal.g:2558:3: ( (lv_ifStatement_3_0= rulestatement ) )
            // InternalPascal.g:2559:4: (lv_ifStatement_3_0= rulestatement )
            {
            // InternalPascal.g:2559:4: (lv_ifStatement_3_0= rulestatement )
            // InternalPascal.g:2560:5: lv_ifStatement_3_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_ifStatement_3_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIf_statementRule());
            					}
            					set(
            						current,
            						"ifStatement",
            						lv_ifStatement_3_0,
            						"org.xtext.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2577:3: (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPascal.g:2578:4: otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                    			
                    // InternalPascal.g:2582:4: ( (lv_elseStatement_5_0= rulestatement ) )
                    // InternalPascal.g:2583:5: (lv_elseStatement_5_0= rulestatement )
                    {
                    // InternalPascal.g:2583:5: (lv_elseStatement_5_0= rulestatement )
                    // InternalPascal.g:2584:6: lv_elseStatement_5_0= rulestatement
                    {

                    						newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseStatement_5_0=rulestatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIf_statementRule());
                    						}
                    						set(
                    							current,
                    							"elseStatement",
                    							lv_elseStatement_5_0,
                    							"org.xtext.Pascal.statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRulecase_statement"
    // InternalPascal.g:2606:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // InternalPascal.g:2606:55: (iv_rulecase_statement= rulecase_statement EOF )
            // InternalPascal.g:2607:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // InternalPascal.g:2613:1: rulecase_statement returns [EObject current=null] : (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) ;
    public final EObject rulecase_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_expression_1_0 = null;

        EObject lv_cases_3_0 = null;

        EObject lv_cases_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2619:2: ( (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' ) )
            // InternalPascal.g:2620:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            {
            // InternalPascal.g:2620:2: (otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end' )
            // InternalPascal.g:2621:3: otherlv_0= 'case' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'of' ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= ';' )? otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
            		
            // InternalPascal.g:2625:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:2626:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:2626:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:2627:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
            		
            // InternalPascal.g:2648:3: ( (lv_cases_3_0= rulecase_limb ) )
            // InternalPascal.g:2649:4: (lv_cases_3_0= rulecase_limb )
            {
            // InternalPascal.g:2649:4: (lv_cases_3_0= rulecase_limb )
            // InternalPascal.g:2650:5: lv_cases_3_0= rulecase_limb
            {

            					newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_cases_3_0=rulecase_limb();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_statementRule());
            					}
            					add(
            						current,
            						"cases",
            						lv_cases_3_0,
            						"org.xtext.Pascal.case_limb");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2667:3: (otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    int LA33_1 = input.LA(2);

                    if ( ((LA33_1>=RULE_ID && LA33_1<=RULE_INTEGER_NUMBER)||LA33_1==RULE_ADDITION_OPERATOR||(LA33_1>=RULE_STRING && LA33_1<=RULE_SIGNED_REAL_NUMBER)||(LA33_1>=41 && LA33_1<=43)) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:2668:4: otherlv_4= ';' ( (lv_cases_5_0= rulecase_limb ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_30); 

            	    				newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalPascal.g:2672:4: ( (lv_cases_5_0= rulecase_limb ) )
            	    // InternalPascal.g:2673:5: (lv_cases_5_0= rulecase_limb )
            	    {
            	    // InternalPascal.g:2673:5: (lv_cases_5_0= rulecase_limb )
            	    // InternalPascal.g:2674:6: lv_cases_5_0= rulecase_limb
            	    {

            	    						newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_cases_5_0=rulecase_limb();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cases",
            	    							lv_cases_5_0,
            	    							"org.xtext.Pascal.case_limb");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalPascal.g:2692:3: (otherlv_6= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPascal.g:2693:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCase_statementAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_limb"
    // InternalPascal.g:2706:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // InternalPascal.g:2706:50: (iv_rulecase_limb= rulecase_limb EOF )
            // InternalPascal.g:2707:2: iv_rulecase_limb= rulecase_limb EOF
            {
             newCompositeNode(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;

             current =iv_rulecase_limb; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecase_limb"


    // $ANTLR start "rulecase_limb"
    // InternalPascal.g:2713:1: rulecase_limb returns [EObject current=null] : ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cases_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2719:2: ( ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) ) )
            // InternalPascal.g:2720:2: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            {
            // InternalPascal.g:2720:2: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) ) )
            // InternalPascal.g:2721:3: ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= ':' ( (lv_statement_2_0= rulestatement ) )
            {
            // InternalPascal.g:2721:3: ( (lv_cases_0_0= rulecase_label_list ) )
            // InternalPascal.g:2722:4: (lv_cases_0_0= rulecase_label_list )
            {
            // InternalPascal.g:2722:4: (lv_cases_0_0= rulecase_label_list )
            // InternalPascal.g:2723:5: lv_cases_0_0= rulecase_label_list
            {

            					newCompositeNode(grammarAccess.getCase_limbAccess().getCasesCase_label_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_cases_0_0=rulecase_label_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_limbRule());
            					}
            					set(
            						current,
            						"cases",
            						lv_cases_0_0,
            						"org.xtext.Pascal.case_label_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCase_limbAccess().getColonKeyword_1());
            		
            // InternalPascal.g:2744:3: ( (lv_statement_2_0= rulestatement ) )
            // InternalPascal.g:2745:4: (lv_statement_2_0= rulestatement )
            {
            // InternalPascal.g:2745:4: (lv_statement_2_0= rulestatement )
            // InternalPascal.g:2746:5: lv_statement_2_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getCase_limbAccess().getStatementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_2_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_limbRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_2_0,
            						"org.xtext.Pascal.statement");
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
    // $ANTLR end "rulecase_limb"


    // $ANTLR start "entryRulecase_label_list"
    // InternalPascal.g:2767:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // InternalPascal.g:2767:56: (iv_rulecase_label_list= rulecase_label_list EOF )
            // InternalPascal.g:2768:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // InternalPascal.g:2774:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2780:2: ( ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* ) )
            // InternalPascal.g:2781:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* )
            {
            // InternalPascal.g:2781:2: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )* )
            // InternalPascal.g:2782:3: ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )*
            {
            // InternalPascal.g:2782:3: ( (lv_constants_0_0= ruleconstant ) )
            // InternalPascal.g:2783:4: (lv_constants_0_0= ruleconstant )
            {
            // InternalPascal.g:2783:4: (lv_constants_0_0= ruleconstant )
            // InternalPascal.g:2784:5: lv_constants_0_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_constants_0_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            					}
            					add(
            						current,
            						"constants",
            						lv_constants_0_0,
            						"org.xtext.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2801:3: (otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==27) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPascal.g:2802:4: otherlv_1= ',' ( (lv_constants_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_30); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:2806:4: ( (lv_constants_2_0= ruleconstant ) )
            	    // InternalPascal.g:2807:5: (lv_constants_2_0= ruleconstant )
            	    {
            	    // InternalPascal.g:2807:5: (lv_constants_2_0= ruleconstant )
            	    // InternalPascal.g:2808:6: lv_constants_2_0= ruleconstant
            	    {

            	    						newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_constants_2_0=ruleconstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constants",
            	    							lv_constants_2_0,
            	    							"org.xtext.Pascal.constant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


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
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:2830:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:2830:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:2831:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:2837:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_opterator_0_0=null;
        Token lv_name_1_0=null;
        Token lv_string_3_0=null;
        Token lv_boolLiteral_4_0=null;
        Token lv_boolLiteral_5_0=null;
        Token lv_nil_6_0=null;
        EObject lv_number_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2843:2: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) )
            // InternalPascal.g:2844:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            {
            // InternalPascal.g:2844:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
                {
                alt38=1;
                }
                break;
            case RULE_STRING:
                {
                alt38=2;
                }
                break;
            case 42:
                {
                alt38=3;
                }
                break;
            case 43:
                {
                alt38=4;
                }
                break;
            case 41:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalPascal.g:2845:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalPascal.g:2845:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalPascal.g:2846:4: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalPascal.g:2846:4: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ADDITION_OPERATOR) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalPascal.g:2847:5: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            {
                            // InternalPascal.g:2847:5: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            // InternalPascal.g:2848:6: lv_opterator_0_0= RULE_ADDITION_OPERATOR
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_32); 

                            						newLeafNode(lv_opterator_0_0, grammarAccess.getConstantAccess().getOpteratorADDITION_OPERATORTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConstantRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"opterator",
                            							lv_opterator_0_0,
                            							"org.xtext.Pascal.ADDITION_OPERATOR");
                            					

                            }


                            }
                            break;

                    }

                    // InternalPascal.g:2864:4: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID) ) {
                        alt37=1;
                    }
                    else if ( ((LA37_0>=RULE_SIGNED_INTEGER_NUMBER && LA37_0<=RULE_INTEGER_NUMBER)||(LA37_0>=RULE_REAL_NUMBER && LA37_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalPascal.g:2865:5: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // InternalPascal.g:2865:5: ( (lv_name_1_0= RULE_ID ) )
                            // InternalPascal.g:2866:6: (lv_name_1_0= RULE_ID )
                            {
                            // InternalPascal.g:2866:6: (lv_name_1_0= RULE_ID )
                            // InternalPascal.g:2867:7: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:2884:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalPascal.g:2884:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalPascal.g:2885:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalPascal.g:2885:6: (lv_number_2_0= rulenumber )
                            // InternalPascal.g:2886:7: lv_number_2_0= rulenumber
                            {

                            							newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_number_2_0=rulenumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConstantRule());
                            							}
                            							set(
                            								current,
                            								"number",
                            								lv_number_2_0,
                            								"org.xtext.Pascal.number");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2906:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:2906:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalPascal.g:2907:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalPascal.g:2907:4: (lv_string_3_0= RULE_STRING )
                    // InternalPascal.g:2908:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2925:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    {
                    // InternalPascal.g:2925:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    // InternalPascal.g:2926:4: (lv_boolLiteral_4_0= 'true' )
                    {
                    // InternalPascal.g:2926:4: (lv_boolLiteral_4_0= 'true' )
                    // InternalPascal.g:2927:5: lv_boolLiteral_4_0= 'true'
                    {
                    lv_boolLiteral_4_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_4_0, grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_4_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2940:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    {
                    // InternalPascal.g:2940:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    // InternalPascal.g:2941:4: (lv_boolLiteral_5_0= 'false' )
                    {
                    // InternalPascal.g:2941:4: (lv_boolLiteral_5_0= 'false' )
                    // InternalPascal.g:2942:5: lv_boolLiteral_5_0= 'false'
                    {
                    lv_boolLiteral_5_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_5_0, grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_5_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:2955:3: ( (lv_nil_6_0= 'nil' ) )
                    {
                    // InternalPascal.g:2955:3: ( (lv_nil_6_0= 'nil' ) )
                    // InternalPascal.g:2956:4: (lv_nil_6_0= 'nil' )
                    {
                    // InternalPascal.g:2956:4: (lv_nil_6_0= 'nil' )
                    // InternalPascal.g:2957:5: lv_nil_6_0= 'nil'
                    {
                    lv_nil_6_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_nil_6_0, grammarAccess.getConstantAccess().getNilNilKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "nil", lv_nil_6_0, "nil");
                    				

                    }


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
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRulewith_statement"
    // InternalPascal.g:2973:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // InternalPascal.g:2973:55: (iv_rulewith_statement= rulewith_statement EOF )
            // InternalPascal.g:2974:2: iv_rulewith_statement= rulewith_statement EOF
            {
             newCompositeNode(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;

             current =iv_rulewith_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulewith_statement"


    // $ANTLR start "rulewith_statement"
    // InternalPascal.g:2980:1: rulewith_statement returns [EObject current=null] : (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) ;
    public final EObject rulewith_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2986:2: ( (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) ) )
            // InternalPascal.g:2987:2: (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            {
            // InternalPascal.g:2987:2: (otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) ) )
            // InternalPascal.g:2988:3: otherlv_0= 'with' ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= 'do' ( (lv_statement_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
            		
            // InternalPascal.g:2992:3: ( (lv_variables_1_0= rulevariable ) )
            // InternalPascal.g:2993:4: (lv_variables_1_0= rulevariable )
            {
            // InternalPascal.g:2993:4: (lv_variables_1_0= rulevariable )
            // InternalPascal.g:2994:5: lv_variables_1_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_variables_1_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWith_statementRule());
            					}
            					add(
            						current,
            						"variables",
            						lv_variables_1_0,
            						"org.xtext.Pascal.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3011:3: (otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==27) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPascal.g:3012:4: otherlv_2= ',' ( (lv_variables_3_0= rulevariable ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPascal.g:3016:4: ( (lv_variables_3_0= rulevariable ) )
            	    // InternalPascal.g:3017:5: (lv_variables_3_0= rulevariable )
            	    {
            	    // InternalPascal.g:3017:5: (lv_variables_3_0= rulevariable )
            	    // InternalPascal.g:3018:6: lv_variables_3_0= rulevariable
            	    {

            	    						newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_variables_3_0=rulevariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_3_0,
            	    							"org.xtext.Pascal.variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_4=(Token)match(input,46,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
            		
            // InternalPascal.g:3040:3: ( (lv_statement_5_0= rulestatement ) )
            // InternalPascal.g:3041:4: (lv_statement_5_0= rulestatement )
            {
            // InternalPascal.g:3041:4: (lv_statement_5_0= rulestatement )
            // InternalPascal.g:3042:5: lv_statement_5_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getWith_statementAccess().getStatementStatementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_5_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWith_statementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_5_0,
            						"org.xtext.Pascal.statement");
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
    // $ANTLR end "rulewith_statement"


    // $ANTLR start "entryRulegoto_statement"
    // InternalPascal.g:3063:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // InternalPascal.g:3063:55: (iv_rulegoto_statement= rulegoto_statement EOF )
            // InternalPascal.g:3064:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // InternalPascal.g:3070:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3076:2: ( (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) ) )
            // InternalPascal.g:3077:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            {
            // InternalPascal.g:3077:2: (otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) ) )
            // InternalPascal.g:3078:3: otherlv_0= 'goto' ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
            		
            // InternalPascal.g:3082:3: ( (lv_label_1_0= rulelabel ) )
            // InternalPascal.g:3083:4: (lv_label_1_0= rulelabel )
            {
            // InternalPascal.g:3083:4: (lv_label_1_0= rulelabel )
            // InternalPascal.g:3084:5: lv_label_1_0= rulelabel
            {

            					newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelLabelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_1_0=rulelabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoto_statementRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.xtext.Pascal.label");
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
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRulelabel_declaration_part"
    // InternalPascal.g:3105:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // InternalPascal.g:3105:63: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // InternalPascal.g:3106:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // InternalPascal.g:3112:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3118:2: ( (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' ) )
            // InternalPascal.g:3119:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            {
            // InternalPascal.g:3119:2: (otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';' )
            // InternalPascal.g:3120:3: otherlv_0= 'label' ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
            		
            // InternalPascal.g:3124:3: ( (lv_labels_1_0= rulelabel ) )
            // InternalPascal.g:3125:4: (lv_labels_1_0= rulelabel )
            {
            // InternalPascal.g:3125:4: (lv_labels_1_0= rulelabel )
            // InternalPascal.g:3126:5: lv_labels_1_0= rulelabel
            {

            					newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_labels_1_0=rulelabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            					}
            					add(
            						current,
            						"labels",
            						lv_labels_1_0,
            						"org.xtext.Pascal.label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3143:3: (otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==27) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPascal.g:3144:4: otherlv_2= ',' ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_34); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalPascal.g:3148:4: ( (lv_labels_3_0= rulelabel ) )
            	    // InternalPascal.g:3149:5: (lv_labels_3_0= rulelabel )
            	    {
            	    // InternalPascal.g:3149:5: (lv_labels_3_0= rulelabel )
            	    // InternalPascal.g:3150:6: lv_labels_3_0= rulelabel
            	    {

            	    						newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_labels_3_0=rulelabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"labels",
            	    							lv_labels_3_0,
            	    							"org.xtext.Pascal.label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascal.g:3176:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:3176:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:3177:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalPascal.g:3183:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3189:2: ( (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:3190:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:3190:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:3191:3: otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,60,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
            		
            // InternalPascal.g:3195:3: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPascal.g:3196:4: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:3196:4: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // InternalPascal.g:3197:5: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:3197:5: (lv_consts_1_0= ruleconstant_definition )
            	    // InternalPascal.g:3198:6: lv_consts_1_0= ruleconstant_definition
            	    {

            	    						newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_consts_1_0=ruleconstant_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"consts",
            	    							lv_consts_1_0,
            	    							"org.xtext.Pascal.constant_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


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
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascal.g:3224:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:3224:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:3225:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalPascal.g:3231:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3237:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:3238:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:3238:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            // InternalPascal.g:3239:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) )
            {
            // InternalPascal.g:3239:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:3240:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:3240:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:3241:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstant_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:3261:3: ( (lv_const_2_0= ruleconstant ) )
            // InternalPascal.g:3262:4: (lv_const_2_0= ruleconstant )
            {
            // InternalPascal.g:3262:4: (lv_const_2_0= ruleconstant )
            // InternalPascal.g:3263:5: lv_const_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_const_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstant_definitionRule());
            					}
            					set(
            						current,
            						"const",
            						lv_const_2_0,
            						"org.xtext.Pascal.constant");
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
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascal.g:3284:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascal.g:3284:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascal.g:3285:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalPascal.g:3291:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3297:2: ( (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:3298:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:3298:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:3299:3: otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
            		
            // InternalPascal.g:3303:3: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:3304:4: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:3304:4: ( (lv_types_1_0= ruletype_definition ) )
            	    // InternalPascal.g:3305:5: (lv_types_1_0= ruletype_definition )
            	    {
            	    // InternalPascal.g:3305:5: (lv_types_1_0= ruletype_definition )
            	    // InternalPascal.g:3306:6: lv_types_1_0= ruletype_definition
            	    {

            	    						newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_types_1_0=ruletype_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_1_0,
            	    							"org.xtext.Pascal.type_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


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
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascal.g:3332:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascal.g:3332:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascal.g:3333:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalPascal.g:3339:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3345:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3346:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3346:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3347:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:3347:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:3348:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:3348:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:3349:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(lv_name_0_0, grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getType_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:3369:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3370:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3370:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3371:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_definitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.Pascal.type");
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
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:3392:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:3392:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:3393:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascal.g:3399:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;

        EObject lv_pointer_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3405:2: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) )
            // InternalPascal.g:3406:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            {
            // InternalPascal.g:3406:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case 24:
            case 41:
            case 42:
            case 43:
                {
                alt43=1;
                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt43=2;
                }
                break;
            case 34:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalPascal.g:3407:3: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // InternalPascal.g:3407:3: ( (lv_simple_0_0= rulesimple_type ) )
                    // InternalPascal.g:3408:4: (lv_simple_0_0= rulesimple_type )
                    {
                    // InternalPascal.g:3408:4: (lv_simple_0_0= rulesimple_type )
                    // InternalPascal.g:3409:5: lv_simple_0_0= rulesimple_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=rulesimple_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.Pascal.simple_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3427:3: ( (lv_structured_1_0= rulestructured_type ) )
                    {
                    // InternalPascal.g:3427:3: ( (lv_structured_1_0= rulestructured_type ) )
                    // InternalPascal.g:3428:4: (lv_structured_1_0= rulestructured_type )
                    {
                    // InternalPascal.g:3428:4: (lv_structured_1_0= rulestructured_type )
                    // InternalPascal.g:3429:5: lv_structured_1_0= rulestructured_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structured_1_0=rulestructured_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"structured",
                    						lv_structured_1_0,
                    						"org.xtext.Pascal.structured_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3447:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    {
                    // InternalPascal.g:3447:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    // InternalPascal.g:3448:4: (lv_pointer_2_0= rulepointer_type )
                    {
                    // InternalPascal.g:3448:4: (lv_pointer_2_0= rulepointer_type )
                    // InternalPascal.g:3449:5: lv_pointer_2_0= rulepointer_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pointer_2_0=rulepointer_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"pointer",
                    						lv_pointer_2_0,
                    						"org.xtext.Pascal.pointer_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascal.g:3470:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:3470:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:3471:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalPascal.g:3477:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_subrange_0_0 = null;

        EObject lv_enumerated_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3483:2: ( ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPascal.g:3484:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPascal.g:3484:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case 41:
            case 42:
            case 43:
                {
                alt44=1;
                }
                break;
            case RULE_ID:
                {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==62) ) {
                    alt44=1;
                }
                else if ( (LA44_2==EOF||(LA44_2>=25 && LA44_2<=27)||LA44_2==29||LA44_2==33) ) {
                    alt44=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt44=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalPascal.g:3485:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:3485:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    // InternalPascal.g:3486:4: (lv_subrange_0_0= rulesubrange_type )
                    {
                    // InternalPascal.g:3486:4: (lv_subrange_0_0= rulesubrange_type )
                    // InternalPascal.g:3487:5: lv_subrange_0_0= rulesubrange_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subrange_0_0=rulesubrange_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					set(
                    						current,
                    						"subrange",
                    						lv_subrange_0_0,
                    						"org.xtext.Pascal.subrange_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3505:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    {
                    // InternalPascal.g:3505:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    // InternalPascal.g:3506:4: (lv_enumerated_1_0= ruleenumerated_type )
                    {
                    // InternalPascal.g:3506:4: (lv_enumerated_1_0= ruleenumerated_type )
                    // InternalPascal.g:3507:5: lv_enumerated_1_0= ruleenumerated_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_enumerated_1_0=ruleenumerated_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					set(
                    						current,
                    						"enumerated",
                    						lv_enumerated_1_0,
                    						"org.xtext.Pascal.enumerated_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3525:3: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:3525:3: ( (lv_name_2_0= RULE_ID ) )
                    // InternalPascal.g:3526:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalPascal.g:3526:4: (lv_name_2_0= RULE_ID )
                    // InternalPascal.g:3527:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_typeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:3547:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:3549:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:3550:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalPascal.g:3559:1: rulesubrange_type returns [EObject current=null] : ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_subrange_3_0=null;
        EObject lv_initialConst_0_0 = null;

        EObject lv_finalConst_2_0 = null;

        EObject lv_const_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:3566:2: ( ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) )
            // InternalPascal.g:3567:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            {
            // InternalPascal.g:3567:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INTEGER_NUMBER)||LA45_0==RULE_ADDITION_OPERATOR||(LA45_0>=RULE_STRING && LA45_0<=RULE_SIGNED_REAL_NUMBER)||(LA45_0>=41 && LA45_0<=43)) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_NUMERIC_SUBRANGE) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:3568:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:3568:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    // InternalPascal.g:3569:4: ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) )
                    {
                    // InternalPascal.g:3569:4: ( (lv_initialConst_0_0= ruleconstant ) )
                    // InternalPascal.g:3570:5: (lv_initialConst_0_0= ruleconstant )
                    {
                    // InternalPascal.g:3570:5: (lv_initialConst_0_0= ruleconstant )
                    // InternalPascal.g:3571:6: lv_initialConst_0_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_initialConst_0_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"initialConst",
                    							lv_initialConst_0_0,
                    							"org.xtext.Pascal.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,62,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1());
                    			
                    // InternalPascal.g:3592:4: ( (lv_finalConst_2_0= ruleconstant ) )
                    // InternalPascal.g:3593:5: (lv_finalConst_2_0= ruleconstant )
                    {
                    // InternalPascal.g:3593:5: (lv_finalConst_2_0= ruleconstant )
                    // InternalPascal.g:3594:6: lv_finalConst_2_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_finalConst_2_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"finalConst",
                    							lv_finalConst_2_0,
                    							"org.xtext.Pascal.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3613:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:3613:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    // InternalPascal.g:3614:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) )
                    {
                    // InternalPascal.g:3614:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) )
                    // InternalPascal.g:3615:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    {
                    // InternalPascal.g:3615:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    // InternalPascal.g:3616:6: lv_subrange_3_0= RULE_NUMERIC_SUBRANGE
                    {
                    lv_subrange_3_0=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_30); 

                    						newLeafNode(lv_subrange_3_0, grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubrange_typeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"subrange",
                    							lv_subrange_3_0,
                    							"org.xtext.Pascal.NUMERIC_SUBRANGE");
                    					

                    }


                    }

                    // InternalPascal.g:3632:4: ( (lv_const_4_0= ruleconstant ) )
                    // InternalPascal.g:3633:5: (lv_const_4_0= ruleconstant )
                    {
                    // InternalPascal.g:3633:5: (lv_const_4_0= ruleconstant )
                    // InternalPascal.g:3634:6: lv_const_4_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_const_4_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"const",
                    							lv_const_4_0,
                    							"org.xtext.Pascal.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // InternalPascal.g:3659:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // InternalPascal.g:3659:56: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // InternalPascal.g:3660:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // InternalPascal.g:3666:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3672:2: ( (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) )
            // InternalPascal.g:3673:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:3673:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            // InternalPascal.g:3674:3: otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:3678:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:3679:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:3679:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:3680:5: lv_identifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerated_typeRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_1_0,
            						"org.xtext.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalPascal.g:3705:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalPascal.g:3705:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalPascal.g:3706:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalPascal.g:3712:1: rulestructured_type returns [EObject current=null] : ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token lv_packed_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3718:2: ( ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) )
            // InternalPascal.g:3719:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // InternalPascal.g:3719:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            // InternalPascal.g:3720:3: ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) )
            {
            // InternalPascal.g:3720:3: ( (lv_packed_0_0= 'packed' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==63) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPascal.g:3721:4: (lv_packed_0_0= 'packed' )
                    {
                    // InternalPascal.g:3721:4: (lv_packed_0_0= 'packed' )
                    // InternalPascal.g:3722:5: lv_packed_0_0= 'packed'
                    {
                    lv_packed_0_0=(Token)match(input,63,FOLLOW_40); 

                    					newLeafNode(lv_packed_0_0, grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStructured_typeRule());
                    					}
                    					setWithLastConsumed(current, "packed", true, "packed");
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:3734:3: ( (lv_type_1_0= ruleunpacked_structured_type ) )
            // InternalPascal.g:3735:4: (lv_type_1_0= ruleunpacked_structured_type )
            {
            // InternalPascal.g:3735:4: (lv_type_1_0= ruleunpacked_structured_type )
            // InternalPascal.g:3736:5: lv_type_1_0= ruleunpacked_structured_type
            {

            					newCompositeNode(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleunpacked_structured_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructured_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Pascal.unpacked_structured_type");
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
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascal.g:3757:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalPascal.g:3757:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalPascal.g:3758:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalPascal.g:3764:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_array_0_0 = null;

        EObject lv_dynamic_1_0 = null;

        EObject lv_record_2_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3770:2: ( ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) ) )
            // InternalPascal.g:3771:2: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) )
            {
            // InternalPascal.g:3771:2: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) )
            int alt47=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==56) ) {
                    alt47=2;
                }
                else if ( (LA47_1==32) ) {
                    alt47=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case 65:
                {
                alt47=3;
                }
                break;
            case 66:
                {
                alt47=4;
                }
                break;
            case 67:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalPascal.g:3772:3: ( (lv_array_0_0= rulearray_type ) )
                    {
                    // InternalPascal.g:3772:3: ( (lv_array_0_0= rulearray_type ) )
                    // InternalPascal.g:3773:4: (lv_array_0_0= rulearray_type )
                    {
                    // InternalPascal.g:3773:4: (lv_array_0_0= rulearray_type )
                    // InternalPascal.g:3774:5: lv_array_0_0= rulearray_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArrayArray_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_0_0=rulearray_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_0_0,
                    						"org.xtext.Pascal.array_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3792:3: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    {
                    // InternalPascal.g:3792:3: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    // InternalPascal.g:3793:4: (lv_dynamic_1_0= ruledynamic_array_type )
                    {
                    // InternalPascal.g:3793:4: (lv_dynamic_1_0= ruledynamic_array_type )
                    // InternalPascal.g:3794:5: lv_dynamic_1_0= ruledynamic_array_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dynamic_1_0=ruledynamic_array_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"dynamic",
                    						lv_dynamic_1_0,
                    						"org.xtext.Pascal.dynamic_array_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3812:3: ( (lv_record_2_0= rulerecord_type ) )
                    {
                    // InternalPascal.g:3812:3: ( (lv_record_2_0= rulerecord_type ) )
                    // InternalPascal.g:3813:4: (lv_record_2_0= rulerecord_type )
                    {
                    // InternalPascal.g:3813:4: (lv_record_2_0= rulerecord_type )
                    // InternalPascal.g:3814:5: lv_record_2_0= rulerecord_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecordRecord_typeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_record_2_0=rulerecord_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"record",
                    						lv_record_2_0,
                    						"org.xtext.Pascal.record_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:3832:3: ( (lv_set_3_0= ruleset_type ) )
                    {
                    // InternalPascal.g:3832:3: ( (lv_set_3_0= ruleset_type ) )
                    // InternalPascal.g:3833:4: (lv_set_3_0= ruleset_type )
                    {
                    // InternalPascal.g:3833:4: (lv_set_3_0= ruleset_type )
                    // InternalPascal.g:3834:5: lv_set_3_0= ruleset_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSetSet_typeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_3_0=ruleset_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_3_0,
                    						"org.xtext.Pascal.set_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:3852:3: ( (lv_file_4_0= rulefile_type ) )
                    {
                    // InternalPascal.g:3852:3: ( (lv_file_4_0= rulefile_type ) )
                    // InternalPascal.g:3853:4: (lv_file_4_0= rulefile_type )
                    {
                    // InternalPascal.g:3853:4: (lv_file_4_0= rulefile_type )
                    // InternalPascal.g:3854:5: lv_file_4_0= rulefile_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFileFile_typeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_file_4_0=rulefile_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"file",
                    						lv_file_4_0,
                    						"org.xtext.Pascal.file_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // InternalPascal.g:3875:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // InternalPascal.g:3875:51: (iv_rulearray_type= rulearray_type EOF )
            // InternalPascal.g:3876:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // InternalPascal.g:3882:1: rulearray_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) ;
    public final EObject rulearray_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_indexes_2_0 = null;

        EObject lv_indexes_4_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3888:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) )
            // InternalPascal.g:3889:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            {
            // InternalPascal.g:3889:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            // InternalPascal.g:3890:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:3898:3: ( (lv_indexes_2_0= ruleindex_type ) )
            // InternalPascal.g:3899:4: (lv_indexes_2_0= ruleindex_type )
            {
            // InternalPascal.g:3899:4: (lv_indexes_2_0= ruleindex_type )
            // InternalPascal.g:3900:5: lv_indexes_2_0= ruleindex_type
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_43);
            lv_indexes_2_0=ruleindex_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					add(
            						current,
            						"indexes",
            						lv_indexes_2_0,
            						"org.xtext.Pascal.index_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3917:3: (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==27) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPascal.g:3918:4: otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_42); 

            	    				newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPascal.g:3922:4: ( (lv_indexes_4_0= ruleindex_type ) )
            	    // InternalPascal.g:3923:5: (lv_indexes_4_0= ruleindex_type )
            	    {
            	    // InternalPascal.g:3923:5: (lv_indexes_4_0= ruleindex_type )
            	    // InternalPascal.g:3924:6: lv_indexes_4_0= ruleindex_type
            	    {

            	    						newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_indexes_4_0=ruleindex_type();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"indexes",
            	    							lv_indexes_4_0,
            	    							"org.xtext.Pascal.index_type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,56,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
            		
            // InternalPascal.g:3950:3: ( (lv_type_7_0= ruletype ) )
            // InternalPascal.g:3951:4: (lv_type_7_0= ruletype )
            {
            // InternalPascal.g:3951:4: (lv_type_7_0= ruletype )
            // InternalPascal.g:3952:5: lv_type_7_0= ruletype
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.Pascal.type");
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
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuledynamic_array_type"
    // InternalPascal.g:3973:1: entryRuledynamic_array_type returns [EObject current=null] : iv_ruledynamic_array_type= ruledynamic_array_type EOF ;
    public final EObject entryRuledynamic_array_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledynamic_array_type = null;


        try {
            // InternalPascal.g:3973:59: (iv_ruledynamic_array_type= ruledynamic_array_type EOF )
            // InternalPascal.g:3974:2: iv_ruledynamic_array_type= ruledynamic_array_type EOF
            {
             newCompositeNode(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledynamic_array_type=ruledynamic_array_type();

            state._fsp--;

             current =iv_ruledynamic_array_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuledynamic_array_type"


    // $ANTLR start "ruledynamic_array_type"
    // InternalPascal.g:3980:1: ruledynamic_array_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruledynamic_array_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3986:2: ( (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3987:2: (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3987:2: (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3988:3: otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,56,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1());
            		
            // InternalPascal.g:3996:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3997:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3997:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3998:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getDynamic_array_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDynamic_array_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.Pascal.type");
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
    // $ANTLR end "ruledynamic_array_type"


    // $ANTLR start "entryRuleindex_type"
    // InternalPascal.g:4019:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // InternalPascal.g:4019:51: (iv_ruleindex_type= ruleindex_type EOF )
            // InternalPascal.g:4020:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // InternalPascal.g:4026:1: ruleindex_type returns [EObject current=null] : ( (lv_type_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4032:2: ( ( (lv_type_0_0= rulesimple_type ) ) )
            // InternalPascal.g:4033:2: ( (lv_type_0_0= rulesimple_type ) )
            {
            // InternalPascal.g:4033:2: ( (lv_type_0_0= rulesimple_type ) )
            // InternalPascal.g:4034:3: (lv_type_0_0= rulesimple_type )
            {
            // InternalPascal.g:4034:3: (lv_type_0_0= rulesimple_type )
            // InternalPascal.g:4035:4: lv_type_0_0= rulesimple_type
            {

            				newCompositeNode(grammarAccess.getIndex_typeAccess().getTypeSimple_typeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=rulesimple_type();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIndex_typeRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.xtext.Pascal.simple_type");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRulerecord_type"
    // InternalPascal.g:4055:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // InternalPascal.g:4055:52: (iv_rulerecord_type= rulerecord_type EOF )
            // InternalPascal.g:4056:2: iv_rulerecord_type= rulerecord_type EOF
            {
             newCompositeNode(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;

             current =iv_rulerecord_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // InternalPascal.g:4062:1: rulerecord_type returns [EObject current=null] : ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token lv_recordKeyword_0_0=null;
        Token lv_endKeyword_2_0=null;
        EObject lv_fields_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4068:2: ( ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) ) )
            // InternalPascal.g:4069:2: ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            {
            // InternalPascal.g:4069:2: ( ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) ) )
            // InternalPascal.g:4070:3: ( (lv_recordKeyword_0_0= 'record' ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= 'end' ) )
            {
            // InternalPascal.g:4070:3: ( (lv_recordKeyword_0_0= 'record' ) )
            // InternalPascal.g:4071:4: (lv_recordKeyword_0_0= 'record' )
            {
            // InternalPascal.g:4071:4: (lv_recordKeyword_0_0= 'record' )
            // InternalPascal.g:4072:5: lv_recordKeyword_0_0= 'record'
            {
            lv_recordKeyword_0_0=(Token)match(input,65,FOLLOW_44); 

            					newLeafNode(lv_recordKeyword_0_0, grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecord_typeRule());
            					}
            					setWithLastConsumed(current, "recordKeyword", lv_recordKeyword_0_0, "record");
            				

            }


            }

            // InternalPascal.g:4084:3: ( (lv_fields_1_0= rulefield_list ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPascal.g:4085:4: (lv_fields_1_0= rulefield_list )
                    {
                    // InternalPascal.g:4085:4: (lv_fields_1_0= rulefield_list )
                    // InternalPascal.g:4086:5: lv_fields_1_0= rulefield_list
                    {

                    					newCompositeNode(grammarAccess.getRecord_typeAccess().getFieldsField_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_fields_1_0=rulefield_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRecord_typeRule());
                    					}
                    					set(
                    						current,
                    						"fields",
                    						lv_fields_1_0,
                    						"org.xtext.Pascal.field_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:4103:3: ( (lv_endKeyword_2_0= 'end' ) )
            // InternalPascal.g:4104:4: (lv_endKeyword_2_0= 'end' )
            {
            // InternalPascal.g:4104:4: (lv_endKeyword_2_0= 'end' )
            // InternalPascal.g:4105:5: lv_endKeyword_2_0= 'end'
            {
            lv_endKeyword_2_0=(Token)match(input,29,FOLLOW_2); 

            					newLeafNode(lv_endKeyword_2_0, grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecord_typeRule());
            					}
            					setWithLastConsumed(current, "endKeyword", lv_endKeyword_2_0, "end");
            				

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
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRulefield_list"
    // InternalPascal.g:4121:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // InternalPascal.g:4121:51: (iv_rulefield_list= rulefield_list EOF )
            // InternalPascal.g:4122:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // InternalPascal.g:4128:1: rulefield_list returns [EObject current=null] : ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_fixed_0_0 = null;

        EObject lv_variants_2_0 = null;

        EObject lv_variants_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4134:2: ( ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? ) )
            // InternalPascal.g:4135:2: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? )
            {
            // InternalPascal.g:4135:2: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )? )
            // InternalPascal.g:4136:3: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= ';' )?
            {
            // InternalPascal.g:4136:3: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==55) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalPascal.g:4137:4: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    {
                    // InternalPascal.g:4137:4: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    // InternalPascal.g:4138:5: ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )?
                    {
                    // InternalPascal.g:4138:5: ( (lv_fixed_0_0= rulefixed_part ) )
                    // InternalPascal.g:4139:6: (lv_fixed_0_0= rulefixed_part )
                    {
                    // InternalPascal.g:4139:6: (lv_fixed_0_0= rulefixed_part )
                    // InternalPascal.g:4140:7: lv_fixed_0_0= rulefixed_part
                    {

                    							newCompositeNode(grammarAccess.getField_listAccess().getFixedFixed_partParserRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_12);
                    lv_fixed_0_0=rulefixed_part();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getField_listRule());
                    							}
                    							set(
                    								current,
                    								"fixed",
                    								lv_fixed_0_0,
                    								"org.xtext.Pascal.fixed_part");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPascal.g:4157:5: (otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==26) ) {
                        int LA50_1 = input.LA(2);

                        if ( (LA50_1==55) ) {
                            alt50=1;
                        }
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalPascal.g:4158:6: otherlv_1= ';' ( (lv_variants_2_0= rulevariant_part ) )
                            {
                            otherlv_1=(Token)match(input,26,FOLLOW_45); 

                            						newLeafNode(otherlv_1, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0());
                            					
                            // InternalPascal.g:4162:6: ( (lv_variants_2_0= rulevariant_part ) )
                            // InternalPascal.g:4163:7: (lv_variants_2_0= rulevariant_part )
                            {
                            // InternalPascal.g:4163:7: (lv_variants_2_0= rulevariant_part )
                            // InternalPascal.g:4164:8: lv_variants_2_0= rulevariant_part
                            {

                            								newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_0_1_1_0());
                            							
                            pushFollow(FOLLOW_12);
                            lv_variants_2_0=rulevariant_part();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getField_listRule());
                            								}
                            								add(
                            									current,
                            									"variants",
                            									lv_variants_2_0,
                            									"org.xtext.Pascal.variant_part");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4184:4: ( (lv_variants_3_0= rulevariant_part ) )
                    {
                    // InternalPascal.g:4184:4: ( (lv_variants_3_0= rulevariant_part ) )
                    // InternalPascal.g:4185:5: (lv_variants_3_0= rulevariant_part )
                    {
                    // InternalPascal.g:4185:5: (lv_variants_3_0= rulevariant_part )
                    // InternalPascal.g:4186:6: lv_variants_3_0= rulevariant_part
                    {

                    						newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_variants_3_0=rulevariant_part();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getField_listRule());
                    						}
                    						add(
                    							current,
                    							"variants",
                    							lv_variants_3_0,
                    							"org.xtext.Pascal.variant_part");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascal.g:4204:3: (otherlv_4= ';' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPascal.g:4205:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getField_listAccess().getSemicolonKeyword_1());
                    			

                    }
                    break;

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
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // InternalPascal.g:4214:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // InternalPascal.g:4214:51: (iv_rulefixed_part= rulefixed_part EOF )
            // InternalPascal.g:4215:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // InternalPascal.g:4221:1: rulefixed_part returns [EObject current=null] : ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sections_0_0 = null;

        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4227:2: ( ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* ) )
            // InternalPascal.g:4228:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            {
            // InternalPascal.g:4228:2: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )* )
            // InternalPascal.g:4229:3: ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            {
            // InternalPascal.g:4229:3: ( (lv_sections_0_0= rulerecord_section ) )
            // InternalPascal.g:4230:4: (lv_sections_0_0= rulerecord_section )
            {
            // InternalPascal.g:4230:4: (lv_sections_0_0= rulerecord_section )
            // InternalPascal.g:4231:5: lv_sections_0_0= rulerecord_section
            {

            					newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_sections_0_0=rulerecord_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFixed_partRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_0_0,
            						"org.xtext.Pascal.record_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4248:3: (otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==26) ) {
                    int LA53_1 = input.LA(2);

                    if ( (LA53_1==RULE_ID) ) {
                        alt53=1;
                    }


                }


                switch (alt53) {
            	case 1 :
            	    // InternalPascal.g:4249:4: otherlv_1= ';' ( (lv_sections_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:4253:4: ( (lv_sections_2_0= rulerecord_section ) )
            	    // InternalPascal.g:4254:5: (lv_sections_2_0= rulerecord_section )
            	    {
            	    // InternalPascal.g:4254:5: (lv_sections_2_0= rulerecord_section )
            	    // InternalPascal.g:4255:6: lv_sections_2_0= rulerecord_section
            	    {

            	    						newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_sections_2_0=rulerecord_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFixed_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_2_0,
            	    							"org.xtext.Pascal.record_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


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
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulevariable_identifier_list"
    // InternalPascal.g:4277:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // InternalPascal.g:4277:65: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // InternalPascal.g:4278:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_identifier_list=rulevariable_identifier_list();

            state._fsp--;

             current =iv_rulevariable_identifier_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable_identifier_list"


    // $ANTLR start "rulevariable_identifier_list"
    // InternalPascal.g:4284:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:4290:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:4291:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:4291:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:4292:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:4292:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:4293:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:4293:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:4294:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_names_0_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:4310:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==27) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalPascal.g:4311:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:4315:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:4316:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:4316:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:4317:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


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
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRulevariable_section"
    // InternalPascal.g:4338:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // InternalPascal.g:4338:57: (iv_rulevariable_section= rulevariable_section EOF )
            // InternalPascal.g:4339:2: iv_rulevariable_section= rulevariable_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_section=rulevariable_section();

            state._fsp--;

             current =iv_rulevariable_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable_section"


    // $ANTLR start "rulevariable_section"
    // InternalPascal.g:4345:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4351:2: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4352:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4352:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4353:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:4353:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // InternalPascal.g:4354:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // InternalPascal.g:4354:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            // InternalPascal.g:4355:5: lv_identifiers_0_0= rulevariable_identifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifiers_0_0=rulevariable_identifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.Pascal.variable_identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:4376:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4377:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4377:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4378:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.Pascal.type");
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
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRulerecord_section"
    // InternalPascal.g:4399:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // InternalPascal.g:4399:55: (iv_rulerecord_section= rulerecord_section EOF )
            // InternalPascal.g:4400:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // InternalPascal.g:4406:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4412:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4413:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4413:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4414:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:4414:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:4415:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:4415:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:4416:5: lv_identifiers_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:4437:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4438:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4438:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4439:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.Pascal.type");
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
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // InternalPascal.g:4460:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // InternalPascal.g:4460:53: (iv_rulevariant_part= rulevariant_part EOF )
            // InternalPascal.g:4461:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // InternalPascal.g:4467:1: rulevariant_part returns [EObject current=null] : (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* ) ;
    public final EObject rulevariant_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tag_1_0 = null;

        EObject lv_variants_4_0 = null;

        EObject lv_variants_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4473:2: ( (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* ) )
            // InternalPascal.g:4474:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* )
            {
            // InternalPascal.g:4474:2: (otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )* )
            // InternalPascal.g:4475:3: otherlv_0= 'case' ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
            		
            // InternalPascal.g:4479:3: ( (lv_tag_1_0= ruletag_field ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==30) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalPascal.g:4480:4: (lv_tag_1_0= ruletag_field )
                    {
                    // InternalPascal.g:4480:4: (lv_tag_1_0= ruletag_field )
                    // InternalPascal.g:4481:5: lv_tag_1_0= ruletag_field
                    {

                    					newCompositeNode(grammarAccess.getVariant_partAccess().getTagTag_fieldParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_tag_1_0=ruletag_field();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariant_partRule());
                    					}
                    					set(
                    						current,
                    						"tag",
                    						lv_tag_1_0,
                    						"org.xtext.Pascal.tag_field");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:4498:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPascal.g:4499:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPascal.g:4499:4: (lv_name_2_0= RULE_ID )
            // InternalPascal.g:4500:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVariant_partAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariant_partRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
            		
            // InternalPascal.g:4520:3: ( (lv_variants_4_0= rulevariant ) )
            // InternalPascal.g:4521:4: (lv_variants_4_0= rulevariant )
            {
            // InternalPascal.g:4521:4: (lv_variants_4_0= rulevariant )
            // InternalPascal.g:4522:5: lv_variants_4_0= rulevariant
            {

            					newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_variants_4_0=rulevariant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariant_partRule());
            					}
            					add(
            						current,
            						"variants",
            						lv_variants_4_0,
            						"org.xtext.Pascal.variant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4539:3: (otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==26) ) {
                    int LA56_1 = input.LA(2);

                    if ( ((LA56_1>=RULE_ID && LA56_1<=RULE_INTEGER_NUMBER)||LA56_1==RULE_ADDITION_OPERATOR||(LA56_1>=RULE_STRING && LA56_1<=RULE_SIGNED_REAL_NUMBER)||(LA56_1>=41 && LA56_1<=43)) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // InternalPascal.g:4540:4: otherlv_5= ';' ( (lv_variants_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_30); 

            	    				newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	    			
            	    // InternalPascal.g:4544:4: ( (lv_variants_6_0= rulevariant ) )
            	    // InternalPascal.g:4545:5: (lv_variants_6_0= rulevariant )
            	    {
            	    // InternalPascal.g:4545:5: (lv_variants_6_0= rulevariant )
            	    // InternalPascal.g:4546:6: lv_variants_6_0= rulevariant
            	    {

            	    						newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_variants_6_0=rulevariant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variants",
            	    							lv_variants_6_0,
            	    							"org.xtext.Pascal.variant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


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
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // InternalPascal.g:4568:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // InternalPascal.g:4568:50: (iv_ruletag_field= ruletag_field EOF )
            // InternalPascal.g:4569:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // InternalPascal.g:4575:1: ruletag_field returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPascal.g:4581:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // InternalPascal.g:4582:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // InternalPascal.g:4582:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // InternalPascal.g:4583:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // InternalPascal.g:4583:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:4584:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:4584:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:4585:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTag_fieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTag_fieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTag_fieldAccess().getColonKeyword_1());
            		

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
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // InternalPascal.g:4609:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // InternalPascal.g:4609:48: (iv_rulevariant= rulevariant EOF )
            // InternalPascal.g:4610:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // InternalPascal.g:4616:1: rulevariant returns [EObject current=null] : ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_0_0 = null;

        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4622:2: ( ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' ) )
            // InternalPascal.g:4623:2: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' )
            {
            // InternalPascal.g:4623:2: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')' )
            // InternalPascal.g:4624:3: ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= ')'
            {
            // InternalPascal.g:4624:3: ( (lv_labels_0_0= rulecase_label_list ) )
            // InternalPascal.g:4625:4: (lv_labels_0_0= rulecase_label_list )
            {
            // InternalPascal.g:4625:4: (lv_labels_0_0= rulecase_label_list )
            // InternalPascal.g:4626:5: lv_labels_0_0= rulecase_label_list
            {

            					newCompositeNode(grammarAccess.getVariantAccess().getLabelsCase_label_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_labels_0_0=rulecase_label_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariantRule());
            					}
            					set(
            						current,
            						"labels",
            						lv_labels_0_0,
            						"org.xtext.Pascal.case_label_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPascal.g:4651:3: ( (lv_fields_3_0= rulefield_list ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==55) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalPascal.g:4652:4: (lv_fields_3_0= rulefield_list )
                    {
                    // InternalPascal.g:4652:4: (lv_fields_3_0= rulefield_list )
                    // InternalPascal.g:4653:5: lv_fields_3_0= rulefield_list
                    {

                    					newCompositeNode(grammarAccess.getVariantAccess().getFieldsField_listParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_fields_3_0=rulefield_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariantRule());
                    					}
                    					set(
                    						current,
                    						"fields",
                    						lv_fields_3_0,
                    						"org.xtext.Pascal.field_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRuleset_type"
    // InternalPascal.g:4678:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // InternalPascal.g:4678:49: (iv_ruleset_type= ruleset_type EOF )
            // InternalPascal.g:4679:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // InternalPascal.g:4685:1: ruleset_type returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4691:2: ( (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4692:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4692:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4693:3: otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,56,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
            		
            // InternalPascal.g:4701:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4702:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4702:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4703:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSet_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.Pascal.type");
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
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulefile_type"
    // InternalPascal.g:4724:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // InternalPascal.g:4724:50: (iv_rulefile_type= rulefile_type EOF )
            // InternalPascal.g:4725:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefile_type"


    // $ANTLR start "rulefile_type"
    // InternalPascal.g:4731:1: rulefile_type returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4737:2: ( (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:4738:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:4738:2: (otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:4739:3: otherlv_0= 'file' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
            		
            otherlv_1=(Token)match(input,56,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
            		
            // InternalPascal.g:4747:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:4748:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:4748:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:4749:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getFile_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFile_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.Pascal.type");
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
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulepointer_type"
    // InternalPascal.g:4770:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // InternalPascal.g:4770:53: (iv_rulepointer_type= rulepointer_type EOF )
            // InternalPascal.g:4771:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // InternalPascal.g:4777:1: rulepointer_type returns [EObject current=null] : (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4783:2: ( (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) )
            // InternalPascal.g:4784:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            {
            // InternalPascal.g:4784:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            // InternalPascal.g:4785:3: otherlv_0= '^' ( (lv_type_1_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
            		
            // InternalPascal.g:4789:3: ( (lv_type_1_0= ruletype ) )
            // InternalPascal.g:4790:4: (lv_type_1_0= ruletype )
            {
            // InternalPascal.g:4790:4: (lv_type_1_0= ruletype )
            // InternalPascal.g:4791:5: lv_type_1_0= ruletype
            {

            					newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointer_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Pascal.type");
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
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:4812:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:4812:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:4813:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalPascal.g:4819:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4825:2: ( (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:4826:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:4826:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            // InternalPascal.g:4827:3: otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
            		
            // InternalPascal.g:4831:3: ( (lv_sections_1_0= rulevariable_section ) )
            // InternalPascal.g:4832:4: (lv_sections_1_0= rulevariable_section )
            {
            // InternalPascal.g:4832:4: (lv_sections_1_0= rulevariable_section )
            // InternalPascal.g:4833:5: lv_sections_1_0= rulevariable_section
            {

            					newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_sections_1_0=rulevariable_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_1_0,
            						"org.xtext.Pascal.variable_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
            		
            // InternalPascal.g:4854:3: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalPascal.g:4855:4: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:4855:4: ( (lv_sections_3_0= rulevariable_section ) )
            	    // InternalPascal.g:4856:5: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // InternalPascal.g:4856:5: (lv_sections_3_0= rulevariable_section )
            	    // InternalPascal.g:4857:6: lv_sections_3_0= rulevariable_section
            	    {

            	    						newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_sections_3_0=rulevariable_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_3_0,
            	    							"org.xtext.Pascal.variable_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,26,FOLLOW_36); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


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
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // InternalPascal.g:4883:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // InternalPascal.g:4883:80: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // InternalPascal.g:4884:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // InternalPascal.g:4890:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+ ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4896:2: ( ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:4897:2: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+
            {
            // InternalPascal.g:4897:2: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=70 && LA60_0<=71)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalPascal.g:4898:3: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:4898:3: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) )
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==70) ) {
            	        alt59=1;
            	    }
            	    else if ( (LA59_0==71) ) {
            	        alt59=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // InternalPascal.g:4899:4: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            {
            	            // InternalPascal.g:4899:4: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            // InternalPascal.g:4900:5: (lv_procedures_0_0= ruleprocedure_declaration )
            	            {
            	            // InternalPascal.g:4900:5: (lv_procedures_0_0= ruleprocedure_declaration )
            	            // InternalPascal.g:4901:6: lv_procedures_0_0= ruleprocedure_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresProcedure_declarationParserRuleCall_0_0_0());
            	            					
            	            pushFollow(FOLLOW_8);
            	            lv_procedures_0_0=ruleprocedure_declaration();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            						}
            	            						add(
            	            							current,
            	            							"procedures",
            	            							lv_procedures_0_0,
            	            							"org.xtext.Pascal.procedure_declaration");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:4919:4: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            {
            	            // InternalPascal.g:4919:4: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            // InternalPascal.g:4920:5: (lv_functions_1_0= rulefunction_declaration )
            	            {
            	            // InternalPascal.g:4920:5: (lv_functions_1_0= rulefunction_declaration )
            	            // InternalPascal.g:4921:6: lv_functions_1_0= rulefunction_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsFunction_declarationParserRuleCall_0_1_0());
            	            					
            	            pushFollow(FOLLOW_8);
            	            lv_functions_1_0=rulefunction_declaration();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            						}
            	            						add(
            	            							current,
            	            							"functions",
            	            							lv_functions_1_0,
            	            							"org.xtext.Pascal.function_declaration");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_47); 

            	    			newLeafNode(otherlv_2, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);


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
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:4947:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalPascal.g:4947:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalPascal.g:4948:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // InternalPascal.g:4954:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4960:2: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) )
            // InternalPascal.g:4961:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            {
            // InternalPascal.g:4961:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            // InternalPascal.g:4962:3: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            {
            // InternalPascal.g:4962:3: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:4963:4: (lv_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:4963:4: (lv_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:4964:5: lv_heading_0_0= ruleprocedure_heading
            {

            					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_heading_0_0=ruleprocedure_heading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.Pascal.procedure_heading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalPascal.g:4985:3: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==28||(LA61_0>=59 && LA61_0<=61)||LA61_0==68||(LA61_0>=70 && LA61_0<=71)) ) {
                alt61=1;
            }
            else if ( (LA61_0==69) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalPascal.g:4986:4: ( (lv_block_2_0= ruleblock ) )
                    {
                    // InternalPascal.g:4986:4: ( (lv_block_2_0= ruleblock ) )
                    // InternalPascal.g:4987:5: (lv_block_2_0= ruleblock )
                    {
                    // InternalPascal.g:4987:5: (lv_block_2_0= ruleblock )
                    // InternalPascal.g:4988:6: lv_block_2_0= ruleblock
                    {

                    						newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_2_0,
                    							"org.xtext.Pascal.block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5006:4: ( (lv_forward_3_0= 'forward' ) )
                    {
                    // InternalPascal.g:5006:4: ( (lv_forward_3_0= 'forward' ) )
                    // InternalPascal.g:5007:5: (lv_forward_3_0= 'forward' )
                    {
                    // InternalPascal.g:5007:5: (lv_forward_3_0= 'forward' )
                    // InternalPascal.g:5008:6: lv_forward_3_0= 'forward'
                    {
                    lv_forward_3_0=(Token)match(input,69,FOLLOW_2); 

                    						newLeafNode(lv_forward_3_0, grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedure_declarationRule());
                    						}
                    						setWithLastConsumed(current, "forward", true, "forward");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_heading"
    // InternalPascal.g:5025:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:5025:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:5026:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // InternalPascal.g:5032:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5038:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:5039:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:5039:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:5040:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
            		
            // InternalPascal.g:5044:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:5045:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:5045:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:5046:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedure_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:5062:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==24) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalPascal.g:5063:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:5063:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:5064:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:5085:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:5085:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:5086:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalPascal.g:5092:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5098:2: ( (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:5099:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:5099:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:5100:3: otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:5104:3: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:5105:4: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:5105:4: (lv_parameters_1_0= ruleformal_parameter_section )
            // InternalPascal.g:5106:5: lv_parameters_1_0= ruleformal_parameter_section
            {

            					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_51);
            lv_parameters_1_0=ruleformal_parameter_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_1_0,
            						"org.xtext.Pascal.formal_parameter_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:5123:3: (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==26) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalPascal.g:5124:4: otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_50); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:5128:4: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:5129:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:5129:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:5130:6: lv_parameters_3_0= ruleformal_parameter_section
            	    {

            	    						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_51);
            	    lv_parameters_3_0=ruleformal_parameter_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_3_0,
            	    							"org.xtext.Pascal.formal_parameter_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascal.g:5156:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:5156:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:5157:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalPascal.g:5163:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5169:2: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // InternalPascal.g:5170:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // InternalPascal.g:5170:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt64=1;
                }
                break;
            case 68:
                {
                alt64=2;
                }
                break;
            case 70:
                {
                alt64=3;
                }
                break;
            case 71:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalPascal.g:5171:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:5171:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:5172:4: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:5172:4: (lv_value_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:5173:5: lv_value_0_0= rulevalue_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=rulevalue_parameter_section();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.Pascal.value_parameter_section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5191:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:5191:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:5192:4: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:5192:4: (lv_variable_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:5193:5: lv_variable_1_0= rulevariable_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=rulevariable_parameter_section();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_1_0,
                    						"org.xtext.Pascal.variable_parameter_section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:5211:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // InternalPascal.g:5211:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // InternalPascal.g:5212:4: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // InternalPascal.g:5212:4: (lv_procedure_2_0= ruleprocedure_heading )
                    // InternalPascal.g:5213:5: lv_procedure_2_0= ruleprocedure_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procedure_2_0=ruleprocedure_heading();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"procedure",
                    						lv_procedure_2_0,
                    						"org.xtext.Pascal.procedure_heading");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:5231:3: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // InternalPascal.g:5231:3: ( (lv_function_3_0= rulefunction_heading ) )
                    // InternalPascal.g:5232:4: (lv_function_3_0= rulefunction_heading )
                    {
                    // InternalPascal.g:5232:4: (lv_function_3_0= rulefunction_heading )
                    // InternalPascal.g:5233:5: lv_function_3_0= rulefunction_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_3_0=rulefunction_heading();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_3_0,
                    						"org.xtext.Pascal.function_heading");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // InternalPascal.g:5254:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:5254:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:5255:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // InternalPascal.g:5261:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5267:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:5268:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:5268:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:5269:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:5269:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:5270:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:5270:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:5271:5: lv_identifiers_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:5292:3: ( (lv_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:5293:4: (lv_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:5293:4: (lv_type_2_0= ruleparameter_type )
            // InternalPascal.g:5294:5: lv_type_2_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.Pascal.parameter_type");
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
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // InternalPascal.g:5315:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:5315:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:5316:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // InternalPascal.g:5322:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_array_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5328:2: ( ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPascal.g:5329:2: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPascal.g:5329:2: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=63 && LA65_0<=64)) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalPascal.g:5330:3: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    {
                    // InternalPascal.g:5330:3: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    // InternalPascal.g:5331:4: (lv_array_0_0= ruleconformant_array_schema )
                    {
                    // InternalPascal.g:5331:4: (lv_array_0_0= ruleconformant_array_schema )
                    // InternalPascal.g:5332:5: lv_array_0_0= ruleconformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getParameter_typeAccess().getArrayConformant_array_schemaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_0_0=ruleconformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameter_typeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_0_0,
                    						"org.xtext.Pascal.conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5350:3: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalPascal.g:5350:3: ( (lv_name_1_0= RULE_ID ) )
                    // InternalPascal.g:5351:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPascal.g:5351:4: (lv_name_1_0= RULE_ID )
                    // InternalPascal.g:5352:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameter_typeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRuleconformant_array_schema"
    // InternalPascal.g:5372:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // InternalPascal.g:5372:64: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // InternalPascal.g:5373:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;

             current =iv_ruleconformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleconformant_array_schema"


    // $ANTLR start "ruleconformant_array_schema"
    // InternalPascal.g:5379:1: ruleconformant_array_schema returns [EObject current=null] : ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject lv_packed_0_0 = null;

        EObject lv_unpacked_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5385:2: ( ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) )
            // InternalPascal.g:5386:2: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            {
            // InternalPascal.g:5386:2: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==63) ) {
                alt66=1;
            }
            else if ( (LA66_0==64) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalPascal.g:5387:3: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:5387:3: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    // InternalPascal.g:5388:4: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    {
                    // InternalPascal.g:5388:4: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    // InternalPascal.g:5389:5: lv_packed_0_0= rulepacked_conformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPackedPacked_conformant_array_schemaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_packed_0_0=rulepacked_conformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    					}
                    					set(
                    						current,
                    						"packed",
                    						lv_packed_0_0,
                    						"org.xtext.Pascal.packed_conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5407:3: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:5407:3: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    // InternalPascal.g:5408:4: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    {
                    // InternalPascal.g:5408:4: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    // InternalPascal.g:5409:5: lv_unpacked_1_0= ruleunpacked_conformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpackedUnpacked_conformant_array_schemaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unpacked_1_0=ruleunpacked_conformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    					}
                    					set(
                    						current,
                    						"unpacked",
                    						lv_unpacked_1_0,
                    						"org.xtext.Pascal.unpacked_conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // InternalPascal.g:5430:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:5430:71: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // InternalPascal.g:5431:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;

             current =iv_rulepacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulepacked_conformant_array_schema"


    // $ANTLR start "rulepacked_conformant_array_schema"
    // InternalPascal.g:5437:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject rulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_bound_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5443:2: ( (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalPascal.g:5444:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalPascal.g:5444:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) )
            // InternalPascal.g:5445:3: otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0());
            		
            otherlv_1=(Token)match(input,64,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPascal.g:5457:3: ( (lv_bound_3_0= rulebound_specification ) )
            // InternalPascal.g:5458:4: (lv_bound_3_0= rulebound_specification )
            {
            // InternalPascal.g:5458:4: (lv_bound_3_0= rulebound_specification )
            // InternalPascal.g:5459:5: lv_bound_3_0= rulebound_specification
            {

            					newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_bound_3_0=rulebound_specification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPacked_conformant_array_schemaRule());
            					}
            					set(
            						current,
            						"bound",
            						lv_bound_3_0,
            						"org.xtext.Pascal.bound_specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5());
            		
            // InternalPascal.g:5484:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalPascal.g:5485:4: (lv_name_6_0= RULE_ID )
            {
            // InternalPascal.g:5485:4: (lv_name_6_0= RULE_ID )
            // InternalPascal.g:5486:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_6_0, grammarAccess.getPacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPacked_conformant_array_schemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulepacked_conformant_array_schema"


    // $ANTLR start "entryRulebound_specification"
    // InternalPascal.g:5506:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // InternalPascal.g:5506:60: (iv_rulebound_specification= rulebound_specification EOF )
            // InternalPascal.g:5507:2: iv_rulebound_specification= rulebound_specification EOF
            {
             newCompositeNode(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;

             current =iv_rulebound_specification; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulebound_specification"


    // $ANTLR start "rulebound_specification"
    // InternalPascal.g:5513:1: rulebound_specification returns [EObject current=null] : ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_final_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalPascal.g:5519:2: ( ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:5520:2: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:5520:2: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalPascal.g:5521:3: ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalPascal.g:5521:3: ( (lv_initial_0_0= RULE_ID ) )
            // InternalPascal.g:5522:4: (lv_initial_0_0= RULE_ID )
            {
            // InternalPascal.g:5522:4: (lv_initial_0_0= RULE_ID )
            // InternalPascal.g:5523:5: lv_initial_0_0= RULE_ID
            {
            lv_initial_0_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_initial_0_0, grammarAccess.getBound_specificationAccess().getInitialIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initial",
            						lv_initial_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1());
            		
            // InternalPascal.g:5543:3: ( (lv_final_2_0= RULE_ID ) )
            // InternalPascal.g:5544:4: (lv_final_2_0= RULE_ID )
            {
            // InternalPascal.g:5544:4: (lv_final_2_0= RULE_ID )
            // InternalPascal.g:5545:5: lv_final_2_0= RULE_ID
            {
            lv_final_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_final_2_0, grammarAccess.getBound_specificationAccess().getFinalIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"final",
            						lv_final_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getBound_specificationAccess().getColonKeyword_3());
            		
            // InternalPascal.g:5565:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPascal.g:5566:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPascal.g:5566:4: (lv_name_4_0= RULE_ID )
            // InternalPascal.g:5567:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getBound_specificationAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulebound_specification"


    // $ANTLR start "entryRuleunpacked_conformant_array_schema"
    // InternalPascal.g:5587:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:5587:73: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // InternalPascal.g:5588:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;

             current =iv_ruleunpacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleunpacked_conformant_array_schema"


    // $ANTLR start "ruleunpacked_conformant_array_schema"
    // InternalPascal.g:5594:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) ) ;
    public final EObject ruleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_bounds_2_0 = null;

        EObject lv_bounds_4_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5600:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:5601:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:5601:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) )
            // InternalPascal.g:5602:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:5610:3: ( (lv_bounds_2_0= rulebound_specification ) )
            // InternalPascal.g:5611:4: (lv_bounds_2_0= rulebound_specification )
            {
            // InternalPascal.g:5611:4: (lv_bounds_2_0= rulebound_specification )
            // InternalPascal.g:5612:5: lv_bounds_2_0= rulebound_specification
            {

            					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_bounds_2_0=rulebound_specification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            					}
            					add(
            						current,
            						"bounds",
            						lv_bounds_2_0,
            						"org.xtext.Pascal.bound_specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:5629:3: (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==26) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalPascal.g:5630:4: otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	    			
            	    // InternalPascal.g:5634:4: ( (lv_bounds_4_0= rulebound_specification ) )
            	    // InternalPascal.g:5635:5: (lv_bounds_4_0= rulebound_specification )
            	    {
            	    // InternalPascal.g:5635:5: (lv_bounds_4_0= rulebound_specification )
            	    // InternalPascal.g:5636:6: lv_bounds_4_0= rulebound_specification
            	    {

            	    						newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_54);
            	    lv_bounds_4_0=rulebound_specification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bounds",
            	    							lv_bounds_4_0,
            	    							"org.xtext.Pascal.bound_specification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,56,FOLLOW_52); 

            			newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5());
            		
            // InternalPascal.g:5662:3: ( (lv_type_7_0= ruleparameter_type ) )
            // InternalPascal.g:5663:4: (lv_type_7_0= ruleparameter_type )
            {
            // InternalPascal.g:5663:4: (lv_type_7_0= ruleparameter_type )
            // InternalPascal.g:5664:5: lv_type_7_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeParameter_typeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.Pascal.parameter_type");
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
    // $ANTLR end "ruleunpacked_conformant_array_schema"


    // $ANTLR start "entryRulevariable_parameter_section"
    // InternalPascal.g:5685:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:5685:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:5686:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // InternalPascal.g:5692:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5698:2: ( (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:5699:2: (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:5699:2: (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:5700:3: otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
            		
            // InternalPascal.g:5704:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:5705:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:5705:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:5706:5: lv_identifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_1_0,
            						"org.xtext.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
            		
            // InternalPascal.g:5727:3: ( (lv_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:5728:4: (lv_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:5728:4: (lv_type_3_0= ruleparameter_type )
            // InternalPascal.g:5729:5: lv_type_3_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.Pascal.parameter_type");
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
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRulefunction_heading"
    // InternalPascal.g:5750:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:5750:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:5751:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // InternalPascal.g:5757:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5763:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:5764:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:5764:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            // InternalPascal.g:5765:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:5769:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:5770:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:5770:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:5771:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:5787:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==24) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalPascal.g:5788:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:5788:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:5789:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_headingRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
            		
            // InternalPascal.g:5810:3: ( (lv_returnType_4_0= RULE_ID ) )
            // InternalPascal.g:5811:4: (lv_returnType_4_0= RULE_ID )
            {
            // InternalPascal.g:5811:4: (lv_returnType_4_0= RULE_ID )
            // InternalPascal.g:5812:5: lv_returnType_4_0= RULE_ID
            {
            lv_returnType_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_returnType_4_0, grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"returnType",
            						lv_returnType_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascal.g:5832:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalPascal.g:5832:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalPascal.g:5833:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // InternalPascal.g:5839:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:5845:2: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) )
            // InternalPascal.g:5846:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            {
            // InternalPascal.g:5846:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            // InternalPascal.g:5847:3: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            {
            // InternalPascal.g:5847:3: ( (lv_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:5848:4: (lv_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:5848:4: (lv_heading_0_0= rulefunction_heading )
            // InternalPascal.g:5849:5: lv_heading_0_0= rulefunction_heading
            {

            					newCompositeNode(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_heading_0_0=rulefunction_heading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.Pascal.function_heading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalPascal.g:5870:3: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==28||(LA69_0>=59 && LA69_0<=61)||LA69_0==68||(LA69_0>=70 && LA69_0<=71)) ) {
                alt69=1;
            }
            else if ( (LA69_0==69) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalPascal.g:5871:4: ( (lv_block_2_0= ruleblock ) )
                    {
                    // InternalPascal.g:5871:4: ( (lv_block_2_0= ruleblock ) )
                    // InternalPascal.g:5872:5: (lv_block_2_0= ruleblock )
                    {
                    // InternalPascal.g:5872:5: (lv_block_2_0= ruleblock )
                    // InternalPascal.g:5873:6: lv_block_2_0= ruleblock
                    {

                    						newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_2_0,
                    							"org.xtext.Pascal.block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:5891:4: ( (lv_forward_3_0= 'forward' ) )
                    {
                    // InternalPascal.g:5891:4: ( (lv_forward_3_0= 'forward' ) )
                    // InternalPascal.g:5892:5: (lv_forward_3_0= 'forward' )
                    {
                    // InternalPascal.g:5892:5: (lv_forward_3_0= 'forward' )
                    // InternalPascal.g:5893:6: lv_forward_3_0= 'forward'
                    {
                    lv_forward_3_0=(Token)match(input,69,FOLLOW_2); 

                    						newLeafNode(lv_forward_3_0, grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunction_declarationRule());
                    						}
                    						setWithLastConsumed(current, "forward", true, "forward");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulefunction_declaration"

    // Delegated rules


    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\54\1\70\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\2\2\13\uffff\1\10\7\uffff\1\4\10\uffff\1\5\1\6\1\7\1\11",
            "\4\12\1\uffff\1\12\12\uffff\1\12\1\uffff\1\13\3\12\1\uffff\1\12\2\uffff\11\12\5\uffff\1\12\1\uffff\1\12\1\uffff\2\12\1\uffff\2\12\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1493:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x3800000010000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0692A00010000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00001E0101001D70L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000500400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001800000082L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000942L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001C000000202L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001E0301001D70L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001E0103001D70L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000E0000001D70L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x80000E0401003D70L,0x000000000000000FL});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000E0001003D70L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000020000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080000002000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x3800000010000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000010L,0x00000000000000D0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000041000000L});

}