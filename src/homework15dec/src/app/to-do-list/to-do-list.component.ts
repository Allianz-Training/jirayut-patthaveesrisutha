import { AfterViewInit, Component, Input, OnInit, Query, QueryList, ViewChildren } from '@angular/core';
import { Task } from '../task';
import { TaskComponent } from '../task/task.component';

@Component({
  selector: 'app-to-do-list',
  templateUrl: './to-do-list.component.html',
  styleUrls: ['./to-do-list.component.css']
})
export class ToDoListComponent implements OnInit {

  tasks: Task[];

  @ViewChildren(TaskComponent)
  taskItems: QueryList<TaskComponent>

  @Input()
  name: string

  @Input()
  description: string

  selectedTask: Task

  constructor() {
    this.tasks = []
  }

  ngOnInit(): void {
  }

  deleteTask(taskComponent: TaskComponent) {
    this.tasks = this.tasks.filter(t => t.id !== taskComponent.task.id)
  }

  addTask() {
    let id: number;

    id = +this.tasks[this.tasks.length-1].id
    let stringId:string = `${id}`
    stringId = "0".repeat(2- stringId.length) + stringId
    this.tasks.push({ id: stringId, name: this.name, description: this.description })
    
    this.name =""
    this.description = ""
  }

  display(taskComponent: TaskComponent){
    this.taskItems.forEach(t => t.isSelected = false)
    taskComponent.isSelected = true
    this.selectedTask = taskComponent.task
  }
}