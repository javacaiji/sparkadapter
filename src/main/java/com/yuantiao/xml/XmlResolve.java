package com.yuantiao.xml;

import org.dom4j.Element;

public interface XmlResolve<C,P> {
    public C resolve(Element element, P parent);
}
