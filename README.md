# README

pocket-instapaper-differ compares the saved links you have on both services and outputs the ones that are mutually exclusive.

It is written in Kotlin for no reason other than to learn and use the language in a scripting context.

## Setup

1. Install Kotlin (if you haven't already)
```
$ curl -s "https://get.sdkman.io" | bash
$ sdk install kotlin

// alternatively with Homebrew
$ brew install kotlin
```

2. Make the script executable
```
$ chmod +x pocket_instapaper_differ.main.kts
```

3. Export saved articles both for [Pocket](https://getpocket.com/export) and for [Instapaper](https://www.instapaper.com/user).

## Usage

```
$ ./pocket_instapaper_differ.main.kts /path/to/ril_export.html /path/to/instapaper-export.html
```
