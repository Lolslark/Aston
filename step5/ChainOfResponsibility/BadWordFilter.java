package Aston.step5.ChainOfResponsibility;

public class BadWordFilter extends MessageFilter{
    @Override
    public String filter(String message) {
        String filtered = message.replace("дурак", "***");
        if (next != null) {
            return next.filter(filtered);
        }
        return filtered;
    }
}
