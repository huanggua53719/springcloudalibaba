package com.example.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sunliang
 * @version 1.0
 * @date 2020/4/22 12:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }
}
