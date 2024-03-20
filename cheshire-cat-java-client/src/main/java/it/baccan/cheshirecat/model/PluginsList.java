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


package it.baccan.cheshirecat.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import it.baccan.cheshirecat.model.Filters;
import it.baccan.cheshirecat.model.Plugin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.baccan.cheshirecat.JSON;

/**
 * PluginsList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PluginsList {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Filters filters;

  public static final String SERIALIZED_NAME_INSTALLED = "installed";
  @SerializedName(SERIALIZED_NAME_INSTALLED)
  private List<Plugin> installed = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGISTRY = "registry";
  @SerializedName(SERIALIZED_NAME_REGISTRY)
  private List<Plugin> registry = new ArrayList<>();

  public PluginsList() {
  }

  public PluginsList filters(Filters filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nonnull
  public Filters getFilters() {
    return filters;
  }

  public void setFilters(Filters filters) {
    this.filters = filters;
  }


  public PluginsList installed(List<Plugin> installed) {
    this.installed = installed;
    return this;
  }

  public PluginsList addInstalledItem(Plugin installedItem) {
    if (this.installed == null) {
      this.installed = new ArrayList<>();
    }
    this.installed.add(installedItem);
    return this;
  }

   /**
   * Get installed
   * @return installed
  **/
  @javax.annotation.Nonnull
  public List<Plugin> getInstalled() {
    return installed;
  }

  public void setInstalled(List<Plugin> installed) {
    this.installed = installed;
  }


  public PluginsList registry(List<Plugin> registry) {
    this.registry = registry;
    return this;
  }

  public PluginsList addRegistryItem(Plugin registryItem) {
    if (this.registry == null) {
      this.registry = new ArrayList<>();
    }
    this.registry.add(registryItem);
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @javax.annotation.Nonnull
  public List<Plugin> getRegistry() {
    return registry;
  }

  public void setRegistry(List<Plugin> registry) {
    this.registry = registry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginsList pluginsList = (PluginsList) o;
    return Objects.equals(this.filters, pluginsList.filters) &&
        Objects.equals(this.installed, pluginsList.installed) &&
        Objects.equals(this.registry, pluginsList.registry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, installed, registry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginsList {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("filters");
    openapiFields.add("installed");
    openapiFields.add("registry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filters");
    openapiRequiredFields.add("installed");
    openapiRequiredFields.add("registry");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PluginsList
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PluginsList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PluginsList is not found in the empty JSON string", PluginsList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PluginsList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PluginsList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PluginsList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `filters`
      Filters.validateJsonElement(jsonObj.get("filters"));
      // ensure the json data is an array
      if (!jsonObj.get("installed").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `installed` to be an array in the JSON string but got `%s`", jsonObj.get("installed").toString()));
      }

      JsonArray jsonArrayinstalled = jsonObj.getAsJsonArray("installed");
      // validate the required field `installed` (array)
      for (int i = 0; i < jsonArrayinstalled.size(); i++) {
        Plugin.validateJsonElement(jsonArrayinstalled.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("registry").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `registry` to be an array in the JSON string but got `%s`", jsonObj.get("registry").toString()));
      }

      JsonArray jsonArrayregistry = jsonObj.getAsJsonArray("registry");
      // validate the required field `registry` (array)
      for (int i = 0; i < jsonArrayregistry.size(); i++) {
        Plugin.validateJsonElement(jsonArrayregistry.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PluginsList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PluginsList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PluginsList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PluginsList.class));

       return (TypeAdapter<T>) new TypeAdapter<PluginsList>() {
           @Override
           public void write(JsonWriter out, PluginsList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PluginsList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PluginsList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PluginsList
  * @throws IOException if the JSON string is invalid with respect to PluginsList
  */
  public static PluginsList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PluginsList.class);
  }

 /**
  * Convert an instance of PluginsList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

