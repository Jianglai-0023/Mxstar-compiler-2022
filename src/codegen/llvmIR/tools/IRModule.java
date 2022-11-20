package codegen.llvmIR.tools;

import java.util.ArrayList;

public class IRModule {
    ArrayList<Function> fns = new ArrayList<>();
    ArrayList<Class> cls = new ArrayList<>();
    ArrayList<Stmt> gVars = new ArrayList<>();

    public Function malloc, array_size, print, println, printInt, printlnInt, getString, getInt, toString,
            string_length, string_subString, string_parseInt, string_ord,
            string_add, string_eq, string_ne, string_lt, string_le, string_gt, string_ge;
    public IRModule(){

    }

}
