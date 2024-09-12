package dev.principles.interface_segregation;

/**
 * Les clients ne doivent pas être obligés de dépendre d'interfaces qu'ils n'utilisent pas.
 * En d'autres termes, il vaut mieux avoir plusieurs interfaces spécifiques plutôt qu'une seule interface générale.
 */
public class HumanWorker implements Worker, Eatable {
    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }
}
