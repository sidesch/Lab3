public class State {
  private Position objPos;
  private Position[] agentPos;
  private int[] agentR;
  
  public State(Position objPos, Position[] agentPos, int[] agentR) {
    this.objPos = objPos;
    this.agentPos = agentPos;
    this.agentR = agentR;
  }
}
