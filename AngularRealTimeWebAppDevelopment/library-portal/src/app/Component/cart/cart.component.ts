import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/providers/book.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {

  	cartlist:[];

  constructor(private bookService:BookService) { }

  ngOnInit() {
    this.bookService.getAllbooksInCart().subscribe((response)=>{
      console.log(response);
      if(response && response.length>0){
        this.cartlist=response;
      }
    })
  }

  removeData(book:Book){
      this.bookService.removeFromCart(book).subscribe((response)=>{
        console.log(response);
        if(response){
          this.bookService.getAllbooksInCart().subscribe((response)=>{
            this.cartlist=response;
          })
        }
      })
  }

}
