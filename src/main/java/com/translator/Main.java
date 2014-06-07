
package com.translator;
import com.translator.parser.JavaLexer;
import com.translator.parser.JavaParser;
import com.translator.parser.SimpleListener;
import com.translator.structure.MainMethodDeclaration;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream stream = Main.class.getResourceAsStream("JavaSourceCode.j");
        ANTLRInputStream antlrStream = new ANTLRInputStream(stream);
        JavaLexer lexer = new JavaLexer(antlrStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        ParserRuleContext tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        SimpleListener listener = new SimpleListener();
        walker.walk(listener, tree);
    }

}
