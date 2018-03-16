package com.yuantiao.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class XmlParser {
    static Logger logger = LoggerFactory.getLogger(XmlParser.class);
    public static Object parser(String path){
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(new File(path));
            Element node = document.getRootElement();

        } catch (DocumentException e) {
            logger.error("read xml fail {}",path);
        }
        return null;

    }
}
