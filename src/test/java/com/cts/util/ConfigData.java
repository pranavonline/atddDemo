package com.cts.util;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.io.FileInputStream;
import java.util.Properties;

/*========================================
 * import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
============================================*/

import com.cts.util.Logging;
import org.slf4j.LoggerFactory;



public class ConfigData extends Logging {

	File fileConfigData = null;
	public  HashMap<String, String> ConfigMap = new HashMap<String, String>();

	public ConfigData() {
		this.logger = LoggerFactory.getLogger(ConfigData.class);
		this.createConfigMap();
	}

	/*public void createConfigMap() {
		try {
			logger.debug("Entering createConfigMap ");
			URL strFilePath = ConfigData.class.getClassLoader()
					.getResource("Config.xml");
			fileConfigData = new File(strFilePath.toURI());
			File file = fileConfigData;
			ConfigMap = new HashMap<String, String>();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			NodeList objectList = doc.getElementsByTagName("variable");

			for (int idx = 0; idx < objectList.getLength(); idx++) {
				Node fstNode = objectList.item(idx);
				Element fstElmnt = (Element) fstNode;
				NodeList nameList = fstElmnt
						.getElementsByTagName("logicalName");
				NodeList identifierList = fstElmnt
						.getElementsByTagName("variableValue");
				if ((nameList.item(0).getTextContent() != null)
						|| (nameList.item(0).getTextContent() != "")) {
					ConfigMap.put(nameList.item(0).getTextContent(),
							identifierList.item(0).getTextContent());
				}
			}
			logger.debug("Exiting createConfigMap ");
		} catch (Exception e) {
			logger.error("Exception thrown-createConfigMap ");
			e.printStackTrace();
		}

	} */

	public HashMap<String, String> getConfigMap() {
		logger.info("Getting ConfigMap ");
		return this.ConfigMap;
	}

	public void setConfigMap(HashMap<String, String> dataSet) {
		logger.info("Set ConfigMap to a HashMap object ");
		this.ConfigMap = dataSet;
	}
	
	public void createConfigMap() {
		try {
			  logger.debug("Entering createConfigMap ");
			  ConfigMap = new HashMap<String, String>();
		      Properties properties = new Properties();
		      URL strFilePath = ConfigData.class.getClassLoader()
						.getResource("config.properties");
		      fileConfigData = new File(strFilePath.toURI());
		      properties.load(new FileInputStream(fileConfigData));
		      for (String key : properties.stringPropertyNames()) {                        
		            ConfigMap.put(key, properties.getProperty(key));
		       }
			  logger.debug("Exiting createConfigMap ");
		} catch (Exception e) {
			logger.error("Exception thrown-createConfigMap ");
			e.printStackTrace();
		}

	}

}
