# Network collector (netcol)

This program collects and processes network config data (ifconfig, route, etc) from remote hosts

## Getting Started

### Prerequisites

For this project you need to install the next software:

```
java 1.8 or higher
gradle
docker
ssh client
```

### Installing

```
```

## Running

```
01. git clone https://github.com/avesat/netcol.git
02. cd netcol
03. ./gradlew  build
04. docker build -t netcol .
05. docker run --name netcol -p 8087:8087 netcol
06. docker run --name ubuntu_sshd rastasheep/ubuntu-sshd:14.04
07. In a browser http://localhost:8087/hostParameters
08. In a browse click "Host Credentials" then enter:
    - Host IP Address: 127.0.0.1
    - Login: <user login to your localhost machine with ssh access>
    - Password: <user password>
    click "Send Request"
09. You will be redirect back to http://localhost:8087/hostParameters
10. click on any field in "Id" column
```

### Docker
```
./gradlew  build
docker build -t netcol .
docker run --name netcol -p 8087:8087 netcol
docker run --name ubuntu_sshd rastasheep/ubuntu-sshd:14.04
```

License
=======
Sourcerer is under the MIT license. See the [LICENSE](https://github.com/sourcerer-io/sourcerer-app/blob/develop/LICENSE.md) for more information.
