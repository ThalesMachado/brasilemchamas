package com.gpms20201.brasilemchamas.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("focoqueimadas")
public class FocoQueimadas {

    public FocoQueimadas() {
    }

    @Id
    private String Id;

    private String estado;
    private String municipio;
    private String bioma;
    private Double latitude;
    private Double longitude;
    private String frp;

    public String getBioma() {
        return bioma;
    }

    public String getEstado() {
        return estado;
    }

    public String getFrp() {
        return frp;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFrp(String frp) {
        this.frp = frp;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}
