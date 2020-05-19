package com.froufrou.cloudDemo.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动器
 * @author Louis
 * @date Jan 15, 2019
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.froufrou.cloudDemo"})
public class CloudDemoBackupApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDemoBackupApplication.class, args);
	}
}