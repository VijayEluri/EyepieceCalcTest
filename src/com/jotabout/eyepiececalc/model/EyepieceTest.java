/**
 * 
 */
package com.jotabout.eyepiececalc.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

/**
 * @author portuesi
 *
 */
public class EyepieceTest {

	private Eyepiece mEyepiece;
	
	@Before
	public void setUp() throws Exception {
		mEyepiece = new Eyepiece();
	}

	@Test
	public void testEyepiece() {
		assertThat( mEyepiece, hasProperty( "id" ) );
		assertThat( mEyepiece, hasProperty( "name" ) );
		assertThat( mEyepiece, hasProperty( "focalLength" ) );
		assertThat( mEyepiece, hasProperty( "apparentFOV" ) );
	}

	@Test
	public void testEyepieceLongStringIntInt() {
		mEyepiece = new Eyepiece( 23, "University Optics MK-80", 32, 80 );
		
		assertThat( mEyepiece.getId(), equalTo( 23L ) );
		assertThat( mEyepiece.getName(), equalTo( "University Optics MK-80" ) );
		assertThat( mEyepiece.getFocalLength(), equalTo( 32 ) );
		assertThat( mEyepiece.getApparentFOV(), equalTo( 80 ) );
	}

	@Test
	public void testGetSetId() {
		mEyepiece.setId( 145 );
		assertThat( mEyepiece.getId(), equalTo( 145L ));
	}

	@Test
	public void testGetSetName() {
		mEyepiece.setName( "TeleVue Ethos" );
		assertThat( mEyepiece.getName(), equalTo( "TeleVue Ethos" ) );
	}

	@Test
	public void testGetSetFocalLength() {
		mEyepiece.setFocalLength( 17 );
		assertThat( mEyepiece.getFocalLength(), equalTo( 17 ) );
	}

	@Test
	public void testGetSetApparentFOV() {
		mEyepiece.setApparentFOV( 65 );
		assertThat( mEyepiece.getApparentFOV(), equalTo( 65 ) );
	}

}
