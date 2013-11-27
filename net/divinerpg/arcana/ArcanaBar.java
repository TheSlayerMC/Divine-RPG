package net.divinerpg.arcana;

public class ArcanaBar
{
  public static String playerID;
  private int arcana = 0;
  private int regenDelay = 0;

  public ArcanaBar(int par1, String username)
  {
    this.arcana = par1;
    this.regenDelay = 0;
    playerID = username;
  }

  public void arcanaRegen(int par1)
  {
    if (this.regenDelay == 0)
    {
      this.arcana += par1;
    }
    else
    {
      this.regenDelay -= 1;
    }
  }

  public void arcanaAdd(int par1)
  {
    this.arcana += par1;
  }

  public boolean arcanaUse(int par1) {
    if (this.arcana < par1)
    {
      this.regenDelay = 30;
      return false;
    }

    this.arcana -= par1;
    this.regenDelay = 30;
    return true;
  }

  public float getBarValue()
  {
    return this.arcana;
  }

  public void setArcana(int par1)
  {
    this.arcana = par1;
  }
}