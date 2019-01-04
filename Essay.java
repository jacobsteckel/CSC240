/*
Design an Essay class that extends the GradeActivity class presented in this chapter. 
The Essay class should determine the grade a student receives for an essay. 
The student's essay score can be up to 100 and is determined in the following manner:
Grammar: 30 points
Spelling: 20 points
Correct length: 20 points
Content: 30 points
*/

//Jake Steckel
public class Essay extends GradeActivity
{
   private double grammar;
   private double spelling;
   private double essayLength;
   private double content;
   
   public Essay(double g, double s, double l, double c)
   {
      
      grammar=g;
      spelling=s; 
      essayLength=l;
      content=c; 
      double deductedPoints;
      double score;
      
      g = 30 - g;
      s = 20 - s;
      l = 20 - l;
      c = 30 - c;
      deductedPoints = g+ s+ l+ c;
      score=100-deductedPoints; 
      setScore(score);
   }
   
   public double getGrammarScore()
   {
      return grammar;
   }
   public double getSpellingScore()
   {
      return spelling;
   }
   public double getLengthScore()
   {
      return essayLength;
   }
   public double getContentScore()
   {
      return content;
   }
}