package codegen.llvmIR.Type;

public class baseType extends IRType {

      public enum typeToken{
        VOID,I,LABEL
      }
      public typeToken type_name;
      public int bits;

      public baseType(typeToken t,int bits_){
        type_name = t;
        bits = bits_;
      }

  @Override
    public int getBytes(){
    return switch(type_name){
      case VOID,LABEL -> 0;
      case I -> bits == 1 ? 1 : bits/8;
    };
  }
}
