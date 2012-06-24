package com.jotabout.eyepiececalc.test;

import java.io.File;

import org.junit.runners.model.InitializationError;

import com.xtremelabs.robolectric.RobolectricConfig;
import com.xtremelabs.robolectric.RobolectricTestRunner;

public class EyepieceCalcTestRunner extends RobolectricTestRunner {

	public EyepieceCalcTestRunner(Class<?> testClass)
			throws InitializationError {
		super(testClass, new RobolectricConfig(new File("../EyepieceCalc")));
	}

}
