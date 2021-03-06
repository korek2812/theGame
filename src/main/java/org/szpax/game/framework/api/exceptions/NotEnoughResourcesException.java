package org.szpax.game.framework.api.exceptions;

import org.szpax.game.framework.api.Named;

public class NotEnoughResourcesException extends RuntimeException {

    private final Double needed;
    private final Double actual;
    private final Named resource;

    public NotEnoughResourcesException(Double needed, Double actual, Named resource) {
        this.needed = needed;
        this.actual = actual;
        this.resource = resource;
    }

    public Double getNeeded() {
        return needed;
    }

    public Double getActual() {
        return actual;
    }

    public Named resource() {
        return resource;
    }
}
