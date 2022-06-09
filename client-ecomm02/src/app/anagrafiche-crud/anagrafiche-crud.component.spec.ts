import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnagraficheCrudComponent } from './anagrafiche-crud.component';

describe('AnagraficheCrudComponent', () => {
  let component: AnagraficheCrudComponent;
  let fixture: ComponentFixture<AnagraficheCrudComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnagraficheCrudComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnagraficheCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
