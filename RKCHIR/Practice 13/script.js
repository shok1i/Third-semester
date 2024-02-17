
/*"use strict";*/

document.addEventListener('DOMContentLoaded', () => {


    const dynamicContent = document.getElementById('dynamic-content');

    window.addEventListener('scroll', function () {
        const scrollPosition = window.scrollY;

        // Изменяем содержимое в зависимости от положения прокрутки
        if (scrollPosition > 100) {
            dynamicContent.innerHTML = '<h1>Какой-то новый заголовок</h1><p>Продолжаем...</p>';
        } else {
            dynamicContent.innerHTML = '<h1>Зоголовки меняются при прокрутки</h1><p>Прокрути...</p>';
        }
    })


    const parallaxBg = document.getElementById('parallax-bg');

    document.addEventListener('scroll', function () {
        const scrollPosition = window.scrollY;
        parallaxBg.style.transform = `translateY(${scrollPosition * 0.45}px)`; // Экспериментируйте с коэффициентом
    })


    // (уведомление)

    const notification = document.querySelector('.notif');
    const notifList = ['Доброе утро!',];

    function showNotification(text) {
        let notif = document.createElement('div');
        notif.className = 'notification';
        notif.textContent = text;


        notification.append(notif);

        setTimeout(() => { notif.remove() }, 3000);
    }

    setInterval(() => { showNotification('!!!Сталина на вас нет!!!') }, 6500);



    //  задание Картинка

    const area = document.querySelector(".area");
    const chicken = area.querySelector('img');

    chicken.style.top = Math.round(area.clientHeight / 2 - chicken.offsetHeight / 2) + "px";
    chicken.style.left = Math.round(area.clientWidth / 2 - chicken.offsetWidth / 2) + "px";


    const clickX = document.querySelector('.clickX').querySelector('span');
    const clickY = document.querySelector('.clickY').querySelector('span');

    area.onclick = function (click) {
        clickX.textContent = click.clientX;
        clickY.textContent = click.clientY;
    }



    // (кнопка закрытия уведомления)

    const notif = document.querySelector('.notifs');
    const notifBtn = notif.querySelector('.notif__btn');
    const notifInner = notif.querySelector('.notif__inner');
    const notifCounter = notif.querySelector('.notif__counter');
    let counter = 0;

    function createNotif() {
        let element = document.createElement('div');
        element.classList.add('notif__item');


        counter++;

        element.textContent = "Уведомление";


        element.style = `
        position: relative;
        width: 200px;
        padding: 10px 20px;
        display: inline-block;
        margin-bottom: 2px;
        background: linear-gradient(170deg, #a91cff 37%, #02359d 30%, rgba(31, 36, 46, 0.5) 45%, rgba(31, 36, 46, 0.8) 75%, #2ef7fe 75%), linear-gradient(45deg, rgba(20, 24, 31, 0.8) 0%, rgba(41, 48, 61, 0.8) 50%, rgba(82, 95, 122, 0.8) 50%, rgba(133, 146, 173, 0.8) 100%) #313949;
        border-radius: 2px;
        color:gold;
        `;

        notifInner.append(element);

        let closeTab = document.createElement('i');
        closeTab.className = 'fa-solid fa-xmark';

        closeTab.style = `
        position: absolute;
        right: 10px;
        top: 3px;
        cursor: pointer;
        `;

        element.append(closeTab);

        notifCounter.textContent = counter;
    }

    let timerId = setInterval(createNotif, 3000);

    notifBtn.addEventListener('click', () => {
        clearInterval(timerId);
        setTimeout(function () {
            timerId = setInterval(createNotif, 3000);
        }, 10000);
    });

    notifInner.onclick = function (event) {
        if (!event.target.classList.contains('fa-xmark')) return; // получаем элемент на котором сработало событие

        let notif = event.target.closest('.notif__item'); // ближайший родственный элемент необходимого класса
        notif.remove();

        counter--;
        notifCounter.textContent = counter;
    };


});