tree grammar TExpr1;

options {
  tokenVocab=Expr;

  ASTLabelType=CommonTree;

}

@header {
// package com.sample;
import java.util.HashMap;
}

@members {
  HashMap<String, Integer> variables = new HashMap<>();
}

prog    : (e=expr {System.out.println ($e.out);})* ;

expr returns [Integer out]
        : ^(PLUS  e1=expr e2=expr) {$out = $e1.out + $e2.out;}
        | ^(MINUS e1=expr e2=expr) {$out = $e1.out - $e2.out;}
        | ^(MUL   e1=expr e2=expr) {$out = $e1.out * $e2.out;}
        | ^(DIV   e1=expr e2=expr) {$out = $e1.out / $e2.out;}
        | ^(PODST i1=ID   e2=expr) {if (variables.containsKey($i1.text)) variables.put($i1.text, $e2.out);
                                    else System.out.println("Variable not declared");}
        | INT                      {$out = Integer.parseInt($INT.text);}
        | ID                       {$out = variables.get($ID.text);}
        | ^(VAR i1=ID)         {variables.put($i1.text, 0);}
        ;