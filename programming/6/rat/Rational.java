/**
 * Rational class by Team BangPi
 * First Last
 * collaborators: Mike Randazzo, Tanya Wardally, AliseBraick, Sarah McCoy
 */


/**
   class Rational
   An instance of this class will represent a rational number (p/q s.t. p,q ints && q!=0),
   and facilitate mathematical operations with another instance of class Rational.
   Basic level (complete all):
   - toString
   - default constructor
   - multiply
   - divide
   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor
   Advanced level (complete Basic + Intermediate + these methods):
   -
*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
   _numerator = 0;
	 _denominator = 1;
  }


  // overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
   if (d==0){
			System.out.println("UNDEFINED! Setting to 0/1.");
		  _numerator = 0;
	    _denominator = 1;	 
		 
	 }else{
	 		_numerator = n;
	 		_denominator = d;
	 }
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    return (_numerator + "/" + _denominator);
  }


//   // floatValue
//   // returns floating point approximation of the number
//   // uses the most precise floating point primitive
   public double floatValue()
   {
     double value = (double)_numerator/(double) _denominator;
		 return value;
   } 
   


//   // multiply
//   // takes a Rational parameter and multiplies it by this Rational
//   // does not return a value
//   // modifies this object
//   // does not modify input
//   // need not reduce
  //r._numerator and r._denominator gets value from main in Driver
  public void multiply( Rational r )
  {
    _numerator = _numerator * r._numerator;
    _denominator = _denominator * r._denominator;
  }


//   // divide
//   // same as multiply, except operation is division
  public void divide ( Rational r )
  {
		//to divide by a fraction you multiply by its reciprocal
    if (r._numerator !=0){
    _numerator = _numerator * r._denominator;
    _denominator = _denominator * r._numerator;
  } else{
    System.out.println("Invalid; no division performed.");  }
  }
 }//end class