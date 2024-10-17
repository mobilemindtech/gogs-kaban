## I. Start the app

### 1. Start backend

#### - tab 1

```shell
sbt "~web/reStart"
```

### 2. Start frontend

#### - tab 2

```shell
sbt "~app/fastLinkJS"
```

#### - tab 3

```shell
cd app-ui
#only has to be run once
npm install
yarn exec vite
```

Then you can access the frontend at http://localhost:3000

## II. Other commands

```shell
sbtn "~web/reStart"

sbtn "~app/fastLinkJS"

cd app-ui
yarn exec vite

```