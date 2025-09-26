<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Calculator</title>
<style>
body {
    font-family: sans-serif;
}
.calculator {
    width: 250px;
    margin: 50px auto;
    border: 1px solid #ccc;
    padding: 10px;
    border-radius: 5px;
}
.display {
    width: 100%;
    margin-bottom: 10px;
    padding: 5px;
    font-size: 20px;
    border: 1px solid #ccc;
    text-align: right;
}
.buttons {
    display: grid;
    grid-template-columns: repeat(4, 1fr);
    grid-gap: 5px;
}
button {
    padding: 10px;
    font-size: 18px;
    border: 1px solid #ccc;
    border-radius: 5px;
    cursor: pointer;
}
</style>
</head>
<body>

<div class="calculator">
    <div class="display">
        <input type="text" id="result" name="result" value="0" readonly>
    </div>
    <div class="buttons">
        <button onclick="appendToDisplay('7')">7</button>
        <button onclick="appendToDisplay('8')">8</button>
        <button onclick="appendToDisplay('9')">9</button>
        <button onclick="setOperator('/')">/</button>

        <button onclick="appendToDisplay('4')">4</button>
        <button onclick="appendToDisplay('5')">5</button>
        <button onclick="appendToDisplay('6')">6</button>
        <button onclick="setOperator('*')">*</button>

        <button onclick="appendToDisplay('1')">1</button>
        <button onclick="appendToDisplay('2')">2</button>
        <button onclick="appendToDisplay('3')">3</button>
        <button onclick="setOperator('-')">-</button>

        <button onclick="appendToDisplay('0')">0</button>
        <button onclick="appendToDisplay('.')">.</button>
        <button onclick="calculate()">=</button>
        <button onclick="setOperator('+')">+</button>

        <button onclick="clearDisplay()">C</button>
    </div>
</div>

<script>
    let display = document.getElementById('result');
    let operator = null;
    let operand1 = null;

    function appendToDisplay(value) {
        if (display.value === '0' && value !== '.') {
            display.value = value;
        } else {
            display.value += value;
        }
    }

    function clearDisplay() {
        display.value = '0';
        operator = null;
        operand1 = null;
    }

    function setOperator(op) {
        operand1 = parseFloat(display.value);
        operator = op;
        display.value = '0';
    }

    function calculate() {
        if (operand1 === null || operator === null) {
            return;
        }

        let operand2 = parseFloat(display.value);
        let result;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 === 0) {
                    display.value = "Error";
                    return;
                }
                result = operand1 / operand2;
                break;
        }

        display.value = result;
        operand1 = null;
        operator = null;
    }
</script>

</body>
</html>