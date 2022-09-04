import { Component, OnInit } from '@angular/core';
import {TripService} from "../../services/trip-service/trip.service";
import {TripDto} from "../../models/trips";

@Component({
  selector: 'app-trip-list',
  templateUrl: './trip-list.component.html',
  styleUrls: ['./trip-list.component.css']
})
export class TripListComponent implements OnInit {

  trips: Array<TripDto> = []

  constructor(private tripService: TripService) { }

  ngOnInit(): void {
    // place for querying the backend and obtaining results
    this.tripService.getAllTrip()
      // TODO: delay data to present that they are available some time later
      .subscribe(value => this.trips = value)
  }

}
