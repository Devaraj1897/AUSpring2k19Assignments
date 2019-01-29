import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {


  book:Book;

  constructor(private bookService:BookService) { }

  ngOnInit() {
    // this.bookService.getBookById().subscribe((response)=>{
    //   if(response){
    //     this.book=response;
    //   }
    // });
    this.book=new Book();

  }

  postData(){
    // console.log(this.id);
    // const book=this.bookService.addBook(new Book(this.id,this.title,this.desc,this.author,this.price));
    //  book.subscribe((response)=>{
    //   console.log(response);
    // });
    this.bookService.searchBook(this.book).subscribe((response)=>{
      console.log(response);
      if(response)
       this.book=response;
    })
    
  }

}
