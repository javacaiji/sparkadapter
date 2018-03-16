package com.yuantiao.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class XmlParser {
    static Logger logger = LoggerFactory.getLogger(XmlParser.class);
    static Map<String,Map<String,XmlResolve>> elementResolve;
    static void init(){

    }
    public static Object parser(String path){
        Object object = new Object();
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(new File(path));
            Element root = document.getRootElement();

        } catch (DocumentException e) {
            logger.error("read xml fail {}",path);
        }
        return object;
    }
    public static void foreach(Element root,Object object){
        Iterator<Element> iterator = root.elementIterator();
        while (iterator.hasNext()){
            Element element = iterator.next();

        }
    }
}
