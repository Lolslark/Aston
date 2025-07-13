package Aston.step5.ChainOfResponsibility;

abstract class MessageFilter {
    protected MessageFilter next;

    public void setNext(MessageFilter next) {
        this.next = next;
    }
    public abstract String filter(String message);
}
