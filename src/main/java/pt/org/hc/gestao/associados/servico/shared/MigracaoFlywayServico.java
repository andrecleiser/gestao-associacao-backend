package pt.org.hc.gestao.associados.servico.shared;

import javax.enterprise.event.Observes;

import org.flywaydb.core.Flyway;

import io.quarkus.runtime.StartupEvent;

// @ApplicationScoped
public class MigracaoFlywayServico {

    // private static final Logger LOGGER = LoggerFactory.getLogger(MigracaoFlywayServico.class);

    public void aoIniciar(@Observes StartupEvent evento, Flyway flyway) {
        // LOGGER.info("A iniciar aplicação no modo: " + ProfileManager.getActiveProfile());
        // flyway.migrate();
        // Optional<MigrationInfo> migracaoCorrente = Optional.ofNullable(flyway.info().current());

        // if (migracaoCorrente.isPresent()) {
        //     LOGGER.info(migracaoCorrente.get().getVersion().getVersion());
        //     LOGGER.info(migracaoCorrente.get().getState().toString());
        // } else {
        //     LOGGER.info("Não há scripts para executar");
        // }
    }

}