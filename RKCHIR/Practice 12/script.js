document.addEventListener('DOMContentLoaded', () => {


    const listbtn = document.querySelector(".list");
    listbtn.addEventListener("click", (e) => {
        const listBlock=document.querySelector('.create-list');

        const list = document.querySelector('.user_list')
       
        listBlock.append(list);
    
        while(true){
            let item=prompt("Что вам нужно?","");
    
            if (!item) break;
    
            let listItem = document.createElement('li');
            listItem.textContent=item;
            list.append(listItem);
        }
    })

   



    // (уведомление)

    const notification=document.querySelector('.notif');
    const notifList=['Доброе утро!',];

    function showNotification(text){
        let notif=document.createElement('div');
        notif.className = 'notification';
        notif.textContent=text;
        

        notification.append(notif);

        setTimeout(()=>{notif.remove()},3000);
    }

    setInterval(() => {showNotification('Исчезает')}, 6500);




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
      

        element.style=`
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

        closeTab.style=`
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
        setTimeout(function() {
            timerId = setInterval(createNotif, 3000);
        }, 10000);
    });

    notifInner.onclick = function(event) {
        if (!event.target.classList.contains('fa-xmark')) return; // получаем элемент на котором сработало событие

        let notif = event.target.closest('.notif__item'); // ближайший родственный элемент необходимого класса
        notif.remove();

        counter--;
        notifCounter.textContent=counter;
    };
    

});
