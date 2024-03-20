# cheshire-cat-java-client

😸 Cheshire-Cat API
- API version: 0.0.5
  - Build date: 2024-03-20T01:30:20.533391300+01:00[Europe/Berlin]

Customizable AI architecture


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>it.baccan</groupId>
  <artifactId>cheshire-cat-java-client</artifactId>
  <version>0.0.5</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'cheshire-cat-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'cheshire-cat-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "it.baccan:cheshire-cat-java-client:0.0.5"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/cheshire-cat-java-client-0.0.5.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.models.*;
import it.baccan.cheshirecat.service.EmbedderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EmbedderApi apiInstance = new EmbedderApi(defaultClient);
    String languageEmbedderName = "languageEmbedderName_example"; // String | 
    try {
      Setting result = apiInstance.getEmbedderSettings(languageEmbedderName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedderApi#getEmbedderSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EmbedderApi* | [**getEmbedderSettings**](docs/EmbedderApi.md#getEmbedderSettings) | **GET** /embedder/settings/{languageEmbedderName} | Get Embedder Settings
*EmbedderApi* | [**getEmbeddersSettings**](docs/EmbedderApi.md#getEmbeddersSettings) | **GET** /embedder/settings | Get Embedders Settings
*EmbedderApi* | [**upsertEmbedderSetting**](docs/EmbedderApi.md#upsertEmbedderSetting) | **PUT** /embedder/settings/{languageEmbedderName} | Upsert Embedder Setting
*LargeLanguageModelApi* | [**getLlmSettings**](docs/LargeLanguageModelApi.md#getLlmSettings) | **GET** /llm/settings/{languageModelName} | Get Llm Settings
*LargeLanguageModelApi* | [**getLlmsSettings**](docs/LargeLanguageModelApi.md#getLlmsSettings) | **GET** /llm/settings | Get LLMs Settings
*LargeLanguageModelApi* | [**upsertLlmSetting**](docs/LargeLanguageModelApi.md#upsertLlmSetting) | **PUT** /llm/settings/{languageModelName} | Upsert LLM Setting
*MemoryApi* | [**deletePointInMemory**](docs/MemoryApi.md#deletePointInMemory) | **DELETE** /memory/collections/{collection_id}/points/{memory_id} | Delete Point In Memory
*MemoryApi* | [**getCollections**](docs/MemoryApi.md#getCollections) | **GET** /memory/collections | Get Collections
*MemoryApi* | [**getConversationHistory**](docs/MemoryApi.md#getConversationHistory) | **GET** /memory/conversation_history | Get Conversation History
*MemoryApi* | [**recallMemoriesFromText**](docs/MemoryApi.md#recallMemoriesFromText) | **GET** /memory/recall | Recall Memories From Text
*MemoryApi* | [**wipeCollections**](docs/MemoryApi.md#wipeCollections) | **DELETE** /memory/collections | Wipe Collections
*MemoryApi* | [**wipeConversationHistory**](docs/MemoryApi.md#wipeConversationHistory) | **DELETE** /memory/conversation_history | Wipe Conversation History
*MemoryApi* | [**wipeMemoryPoints**](docs/MemoryApi.md#wipeMemoryPoints) | **DELETE** /memory/collections/{collection_id}/points | Wipe Memory Points By Metadata
*MemoryApi* | [**wipeSingleCollection**](docs/MemoryApi.md#wipeSingleCollection) | **DELETE** /memory/collections/{collection_id} | Wipe Single Collection
*PluginsApi* | [**deletePlugin**](docs/PluginsApi.md#deletePlugin) | **DELETE** /plugins/{plugin_id} | Delete Plugin
*PluginsApi* | [**getPluginDetails**](docs/PluginsApi.md#getPluginDetails) | **GET** /plugins/{plugin_id} | Get Plugin Details
*PluginsApi* | [**getPluginSettings**](docs/PluginsApi.md#getPluginSettings) | **GET** /plugins/settings/{plugin_id} | Get Plugin Settings
*PluginsApi* | [**getPluginsSettings**](docs/PluginsApi.md#getPluginsSettings) | **GET** /plugins/settings | Get Plugins Settings
*PluginsApi* | [**installPlugin**](docs/PluginsApi.md#installPlugin) | **POST** /plugins/upload | Install Plugin
*PluginsApi* | [**installPluginFromRegistry**](docs/PluginsApi.md#installPluginFromRegistry) | **POST** /plugins/upload/registry | Install Plugin From Registry
*PluginsApi* | [**listAvailablePlugins**](docs/PluginsApi.md#listAvailablePlugins) | **GET** /plugins | List Available Plugins
*PluginsApi* | [**togglePlugin**](docs/PluginsApi.md#togglePlugin) | **PUT** /plugins/toggle/{plugin_id} | Toggle Plugin
*PluginsApi* | [**upsertPluginSettings**](docs/PluginsApi.md#upsertPluginSettings) | **PUT** /plugins/settings/{plugin_id} | Upsert Plugin Settings
*RabbitHoleApi* | [**getAllowedMimetypes**](docs/RabbitHoleApi.md#getAllowedMimetypes) | **GET** /rabbithole/allowed-mimetypes | Get Allowed Mimetypes
*RabbitHoleApi* | [**uploadFile**](docs/RabbitHoleApi.md#uploadFile) | **POST** /rabbithole | Upload File
*RabbitHoleApi* | [**uploadMemory**](docs/RabbitHoleApi.md#uploadMemory) | **POST** /rabbithole/memory | Upload Memory
*RabbitHoleApi* | [**uploadUrl**](docs/RabbitHoleApi.md#uploadUrl) | **POST** /rabbithole/web | Upload URL
*SettingsApi* | [**createSetting**](docs/SettingsApi.md#createSetting) | **POST** /settings | Create Setting
*SettingsApi* | [**deleteSetting**](docs/SettingsApi.md#deleteSetting) | **DELETE** /settings/{settingId} | Delete Setting
*SettingsApi* | [**getSetting**](docs/SettingsApi.md#getSetting) | **GET** /settings/{settingId} | Get Setting
*SettingsApi* | [**getSettings**](docs/SettingsApi.md#getSettings) | **GET** /settings | Get Settings
*SettingsApi* | [**updateSetting**](docs/SettingsApi.md#updateSetting) | **PUT** /settings/{settingId} | Update Setting
*StatusApi* | [**home**](docs/StatusApi.md#home) | **GET** / | Home


## Documentation for Models

 - [BodyUploadUrl](docs/BodyUploadUrl.md)
 - [Collection](docs/Collection.md)
 - [CollectionData](docs/CollectionData.md)
 - [CollectionsList](docs/CollectionsList.md)
 - [ConversationHistory](docs/ConversationHistory.md)
 - [ConversationMessage](docs/ConversationMessage.md)
 - [Detail](docs/Detail.md)
 - [FileResponse](docs/FileResponse.md)
 - [Filters](docs/Filters.md)
 - [GetPluginSettings200Response](docs/GetPluginSettings200Response.md)
 - [HTTPValidationError](docs/HTTPValidationError.md)
 - [HooksInner](docs/HooksInner.md)
 - [MemoryRecall](docs/MemoryRecall.md)
 - [MetaData](docs/MetaData.md)
 - [Plugin](docs/Plugin.md)
 - [PluginsList](docs/PluginsList.md)
 - [QueryData](docs/QueryData.md)
 - [ResponseGetAllowedMimetypes](docs/ResponseGetAllowedMimetypes.md)
 - [Setting](docs/Setting.md)
 - [SettingBody](docs/SettingBody.md)
 - [SettingsResponse](docs/SettingsResponse.md)
 - [Status](docs/Status.md)
 - [ToggleResponse](docs/ToggleResponse.md)
 - [ToolsInner](docs/ToolsInner.md)
 - [VectorsData](docs/VectorsData.md)
 - [WebResponse](docs/WebResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


