public interface RemoteControl {
  boolean powerOnOff();
  int volumnUp(int increment);
  int volumnDown(int decrement);
  void mute();
  int channelUp();
  int channelDown();
  int channelChange(int channel);
}
