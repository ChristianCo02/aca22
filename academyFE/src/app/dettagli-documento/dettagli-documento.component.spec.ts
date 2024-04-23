import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DettagliDocumentoComponent } from './dettagli-documento.component';

describe('DettagliDocumentoComponent', () => {
  let component: DettagliDocumentoComponent;
  let fixture: ComponentFixture<DettagliDocumentoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DettagliDocumentoComponent]
    });
    fixture = TestBed.createComponent(DettagliDocumentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
