
const route = (event) => {

    event = event || window.event;
    event.preventDefault();
    window.history.pushState({}, "", event.target.href);
    handleLocation();
}


const routers = {
    404: "/pages/404.html",
    "/": "/pages/main.html",
    "/settings": "/pages/settings.html",
    "/about": "/pages/about.html"
}

const handleLocation = async() =>{
    const path = window.location.pathname;
    const route = routers[path] || routers[404];
    const html = await fetch(route).then((data) => data.text())
    document.getElementById("main-page").innerHTML = html;
}

window.onpopstate = handleLocation;
window.route = route;

handleLocation();

