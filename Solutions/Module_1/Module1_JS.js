// Welcome message

console.log("Welcome to the Community Portal");

window.onload = function () {

    window.scrollTo(0, 0);

    alert("Welcome to Sunburn Goa Event Portal");
};

// Event details

const eventName = "Sunburn Goa";

const eventDate = "31 December 2026";

let seats = 100;

// Display event details

console.log(`Event: ${eventName}`);
console.log(`Date: ${eventDate}`);
console.log(`Available Seats: ${seats}`);

// Register button

function registerUser() {

    try {

        if (seats > 0) {

            seats--;

            alert("Registration successful");

            document.getElementById("message").innerHTML =

            "Registration completed successfully!";
        }

        else {

            throw "No seats available";
        }
    }

    catch(error) {

        console.log(error);
    }
}

// Phone validation

function validatePhone() {

    let phone =
        document.getElementById("phone").value;

    if(phone.length != 10) {

        document.getElementById("phoneError").innerHTML =
            "Enter valid phone number";
    }

    else {

        document.getElementById("phoneError").innerHTML =
            "";
    }
}

// Show event fee

function showFee() {

    let fee =
        document.getElementById("eventType").value;

    document.getElementById("fee").innerHTML =
        "Selected Event Fee: ₹" + fee;

    localStorage.setItem("selectedFee", fee);
}

// Load saved fee

window.addEventListener("load", function () {

    let savedFee =
        localStorage.getItem("selectedFee");

    if(savedFee) {

        document.getElementById("fee").innerHTML =
            "Previously Selected Fee: ₹" + savedFee;
    }
});

// Character counter

function countCharacters() {

    let text =
        document.getElementById("feedback").value;

    document.getElementById("count").innerHTML =
        text.length;
}
// Video ready message

function videoReady() {

    document.getElementById("videoMessage").innerHTML =

        "Video ready to play";
}

// Enlarge image

function enlargeImage(image) {

    if(image.style.transform == "scale(1.2)") {

    image.style.transform = "scale(1)";
}

else {

    image.style.transform = "scale(1.2)";
}
}

// Geolocation

function findLocation() {

    if(navigator.geolocation) {

        navigator.geolocation.getCurrentPosition(

            function(position) {

                document.getElementById("location").innerHTML =

                    "Latitude: " +
                    position.coords.latitude +

                    "<br>Longitude: " +
                    position.coords.longitude;
            },

            function(error) {

                document.getElementById("location").innerHTML =

                    "Location access denied";
            },

            {
                enableHighAccuracy: true,
                timeout: 5000
            }
        );
    }

    else {

        document.getElementById("location").innerHTML =

            "Geolocation not supported";
    }
}
// Clear storage

function clearPreferences() {

    localStorage.clear();

    sessionStorage.clear();

    alert("Preferences cleared");
}

// Event object

class Event {

    constructor(name, category) {

        this.name = name;

        this.category = category;
    }
}

// Event array

let events = [

    new Event("DJ Night", "Music"),

    new Event("Dance Arena", "Dance"),

    new Event("Live Concert", "Music")
];

// Filter music events

let musicEvents = events.filter(

    event => event.category === "Music"
);

console.log(musicEvents);

// Map event names

let eventCards = events.map(

    event => `Event: ${event.name}`
);

console.log(eventCards);

