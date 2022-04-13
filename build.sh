rm -rf docker/client/grpc-client-*-SNAPSHOT.jar
rm -rf docker/server/grpc-server-*-SNAPSHOT.jar

cp springboot-rest-grpc-client/target/grpc-client-*-SNAPSHOT.jar docker/client/
cp springboot-rest-grpc-server/target/grpc-server-*-SNAPSHOT.jar docker/server/

docker build -t yogeshprasadkurmi/grpc-client:1.1 -f docker/client/Dockerfile docker/client/

docker build -t yogeshprasadkurmi/grpc-server:1.1 -f docker/server/Dockerfile docker/server/

# docker login
# docker push yogeshprasadkurmi/grpc-client:1.1
# docker push yogeshprasadkurmi/grpc-server:1.1