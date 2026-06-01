const checkAll = document.getElementById("checkAll");

function toggleAll() {
    const checkBoxes = document.querySelectorAll('.detail input[type="checkbox"]');
    checkBoxes.forEach(cb => cb.checked = checkAll.checked);
}

checkAll.onclick = toggleAll;
