package codegen.llvmIR.Inst;

import codegen.llvmIR.Entity.Entity;
import codegen.llvmIR.Type.IRType;

public class binaryOp extends Inst{
    public enum binaryOpType{
        ADD, SUB, MUL, UDIV, SDIV, UREM, SREM,
        SHL, LSHR, ASHR, AND, OR, XOR
    }

    public binaryOpType op;
    public IRType type;
    public Entity rd,rs1,rs2;

    @Override
    public String toString() {
        String re = "%" + rd.toString() + " = " + op.name().toLowerCase();
        re = re + type.toString() + rs1.getValue() + "," + rs2.getValue();
        return re;
    }
}
