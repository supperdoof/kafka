package com.ifan.kafka;

/**
 * Kafka测试类
 */

public class KafkaClientApp {
    public static void main(String[] args) {

        new KafkaProducer(KafkaProperties.TOPIC).start();

        new KafkaConsumer(KafkaProperties.TOPIC).start();
    }
}
