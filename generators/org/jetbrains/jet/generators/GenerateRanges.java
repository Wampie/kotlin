/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.generators;

import com.intellij.openapi.util.io.FileUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class GenerateRanges {
    public static void main(String[] args) throws IOException {
        PrintStream out = new PrintStream(new FileOutputStream("runtime/src/jet/runtime/Ranges.java"));
        try {
            String copyright = "injector-generator/copyright.txt";
            out.println(FileUtil.loadFile(new File(copyright)));
            out.println();

            out.println("package jet.runtime;");
            out.println();

            out.println("import jet.*;");
            out.println();

            out.println("/* This file is generated by " + GenerateRanges.class.getName() + ". DO NOT EDIT! */");
            out.println("public class Ranges {");

            List<String> strings = Arrays.asList("byte", "short", "int", "long", "float", "double", "char");
            for (String t1 : strings) {
                for (String t2 : strings) {
                    String resType;
                    if (t1.equals("double") || t2.equals("double")) {
                        resType = "DoubleRange";
                    }
                    else if (t1.equals("float") || t2.equals("float")) {
                        resType = "FloatRange";
                    }
                    else if (t1.equals("long") || t2.equals("long")) {
                        resType = "LongRange";
                    }
                    else if (t1.equals("int") || t2.equals("int")) {
                        resType = "IntRange";
                    }
                    else if (t1.equals("short") || t2.equals("short")) {
                        resType = "ShortRange";
                    }
                    else if (t1.equals("char") || t2.equals("char")) {
                        resType = "CharRange";
                    }
                    else {
                        resType = "ByteRange";
                    }

                    if (resType.equals("FloatRange") || resType.equals("DoubleRange")) {
                        out.println("    public static " + resType + " rangeTo(" + t1 + " from, " + t2 + " to) {");
                        out.println("        return new " + resType + "(from, to - from);");
                        out.println("    }");
                        out.println();
                    }
                    else {
                        String castIfNecessary;
                        if (t1.equals("byte") && t2.equals("char") || t1.equals("char") && t2.equals("short")) {
                            castIfNecessary = "(" + t2 + ") ";
                        }
                        else {
                            castIfNecessary = "";
                        }


                        out.println("    public static " + resType + " rangeTo(" + t1 + " from, " + t2 + " to) {");
                        out.println("        if (from > to) {");
                        out.println("            return " + resType + ".EMPTY;");
                        out.println("        }");
                        out.println("        else {");
                        out.println("            return new " + resType + "(" + castIfNecessary + "from, to - from + 1);");
                        out.println("        }");
                        out.println("    }");
                        out.println();
                    }
                }
            }

            out.println("    private Ranges() {}");
            out.println("}");
        }
        finally {
            out.close();
        }


    }

    private GenerateRanges() {
    }
}