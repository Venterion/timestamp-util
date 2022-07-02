# 🕕 Discord timestamp util
This library aims at easy access for Discord timestamp markdowns. You just specify the timestamp and format,
and you get the markdown string.

# 🤷‍♀️ How to use?
First, you need to add the dependency of this library to your project. Copy the following code snippet, and replace
the "[version]" with the latest version (check the version of the latest package).

Maven:
```
<repositories>
    <repository>
        <id>timestamp-utils</id>
        <url>https://maven.pkg.github.com/Venterion/timestamp-util</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.venterion.discord</groupId>
        <artifactId>timestamp-util</artifactId>
        <version>[version]</version>
    </dependency>
</dependencies>
```

Gradle:
```
repositories {
    maven {
        url 'https://maven.pkg.github.com/Venterion/timestamp-util'
    }
}

dependencies {
    implementation 'com.venterion.discord:timestamp-util:[version]'
}
```

# 🖊 How to contribute?
If you want to contribute, feel free to open a pull request. We do not have specific contribution guidelines, but
please try to match the code style of the project. 