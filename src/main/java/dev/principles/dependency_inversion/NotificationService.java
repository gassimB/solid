package dev.principles.dependency_inversion;

/**
 * Les modules de haut niveau ne doivent pas dépendre de modules de bas niveau. Les deux devraient dépendre d'abstractions.
 * De plus, les abstractions ne doivent pas dépendre des détails. Ce sont les détails qui doivent dépendre des abstractions.
 */
public class NotificationService {
    private final MessageService messageService;

    public NotificationService(MessageService service) {
        this.messageService = service;
    }

    public void notify(String message) {
        messageService.sendMessage(message);
    }
}
