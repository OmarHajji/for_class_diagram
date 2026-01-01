//package ast;
//
///**
// * Binary Operation Node
// * Represents: a + b, x == y, a and b
// */
//
//public class BinaryOpNode extends ExpressionNode {
//
//    /** Binary operators */
//    public enum Operator {
//        // Arithmetic
//        ADD("+"),
//        SUBTRACT("-"),
//        MULTIPLY("*"),
//        DIVIDE("/"),
//        MODULO("%"),
//        FLOOR_DIVIDE("//"),
//        POWER("**"),
//
//        // Comparison
//        EQUAL("=="),
//        NOT_EQUAL("!="),
//        LESS_THAN("<"),
//        GREATER_THAN(">"),
//        LESS_EQUAL("<="),
//        GREATER_EQUAL(">="),
//
//        // Logical
//        AND("and"),
//        OR("or"),
//
//        // Membership
//        IN("in"),
//        NOT_IN("not in");
//
//        private final String symbol;
//
//        Operator(String symbol) {
//            this.symbol = symbol;
//        }
//
//        public String getSymbol() {
//            return symbol;
//        }
//    }
//
//    /** Operator */
//    private Operator operator;
//
//    /** Left operand */
//    private ExpressionNode left;
//
//    /** Right operand */
//    private ExpressionNode right;
//
//    /**
//     * Constructor
//     * @param operator the operator
//     * @param lineNumber line number
//     */
//    public BinaryOpNode(Operator operator, int lineNumber) {
//        super("BinaryOperation", lineNumber);
//        this.operator = operator;
//    }
//
//    // ==================== Getters & Setters ====================
//
//    public Operator getOperator() {
//        return operator;
//    }
//
//    public void setOperator(Operator operator) {
//        this.operator = operator;
//    }
//
//    public ExpressionNode getLeft() {
//        return left;
//    }
//
//    public void setLeft(ExpressionNode left) {
//        this.left = left;
//        addChild(left);
//    }
//
//    public ExpressionNode getRight() {
//        return right;
//    }
//
//    public void setRight(ExpressionNode right) {
//        this.right = right;
//        addChild(right);
//    }
//
//    @Override
//    public void print(int indent) {
//        String indentStr = getIndent(indent);
//        System.out.println(indentStr + "+-- BinaryOp [" + operator.getSymbol() + "] (Line: " + lineNumber + ")");
//        System.out.println(indentStr + "|   +-- Left:");
//        if (left != null) {
//            left.print(indent + 2);
//        }
//        System.out.println(indentStr + "|   +-- Right:");
//        if (right != null) {
//            right.print(indent + 2);
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        String leftDesc = left != null ? left.getDescription() : "?";
//        String rightDesc = right != null ? right.getDescription() : "?";
//        return leftDesc + " " + operator.getSymbol() + " " + rightDesc;
//    }
//}
