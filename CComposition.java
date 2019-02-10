package lab.polymorphism;

public class CComposition implements TextBlock{

 TextBlock block;
 int width;
 public CComposition (TextBlock block, int width) {
   this.block = block;
   this.width = width;
 }
 
 public String row(int i) throws Exception {
   // The top and bottom of the box\
   String row = this.block.row(i-1);
   while (row.charAt(row.length() - 1) == ' ')
   {
     row = row.substring(0, (row.length() - 1));
   }
   if ((i == 0) || (i == this.block.height() + 1)) {
     return "+" + TBUtils.dashes(this.width()) + "+";
   }
   // Stuff within the box
   else if ((i > 0) && (i <= this.block.height())) {
     return "|" + TBUtils.spaces((this.width-row.length())/2)+ row + TBUtils.spaces((this.width-row.length())/2) + "|";
   }
   // Everything else
   else {
     throw new Exception("Invalid row " + i);
   }
 } // row(int)
 
  public int height() {
    return this.block.height();
  }

 
  public int width() {
    return this.block.width();
  }

  
}
