package Example;

class Message { void send() { System.out.println("Message sent."); }

} class TextMessage extends Message { void send() { System.out.println("Text message sent."); } } class VoiceMessage extends Message { void send() { System.out.println("Voice message sent."); } } class VideoMessage extends Message { void send() { System.out.println("Video message sent."); } } public class Main { public static void main(String[] args) { Message text = new TextMessage(); text.send(); Message voice = new VoiceMessage(); voice.send(); Message video = new VideoMessage(); video.send(); } }