import { Component, OnInit } from '@angular/core';
import { Food } from 'src/app/interfaces/food-interface';
import { StringResponse } from 'src/app/interfaces/string-response-interface';
import { TestService } from 'src/app/services/test.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss']
})
export class HomepageComponent implements OnInit {
  food: Food[];
  workplans: any[];

  constructor(private testService: TestService) { }

  ngOnInit(): void {
    this.testService.getFood().subscribe((ret: any) => {
      this.food = ret;
    });
  }
}
