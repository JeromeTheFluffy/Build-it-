package com.JeromeTF.Package

import com.JeromeTF.Package.*

public class Avatar{
  private Image characterImage;
  protected int xpLevel = 0;
  public int health = 20;
  public int hunger = 20;
  public int nutrition = 20;
  public int oxygenLevel;
  Private string characterName;
  private boolean isUnderWater = false
  // getters and setters
  public void setName(string name){
    characterName = name;
  }
  public string getName(){
    return characterName;
  public void setImage(Image image){
    characterImage = image;
  }
  public void setXP(int xpIncreasement){
    xpLevel += xpIncreasement;
  }
  public int getXP(){
    return xpLevel;
  }
  public void setHealth(boolean increaseOrDecrease, int byHowMuch){
    if(increaseOrDecrease == True);{
      this.health += byHowMuch;
    }
    else{
      this.health -= byHowMuch;
    }
  }
  public void setHunger(string foodEaten, string actionBeingPreformed){
    // not complete list
    if(foodEaten == "bread");{
      this.hunger = += 7;
    }
    if(foodEaten == "apple);{
      this.hunger += 3;
    }
    if(foodEaten == "potato");{
      hunger += 1;
    }
    if(foodEaten == "baked potato");{
     hunger += 8;
    }
    if(foodEaten == "carrot");{
      hunger += 4;
    }
  }
  public int gethunger(){
    return this.hunger;
  }
  public void setOxygenLevel()
    while(this.isUnderWater == true);{
      Time.delay(2000);
      health -= 1
    }
  }
  
