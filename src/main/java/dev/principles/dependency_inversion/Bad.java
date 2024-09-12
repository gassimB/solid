package dev.principles.dependency_inversion;

class EmailServiceBad {
    public void sendEmail(String message) {
    }
}

class NotificationServiceBad {
    private final EmailServiceBad emailServiceBad;

    public NotificationServiceBad() {
        this.emailServiceBad = new EmailServiceBad();
    }

    public void notify(String message) {
        emailServiceBad.sendEmail(message);
    }
}

