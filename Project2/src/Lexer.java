public class Lexer {
	
	  public static final int q0 = 0;
	  public static final int q1 = 1;
	  public static final int q2 = 2;
	  public static final int q3 = 3;
	  public static final int q4 = 4;
	  public static final int q5 = 5;
	  public static final int q6 = 6;
	  public static final int q7 = 7;
	  public static final int q8 = 8;
	  public static final int q9 = 9;
	  public static final int q10 = 10;
	  public static final int q11 = 11;
	  public static final int q12 = 12;
	  public static final int q13 = 13;
	  public static final int q14 = 14;
	  public static final int q15 = 15;
	  public static final int q16 = 16;
	  public static final int q17 = 17;
	  public static final int q18 = 18;
	  public static final int q19 = 19;
	  public static final int q20 = 20;
	  public static final int q21 = 21;
	  public static final int q22 = 22;
	  public static final int q23 = 23;
	  public static final int q24 = 24;
	  public static final int q25 = 25;
	  public static final int q26 = 26;
	  public static final int q27 = 27;
	  public static final int q28 = 28;
	  public static final int q29 = 29;
	  public static final int q30 = 30;
	  public static final int q31 = 31;
	  public static final int q32 = 32;
	  public static final int q33 = 33;
	  public static final int q34 = 34;
	  public static final int q35 = 35;
	  public static final int q36 = 36;
	  public static final int q37 = 37;
	  public static final int q38 = 38;
	  public static final int q39 = 39;
	  public static final int q40 = 40;
	  public static final int q41 = 41;
	  public static final int q42 = 42;
		
	  /**
	   * matrix
	   * This is the matrix that will be traversed by lex.
	   */
	  public static int[][] matrix = 
	    {
	      //Start
	      //      a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  p, q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  *,  -,  ",  (,  ),  +,  =, nl,sp
	      /*q0*/{q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q18,q1,q18,q18,q18,q18,q18,q30,q18,q18,q18,q18,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q35,q41,q41,q41,q41,q41,q41,q0,q0},
	      //Print
	      /*q1*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q19,q41,q2,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q19},
	      /*q2*/{q41,q41,q41,q41,q41,q41,q41,q41,q3,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
	      /*q3*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q4,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
	      /*q4*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q42,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
	      /*q5*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q6,q41,q41,q41,q41,q41},
	      /*q6*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q7},
	      /*q7*/{q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q13,q13,q13,q13,q13,q13,q13,q13,q13,q13,q41,q41,q8,q41,q41,q41,q41,q41,q41},
	      /*q8*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q9},
	      /*q9*/{q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q10,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q10},
	      /*q10*/{q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q9,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q11,q41,q41,q41,q41,q41,q10},
	      /*q11*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q12},
	      /*q12*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q17,q41,q41,q41,q41},
	      /*q13*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q14},
	      /*q14*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q17,q15,q41,q41,q41},
	      /*q15*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q16},
	      /*q16*/{q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q11,q13,q13,q13,q13,q13,q13,q13,q13,q13,q13,q41,q41,q8,q41,q41,q41,q41,q41,q41},
	      /*q17*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q0,q0},
	      //Assign 
	      //       a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  p,  q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  *,  -,  ",  (,  ),  +,  =, nl, sp
	      /*q18*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q19},
	      /*q19*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q20,q41,q41},
	      /*q20*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q21},
	      /*q21*/{q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q25,q25,q25,q25,q25,q25,q25,q25,q25,q25,q41,q41,q22,q41,q41,q41,q41,q41,q41},
	      /*q22*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q23},
	      /*q23*/{q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q24},
	      /*q24*/{q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q23,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q29,q41,q41,q41,q41,q41,q24},
	      /*q25*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q26},
	      /*q26*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q27,q41,q41,q41},
	      /*q27*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q28},
	      /*q28*/{q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q29,q25,q25,q25,q25,q25,q25,q25,q25,q25,q25,q41,q41,q22,q41,q41,q41,q41,q41,q41},
	      /*q29*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q0,q0},
	      //VarDecl
	      //       a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  p,  q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  *,  -,  ",  (,  ),  +,  =, nl, sp
	      /*q30*/{q31,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q19},
	      /*q31*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q32,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
	      /*q32*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q33},
	      /*q33*/{q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q34,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
	      /*q34*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q0,q0},
	      //Comment
	      //       a,  b,  c,  d,  e,  f,  g,  h,  i,  j,  k,  l,  m,  n,  o,  p,  q,  r,  s,  t,  u,  v,  w,  x,  y,  z,  0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  *,  -,  ",  (,  ),  +,  =, nl, sp
	      /*q35*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q36,q41,q41,q41,q41,q41,q41,q41},
	      /*q36*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q37},
	      /*q37*/{q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q38},
	      /*q38*/{q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q37,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q39,q41,q41,q41,q41,q41,q41,q38},
	      /*q39*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q40,q41,q41,q41,q41,q41,q41,q41,q41},
	      /*q40*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q0,q0},
	      //Error 
	      /*q41*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41},
	      //Extra Space for Print
	      /*q42*/{q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q41,q5},
	    };
  
  /**
	   * lexString
	   * 
	   * This function takes the string from the user input. Then using the matrix to navigate through states it evaluates the string to make sure it is accepted by the grammar
	   * 
	   * Parameters:
	   *   userInput: the string that the user inputs
	   *   codeColor: the color of the accepted code
	   *   commentColor: the color of the accepted a comment
	   * 
	   * Return value: Returns the string that will be put into the htmlEditor
	   */
	  public static String lexString(String userInput, String codeColor, String commentColor)
	    {
	      String HTMLoutput = "<html><head></head><body>";
	      String buildNext = "";
	      Boolean commentCheck = false;
	      char currentChar;
	      int currentState = 0;
	      
	      //loop that go through the user string
	      for(int i = 0; i < userInput.length(); i++)
	      {
	        //get current char
	        currentChar = userInput.charAt(i);
	        //switch case navigates through the matrix
	        switch (currentChar)
	        {
	          case 'a':
	              currentState = matrix[currentState][0];
	              buildNext = buildNext + 'a';
	              break;
	          case 'b':
	              currentState = matrix[currentState][1];
	              buildNext = buildNext + 'b';
	              break;
	          case 'c':
	              currentState = matrix[currentState][2];
	              buildNext = buildNext + 'c';
	              break;
	          case 'd':
	              currentState = matrix[currentState][3];
	              buildNext = buildNext + 'd';
	              break;
	          case 'e':
	              currentState = matrix[currentState][4];
	              buildNext = buildNext + 'e';
	              break;
	          case 'f':
	              currentState = matrix[currentState][5];
	              buildNext = buildNext + 'f';
	              break;
	          case 'g':
	              currentState = matrix[currentState][6];
	              buildNext = buildNext + 'g';
	              break;
	          case 'h':
	              currentState = matrix[currentState][7];
	              buildNext = buildNext + 'h';
	              break;
	          case 'i':
	              currentState = matrix[currentState][8];
	              buildNext = buildNext + 'i';
	              break;
	          case 'j':
	              currentState = matrix[currentState][9];
	              buildNext = buildNext + 'j';
	              break;
	          case 'k':
	              currentState = matrix[currentState][10];
	              buildNext = buildNext + 'k';
	              break;
	          case 'l':
	              currentState = matrix[currentState][11];
	              buildNext = buildNext + 'l';
	              break;
	          case 'm':
	              currentState = matrix[currentState][12];
	              buildNext = buildNext + 'm';
	              break;
	          case 'n':
	              currentState = matrix[currentState][13];
	              buildNext = buildNext + 'n';
	              break;
	          case 'o':
	              currentState = matrix[currentState][14];
	              buildNext = buildNext + 'o';
	              break;
	          case 'p':
	              currentState = matrix[currentState][15];
	              buildNext = buildNext + 'p';
	              break;
	          case 'q':
	              currentState = matrix[currentState][16];
	              buildNext = buildNext + 'q';
	              break;
	          case 'r':
	              currentState = matrix[currentState][17];
	              buildNext = buildNext + 'r';
	              break;
	          case 's':
	              currentState = matrix[currentState][18];
	              buildNext = buildNext + 's';
	              break;
	          case 't':
	              currentState = matrix[currentState][19];
	              buildNext = buildNext + 't';
	              break;
	          case 'u':
	              currentState = matrix[currentState][20];
	              buildNext = buildNext + 'u';
	              break;
	          case 'v':
	              currentState = matrix[currentState][21];
	              buildNext = buildNext + 'v';
	              break;
	          case 'w':
	              currentState = matrix[currentState][22];
	              buildNext = buildNext + 'w';
	              break;
	          case 'x':
	              currentState = matrix[currentState][23];
	              buildNext = buildNext + 'x';
	              break;
	          case 'y':
	              currentState = matrix[currentState][24];
	              buildNext = buildNext + 'y';
	              break;
	          case 'z':
	              currentState = matrix[currentState][25];
	              buildNext = buildNext + 'z';
	              break;
	          case '0':
	              currentState = matrix[currentState][26];
	              buildNext = buildNext + '0';
	              break;
	          case '1':
	              currentState = matrix[currentState][27];
	              buildNext = buildNext + '1';
	              break;
	          case '2':
	              currentState = matrix[currentState][28];
	              buildNext = buildNext + '2';
	              break;
	          case '3':
	              currentState = matrix[currentState][29];
	              buildNext = buildNext + '3';
	              break;
	          case '4':
	              currentState = matrix[currentState][30];
	              buildNext = buildNext + '4';
	              break;
	          case '5':
	              currentState = matrix[currentState][31];
	              buildNext = buildNext + '5';
	              break;
	          case '6':
	              currentState = matrix[currentState][32];
	              buildNext = buildNext + '6';
	              break;
	          case '7':
	              currentState = matrix[currentState][33];
	              buildNext = buildNext + '7';
	              break;
	          case '8':
	              currentState = matrix[currentState][34];
	              buildNext = buildNext + '8';
	              break;
	          case '9':
	              currentState = matrix[currentState][35];
	              buildNext = buildNext + '9';
	              break;
	          case '*':
	              currentState = matrix[currentState][36];
	              buildNext = buildNext + '*';
	              break;
	          case '-':
	              currentState = matrix[currentState][37];
	              buildNext = buildNext + '-';
	              break;
	          case '"':
	              currentState = matrix[currentState][38];
	              buildNext = buildNext + '"';
	              break;
	          case '(':
	              currentState = matrix[currentState][39];
	              buildNext = buildNext + '(';
	              break;
	          case ')':
	              currentState = matrix[currentState][40];
	              buildNext = buildNext + ')';
	              break;
	          case '+':
	              currentState = matrix[currentState][41];
	              buildNext = buildNext + '+';
	              break;
	          case '=':
	              currentState = matrix[currentState][42];
	              buildNext = buildNext + '=';
	              break;
	          case '~':
	              currentState = matrix[currentState][43];
	              HTMLoutput = HTMLoutput + "<p>";
	              break;
	          case ' ':
	              currentState = matrix[currentState][44];
	              buildNext = buildNext + ' ';
	              break;
	          default:
	        	  buildNext = buildNext + currentChar;
	        	  currentState = 41;
	              break;
	        }
	     
	        switch(currentState)
	        {
	          case 17:
	              buildNext = "<font color='"+codeColor+"'>" + buildNext + "</font>";
	              HTMLoutput = HTMLoutput + buildNext;
	              buildNext = "";
	              currentState = 0;
	              break;
	          case 25:
	        	  if (i == (userInput.length() - 1))
	        	  {
	                buildNext = "<font color='"+codeColor+"'>" + buildNext + "</font>";
	                HTMLoutput = HTMLoutput + buildNext;
	                buildNext = "";
	                currentState = 0;
	        	  }
	        	  else
	              {
	                if(userInput.charAt(i+2) != '+')
	                {
	             	  buildNext = "<font color='"+codeColor+"'>" + buildNext + "</font>";
	                  HTMLoutput = HTMLoutput + buildNext;
	                  buildNext = "";
	                  currentState = 0;
	                }
	              }
	              break;
	          case 29:
	              buildNext = "<font color='"+codeColor+"'>" + buildNext + "</font>";
	              HTMLoutput = HTMLoutput + buildNext;
	              buildNext = "";
	              currentState = 0;
	              break;
	          case 34:
	              buildNext = "<font color='"+codeColor+"'>" + buildNext + "</font>";
	              HTMLoutput = HTMLoutput + buildNext;
	              buildNext = "";
	              currentState = 0;
	              break;
	          case 35:
	              commentCheck = true;
	              break;
	          case 40:
	              buildNext = "<font color='"+commentColor+"'>" + buildNext + "</font>";
	              HTMLoutput = HTMLoutput + buildNext;
	              buildNext = "";
	              currentState = 0;
	              commentCheck = false;
	              break;
	          case 41:
	              if (commentCheck == true && currentChar != '*')
	              {
	                currentState = 41;
	              }
	              else
	              {
	                buildNext = "<font color='red'>" + buildNext + "</font>";
	                HTMLoutput = HTMLoutput + buildNext;
	                buildNext = "";
	                currentState = 0;
	                commentCheck = false; 
	              }
	              break;
	        }
	      }
	    //error state
	    if (buildNext.length() > 0)
	    {
	      buildNext = "<font color='red'>" + buildNext + "</font>";
	      HTMLoutput = HTMLoutput + buildNext;
	    }
	    //add ending html tags
	    HTMLoutput = HTMLoutput + "</body></html>";
	    return HTMLoutput;
		}
			
}