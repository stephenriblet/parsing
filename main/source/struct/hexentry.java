public class HexEntry implements {
  private String value;
  public HexEntry(){
    value= "";
  }
  public HexEntry(String s){
    value = s;
  }
  @overrides
  public String toString(){
    return value;
  }

}
