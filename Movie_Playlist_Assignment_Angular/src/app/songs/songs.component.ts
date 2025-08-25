import { Component } from '@angular/core';
import { CommonModule } from '@angular/common'; 
import { FormsModule } from '@angular/forms';   
import { MatInputModule } from '@angular/material/input';
import { MatCardModule } from '@angular/material/card';
import { Song } from '../song';

@Component({
  selector: 'app-songs',
  standalone: true,
  templateUrl: './songs.component.html',
  styleUrls: ['./songs.component.css'],
  imports: [CommonModule, FormsModule, MatInputModule, MatCardModule] 
})
export class SongsComponent {
  // Filters
  filterArtist: string = '';
  filterAlbum: string = '';

  // Song list
  songs: Song[] = [
    { name: 'Naatu Naatu', artist: 'Rahul Sipligunj, Kaala Bhairava', album: 'RRR', duration: '4:24', rating: 5/5 },
    { name: 'Tum Hi Ho', artist: 'Arijit Singh', album: 'Aashiqui 2', duration: '3:20', rating: 4/5 },
    { name: 'Butta Bomma', artist: 'Armaan Malik', album: 'Ala Vaikunthapuramuloo', duration: '3:23', rating: 5/5 },
    { name: 'Vachindhamma', artist: 'Sid Sriram', album: 'Geetha Govindam', duration: '3:11', rating: 5/5 },
    { name: 'Samajavaragamana', artist: 'Sid Sriram', album: 'Ala Vaikunthapuramulo', duration: '4:23', rating: 5/5 }
  ];

  // Getter for filtered songs
  get filteredSongs(): Song[] {
    return this.songs.filter(song =>
      song.artist.toLowerCase().includes(this.filterArtist.toLowerCase()) &&
      song.album.toLowerCase().includes(this.filterAlbum.toLowerCase())
    );
  }
}
