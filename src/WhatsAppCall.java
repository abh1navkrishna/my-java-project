public interface WhatsAppCall {
    void call();

    void mute();

    void disConnect();
}

class AudioCall implements WhatsAppCall {
    public void call() {
        System.out.println("WhatsApp audio call....");
    }

    public void mute() {
        System.out.println("Audio call muted...");
    }

    public void disConnect() {
        System.out.println("Audio call diconnectd...");
    }
}

class VideoCall implements WhatsAppCall {
    public void call() {
        System.out.println("WhatsApp video call...");
    }

    public void mute() {
        System.out.println("Video call muted...");
    }

    public void disConnect() {
        System.out.println("Video call disconnected...");
    }

}