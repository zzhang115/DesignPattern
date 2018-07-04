package com.dp.dynamic.strategy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String src =
                "package com.dp.dynamic.strategy;\n" +
                "public class NewTankTimeProxy implements Moveable {\n" +
                "    Tank t;\n" +

                "    public NewTankTimeProxy() {\n" +
                "        t = new Tank();\n" +
                "    }\n" +

                "    @Override\n" +
                "    public void move() {\n" +
                "        System.out.println(\"Time proxy start\");\n" +
                "        long start = System.currentTimeMillis();\n" +
                "        t.move();\n" +
                "        long end = System.currentTimeMillis();\n" +
                "        System.out.println(\"Total running time:\" + (end - start));\n" +
                "        System.out.println(\"Time proxy end\");\n" +
                "    }\n" +
                "}\n";
        String fileName = System.getProperty("user.dir") +
                "/src/com/dp/dynamic/strategy/NewTankTimeProxy.java";
        System.out.println(fileName);
        File file = new File(fileName);
        FileWriter fw = new FileWriter(file);
        fw.write(src);
        fw.flush();
        fw.close();

        // compile java file
        JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileMgr = jc.getStandardFileManager(null, null, null);
        Iterable units = fileMgr.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask ct = jc.getTask(null, fileMgr, null, null, null, units);
        ct.call();
        fileMgr.close();

        // load into memory and create a instance
        URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") + "/src")};
        URLClassLoader ul = new URLClassLoader(urls);
        Class c = ul.loadClass("com.dp.dynamic.strategy.NewTankTimeProxy");
        System.out.println(c);
    }
}
