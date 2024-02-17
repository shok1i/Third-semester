"use strict";

function onDragStart(event) {
    event.dataTransfer.setData('plain', event.target.id);
}
function onDragOver(event) {
    event.preventDefault();
}

let allPrice=document.querySelector('.full_price').querySelector('b');

function onDrop(event) {
    const id = event.dataTransfer.getData('plain');
    const price = document.getElementById(id).nextElementSibling;
    allPrice.textContent=+allPrice.textContent+(+price.querySelector('b').textContent);
    const draggableElement = document.getElementById(id);
    const dropzone = event.target;
    dropzone.appendChild(draggableElement);
    price.remove();
    event.dataTransfer.clearData();
}
