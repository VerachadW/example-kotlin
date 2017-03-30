package org.jacoco.examples.maven.kotlin

import junit.framework.TestCase

class HelloWorldTest : TestCase() {

	fun testAssert() {
		assertEquals("Hello World!", HelloWorld().getMessage(false))
	}

	fun testAssert2() {
		assertEquals("Hello Universe!", HelloWorld().getMessage(true))
	}


}
