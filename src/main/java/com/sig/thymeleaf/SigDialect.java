package com.sig.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.sig.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.sig.thymeleaf.processor.MenuAttributeTagProcessor;
import com.sig.thymeleaf.processor.MessageElementTagProcessor;
import com.sig.thymeleaf.processor.OrderElementTagProcessor;
import com.sig.thymeleaf.processor.PaginationElementTagProcessor;

@Component
public class SigDialect extends AbstractProcessorDialect {

	public SigDialect() {
		super("Sig", "Sig", StandardDialect.PROCESSOR_PRECEDENCE);
	}
	
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcessor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		processadores.add(new PaginationElementTagProcessor(dialectPrefix));
		processadores.add(new MenuAttributeTagProcessor(dialectPrefix));
		return processadores;
	}

}
