import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ArrayTeste {

	//System under test(ArrayInteiros)_(ArrayOrdenado)
	@Test
	@DisplayName("Testa a ordenação de um array de números inteiros")
	void textArray_When_ArrayNumber_Should_OrdereArray() {
		//Arrange -> Given
		int [] numbers = {25, 8, 31, 19, 3, 55, 2};
		int [] ordererArray = {2, 3, 8, 19, 25, 31, 55};

		//Act -> When
		Arrays.sort(numbers);

		//Assert -> Then
		assertArrayEquals(numbers, ordererArray);
	}
	
	//aaa + (ctrl + espaço)
	
	//System under test(TimeOut)_(FailOrPass)
	@Test
	@DisplayName("Test timeout in 10 miliseconds")
	//@Timeout(1)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void textTimeOut_When_More10ms_Should_Fail() {
		//Arrange -> Given
		int [] numbers = {25, 8, 31, 19, 3, 55, 2};

		//Act -> When

		//Assert -> Then
		for(int i = 0; i<7;i++) {
			numbers[0] = i;
			Arrays.sort(numbers);
		}
	}

	//System under test(CSVParameter)_(OrdererArrays)
	@DisplayName("CSV ARRAY TEST")
	@ParameterizedTest
	@CsvFileSource(resources="/arrayparameter.csv")
	void textCSV_When_ARRAYCSV_Should_ORDERERARRAYS(String numbersStrg) {
		//Arrange -> Given
		int[] numbers = Arrays.stream(numbersStrg.split(","))
				.map(String::trim)
				.mapToInt(Integer::parseInt)
				.toArray();
		
		//Act -> When
		Arrays.sort(numbers);
		int[] expected = numbers.clone();
		
		//Assert -> Then
		assertArrayEquals(expected, numbers, " Expected: "+expected+ " Numbers: "+ numbers);
	}
}
