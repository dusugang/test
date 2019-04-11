package com.youbaoplus.xml;

import java.io.Writer;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Text;


public class XmlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Document document = DocumentHelper.createDocument();
		Element root = DocumentHelper.createElement("root");
		Element secEle=DocumentHelper.createElement("second");
		Text createText = DocumentHelper.createText("liongbo");
		secEle.add(createText);
		document.setRootElement(root);
		/*root.addElement("second");
		root.addElement("second");
		root.addElement("second");*/
		root.add(secEle);
		System.out.println("xml:");
		System.out.println(document.asXML());
	}

}
