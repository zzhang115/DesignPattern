package com.dp.dynamic.strategy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class DynamicProxy {
    public Object gntProxyInstance(Class cls, InvocationHandler invoHandler) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String methodStr = "";
        String sep = "\r\n";
        String invoClassName = InvocationHandler.class.getName();
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            String mtdStr = method.getName();
            methodStr += "    @Override" + sep +
                         "    public void " + mtdStr + "() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {" + sep +
                         "        Method md = " + cls.getName() + ".class.getMethod(\"" + mtdStr + "\");" + sep +
                         "        " + "t.invoke(this, md);" + sep +
                         "    }" + sep;
        }

        String src =
                "package com.dp.dynamic.strategy;" + sep + sep +
                "import java.lang.reflect.Method;" + sep +
                "import java.lang.reflect.InvocationTargetException;" + sep + sep +
                        "public class NewTankTimeProxy implements " + cls.getName() + " {" + sep +
                        "    " + invoClassName + " t;" + sep +

                        "    public NewTankTimeProxy(" + invoClassName + " h) {" + sep +
                        "        super();" + sep +
                        "        this.t = h;" + sep +
                        "    }" + sep +
                        methodStr + sep +
                        "}" + sep;
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

        // c.getNewInstance only get the constructor has no arguments
        Constructor ctr = c.getConstructor(InvocationHandler.class);
        Moveable m = (Moveable) ctr.newInstance(invoHandler);
        return m;
//        // c.getNewInstance only get the constructor has no arguments
//        Constructor ctr = c.getConstructor(cls);
//        Moveable m = (Moveable) ctr.newInstance(new Tank());
//        m.move();

//        cls.getClass() m = (cls.getClass()) ctr.newInstance(new Tank());
//        cls m = (cls) ctr.newInstance(new Tank());
//        m.move();
    }
}
