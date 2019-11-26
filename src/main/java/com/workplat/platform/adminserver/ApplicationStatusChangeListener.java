package com.workplat.platform.adminserver;/**
 * Created by atlantisholic on 2019/3/29.
 */

import de.codecentric.boot.admin.server.domain.entities.Instance;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.domain.events.InstanceEvent;
import de.codecentric.boot.admin.server.notify.AbstractStatusChangeNotifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @ClassName ApplicationStatusChangeListener
 * @Description TODO
 * @Author 郁晓勇
 * @Date 2019/3/29 15:07
 * @Version 1.0.0
 **/
@Service
public class ApplicationStatusChangeListener extends AbstractStatusChangeNotifier {

    public ApplicationStatusChangeListener(InstanceRepository repositpry) {
        super(repositpry);
    }

    @Override
    protected Mono<Void> doNotify(InstanceEvent event, Instance instance) {
        return Mono.fromRunnable(() -> {
            //TODO 插入数据库，并发送邮件和短信到项目负责人
            System.out.println("============================="+instance);
        });
    }
}
