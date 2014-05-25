
import com.translator.RuleController;
import com.translator.parser.EchoListener;
import com.translator.parser.JavaLexer;
import com.translator.parser.JavaParser;
import com.translator.structure.CompilationUnit;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

public class TranslationTest {

    @Test
    public void simpleTest() throws IOException {
        String sourceCode = "public class Klasa{"
                + "public void Metoda(TypArg argument){}"
                + "}";
        createStructureFromSourceCode(sourceCode);
        TreeDisplayer.displayTreeOfCode(sourceCode);
    }


    private void createStructureFromSourceCode(String code) {
        ANTLRInputStream stream = new ANTLRInputStream(code);
        JavaLexer lexer = new JavaLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        RuleController.setCurrentRule(new CompilationUnit());

        ParserRuleContext tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        EchoListener listener = new EchoListener();
        walker.walk(listener, tree);
    }

}
