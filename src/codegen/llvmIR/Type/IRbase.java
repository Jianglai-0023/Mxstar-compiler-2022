package codegen.llvmIR.Type;

public class IRbase extends IRType {

      public enum typeToken{
        VOID,I,LABEL
      }
      public typeToken type_name;
      public int bits;

      public IRbase(typeToken t, int bits_){
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
  @Override
    public String toString(){
          String s = type_name.name().toLowerCase();
          if(type_name==typeToken.I) s += Integer.toString(bits);
          return s;
  }
}
