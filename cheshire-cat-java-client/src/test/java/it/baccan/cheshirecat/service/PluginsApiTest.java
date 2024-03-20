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
import it.baccan.cheshirecat.model.BodyUploadUrl;
import java.io.File;
import it.baccan.cheshirecat.model.FileResponse;
import it.baccan.cheshirecat.model.GetPluginSettings200Response;
import it.baccan.cheshirecat.model.HTTPValidationError;
import it.baccan.cheshirecat.model.Plugin;
import it.baccan.cheshirecat.model.PluginsList;
import it.baccan.cheshirecat.model.Setting;
import it.baccan.cheshirecat.model.SettingsResponse;
import it.baccan.cheshirecat.model.ToggleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PluginsApi
 */
@Disabled
public class PluginsApiTest {

    private final PluginsApi api = new PluginsApi();

    /**
     * Delete Plugin
     *
     * Physically remove a plugin
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePluginTest() throws ApiException {
        String pluginId = null;
        List<String> response = api.deletePlugin(pluginId);
        // TODO: test validations
    }

    /**
     * Get Plugin Details
     *
     * Returns information on a single plugin
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPluginDetailsTest() throws ApiException {
        String pluginId = null;
        Plugin response = api.getPluginDetails(pluginId);
        // TODO: test validations
    }

    /**
     * Get Plugin Settings
     *
     * Returns the settings of a specific plugin
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPluginSettingsTest() throws ApiException {
        String pluginId = null;
        GetPluginSettings200Response response = api.getPluginSettings(pluginId);
        // TODO: test validations
    }

    /**
     * Get Plugins Settings
     *
     * Returns the settings of all the plugins
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPluginsSettingsTest() throws ApiException {
        SettingsResponse response = api.getPluginsSettings();
        // TODO: test validations
    }

    /**
     * Install Plugin
     *
     * Install a new plugin from a zip file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void installPluginTest() throws ApiException {
        File _file = null;
        FileResponse response = api.installPlugin(_file);
        // TODO: test validations
    }

    /**
     * Install Plugin From Registry
     *
     * Install a new plugin from external repository
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void installPluginFromRegistryTest() throws ApiException {
        BodyUploadUrl bodyUploadUrl = null;
        FileResponse response = api.installPluginFromRegistry(bodyUploadUrl);
        // TODO: test validations
    }

    /**
     * List Available Plugins
     *
     * List both installed and registry plugins
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAvailablePluginsTest() throws ApiException {
        String query = null;
        PluginsList response = api.listAvailablePlugins(query);
        // TODO: test validations
    }

    /**
     * Toggle Plugin
     *
     * Enable or disable a single plugin
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void togglePluginTest() throws ApiException {
        String pluginId = null;
        ToggleResponse response = api.togglePlugin(pluginId);
        // TODO: test validations
    }

    /**
     * Upsert Plugin Settings
     *
     * Updates the settings of a specific plugin
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void upsertPluginSettingsTest() throws ApiException {
        String pluginId = null;
        Object body = null;
        Setting response = api.upsertPluginSettings(pluginId, body);
        // TODO: test validations
    }

}
