/*
 * Copyright 2021-2022 Solace Corporation. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.solace.samples.java.snippets;

import com.solace.messaging.MessagingService;
import com.solace.messaging.resources.TopicSubscription;

public class HowToConsumeDirectMessageWithStreaming {


  public static void consumeStreamOfMessages(MessagingService service,
      TopicSubscription directMessageTopic) {
    // TODO to be implemented later
    //    final DirectMessageStreamReceiver receiver = service
    //        .createDirectMessageReceiverBuilder().withSubscriptions(directMessageTopic)
    //        .stream().build().start();
    //
    //    receiver.stream((message, throwable) -> {
    //      // do something about message processing exception
    //    }).filter((message -> {
    //      // i.e keep only messages that we not redelivered
    //      return message.isRedelivered();
    //    })).forEach((message -> {
    //      // process direct message
    //    }));
  }


}
