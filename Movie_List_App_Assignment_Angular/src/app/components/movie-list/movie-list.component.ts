import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-movie-list',
  standalone: true,
  imports: [CommonModule, MatCardModule, MatIconModule],
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.scss']
})
export class MovieListComponent {
  movies = [
   
    { 
      title: 'Titanic', 
      genre: 'Romance', 
      rating: 4.5, 
      description: 'A tragic love story.',
      poster: 'https://m.media-amazon.com/images/I/81t2CVWEsUL._AC_UF894,1000_QL80_.jpg'
    },
    { 
      title: 'Avatar', 
      genre: 'Sci-Fi', 
      rating: 4.7, 
      description: 'An epic sci-fi adventure.',
      poster: 'https://m.media-amazon.com/images/I/91kFYg4fX3L._AC_UF894,1000_QL80_.jpg'
    }
  ];
}
