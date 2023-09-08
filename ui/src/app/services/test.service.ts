import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { StringResponse } from '../interfaces/string-response-interface';
import { Food } from '../interfaces/food-interface';

@Injectable({
  providedIn: 'root'
})
export class TestService {

  apiUrl = 'api';

  getFood(): Observable<Food> {
    return this.http.get<Food>(`${this.apiUrl}/food`);
  }

  constructor(private http: HttpClient) { }

}
