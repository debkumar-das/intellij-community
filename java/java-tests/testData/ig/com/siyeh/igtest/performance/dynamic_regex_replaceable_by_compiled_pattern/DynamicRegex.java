package com.siyeh.igtest.performance.dynamic_regex_replaceable_by_compiled_pattern;

class DynamicRegex {
  void m(String s) {
    "asdf::asdf".<warning descr="'split()' can be replaced with compiled 'java.util.regex.Pattern' construct">split</warning>("::");
    s.<warning descr="'matches()' can be replaced with compiled 'java.util.regex.Pattern' construct">matches</warning>("test");
    s.<warning descr="'replaceAll()' can be replaced with compiled 'java.util.regex.Pattern' construct">replaceAll</warning>("all", "nothing");
    s.<warning descr="'replaceFirst()' can be replaced with compiled 'java.util.regex.Pattern' construct">replaceFirst</warning>("first", "second");
    s.split("a");
    s.split("\\\\");
    "abba".replace("bb", "aa");
    "abba".replace('b', 'a');
  }
}