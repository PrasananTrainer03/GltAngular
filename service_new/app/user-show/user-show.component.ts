import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-show',
  templateUrl: './user-show.component.html',
  styleUrls: ['./user-show.component.css']
})
export class UserShowComponent implements OnInit {

  id : number;
  user : Observable<User>;
  search() {
    this.user = this._userService.searchUser(this.id);
  }
  constructor(private _userService : UserService) { }

  ngOnInit(): void {
  }

}
