/*
 *  Copyright (c) 2018-2021, baomidou (63976799@qq.com).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.baomidou.lock;

import java.lang.reflect.Method;

/**
 * @author zengzhihong
 */
public interface LockFailureStrategy {

    /**
     * 锁失败事件
     */
    void onLockFailure(String key, Method method, Object[] arguments);

}
