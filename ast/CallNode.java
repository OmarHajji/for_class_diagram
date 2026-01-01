//package ast;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Function Call Node
// * Represents: function(arg1, arg2, name=value)
// */
//public class CallNode extends ExpressionNode {
//
//    /** Function being called */
//    private ExpressionNode callee;
//
//    /** Arguments */
//    private List<ArgumentNode> arguments;
//
//    /**
//     * Constructor
//     * @param lineNumber line number
//     */
//    public CallNode(int lineNumber) {
//        super("FunctionCall", lineNumber);
//        this.arguments = new ArrayList<>();
//    }
//
//    // ==================== Getters & Setters ====================
//
//    public ExpressionNode getCallee() {
//        return callee;
//    }
//
//    public void setCallee(ExpressionNode callee) {
//        this.callee = callee;
//        addChild(callee);
//    }
//
//    public List<ArgumentNode> getArguments() {
//        return arguments;
//    }
//
//    public void addArgument(ArgumentNode arg) {
//        this.arguments.add(arg);
//        addChild(arg);
//    }
//
//    @Override
//    public void print(int indent) {
//        String indentStr = getIndent(indent);
//        System.out.println(indentStr + "+-- FunctionCall (Line: " + lineNumber + ")");
//        System.out.println(indentStr + "|   +-- Callee:");
//        if (callee != null) {
//            callee.print(indent + 2);
//        }
//        System.out.println(indentStr + "|   +-- Arguments:");
//        if (arguments.isEmpty()) {
//            System.out.println(indentStr + "|       (none)");
//        } else {
//            for (ArgumentNode arg : arguments) {
//                arg.print(indent + 2);
//            }
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        String calleeDesc = callee != null ? callee.getDescription() : "?";
//        return calleeDesc + "(...)";
//    }
//}
