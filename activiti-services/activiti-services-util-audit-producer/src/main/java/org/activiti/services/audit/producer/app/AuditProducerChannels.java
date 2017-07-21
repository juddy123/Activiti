package org.activiti.services.audit.producer.app;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface AuditProducerChannels {

    String COMMAND_CONSUMER = "commandConsumer";

    @Input(COMMAND_CONSUMER)
    SubscribableChannel commandConsumer();
    
    String AUDIT_PRODUCER = "auditProducer";

    @Output(AUDIT_PRODUCER)
    MessageChannel auditProducer();
}