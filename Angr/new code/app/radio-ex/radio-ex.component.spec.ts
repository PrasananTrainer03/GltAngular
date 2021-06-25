import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RadioExComponent } from './radio-ex.component';

describe('RadioExComponent', () => {
  let component: RadioExComponent;
  let fixture: ComponentFixture<RadioExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RadioExComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RadioExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
