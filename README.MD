# queso
A collection of utilities involving data files.

## Modules
### JSON
A simple JSON, JSONC, and JSON5 reader and writer, modeled after GSON's JsonReader and JsonWriter interface.

```kotlin
dependencies {
    implementation("org.quiltmc.queso:json:0.1.0")
}
```
### GSON
An adapter of the JSON module to GSON, allowing queso JsonReader/Writer objects to be used with methods in the `Gson` class.

```kotlin
dependencies {
    implementation("org.quiltmc.queso:gson:0.1.0") // pulls in correct versions of queso-json and gson
}
```

## FAQ
### Why 'queso'?
quilt json -> qson ([already exists](https://github.com/quarkusio/qson)) -> queson -> queso
### Can you add $FORMAT?
Probably! Feel free to open an issue or submit a PR!