# README

pocket-instapaper-differ simply compares the saved links you have on both services and outputs the ones that are mutually exclusive.

It is written in Kotlin for no reason other than to learn and use the language in a scripting context.

## Setup

1. Get
```
// install sdkman (if you haven't already)
curl -s "https://get.sdkman.io" | bash  # install sdkman
sdk install maven
sdk install kotlin

// alternatively with Homebrew
brew install maven
```

2. Export our saved articles both for [Pocket](https://getpocket.com/export) and for [Instapaper](https://www.instapaper.com/user).

## Usage

```
$ kscript pocket_instapaper_differ.kts /path/to/ril_export.html /path/to/instapaper-export.html
```
