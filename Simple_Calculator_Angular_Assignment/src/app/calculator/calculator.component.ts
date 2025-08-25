import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-calculator',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {
  num1: number = 0;
  num2: number = 0;
  result: number | null = null;

  // Operations
  //addition
  add() { this.result = this.num1 + this.num2; }
  //subtraction
  subtract() { this.result = this.num1 - this.num2; }
  //multiplication
  multiply() { this.result = this.num1 * this.num2; }
  //division
  divide() {
    if (this.num2 !== 0) {
      this.result = this.num1 / this.num2;
    } else {
      alert("Cannot divide by zero!");
    }
  }

  // Increment & Decrement
  increment1() { this.num1++; }
  decrement1() { this.num1--; }
  increment2() { this.num2++; }
  decrement2() { this.num2--; }

  // Reset button
  reset() {
    this.num1 = 0;
    this.num2 = 0;
    this.result = null;
  }
}
