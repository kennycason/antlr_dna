grammar Grammar;

@parser::header { package gen; }
@lexer::header { package gen; }

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

@lexer::members {

}

dna : ( nucleotide | aminoacid )+;

nucleotide 
	: A 
	| T 
	| C 
	| G 
	;
	
aminoacid	
	: ISO 
	| LEU 
	| VAL 
	| PHE 
	| MET 
	| CYS 
	| ALA 
	| GLY 
	| PRO 
	| THR 
	| SER 
	| TYR 
	| TRY 
	| GLN 
	| ASN
	| HIS 
	| GLU 
	| ASP 
	| LYS 
	| ARG 
	| STOP
	;

protein : aminoacid+;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
 
// Nucleotides
A : ('A');

T : ('T');

C : ('C');

G : ('G');
 
 // Amino Acid DNA Codons 
 ISO 
 	: A T T
 	| A T C
 	| A T A
 	;
 	
 LEU
 	: C T T
 	| C T C
 	| C T A
 	| C T G
 	| T T A
 	| T T G
 	;
 
 VAL 
 	: G T T
 	| G T C 
 	| G T A 
 	| G T G
 	;
 	
 PHE 
 	: T T T 
 	| T T C
 	;
 
 MET 
 	: A T G
 	;
 
 CYS 
 	: T G T
 	| T G C
 	;
 	
 ALA
 	: G C T
 	| G C C
 	| G C A
 	| G C G
 	;
 	
 GLY
 	: G G T
 	| G G C 
 	| G G A
 	| G G G
 	;
 	
 PRO
 	: C C T
 	| C C C
 	| C C A
 	| C C G
 	;
 	
 THR
 	: A C T
 	| A C C
 	| A C A
 	| A C G
 	;
 	
 SER
 	: T C T
 	| T C C
 	| T C A
 	| T C G
 	| A G T
 	| A G C
 	;
 	
 TYR 
 	: T A T
 	| T A C
 	;
 	
 TRY
 	: T G G
 	;
 	
 GLN
 	: C A A
 	| C A G
 	;
 
 ASN
 	: A A T
 	| A A C
 	;
 	
 HIS
 	: C A T
 	| C A C
 	;
 	
 GLU
 	: G A A
 	| G A G
 	;
 	
 ASP
 	: G A T
 	| G A C
 	;
 	
 LYS 
 	: A A A
 	| A A G
 	;
 	
 ARG
 	: C G T
 	| C G C
 	| C G A
 	| C G G
 	| A G A
 	| A G G 
 	;
 	
 STOP 
 	: T A A
 	| T A G
 	| T G A
 	;
 	
 WS : [ \t\r\n\u000C]+ -> channel(HIDDEN);
 
 OTHER : .;
