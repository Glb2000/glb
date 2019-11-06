package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Admin {
    @Id
    private String id;
    private String username;
    private String password;
    private String nickname;
    private Integer age;
    private String sex;
    private String test;

    public static void main(String[] args) {
        int[] a = {1, 4, 7, 5, 2, 3};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    count = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = count;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
