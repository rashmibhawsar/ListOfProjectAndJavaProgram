package CoreSpring8_Bean_Init_distroy_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mango {
private String type;

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "Mango [type=" + type + "]";
}

//*************************annotaion
@PostConstruct
public void start() {
	System.out.println("deliciouus mango created");
}
@PreDestroy
public void end()
{
	System.out.println(" mango destroyed ....");
}
}
