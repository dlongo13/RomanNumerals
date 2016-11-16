import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRomanNumerals {

	/*@Test
	public void test() {		
		fail("Not yet implemented");
	}*/
	
	@Test
	public void XXX_equals_10() throws VLD_CantBeRepetedException {		
		RomanNumerals num =new RomanNumerals();
		assertEquals(30,num.convertToInteger("XXX"));
	}
	@Test
	public void LCC_equals_150() throws VLD_CantBeRepetedException {		
		RomanNumerals num =new RomanNumerals();
		assertEquals(150,num.convertToInteger("LCC"));
	}
	@Test
	public void CM_equals_1000() throws VLD_CantBeRepetedException {		
		RomanNumerals num =new RomanNumerals();
		assertEquals(900,num.convertToInteger("CM"));
	}
	@Test (expected = VLD_CantBeRepetedException.class)
	public void V_CantBeRepeted() throws VLD_CantBeRepetedException {		
		RomanNumerals num =new RomanNumerals();
		num.convertToInteger("MVV");
		}
	@Test (expected = VLD_CantBeRepetedException.class)
	public void L_CantBeRepeted() throws VLD_CantBeRepetedException {		
		RomanNumerals num =new RomanNumerals();
		num.convertToInteger("LLMM");
		}
	@Test (expected = VLD_CantBeRepetedException.class)
	public void D_CantBeRepeted() throws VLD_CantBeRepetedException {		
		RomanNumerals num =new RomanNumerals();
		num.convertToInteger("CDD");
		}
}
