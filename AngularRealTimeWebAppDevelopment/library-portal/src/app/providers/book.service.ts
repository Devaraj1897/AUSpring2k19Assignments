import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient ) { }

  getAllBooks():Observable<any>{
    return this.http.get('/LibraryPortal/books');
  }

  getBookById():Observable<any>{
    return this.http.get('/LibraryPortal/books/1/get');
  }

  addBook(book: any):Observable<any>{
    return this.http.post('/LibraryPortal/books',book);
  }

  searchBook(book: any):Observable<any>{
    return this.http.get('/LibraryPortal/books/'+book.id+'/get',book);
  }  

  putInCart(book: any):Observable<any>{
    return this.http.post('/LibraryPortal/addToCart',book);
  } 

  getAllbooksInCart():Observable<any>{
    return this.http.get('/LibraryPortal/getAllInCart');
  }

  removeFromCart(book:any):Observable<any>{
    return this.http.post('/LibraryPortal/removeFromCart',book);
  }
}
