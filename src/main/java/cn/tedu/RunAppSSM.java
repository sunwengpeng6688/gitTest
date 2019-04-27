package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.mapper")	//mybatis接口扫描的路径
public class RunAppSSM {

	public static void main(String[] args) {
		SpringApplication.run(RunAppSSM.class, args);
	}

}
