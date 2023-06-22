let calculator = {
  displayValue: "0",
  firstOperand: null,
  waitingForSecondOperand: false,
  operator: null,
};

function updateDisplay() {
  let display = document.querySelector(".visor");
  display.value = calculator.displayValue;
}

updateDisplay();

let keys = document.querySelector('.teclas');
keys.addEventListener('click', (event) => {
  let target = event.target;
  if (!target.matches('button')) {
    return;
  }

  if (target.classList.contains('operador')) {
    console.log('operador', target.value);
	handleOperator(target.value);
    return;
  }

  if (target.classList.contains('decimal')) {
    console.log('decimal', target.value);
	inputDecimal(target.value);
	updateDisplay();
    return;
  }

  if (target.classList.contains('limpar')) {
    console.log('tecla', target.value);
	resetCalculator();
	updateDisplay();
    return;
  }

  if (target.classList.contains('igual')) {
    console.log('tecla', target.value);
	handleOperator(target.value);
    return;
  }
  
  inputDigit(target.value);
  updateDisplay();
  console.log('digit', target.value);
});

function inputDigit(digit) {
  let displayValue = calculator.displayValue; // já existente
  let waitingForSecondOperand = calculator.waitingForSecondOperand 
  
  if (waitingForSecondOperand === true) {
    calculator.displayValue = digit;
    calculator.waitingForSecondOperand = false;
  } else {
	  // Se o valor atual for '0' substituir. Se não, concatenar
	  if(displayValue == '0'){
		 calculator.displayValue = digit;
	  } else {
		  calculator.displayValue = displayValue + digit;
	  }
  }
}

function inputDecimal(dot) {
  // If the `displayValue` does not contain a decimal point
  if (!calculator.displayValue.includes(dot)) {
    // Append the decimal point
    calculator.displayValue += dot;
  }
}

function resetCalculator() {
  calculator.displayValue = '0';
  calculator.firstOperand = null;
  calculator.waitingForSecondOperand = false;
  calculator.operator = null;
  console.log(calculator);
}

function handleOperator(operador) {
  let firstOperand = calculator.firstOperand;
  let displayValue = calculator.displayValue;
  let operator = calculator.operator;
  
  let inputValue = parseFloat(displayValue);

  if (firstOperand === null) {
    calculator.firstOperand = inputValue;
  } else if (operator) {
    const result = fazerCalculo[operator](firstOperand, inputValue);

    calculator.displayValue = String(result);
	updateDisplay();
    calculator.firstOperand = result;
  }

  calculator.waitingForSecondOperand = true;
  calculator.operator = operador;
  //console.log(calculator);
}

let fazerCalculo = {
  '/': (firstOperand, secondOperand) => firstOperand / secondOperand,
  '*': (firstOperand, secondOperand) => firstOperand * secondOperand,
  '+': (firstOperand, secondOperand) => firstOperand + secondOperand,
  '-': (firstOperand, secondOperand) => firstOperand - secondOperand,
  '=': (firstOperand, secondOperand) => secondOperand
};