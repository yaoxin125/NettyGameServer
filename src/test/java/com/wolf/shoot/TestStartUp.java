package com.wolf.shoot;

<<<<<<< HEAD

import com.wolf.shoot.common.config.GameServerConfigService;

=======
import com.wolf.shoot.common.config.GameServerConfigService;
>>>>>>> refs/remotes/jwpttcg66/master
import com.wolf.shoot.common.util.BeanUtil;
import com.wolf.shoot.manager.LocalMananger;
import com.wolf.shoot.manager.spring.LocalSpringBeanManager;
import com.wolf.shoot.manager.spring.LocalSpringServiceManager;
import com.wolf.shoot.manager.spring.LocalSpringServicerAfterManager;
import com.wolf.shoot.service.net.message.registry.MessageRegistry;

import com.wolf.shoot.service.net.message.registry.MessageRegistry;


/**
 * Created by jiangwenping on 17/4/19.
 */
public class TestStartUp {
<<<<<<< HEAD

    public static void startUpWithSpring(){

=======
    public static void startUpWithSpring(){
>>>>>>> refs/remotes/jwpttcg66/master
        LocalSpringServiceManager localSpringServiceManager = (LocalSpringServiceManager) BeanUtil.getBean("localSpringServiceManager");
        LocalSpringBeanManager localSpringBeanManager = (LocalSpringBeanManager) BeanUtil.getBean("localSpringBeanManager");
        LocalSpringServicerAfterManager localSpringServicerAfterManager  = (LocalSpringServicerAfterManager) BeanUtil.getBean("localSpringServicerAfterManager");
        LocalMananger.getInstance().setLocalSpringBeanManager(localSpringBeanManager);
        LocalMananger.getInstance().setLocalSpringServiceManager(localSpringServiceManager);
        LocalMananger.getInstance().setLocalSpringServicerAfterManager(localSpringServicerAfterManager);
        try {
            localSpringServiceManager.start();
            localSpringServicerAfterManager.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

<<<<<<< HEAD

=======
>>>>>>> refs/remotes/jwpttcg66/master
    public static void startUp() throws  Exception{
        LocalSpringServiceManager localSpringServiceManager = new LocalSpringServiceManager();
        GameServerConfigService gameServerConfigService = new GameServerConfigService();
        gameServerConfigService.startup();;
        localSpringServiceManager.setGameServerConfigService(gameServerConfigService);
        LocalMananger.getInstance().setLocalSpringServiceManager(localSpringServiceManager);
        LocalMananger.getInstance().create(MessageRegistry.class, MessageRegistry.class);
        localSpringServiceManager.setMessageRegistry(LocalMananger.getInstance().get(MessageRegistry.class));
    }

<<<<<<< HEAD

=======
>>>>>>> refs/remotes/jwpttcg66/master
}
