package com.jotabout.eyepiececalc.model;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class TelescopeTest {
	
	private Telescope mTelescope;

	@Before
	public void setUp() throws Exception {
		mTelescope = new Telescope();
	}

	@Test
	public void testTelescope() {
		assertThat( mTelescope, hasProperty("id") );
		assertThat( mTelescope, hasProperty("name") );
		assertThat( mTelescope, hasProperty("focalLength") );
		assertThat( mTelescope, hasProperty("aperture") );
	}

	@Test
	public void testTelescopeLongStringIntInt() {
		mTelescope = new Telescope( 89, "Meade LX-10", 2000, 203 );
		assertThat( mTelescope.getId(), equalTo(89L) );
		assertThat( mTelescope.getName(), equalTo("Meade LX-10") );
		assertThat( mTelescope.getFocalLength(), equalTo( 2000 ) );
		assertThat( mTelescope.getAperture(), equalTo( 203 ) );
	}

	@Test
	public void testGetSetId() {
		mTelescope.setId( 1522 );
		assertThat( mTelescope.getId(), equalTo( 1522L ));
	}

	@Test
	public void testGetSetName() {
		mTelescope.setName( "Celestron NexStar" );
		assertThat( mTelescope.getName(), equalTo( "Celestron NexStar" ) ); 
	}

	@Test
	public void testGetSetFocalLength() {
		mTelescope.setFocalLength( 1875 );
		assertThat( mTelescope.getFocalLength(), equalTo( 1875 ) );
	}

	@Test
	public void testGetSetAperture() {
		mTelescope.setAperture( 380 );
		assertThat( mTelescope.getAperture(), equalTo( 380 ) );
	}

}
