package br.upe.ppsw.jabberpoint.Model;

import br.upe.ppsw.jabberpoint.View.Draw;

public abstract class SlideItem extends Draw {

  private int level = 0;

  public SlideItem(int lev) {
    level = lev;
  }

  public SlideItem() {
    this(0);
  }

  public int getLevel() {
    return level;
  }

  
}
