package com.youtube.app.copelmenorte.io.response;

import com.google.gson.annotations.SerializedName;
import com.youtube.app.copelmenorte.model.Hoja;

public class HojaResponse {

    @SerializedName("hoja")
    private Hoja hoja;

    @SerializedName("error")
    private boolean error;

    @SerializedName("mensaje")
    private String message;

    public Hoja getHoja() {
        return hoja;
    }

    public void setHoja(Hoja hoja) {
        this.hoja = hoja;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
