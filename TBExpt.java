package lab.polymorphism;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
   TextBlock block = new TextLine("Hello");
//    BoxedBlock block1 = new BoxedBlock(block);
//    BoxedBlock block2 = new BoxedBlock(block1);
//    TextBlock block3 = new TextLine("");
//    BoxedBlock block4 = new BoxedBlock(block3);
   TextBlock block5 = new TextLine("Goodbye");
//    TextBlock block6 = new VComposition(block, block5);
//    BoxedBlock block7 = new BoxedBlock(block6);
    
    TextBlock block3 = new CComposition(block,20);
    // Print out the block
    TBUtils.print(pen, block3);
    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
