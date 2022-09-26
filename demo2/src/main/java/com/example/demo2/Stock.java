package com.example.demo2;

import java.io.Serializable;

public record Stock(String id, String quantity) implements Serializable {
}
