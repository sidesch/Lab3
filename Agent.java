import java.util.Random;

public class Agent {
  private int id;
  private Position pos;
  private float[] probs;
  private int rval;

  public Agent(int id, Position pos, float[] probs) {
    this.id = id;
    this.pos = pos;
    this.probs = probs;
    this.rval = 0;
  }

  public int pickAction() {
    Random rand = new Random();
    double action = rand.nextDouble();
    if (action < probs[0]) {
      return 0;
    } else if (action < probs[1]) {
      return 1;
    } else if (action < probs[2]) {
      return 2;
    } else {
      return 3;
    }
  }

  public void addPunishment(int n) {
    this.rval -= n;
  }

  public void addReward(int n) {
    this.rval += n;
  }

  public int getR() {
    return this.rval;
  }
}
