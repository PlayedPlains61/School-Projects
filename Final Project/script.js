'use strict';
//car info on home page
let myForm=document.querySelector('form');
myForm.addEventListener('submit',(event)=>{
    event.preventDefault();
    let firstname=document.querySelector('#firstname').value;
    document.querySelector('#fn').textContent=firstname;

    let lastname=document.querySelector('#lastname').value;
    document.querySelector('#ln').textContent=lastname;

    let email=document.querySelector('#email').value;
    document.querySelector('#em').textContent=email;

    let car=document.querySelector('#cars').value;
    document.querySelector('#car').innerHTML=car;

    let color=document.querySelector('#colors').value;
    document.querySelector('#color').innerHTML=color;

    let days=document.querySelector('#days').value;
    document.querySelector('#da').innerHTML=days;
    //down payment cost
    let cost=300;

    //if statements for each car
    if(car=='Chevy Suburban'){
        document.querySelector('#mi').textContent='36,000';
        document.querySelector('#dr').textContent='AWD';
        document.querySelector('#ye').textContent='2021';
        document.querySelector('#cost').innerHTML=(350*days)+cost;
    }
    else if(car=='Ford F-150'){
        document.querySelector('#mi').textContent='50,000';
        document.querySelector('#dr').textContent='AWD';
        document.querySelector('#ye').textContent='2020';
        document.querySelector('#cost').innerHTML=(375*days)+cost;
    }
    else if(car=='Volkswagen Atlas'){
        document.querySelector('#mi').textContent='75,000';
        document.querySelector('#dr').textContent='AWD';
        document.querySelector('#ye').textContent='2021';
        document.querySelector('#cost').innerHTML=(320*days)+cost;
    }
    else if(car=='Nissan Altima'){
        document.querySelector('#mi').textContent='100,000';
        document.querySelector('#dr').textContent='FWD';
        document.querySelector('#ye').textContent='2015';
        document.querySelector('#cost').innerHTML=(250*days)+cost;
    }
    else if(car=='Jeep Compass'){
        document.querySelector('#mi').textContent='250,000';
        document.querySelector('#dr').textContent='RWD';
        document.querySelector('#ye').textContent='2008';
        document.querySelector('#cost').innerHTML=(210*days)+cost;
    }
    else if(car=='Toyota Rav 4'){
        document.querySelector('#mi').textContent='335,000';
        document.querySelector('#dr').textContent='RWD';
        document.querySelector('#ye').textContent='2013';
        document.querySelector('#cost').innerHTML=(300*days)+cost;
    }
})