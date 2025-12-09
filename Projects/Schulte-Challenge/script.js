// ================= DOM =================
const cont1 = document.getElementById("container1");
const cont2 = document.getElementById("container2");
const tableSize = document.getElementById("table-select");
const ground = document.getElementById("ground");
const gameClock = document.getElementById("game-clock");

// score UI
const scoreTime = document.getElementById("score-time");
const scoreProgress = document.getElementById("score-progress");
const correctUI = document.getElementById("correct");
const wrongUI = document.getElementById("wrong");
const accuracyUI = document.getElementById("accuracy");

// buttons
const resetBtn = document.getElementById("reset-btn");
const darkBtn = document.getElementById("dark-btn");
const soundBtn = document.getElementById("sound-btn");

// ================= AUDIO =================

const audio = new Audio("./audio/audio.wav");
const wrongAudio = new Audio("./audio/wrong-ans.mp3");
const clickAudio = new Audio("./audio/ui-click.mp3");

let soundOn = true;

function play(sound){
    if(soundOn) sound.play();
}

// ================= GAME DATA =================

let sec = 0;
let interval = null;
let totalBoxes = 0;
let next = 1;

let correct = 0;
let wrong = 0;

// ================= EVENTS =================

cont2.onclick = startGame;
soundBtn.onclick = toggleSound;
darkBtn.onclick = toggleDark;
resetBtn.onclick = resetGame;

// ================= START GAME =================

function startGame(){
    play(clickAudio);

    resetStats();

    cont1.style.display = "none";
    cont2.style.display = "none";
    gameClock.style.visibility = "visible";

    startClock();
    createTable();
}

// ================= TIMER =================

function startClock(){
    interval = setInterval(()=>{
        sec++;
        gameClock.textContent = "Time: " + sec + " sec";
        scoreTime.textContent = sec;
    },1000);
}

// ================= TABLE GEN =================

function createTable(){

    const size = parseInt(tableSize.value);
    totalBoxes = size * size;

    scoreProgress.textContent = `0 / ${totalBoxes}`;

    const width = {3:306,4:324,5:310}[size];

    const grid = document.createElement("div");
    grid.className = "schulte";
    grid.style.width = width + "px";

    ground.appendChild(grid);

    shuffle([...Array(totalBoxes).keys()].map(n=>n+1))
    .forEach(num=>{

        const bsize = {3:100,4:80,5:60}[size];

        let box = document.createElement("div");
        box.className = "box";
        box.style.width = box.style.height = bsize + "px";
        box.textContent = num;

        box.onclick = ()=> clickBox(box, num);

        grid.appendChild(box);

    });
}

// ================= CLICK LOGIC =================

function clickBox(box,val){

    if(val === next){
        play(audio);

        markCorrect(box);

        next++;
        correct++;

        updateStats();

        if(next > totalBoxes){
            finishGame();
        }
    }
    else{
        play(wrongAudio);
        flash(box);

        wrong++;
        updateStats();
    }
}

// ================= HELPERS =================

function markCorrect(box){
    box.style.backgroundColor = "#06fc6d62";
    box.onclick = null;
}

function flash(box){
    box.style.backgroundColor = "indianred";
    setTimeout(()=> box.style.backgroundColor="transparent",300);
}

// ================= SCORE UPDATES =================

function updateStats(){

    correctUI.textContent = correct;
    wrongUI.textContent = wrong;

    let attempts = correct + wrong;
    let accuracy = attempts === 0 ? 0 :
        Math.round((correct / attempts) * 100);

    accuracyUI.textContent = accuracy + "%";
    scoreProgress.textContent = `${correct} / ${totalBoxes}`;
}

// ================= END =================

function finishGame(){

    clearInterval(interval);

    let grade = getGrade();

    setTimeout(()=>{
        alert(
            `✅ Completed!\n\nTime: ${sec} sec\n`
        );
    },300);
}

function getGrade(){

    if(sec <= 10) return "⭐ S Rank";
    if(sec <= 15) return "A Rank";
    if(sec <= 20) return "B Rank";
    return "C Rank";
}

// ================= RESETS =================

function resetStats(){

    clearInterval(interval);

    sec=0;
    next=1;
    correct=0;
    wrong=0;

    gameClock.textContent="";
    scoreTime.textContent="0";
    correctUI.textContent="0";
    wrongUI.textContent="0";
    accuracyUI.textContent="0%";
    scoreProgress.textContent="0 / 0";

    ground.innerHTML="";
}

function resetGame(){

    play(clickAudio);
    resetStats();

    cont1.style.display="flex";
    cont2.style.display="flex";
    gameClock.style.visibility="hidden";
}

// ================= TOGGLES =================

function toggleSound(){
    soundOn = !soundOn;
    soundBtn.textContent = soundOn ? "🔊 Sound ON" : "🔇 Sound OFF";
}

function toggleDark(){
    document.body.classList.toggle("dark");
}

// ================= SHUFFLE =================

function shuffle(arr){
    for(let i = arr.length - 1; i > 0; i--){
        let j = Math.floor(Math.random()*(i+1));
        [arr[i],arr[j]] = [arr[j],arr[i]];
    }
    return arr;
}
