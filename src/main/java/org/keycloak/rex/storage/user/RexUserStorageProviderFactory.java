package org.keycloak.rex.storage.user;

import org.jboss.logging.Logger;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

public class RexUserStorageProviderFactory implements UserStorageProviderFactory<RexUserStorageProvider> {
    public static final String PROVIDER_ID = "rex-user-storage-jpa";

    private static final Logger logger = Logger.getLogger(RexUserStorageProviderFactory.class);

    @Override
    public RexUserStorageProvider create(KeycloakSession session, ComponentModel model) {
        return new RexUserStorageProvider(session, model);
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public String getHelpText() {
        return "JPA User Storage Provider";
    }

    @Override
    public void close() {
        logger.info("<<<<<< Closing factory");

    }
}