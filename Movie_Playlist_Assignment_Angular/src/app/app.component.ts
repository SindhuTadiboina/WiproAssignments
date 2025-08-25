import { Component } from '@angular/core';
import { SongsComponent } from './songs/songs.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [SongsComponent], 
  template: `
    <h1 class="title"> My Music App</h1>
    <app-songs></app-songs>
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {}
