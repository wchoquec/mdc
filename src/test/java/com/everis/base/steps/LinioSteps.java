package com.everis.base.steps;

import com.everis.base.pageobject.LinioPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinioSteps {

    LinioPage page;

    private static final Logger logger = LoggerFactory.getLogger(LinioSteps.class);

    public void abrirPaginaLinio(){
        logger.info("abrimos Linio");
        page.open();
    }
    public void ingresarDato(String dato){
        page.txtBuscador.type(dato);
    }
    public void presionarBotonBuscar(){
        page.btnBuscar.click();
    }
    public void validarResultados(){
        page.lblResultados.isVisible();
        logger.info(page.lblResultados.getText());
    }
    public void seleccionarPrimerElemento(){
        page.primerElemento.click();
    }
    public void seleccionarBotonAñadir(){
        page.btnAñadirCarrito.click();
    }
    public void validarMensaje(){
        page.lblMensaje.isVisible();
        logger.info(page.lblMensaje.getText());
    }

}
