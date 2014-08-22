import static java.lang.Math.max;
import static java.lang.Math.min;
public class DVD implements RemoteControl {
  public DVD(String name, String maker){
    this.name = name;
    this.maker = maker;
  }

  public boolean powerOnOff(){
    powerOn = !powerOn;
    System.out.println("DVD " + name + " is " + (powerOn ? "On" : "OFF"));
    return powerOn;
  }

  public int volumnUp(int increment){
    if(!powerOn){
      return 0;
    }
    if (mute){
      System.out.println("DVD " + name + " is set to mute");
    }
    volumn += increment;
    volumn = min(volumn,VOLUMN_MAX);    
    System.out.println("DVD " + name + " volumn increase to " + volumn);
    return volumn;
  }

  public int volumnDown(int decrement){
    if(!powerOn){
      return 0;
    }
    if (mute){
      System.out.println("DVD " + name + " is set to mute");
    }
    volumn -= decrement;
    volumn = max(volumn, VOLUMN_MIN);
    System.out.println("DVD " + name + " volumn decrease to " + volumn);
    return volumn;
  }

  public void mute(){
    if(!powerOn){
      return;
    } 
    //volumn = 0;
    mute = !mute;
    System.out.println("DVD " + name + " volumn is set to " + (mute ? "On" : "OFF"));
  }

  public int channelUp(){
    if (!powerOn) {
      return 0;
    }
    channel++;
    if(channel > CHANNEL_MAX) channel = CHANNEL_MIN; 
    System.out.println("DVD " + name + ": channel set to " + channel);
    return channel;
  }
  public int channelDown(){
    if (!powerOn){
      return 0;
    }
    channel--;
    if (channel < CHANNEL_MIN) channel = CHANNEL_MAX;
    System.out.println("DVD " + name + ": channel set to " + channel);
    return channel;
  }
  public int channelChange(int channel){
    if (!powerOn){
      return 0;
    } 
    if (channel > CHANNEL_MAX) {
      this.channel = CHANNEL_MAX;
    }else if (channel < CHANNEL_MIN) {
      this.channel = CHANNEL_MIN;
    }else {
      this.channel = channel;
    }
    return this.channel;
  }

  private String name;
  private String maker;
  private double screenSize;
 
  private boolean powerOn = false;
  private int volumn = 50;
  private static final int VOLUMN_MAX = 100;
  private static final int VOLUMN_MIN = 0;
  private boolean mute = false;
  
  private int channel = 1;
  private static final int CHANNEL_MAX = 999;
  private static final int CHANNEL_MIN = 1;
}
