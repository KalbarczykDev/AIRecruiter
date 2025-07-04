import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeService } from '../../services/home/home.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent {
  message: string = '';

  constructor(private homeService: HomeService) {}

  ngOnInit(): void {
    this.homeService.getHomeData().subscribe({
      next: (data) => {
        this.message = data;
      },
      error: (err) => {
        this.message = 'Error loading data';
        console.error(err);
      },
    });
  }
}
