package com.artemis.model.scan;

import static org.objectweb.asm.Opcodes.ASM4;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ArtemisMethodReader extends MethodVisitor {

	private ArtemisConfigurationData config;
	private ArtemisConfigurationResolver resolver;

	public ArtemisMethodReader(ArtemisConfigurationData config, ArtemisConfigurationResolver resolver) {
		super(ASM4);
		this.config = config;
		this.resolver = resolver;
	}
}