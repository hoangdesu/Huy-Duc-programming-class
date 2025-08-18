
console.log('js connected');

// Step 1: grab the element from the DOM
const clickMeBtn = document.querySelector('#clickme-btn');

// Step 2: bind/connect some events to the element
clickMeBtn.addEventListener('mouseleave', () => {
    alert('Wassup!!');
});

const firstInput = document.querySelector('#first-input');
const secondInput = document.querySelector('#second-input');
const addBtn = document.querySelector('#add-btn');
const resultInput = document.querySelector('#result-input');


addBtn.addEventListener('click', () => {
    // console.log(firstInput.value);
    const total = Number(firstInput.value) + parseInt(secondInput.value);

    console.log(total);

    resultInput.value = total;

});
