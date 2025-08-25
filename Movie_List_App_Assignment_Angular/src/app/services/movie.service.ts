import { Injectable } from '@angular/core';
import { Movie } from '../models/movie.model';
import { MOVIES } from '../data/movies';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  constructor() { }

  getMovies(): Movie[] {
    return MOVIES;
  }
}
