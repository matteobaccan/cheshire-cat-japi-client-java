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
import it.baccan.cheshirecat.model.MetaData;
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
 * CollectionData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-20T01:30:20.533391300+01:00[Europe/Berlin]")
public class CollectionData {
  public static final String SERIALIZED_NAME_PAGE_CONTENT = "page_content";
  @SerializedName(SERIALIZED_NAME_PAGE_CONTENT)
  private String pageContent;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private MetaData metadata;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_VECTOR = "vector";
  @SerializedName(SERIALIZED_NAME_VECTOR)
  private List<Integer> vector = new ArrayList<>();

  public CollectionData() {
  }

  public CollectionData pageContent(String pageContent) {
    this.pageContent = pageContent;
    return this;
  }

   /**
   * Get pageContent
   * @return pageContent
  **/
  @javax.annotation.Nonnull
  public String getPageContent() {
    return pageContent;
  }

  public void setPageContent(String pageContent) {
    this.pageContent = pageContent;
  }


  public CollectionData metadata(MetaData metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public MetaData getMetadata() {
    return metadata;
  }

  public void setMetadata(MetaData metadata) {
    this.metadata = metadata;
  }


  public CollectionData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CollectionData score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nonnull
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }


  public CollectionData vector(List<Integer> vector) {
    this.vector = vector;
    return this;
  }

  public CollectionData addVectorItem(Integer vectorItem) {
    if (this.vector == null) {
      this.vector = new ArrayList<>();
    }
    this.vector.add(vectorItem);
    return this;
  }

   /**
   * Get vector
   * @return vector
  **/
  @javax.annotation.Nonnull
  public List<Integer> getVector() {
    return vector;
  }

  public void setVector(List<Integer> vector) {
    this.vector = vector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionData collectionData = (CollectionData) o;
    return Objects.equals(this.pageContent, collectionData.pageContent) &&
        Objects.equals(this.metadata, collectionData.metadata) &&
        Objects.equals(this.id, collectionData.id) &&
        Objects.equals(this.score, collectionData.score) &&
        Objects.equals(this.vector, collectionData.vector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageContent, metadata, id, score, vector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionData {\n");
    sb.append("    pageContent: ").append(toIndentedString(pageContent)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    vector: ").append(toIndentedString(vector)).append("\n");
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
    openapiFields.add("page_content");
    openapiFields.add("metadata");
    openapiFields.add("id");
    openapiFields.add("score");
    openapiFields.add("vector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page_content");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("score");
    openapiRequiredFields.add("vector");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CollectionData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CollectionData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollectionData is not found in the empty JSON string", CollectionData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CollectionData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CollectionData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CollectionData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("page_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_content").toString()));
      }
      // validate the required field `metadata`
      MetaData.validateJsonElement(jsonObj.get("metadata"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("vector") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("vector").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vector` to be an array in the JSON string but got `%s`", jsonObj.get("vector").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollectionData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollectionData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollectionData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollectionData.class));

       return (TypeAdapter<T>) new TypeAdapter<CollectionData>() {
           @Override
           public void write(JsonWriter out, CollectionData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CollectionData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CollectionData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CollectionData
  * @throws IOException if the JSON string is invalid with respect to CollectionData
  */
  public static CollectionData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollectionData.class);
  }

 /**
  * Convert an instance of CollectionData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

