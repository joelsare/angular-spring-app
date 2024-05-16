import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TestService {

  private readonly testUrl = 'api/test';
  private readonly httpOptions = { headers: new HttpHeaders({ 'Content-Type': 'application/json' }) };

  constructor(private http: HttpClient) { }

  getBoolean(): Observable<boolean> {
    return this.http.get<boolean>(`${this.testUrl}`)
  }

  getInt(): Observable<number> {
    return this.http.get<number>(`${this.testUrl}/number`)
  }
}
