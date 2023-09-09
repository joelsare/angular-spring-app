import { Component, OnInit } from '@angular/core';
import { Food } from 'src/app/interfaces/food-interface';
import { StringResponse } from 'src/app/interfaces/string-response-interface';
import { FoodService } from 'src/app/services/food/food.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss']
})
export class HomepageComponent implements OnInit {
  food: Food[];
  workplans: any[];
  inputVal: string;
  displayedColumns = [
    'idColumn',
    'nameColumn',
    'deleteColumn',
  ];

  constructor(private foodService: FoodService) { }

  ngOnInit(): void {
    this.foodService.getFood().subscribe((ret: any) => {
      this.food = ret;
    });
  }

  createFood() {
    this.foodService.createFood(this.inputVal).subscribe((foodFromDatabase: Food) => {
      this.food.push(foodFromDatabase);
      this.food = [...this.food]; //https://stackoverflow.com/questions/56077860/view-page-does-not-refresh-after-array-pushing-in-angular
      this.inputVal = '';
    });
  }

  editFood(food: Food) {
    console.log(food);
  }

  deleteFood(food: Food) {
    let index = this.food.indexOf(food);
    this.food.splice(index, 1);
    this.food = [...this.food];
    this.foodService.deleteFood(food.id);
  }
}
