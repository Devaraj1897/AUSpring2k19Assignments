import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  books:any=[];

  // id:string;
  // title:string;
  // desc:string;
  // author:string;
  // price:number;

  book:Book;
  constructor(private bookService:BookService) { }

  ngOnInit() {
    this.book=new Book();
    this.getBooks();
  }

  postData(){
    this.bookService.addBook(this.book).subscribe((response)=>{
      console.log(response);
      if(response)
            this.books.push(response);
      })
  }
  

  getBooks() {
    this.bookService.getAllBooks().subscribe((response)=>{
      console.log(response);
      if(response && response.length>0){
        this.books=response;
      }
    });
  }

  addToCart(book:Book){
    this.bookService.putInCart(book).subscribe((response)=>{
      console.log(response);
      if(response==null){
        alert("oops!! Book Already in Cart.");
      }
      else
       {
         alert("Book Added");
       }
    })
  }

}
