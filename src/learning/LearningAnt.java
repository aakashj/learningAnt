package learning;

import org.apache.log4j.Logger;
//import org.apache.log4j.BasicConfigurator;

public class LearningAnt{
	static Logger log = Logger.getLogger(LearningAnt.class);
	public static void main(String args[]){
		//BasicConfigurator.configure();
		System.out.println("Hello World from Ant build");
		log.info("Hello world from Ant build with logger dependency");
	}
}
