package ast.Css;

import ast.ASTNode;

public  abstract  class CssNode extends ASTNode {
    public CssNode(String type,int lineNumber) {
        super(type,lineNumber);
    }


}
