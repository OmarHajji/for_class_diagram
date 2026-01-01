//package ast;
//
///**
// * Unary Operation Node
// * Represents: -x, not x
// */
//public class UnaryOpNode extends ExpressionNode {
//
//    /** Unary operators */
//    public enum Operator {
//        NEGATIVE("-"),
//        POSITIVE("+"),
//        NOT("not");
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
//    /** Operand */
//    private ExpressionNode operand;
//
//    /**
//     * Constructor
//     * @param operator the operator
//     * @param lineNumber line number
//     */
//    public UnaryOpNode(Operator operator, int lineNumber) {
//        super("UnaryOperation", lineNumber);
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
//    public ExpressionNode getOperand() {
//        return operand;
//    }
//
//    public void setOperand(ExpressionNode operand) {
//        this.operand = operand;
//        addChild(operand);
//    }
//
//    @Override
//    public void print(int indent) {
//        String indentStr = getIndent(indent);
//        System.out.println(indentStr + "+-- UnaryOp [" + operator.getSymbol() + "] (Line: " + lineNumber + ")");
//        System.out.println(indentStr + "|   +-- Operand:");
//        if (operand != null) {
//            operand.print(indent + 2);
//        }
//    }
//
//    @Override
//    public String getDescription() {
//        String operandDesc = operand != null ? operand.getDescription() : "?";
//        return operator.getSymbol() + " " + operandDesc;
//    }
//}
