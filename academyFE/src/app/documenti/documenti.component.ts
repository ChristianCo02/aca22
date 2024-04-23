import { Component, TemplateRef } from '@angular/core';
import { RestService } from '../service/rest.service';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-documenti',
  templateUrl: './documenti.component.html',
  styleUrls: ['./documenti.component.scss']
})
export class DocumentiComponent {

  immagineDocumento!: File;
  nomeDocumento!: string;
  
 constructor(private service : RestService,private modalService: NgbModal){
 
  }
 
 

 
    
  
   

  onFileSelectedImg(event: any) {
    const files: FileList = event.target.files;
    if (files && files.length > 0) {
      this.immagineDocumento = files[0];
      
    }
  }

  listaDocumenti !: any[];
  tipoBase: any = "data:image/*;base64,";

  isModalOpen = false;
 

  
getAllDocuments(){

  this.service.getAllDocuments().subscribe({
    next:(res : any) => {

      this.listaDocumenti=res
      console.log(this.listaDocumenti);
      
    }
  })

}
 

  ngOnInit(){

    this.getAllDocuments()

  }
  openAddDocument(content: any): void {
    this.modalService.open(content, { ariaLabelledBy: 'modal-basic-title' });
  }

  addDocument(){

    this.service.addDocument(this.nomeDocumento,this.immagineDocumento).subscribe({
      next:(res : any) => {

        this.modalService.dismissAll();
        this.getAllDocuments()
        
      }
    })

  }
}
