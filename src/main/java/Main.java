import generated.Calculator.CalculatorLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharStream charStream = CharStreams.fromString("1 + 2");
        CalculatorLexer lexer = new CalculatorLexer(charStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();

        for (Token token : tokens.getTokens()) {
            System.out.println(token.toString());
        }
    }
}
