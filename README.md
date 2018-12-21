# Theia & Xtext Example [FOR SAMPLE DSL]

A Theia Application with an Xtext-based Language Server extension.

Check it out on Gitpod or locally:

Build the language server
```
  cd xtext-dsl-language-server &&
  ./gradlew shadowJar &&
  cd ..
```

Build and start Theia
```
   yarn install &&
   cd app &&
   yarn start (in gitpod, use 'yarn start --hostname 0.0.0.0 --port 3000' instaed)
```
