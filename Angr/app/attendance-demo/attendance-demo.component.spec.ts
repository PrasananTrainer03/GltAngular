import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttendanceDemoComponent } from './attendance-demo.component';

describe('AttendanceDemoComponent', () => {
  let component: AttendanceDemoComponent;
  let fixture: ComponentFixture<AttendanceDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AttendanceDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AttendanceDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
