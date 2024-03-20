/*
 * 😸 Cheshire-Cat API
 * Customizable AI architecture
 *
 * The version of the OpenAPI document: 0.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.model.HTTPValidationError;
import it.baccan.cheshirecat.model.Setting;
import it.baccan.cheshirecat.model.SettingsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmbedderApi
 */
@Disabled
public class EmbedderApiTest {

    private final EmbedderApi api = new EmbedderApi();

    /**
     * Get Embedder Settings
     *
     * Get settings and schema of the specified Embedder
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmbedderSettingsTest() throws ApiException {
        String languageEmbedderName = null;
        Setting response = api.getEmbedderSettings(languageEmbedderName);
        // TODO: test validations
    }

    /**
     * Get Embedders Settings
     *
     * Get the list of the Embedders
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmbeddersSettingsTest() throws ApiException {
        SettingsResponse response = api.getEmbeddersSettings();
        // TODO: test validations
    }

    /**
     * Upsert Embedder Setting
     *
     * Upsert the Embedder setting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void upsertEmbedderSettingTest() throws ApiException {
        String languageEmbedderName = null;
        Object body = null;
        Setting response = api.upsertEmbedderSetting(languageEmbedderName, body);
        // TODO: test validations
    }

}