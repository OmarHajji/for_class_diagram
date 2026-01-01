//package ast;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FunctionCallNode extends ASTNode {
//    private String functionName;
//    private ASTNode callee;
//    private List<ASTNode> arguments;
//
//    public FunctionCallNode(String functionName, int lineNumber) {
//        super("FunctionCall", lineNumber);
//        this.functionName = functionName;
//        this.arguments = new ArrayList<>();
//    }
//
//    public void setCallee(ASTNode callee) {
//        this.callee = callee;
//    }
//
//    public void addArgument(ASTNode arg) {
//        arguments.add(arg);
//    }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- FunctionCall: " + functionName + "() (Line: " + lineNumber + ")");
//        if (callee != null) {
//            System.out.println(ind + "    +-- Callee:");
//            callee.print(indent + 2);
//        }
//        if (!arguments.isEmpty()) {
//            System.out.println(ind + "    +-- Arguments:");
//            for (ASTNode arg : arguments) {
//                arg.print(indent + 2);
//            }
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        return "FunctionCall: " + functionName + "()";
//    }
//}