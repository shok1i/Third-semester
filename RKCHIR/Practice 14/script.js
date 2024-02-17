"use strict";
function onDragStart(event) {
    event.dataTransfer.setData('plain', event.target.id);
}
function onDragOver(event) {
    event.preventDefault();
}

let allPrice = document.querySelector('.full_price').querySelector('b');

function onDrop(event) {
    const id = event.dataTransfer.getData('plain');
    const price = document.getElementById(id).nextElementSibling;
    allPrice.textContent = +allPrice.textContent + (+price.querySelector('b').textContent);
    const draggableElement = document.getElementById(id);
    const dropzone = event.target;
    dropzone.appendChild(draggableElement);
    price.remove();
    event.dataTransfer.clearData();
}


// Первое задание

document.getElementById('contents').addEventListener('click', function (event) {
    if (event.target.tagName === 'A') {
        var confirmed = confirm(`Хочешь покинуть страницу по ${event.target.innerText}?`);
        if (!confirmed) {
            event.preventDefault();
        }
    }
});

// Второе задание

const photos = document.getElementById('photos');

photos.onclick = function (event) {
    let picture = event.target.closest('img');
    mainImg.src = picture.src;
}

// Третье задание

const list = document.getElementById('myList');
const items = list.getElementsByTagName('li');

list.addEventListener('click', function (event) {
    const clickedItem = event.target;

    if (event.ctrlKey || event.metaKey) {
        clickedItem.classList.toggle('selected');
    } else {
        for (const item of items) {
            if (item !== clickedItem) {
                item.classList.remove('selected');
            }
        }
        clickedItem.classList.toggle('selected');
    }
});

// Четвертое задание 

let thumb = slider.querySelector('.thumb');

thumb.onmousedown = function (event) {
 

    let rightEdge = slider.offsetWidth - thumb.offsetWidth;
    document.addEventListener('mousemove', onMouseMove);
    document.addEventListener('mouseup', onMouseUp);

    function onMouseMove(event) {
        let newLeft = event.clientX - slider.getBoundingClientRect().left;
        // курсор вышел из слайдера => оставить бегунок в его границах.
        if (newLeft < 0) {
            newLeft = 0;
        }
        if (newLeft > rightEdge) {
            newLeft = rightEdge;
        }
        thumb.style.left = newLeft + 'px';
    }

    function onMouseUp() {
        document.removeEventListener('mouseup', onMouseUp);
        document.removeEventListener('mousemove', onMouseMove);
    }

};

thumb.ondragstart = function () {
    return false;
};


// Шестое задание

const car = document.querySelector('#car');
const tree = document.querySelector('#tree')


car.onclick = function () {
    let start = Date.now();

    let timer = setInterval(function () {
        let timePassed = Date.now() - start;

        car.style.left = timePassed / 3 + 'px';

        if (timePassed > 3000) clearInterval(timer);

    }, 10);
}
tree.onclick = function () {
    let start = Date.now();
           tree.style.opacity = "100%";

    let timer = setInterval(function () {
 
        let timePassed = Date.now() - start;

        tree.style.opacity = 5000 / timePassed  + '%';

        if (timePassed > 5000) { clearInterval(timer); tree.style.opacity = "100%";};

    }, 10);
}



// Получаем ссылку на элемент box
const box = document.getElementById("box");
// Определяем начальный и конечный цвет для анимации
const startColor = "blue";
const endColor = "green";



// Определяем функцию для запуска анимации
function triggerAnimation() {
    // Добавляем CSS-класс к элементу box, чтобы инициировать переход
    box.classList.add("spin");


    // Определяем текущий цвет бокса
    const currentColor = box.style.backgroundColor;

    // Проверяем, является ли текущий цвет начальным цветом
    if (currentColor === startColor) {
        // Изменяем цвет бокса на последний цвет
        box.style.backgroundColor = endColor;
    } else {
        // Изменяем цвет бокса на начальный цвет
        box.style.backgroundColor = startColor;
    }}

// Настраиваем прослушиватель событий для элемента box
box.addEventListener("click", triggerAnimation);

// Сбрасываем анимацию, когда переход закончится
box.addEventListener("transitionend", function () {
    box.classList.remove("spin");
    // Определяем текущий цвет бокса
    const currentColor = box.style.backgroundColor;

    // Проверяем, является ли текущий цвет начальным цветом
    if (currentColor === startColor) {
        // Изменяем цвет бокса на последний цвет
        box.style.backgroundColor = endColor;
    } else {
        // Изменяем цвет бокса на начальный цвет
        box.style.backgroundColor = startColor;
    }});



 