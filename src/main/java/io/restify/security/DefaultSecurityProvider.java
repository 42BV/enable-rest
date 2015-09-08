/*
 * (C) 2014 42 bv (www.42.nl). All rights reserved.
 */
package io.restify.security;

/**
 * Default implementation that grants everbody access.
 *
 * @author Jeroen van Schagen
 * @since Sep 8, 2015
 */
public class DefaultSecurityProvider implements SecurityProvider {
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAuthorized(String[] roles) {
        return true;
    }
    
}
