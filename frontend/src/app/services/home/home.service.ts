import { Injectable } from '@angular/core';

import { environment } from '../../../environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable, map } from 'rxjs';
import { JobOffer } from '../../models/job-offer';

@Injectable({
  providedIn: 'root',
})
export class HomeService {
  private readonly apiUrl = environment.API_URL;
  constructor(private http: HttpClient) {}

  getHomeData(): Observable<JobOffer[]> {
    return this.http.get<JobOffer[]>(`${this.apiUrl}/`);
  }
}
