import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeService } from '../../services/home/home.service';
import { JobOffer } from '../../models/job-offer';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent {
  data: any = [];
  errorMessage: string = '';

  constructor(private homeService: HomeService) {}

  ngOnInit(): void {
    this.homeService.getHomeData().subscribe({
      next: (data) => {
        this.data = data;
      },
      error: (err) => {
        this.errorMessage = 'Error loading data';
        console.error(err);
      },
    });
  }
}
