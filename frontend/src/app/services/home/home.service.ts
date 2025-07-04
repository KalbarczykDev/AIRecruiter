import { Injectable } from '@angular/core';

import { environment } from '../../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';

interface HomeResponse {
  message: string;
}

@Injectable({
  providedIn: 'root',
})
export class HomeService {
  private readonly apiUrl = environment.API_URL;
  constructor(private http: HttpClient) {}

  getHomeData(): Observable<string> {
    return this.http
      .get<{ message: string }>(`${this.apiUrl}/`)
      .pipe(map((response: HomeResponse) => response.message));
  }
}
