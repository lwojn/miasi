// $ANTLR 3.4 /home/uml/eclipse-workspace/lab2/src/TExpr1.g 2019-03-05 10:52:04

// package com.sample;
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TExpr1 extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV", "ID", "INT", "LP", "MINUS", "MUL", "NL", "PLUS", "PODST", "RP", "VAR", "WS"
    };

    public static final int EOF=-1;
    public static final int DIV=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int LP=7;
    public static final int MINUS=8;
    public static final int MUL=9;
    public static final int NL=10;
    public static final int PLUS=11;
    public static final int PODST=12;
    public static final int RP=13;
    public static final int VAR=14;
    public static final int WS=15;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TExpr1(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TExpr1(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TExpr1.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/eclipse-workspace/lab2/src/TExpr1.g"; }


      HashMap<String, Integer> variables = new HashMap<>();



    // $ANTLR start "prog"
    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:19:1: prog : (e= expr )* ;
    public final void prog() throws RecognitionException {
        Integer e =null;


        try {
            // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:19:9: ( (e= expr )* )
            // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:19:11: (e= expr )*
            {
            // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:19:11: (e= expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= DIV && LA1_0 <= INT)||(LA1_0 >= MINUS && LA1_0 <= MUL)||(LA1_0 >= PLUS && LA1_0 <= PODST)||LA1_0==VAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:19:12: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog51);
            	    e=expr();

            	    state._fsp--;


            	    System.out.println (e);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "expr"
    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:21:1: expr returns [Integer out] : ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT | ID | ^( VAR i1= ID ) );
    public final Integer expr() throws RecognitionException {
        Integer out = null;


        CommonTree i1=null;
        CommonTree INT1=null;
        CommonTree ID2=null;
        Integer e1 =null;

        Integer e2 =null;


        try {
            // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:22:9: ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | INT | ID | ^( VAR i1= ID ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt2=1;
                }
                break;
            case MINUS:
                {
                alt2=2;
                }
                break;
            case MUL:
                {
                alt2=3;
                }
                break;
            case DIV:
                {
                alt2=4;
                }
                break;
            case PODST:
                {
                alt2=5;
                }
                break;
            case INT:
                {
                alt2=6;
                }
                break;
            case ID:
                {
                alt2=7;
                }
                break;
            case VAR:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:22:11: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr77); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr82);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr86);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    out = e1 + e2;

                    }
                    break;
                case 2 :
                    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:23:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr102); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr106);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr110);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    out = e1 - e2;

                    }
                    break;
                case 3 :
                    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:24:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr126); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr132);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr136);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    out = e1 * e2;

                    }
                    break;
                case 4 :
                    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:25:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr152); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr158);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr162);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    out = e1 / e2;

                    }
                    break;
                case 5 :
                    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:26:11: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr178); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr182); 

                    pushFollow(FOLLOW_expr_in_expr188);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    if (variables.containsKey((i1!=null?i1.getText():null))) variables.put((i1!=null?i1.getText():null), e2);
                                                        else System.out.println("Variable not declared");

                    }
                    break;
                case 6 :
                    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:28:11: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_expr203); 

                    out = Integer.parseInt((INT1!=null?INT1.getText():null));

                    }
                    break;
                case 7 :
                    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:29:11: ID
                    {
                    ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expr238); 

                    out = variables.get((ID2!=null?ID2.getText():null));

                    }
                    break;
                case 8 :
                    // /home/uml/eclipse-workspace/lab2/src/TExpr1.g:30:11: ^( VAR i1= ID )
                    {
                    match(input,VAR,FOLLOW_VAR_in_expr275); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr279); 

                    match(input, Token.UP, null); 


                    variables.put((i1!=null?i1.getText():null), 0);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return out;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_prog51 = new BitSet(new long[]{0x0000000000005B72L});
    public static final BitSet FOLLOW_PLUS_in_expr77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr82 = new BitSet(new long[]{0x0000000000005B70L});
    public static final BitSet FOLLOW_expr_in_expr86 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr106 = new BitSet(new long[]{0x0000000000005B70L});
    public static final BitSet FOLLOW_expr_in_expr110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr132 = new BitSet(new long[]{0x0000000000005B70L});
    public static final BitSet FOLLOW_expr_in_expr136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr158 = new BitSet(new long[]{0x0000000000005B70L});
    public static final BitSet FOLLOW_expr_in_expr162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr182 = new BitSet(new long[]{0x0000000000005B70L});
    public static final BitSet FOLLOW_expr_in_expr188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INT_in_expr203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_expr275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr279 = new BitSet(new long[]{0x0000000000000008L});

}