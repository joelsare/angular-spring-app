import { Component } from '@angular/core';
import { mergeMap, of } from 'rxjs';
import { TestService } from 'src/app/services/test/test.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.scss']
})
export class TestComponent {

  constructor(private testService: TestService) { }

  b: any;

  getBoolean() {
    this.testService.getBoolean().pipe(
      mergeMap((b: boolean) => {
        return (b ? this.testService.getInt() : of());
      })
    ).subscribe(ret => {
      this.b = ret;
    });
  }

}
