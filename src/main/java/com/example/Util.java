package com.example;

import java.io.File;

public class Util {
    private static boolean isDirectory(String path) {
      return new File(path).isDirectory();
    }
}
