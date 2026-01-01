//package ast;
//
//public class BinaryExpressionNode extends ASTNode {
//    private String operator;
//    private ASTNode left;
//    private ASTNode right;
//
//    public BinaryExpressionNode(String operator, int lineNumber) {
//        super("BinaryExpression", lineNumber);
//        this.operator = operator;
//    }
//
//    public void setLeft(ASTNode left) {
//        this.left = left;
//    }
//
//    public void setRight(ASTNode right) {
//        this.right = right;
//    }
//
//    public ASTNode getLeft() {
//        return left;
//    }
//
//    public ASTNode getRight() {
//        return right;
//    }
//
//    public String getOperator() {
//        return operator;
//    }
//
//    @Override
//    public void print(int indent) {
//        String ind = getIndent(indent);
//        System.out.println(ind + "+-- BinaryExpr: " + operator + " (Line: " + lineNumber + ")");
//        if (left != null) {
//            System.out.println(ind + "    +-- Left:");
//            left.print(indent + 2);
//        }
//        if (right != null) {
//            System.out.println(ind + "    +-- Right:");
//            right.print(indent + 2);
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        return "BinaryExpression: " + operator;
//    }
//}