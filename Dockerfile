FROM openjdk:11
LABEL maintainer="Andres Uzeda <andres.uzeda88@gmail.com>"

# 0 Copy Java files
COPY src /rest-client-mac-address

# 1 Compile Java CLI application
RUN cd rest-client-mac-address/ && javac main.java
