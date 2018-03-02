package cn.itcast.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties 标注当前的方法返回的对象或者类的配置项从application.properties文件中读取
 * 前缀与类变量结合后的配置项的值并设置到类变量
 *prefix 配置文件中的配置项前缀
 *ignoreUnknownFields 是否要忽略在配置文件中存在的配置项但是又在类中没有找到对应的变量的那些配置
 */

@ConfigurationProperties(prefix = "cn.itcast", ignoreUnknownFields = true)
public class ItcastProperties {

	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
