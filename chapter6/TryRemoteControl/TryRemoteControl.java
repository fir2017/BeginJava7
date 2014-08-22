import static java.lang.Math.random;
public class TryRemoteControl {
  public static void main (String[] args){
    RemoteControl[] controls = new RemoteControl[5];
    for (int i = 0; i < controls.length; i++) {
      if(random() > 0.5) {
        controls[i] = new TV("TV" + i,"Sony", 25.6);
      }else{
        controls[i] = new DVD("DVD" + i, "Pioneer");
      }
    }
    for(RemoteControl r : controls){
       r.powerOnOff();
       r.channelUp();
       r.volumnUp(1);
       r.mute();
       r.mute();
    }
  }
} 
