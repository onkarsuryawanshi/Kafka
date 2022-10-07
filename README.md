# Kafka



>> Download offsetExplorer to see kafka message push by application

>>refer this documnet to start the kafka cosumer and producer 
  https://kafka.apache.org/quickstart
  
# Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties


Open another terminal session and run:
# Start the Kafka broker service
$ bin/kafka-server-start.sh config/server.properties



CREATE A TOPIC TO STORE YOUR EVENTS
bin/kafka-topics.sh --create --topic topicName --bootstrap-server localhost:9092


WRITE SOME EVENTS INTO THE TOPIC

$ bin/kafka-console-producer.sh --topic topicName--bootstrap-server localhost:9092
This is my first event
This is my second event

READ THE EVENTS

$ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
This is my first event
This is my second event
