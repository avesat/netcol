# Network collector (netcol)

This program collects and processes network config data (ifconfig, route, etc) from remote hosts

## Getting Started

### Prerequisites

For this project you need to install the next software:

```
java 1.8 or higher
gradle
ssh client
```

### Installing

```
```

## Running

```
1. git clone https://github.com/avesat/netcol.git
2. cd netcol
3. ./gradlew  bootRun 
4. In a browser http://localhost:8087/hostParameters
5. In a browse click "Host Credentials" then enter:
    - Host IP Address: 127.0.0.1
    - Login: <user login to your localhost machine with ssh access>
    - Password: <user password>
    click "Send Request"
6. You will be redirect back to http://localhost:8087/hostParameters
7. click on any field in "Id" column
8. !!!Currently parser works for Linux hosts only.
```

License
=======
Sourcerer is under the MIT license. See the [LICENSE](https://github.com/sourcerer-io/sourcerer-app/blob/develop/LICENSE.md) for more information.
