export interface Movie {
  id: number;
  title: string;
  poster?: string;      // optional; placeholder will be used if empty
  genre: string;
  rating: number;       // 1.0 - 5.0
  description: string;
}
