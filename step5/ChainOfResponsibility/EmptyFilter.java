package Aston.step5.ChainOfResponsibility;

public class EmptyFilter extends MessageFilter {
    @Override
    public String filter(String message) {
        if (message.isEmpty()) {
            return "Сообщение удалено";
        }
        if (next != null) {
            return next.filter(message);
        }
        return message;
    }
}
