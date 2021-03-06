/**
 *    Copyright 2018 chengfan(fanhub.cn)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.fanhub.irelia.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 * @author chengfan
 * @version $Id: RpcConfig.java, v 0.1 2018年04月30日 下午10:34 chengfan Exp $
 */
@Data
@NoArgsConstructor
public class RpcConfig implements Serializable {
    private String itfName;
    private String methodName;
    private String appName;
    private String rpcValue;
    private String rpcName;
    private String des;
    private LimitConfig limitConfig;

    /**
     * 扩展字段，可以存为一个大的 json 字段，用来为自定义的 handler 提供配置功能
     */
    private String extension;
}