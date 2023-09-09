import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Food } from 'src/app/interfaces/food-interface';

@Injectable({
  providedIn: 'root'
})
export class FoodService {
  private readonly foodUrl = 'api/food';
  private readonly httpOptions = { headers: new HttpHeaders({ 'Content-Type': 'application/json' }) };

  getFood(): Observable<Food[]> {
    return this.http.get<Food[]>(`${this.foodUrl}`);
  }

  createFood(name: string): Observable<Food> {
    return this.http.post<Food>(`${this.foodUrl}`, name, this.httpOptions);
  }

  deleteFood(id: number): void {
    this.http.delete(`${this.foodUrl}/${id}`).subscribe();
  }

  constructor(private http: HttpClient) { }
}
