import { Component, OnInit } from '@angular/core';
import {TripService} from "../../services/trip-service/trip.service";
import {TripDto} from "../../models/trips";
import {delay, tap} from "rxjs";

@Component({
  selector: 'app-trip-list',
  templateUrl: './trip-list.component.html',
  styleUrls: ['./trip-list.component.css']
})
export class TripListComponent implements OnInit {

  trips: Array<TripDto> = []

  constructor(private tripService: TripService) { }

  ngOnInit(): void {
    console.log("trying to obtain data from server")
    // place for querying the backend and obtaining results
    this.tripService.getAllTrip()
      .pipe(
        delay(1_000), // additional delay to simulate server delay
        tap(value => console.log("from server: " + JSON.stringify(value)))  // tap() is for looping - we can see what's inside the stream of data
      )
      .subscribe(value => this.trips = value)
  }

}
