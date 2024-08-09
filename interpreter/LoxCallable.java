package interpreter;

import java.util.List;

interface LoxCallable {
    int arity() ;
    public Object call(Interpreter interpreter, List<Object> arguments);
}
