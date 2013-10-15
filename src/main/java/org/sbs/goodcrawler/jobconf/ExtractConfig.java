/**
 * ########################  SHENBAISE'S WORK  ##########################
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sbs.goodcrawler.jobconf;

import java.util.List;
import java.util.regex.Pattern;

import org.sbs.goodcrawler.conf.Configuration;
import org.sbs.goodcrawler.extractor.selector.ElementCssSelector;


/**
 * @author whiteme
 * @date 2013年10月13日
 * @desc 内容抽取配置对象
 */
public class ExtractConfig extends Configuration {
	/**
	 * 默认使用个线程提取信息
	 */
	private int threadNum = 5;
	
	
	
	@Override
	public String toString() {
		return null;
	}
	
	
}

/**
 * 
 * @author whiteme
 * @date 2013年10月15日
 * @desc 抽取模板，一个提取任务可以拥有多个收取模板
 */
class ExtractTemplate{
	/**
	 * 模板名称
	 */
	private String name;
	/**
	 * 该模板对应的模板模式，如果没有设置则，对所有页面以次模板提取信息
	 */
	private Pattern urlPattern;
	/**
	 * 该模板对应的css选择器，使用jsoup进行提取。
	 */
	private List<ElementCssSelector<?>> cssSelectors;
	
	
}