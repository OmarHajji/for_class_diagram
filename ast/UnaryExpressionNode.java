//package ast;
//
//public class UnaryExpressionNode extends ASTNode {
//    private String operator;
//    private ASTNode operand;
//
//    public UnaryExpressionNode(String operator, int lineNumber) {
//        super("UnaryExpression", lineNumber);
//        this.operator = operator;
//    }
//
//    public void setOperand(ASTNode operand) {
//        this.operand = operand;
//    }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- UnaryExpr: " + operator + " (Line: " + lineNumber + ")");
//        if (operand != null) operand.print(indent + 1);
//    }
//
//    @Override
//    public String getDescription() {
//        return "UnaryExpression: " + operator;
//    }
//}