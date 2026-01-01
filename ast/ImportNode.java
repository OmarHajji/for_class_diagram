package ast;

import java.util.ArrayList;
import java.util.List;

public class ImportNode extends ASTNode {
    private String moduleName;
    private List<String> importedNames;

    public ImportNode(String moduleName, int lineNumber) {
        super("Import", lineNumber);
        this.moduleName = moduleName;
        this.importedNames = new ArrayList<>();
    }
    public void addImportedName(String name) {
        importedNames.add(name);
    }
    public List<String> getImportedNames() {
        return importedNames;
    }
    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- Import: " + moduleName + " (Line: " + lineNumber + ")");
        if (!importedNames.isEmpty()) {
            System.out.println(ind + "    +-- Imported: " + importedNames);
        }
    }
    @Override
    public String getDescription() { return "Import: " + moduleName; }
}