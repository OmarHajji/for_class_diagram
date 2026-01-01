//package ast;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TupleNode extends ASTNode {
//    private List<ASTNode> elements;
//
//    public TupleNode(int lineNumber) {
//        super("Tuple", lineNumber);
//        this.elements = new ArrayList<>();
//    }
//
//    public void addElement(ASTNode element) {
//        elements.add(element);
//    }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- Tuple (" + elements.size() + " elements) (Line: " + lineNumber + ")");
//        for (ASTNode elem : elements) elem.print(indent + 1);
//    }
//
//    @Override
//    public String getDescription() {
//        return "Tuple";
//    }
//}