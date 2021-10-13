# scala3-template

스칼라3 프로젝트 표준 템플릿

## Prerequisites

### WSL2 설치 (Windows 사용자만)

> [Windows 10에 Linux용 Windows 하위 시스템 설치 가이드](https://docs.microsoft.com/ko-kr/windows/wsl/install-win10)

## Setup

### [Homebrew](https://brew.sh/) 설치

```
$ /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

### [SDKMAN](https://sdkman.io/install) 설치

```
$ curl -s "https://get.sdkman.io" | bash
```

### [JDK](https://sdkman.io/jdks#Oracle) 설치

```
$ sdk list java
$ sdk install java 21.2.0.r11-grl
```

### [SBT](https://sdkman.io/sdks#sbt) 설치

```
$ sdk install sbt 1.5.5
```

### VSCode 설치

> https://code.visualstudio.com/

## To Do

### Docker Login

```
$ docker login https://ghcr.io -u <username>
```

### SBT Credentials

`~/.sbt/1.0/credentials.sbt`

```
credentials += Credentials(
  realm = "",
  host = "maven.pkg.github.com",
  userName = "<username>",
  passwd = "<token>"
)
```

---

## References

- [The Scala Library Index](https://index.scala-lang.org/)
- [Migrating from IntelliJ IDEA to VSCode and Metals – Staying Productive at Writing Scala](https://www.iteratorshq.com/blog/migrating-from-intellij-idea-to-vscode-and-metals-staying-productive-at-writing-scala/)
