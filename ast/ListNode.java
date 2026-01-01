//package ast;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ListNode extends ASTNode {
//    private List<ASTNode> elements;
//
//    public ListNode(int lineNumber) {
//        super("List", lineNumber);
//        this.elements = new ArrayList<>();
//    }
//
//    public void addElement(ASTNode element) { elements.add(element); }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- List [" + elements.size() + " elements] (Line: " + lineNumber + ")");
//        for (ASTNode elem : elements) elem.print(indent + 1);
//    }
//
//    @Override
//    public String getDescription() {
//        return "List";
//    }
//}